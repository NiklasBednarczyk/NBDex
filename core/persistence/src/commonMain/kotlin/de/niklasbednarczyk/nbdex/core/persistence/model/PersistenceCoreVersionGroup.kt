package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.VERSION_GROUP,
)
data class PersistenceCoreVersionGroup(
    @PrimaryKey
    val id: CoreVersionGroupId,
    val generationId: CoreGenerationId?,
    val name: String,
    val order: Int?,
)
