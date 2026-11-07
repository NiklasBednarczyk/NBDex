package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedex

@Dao
interface CorePokedexDao {
    @Query(
        """
            SELECT EXISTS
            (
                SELECT 1
                FROM ${DexTableName.POKEDEX}
            );
        """,
    )
    suspend fun hasPokedexes(): Boolean

    @Insert(onConflict = DexDao.ON_CONFLICT)
    suspend fun insertPokedexes(
        pokedexes: List<PersistenceCorePokedex>,
    )
}
