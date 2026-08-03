package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeNameId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.TYPE_NAME,
)
data class PersistenceCoreTypeName(
    @PrimaryKey
    val id: CoreTypeNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val typeId: CoreTypeId?,
)
