package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreType

@Dao
interface CoreTypeDao {

    @Query(
        """
            SELECT EXISTS 
            (
                SELECT 1 
                FROM ${NBTableName.TYPE}
            );
        """
    )
    suspend fun hasTypes(): Boolean

    @Insert(onConflict = NBDao.ON_CONFLICT)
    suspend fun insertTypes(types: List<PersistenceCoreType>)

}