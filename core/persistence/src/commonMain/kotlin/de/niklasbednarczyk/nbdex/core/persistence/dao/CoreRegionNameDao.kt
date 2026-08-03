package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreRegionName

@Dao
interface CoreRegionNameDao {

    @Query(
        """
            SELECT EXISTS 
            (
                SELECT 1 
                FROM ${NBTableName.REGION_NAME}
            );
        """
    )
    suspend fun hasRegionNames(): Boolean

    @Insert(onConflict = NBDao.ON_CONFLICT)
    suspend fun insertRegionNames(regionNames: List<PersistenceCoreRegionName>)

}