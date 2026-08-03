package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionNameId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.REGION_NAME,
)
data class PersistenceCoreRegionName(
    @PrimaryKey
    val id: CoreRegionNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val regionId: CoreRegionId?,
)
