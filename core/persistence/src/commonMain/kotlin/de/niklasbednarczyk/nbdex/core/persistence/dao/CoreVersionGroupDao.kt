package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionGroup

@Dao
interface CoreVersionGroupDao {
    @Query(
        """
            SELECT EXISTS
            (
                SELECT 1
                FROM ${DexTableName.VERSION_GROUP}
            );
        """,
    )
    suspend fun hasVersionGroups(): Boolean

    @Insert(onConflict = DexDao.ON_CONFLICT)
    suspend fun insertVersionGroups(
        versionGroups: List<PersistenceCoreVersionGroup>,
    )
}
