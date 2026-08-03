package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreMoveDamageClassId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.TYPE,
)
data class PersistenceCoreType(
    @PrimaryKey
    val id: CoreTypeId,
    val generationId: CoreGenerationId?,
    val moveDamageClassId: CoreMoveDamageClassId?,
    val name: String,
)
