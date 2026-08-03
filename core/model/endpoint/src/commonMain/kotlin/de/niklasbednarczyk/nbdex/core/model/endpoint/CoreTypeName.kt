package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeNameId

data class CoreTypeName(
    val id: CoreTypeNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val typeId: CoreTypeId?,
) {

    companion object {

        fun example(
            id: CoreTypeNameId = CoreTypeNameId.example(),
            languageId: CoreLanguageId? = CoreLanguageId.example(),
            name: String = "TypeName Name",
            typeId: CoreTypeId? = CoreTypeId.example(),
        ): CoreTypeName {
            return CoreTypeName(
                id = id,
                languageId = languageId,
                name = name,
                typeId = typeId,
            )
        }

    }

}
