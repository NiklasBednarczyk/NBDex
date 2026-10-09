package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao

import androidx.room3.Dao
import androidx.room3.Query
import androidx.room3.Transaction
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex.PersistencePokedexPokedex
import kotlinx.coroutines.flow.Flow

@Dao
interface PokedexPokedexDao {
    @Transaction
    @Query(
        """
            SELECT *
            FROM ${NBTableName.POKEDEX}
        """,
    )
    fun getPokedexPokedexes(): Flow<List<PersistencePokedexPokedex>>
}
