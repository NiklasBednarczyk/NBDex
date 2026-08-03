package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionNameId

data class CoreVersionName(
    val id: CoreVersionNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val versionId: CoreVersionId?,
) {

    companion object {

        fun example(
            id: CoreVersionNameId = CoreVersionNameId.example(),
            languageId: CoreLanguageId? = CoreLanguageId.example(),
            name: String = "VersionName Name",
            versionId: CoreVersionId? = CoreVersionId.example(),
        ): CoreVersionName {
            return CoreVersionName(
                id = id,
                languageId = languageId,
                name = name,
                versionId = versionId,
            )
        }

    }

}