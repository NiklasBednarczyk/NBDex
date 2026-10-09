package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao

import androidx.room3.Dao
import androidx.room3.Query
import androidx.room3.Transaction
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.type.PersistencePokedexType
import kotlinx.coroutines.flow.Flow

@Dao
interface PokedexTypeDao {
    @Transaction
    @Query(
        """
            SELECT *
            FROM ${NBTableName.TYPE}
        """,
    )
    fun getPokedexTypes(): Flow<List<PersistencePokedexType>>
}
