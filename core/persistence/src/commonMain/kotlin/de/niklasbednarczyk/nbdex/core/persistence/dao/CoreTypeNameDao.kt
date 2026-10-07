package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreTypeName

@Dao
interface CoreTypeNameDao {
    @Query(
        """
            SELECT EXISTS 
            (
                SELECT 1 
                FROM ${NBTableName.TYPE_NAME}
            );
        """,
    )
    suspend fun hasTypeNames(): Boolean

    @Insert(onConflict = NBDao.ON_CONFLICT)
    suspend fun insertTypeNames(
        typeNames: List<PersistenceCoreTypeName>,
    )
}
