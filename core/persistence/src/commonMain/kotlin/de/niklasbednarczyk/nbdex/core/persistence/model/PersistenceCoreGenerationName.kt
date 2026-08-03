package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationNameId
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.GENERATION_NAME,
)
data class PersistenceCoreGenerationName(
    @PrimaryKey
    val id: CoreGenerationNameId,
    val generationId: CoreGenerationId?,
    val languageId: CoreLanguageId?,
    val name: String,
)
