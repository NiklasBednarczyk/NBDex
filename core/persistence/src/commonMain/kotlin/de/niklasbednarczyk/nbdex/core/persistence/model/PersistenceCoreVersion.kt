package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.VERSION,
)
data class PersistenceCoreVersion(
    @PrimaryKey
    val id: CoreVersionId,
    val name: String,
    val versionGroupId: CoreVersionGroupId?,
)
