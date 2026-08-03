package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.GENERATION,
)
data class PersistenceCoreGeneration(
    @PrimaryKey
    val id: CoreGenerationId,
    val name: String,
    val regionId: CoreRegionId?,
)
