package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.REGION,
)
data class PersistenceCoreRegion(
    @PrimaryKey
    val id: CoreRegionId,
    val name: String,
)
