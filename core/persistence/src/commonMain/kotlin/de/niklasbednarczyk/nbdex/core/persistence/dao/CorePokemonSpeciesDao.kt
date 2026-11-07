package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonSpecies

@Dao
interface CorePokemonSpeciesDao {
    @Query(
        """
            SELECT EXISTS
            (
                SELECT 1
                FROM ${DexTableName.POKEMON_SPECIES}
            );
        """,
    )
    suspend fun hasPokemonSpecies(): Boolean

    @Query(
        """
            SELECT EXISTS
            (
                SELECT 1
                FROM ${DexTableName.POKEMON_SPECIES}
                WHERE generationId = :generationId
            );
        """,
    )
    suspend fun hasPokemonSpeciesWithGenerationId(
        generationId: CoreGenerationId,
    ): Boolean

    @Insert(onConflict = DexDao.ON_CONFLICT)
    suspend fun insertPokemonSpecies(
        pokemonSpecies: List<PersistenceCorePokemonSpecies>,
    )
}
