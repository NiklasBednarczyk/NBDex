package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonFormName

@Dao
interface CorePokemonFormNameDao {
    @Query(
        """
            SELECT EXISTS 
            (
                SELECT 1 
                FROM ${NBTableName.POKEMON_FORM_NAME}
            );
        """,
    )
    suspend fun hasPokemonFormNames(): Boolean

    @Insert(onConflict = NBDao.ON_CONFLICT)
    suspend fun insertPokemonFormNames(
        pokemonFormNames: List<PersistenceCorePokemonFormName>,
    )
}
