package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionNameId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.VERSION_NAME,
)
data class PersistenceCoreVersionName(
    @PrimaryKey
    val id: CoreVersionNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val versionId: CoreVersionId?,
)
