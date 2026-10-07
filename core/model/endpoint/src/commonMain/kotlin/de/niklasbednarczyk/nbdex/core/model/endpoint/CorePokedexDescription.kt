package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexDescriptionId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId

data class CorePokedexDescription(
    val id: CorePokedexDescriptionId,
    val description: String,
    val languageId: CoreLanguageId?,
    val pokedexId: CorePokedexId?,
) {
    companion object {
        fun example(
            id: CorePokedexDescriptionId = CorePokedexDescriptionId.example(),
            description: String = "PokedexDescription Description",
            languageId: CoreLanguageId? = CoreLanguageId.example(),
            pokedexId: CorePokedexId? = CorePokedexId.example(),
        ): CorePokedexDescription {
            return CorePokedexDescription(
                id = id,
                description = description,
                languageId = languageId,
                pokedexId = pokedexId,
            )
        }
    }
}
