package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonType

@Dao
interface CorePokemonTypeDao {
    @Query(
        """
            SELECT EXISTS 
            (
                SELECT 1 
                FROM ${NBTableName.POKEMON_TYPE}
            );
        """,
    )
    suspend fun hasPokemonTypes(): Boolean

    @Query(
        """
            SELECT EXISTS 
            (
                SELECT 1 
                FROM ${NBTableName.POKEMON_TYPE}
                WHERE typeId = :typeId
            );
        """,
    )
    suspend fun hasPokemonTypesWithTypeId(
        typeId: CoreTypeId,
    ): Boolean

    @Insert(onConflict = NBDao.ON_CONFLICT)
    suspend fun insertPokemonTypes(
        pokemonTypes: List<PersistenceCorePokemonType>,
    )
}
