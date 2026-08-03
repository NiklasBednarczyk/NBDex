package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationNameId
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId

data class CoreGenerationName(
    val id: CoreGenerationNameId,
    val generationId: CoreGenerationId?,
    val languageId: CoreLanguageId?,
    val name: String,
) {

    companion object {

        fun example(
            id: CoreGenerationNameId = CoreGenerationNameId.example(),
            generationId: CoreGenerationId? = CoreGenerationId.example(),
            languageId: CoreLanguageId? = CoreLanguageId.example(),
            name: String = "GenerationName Name",
        ): CoreGenerationName {
            return CoreGenerationName(
                id = id,
                generationId = generationId,
                languageId = languageId,
                name = name,
            )
        }

    }

}
