package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersion

@Dao
interface CoreVersionDao {

    @Query(
        """
            SELECT EXISTS 
            (
                SELECT 1 
                FROM ${NBTableName.VERSION}
            );
        """
    )
    suspend fun hasVersions(): Boolean

    @Insert(onConflict = NBDao.ON_CONFLICT)
    suspend fun insertVersions(versions: List<PersistenceCoreVersion>)

}