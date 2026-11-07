package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonForm

@Dao
interface CorePokemonFormDao {
    @Query(
        """
            SELECT EXISTS
            (
                SELECT 1
                FROM ${DexTableName.POKEMON_FORM}
            );
        """,
    )
    suspend fun hasPokemonForms(): Boolean

    @Insert(onConflict = DexDao.ON_CONFLICT)
    suspend fun insertPokemonForms(
        pokemonForms: List<PersistenceCorePokemonForm>,
    )
}
