package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexName

@Dao
interface CorePokedexNameDao {
    @Query(
        """
            SELECT EXISTS
            (
                SELECT 1
                FROM ${DexTableName.POKEDEX_NAME}
            );
        """,
    )
    suspend fun hasPokedexNames(): Boolean

    @Insert(onConflict = DexDao.ON_CONFLICT)
    suspend fun insertPokedexNames(
        pokedexNames: List<PersistenceCorePokedexName>,
    )
}
