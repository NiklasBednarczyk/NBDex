package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonDexNumber

@Dao
interface CorePokemonDexNumberDao {
    @Query(
        """
            SELECT EXISTS
            (
                SELECT 1
                FROM ${DexTableName.POKEMON_DEX_NUMBER}
            );
        """,
    )
    suspend fun hasPokemonDexNumbers(): Boolean

    @Query(
        """
            SELECT EXISTS
            (
                SELECT 1
                FROM ${DexTableName.POKEMON_DEX_NUMBER}
                WHERE pokedexId = :pokedexId
            );
        """,
    )
    suspend fun hasPokemonDexNumbersWithPokedexId(
        pokedexId: CorePokedexId,
    ): Boolean

    @Insert(onConflict = DexDao.ON_CONFLICT)
    suspend fun insertPokemonDexNumbers(
        pokemonDexNumbers: List<PersistenceCorePokemonDexNumber>,
    )
}
