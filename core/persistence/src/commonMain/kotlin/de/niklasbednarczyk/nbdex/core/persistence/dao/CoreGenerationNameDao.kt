package de.niklasbednarczyk.nbdex.core.persistence.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBDao
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreGenerationName

@Dao
interface CoreGenerationNameDao {

    @Query(
        """
            SELECT EXISTS 
            (
                SELECT 1 
                FROM ${NBTableName.GENERATION_NAME}
            );
        """
    )
    suspend fun hasGenerationNames(): Boolean

    @Insert(onConflict = NBDao.ON_CONFLICT)
    suspend fun insertGenerationNames(generationNames: List<PersistenceCoreGenerationName>)

}