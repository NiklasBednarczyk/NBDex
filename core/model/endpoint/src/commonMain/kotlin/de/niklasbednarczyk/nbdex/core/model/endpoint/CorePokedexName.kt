package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexNameId

data class CorePokedexName(
    val id: CorePokedexNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val pokedexId: CorePokedexId?,
) {

    companion object {

        fun example(
            id: CorePokedexNameId = CorePokedexNameId.example(),
            languageId: CoreLanguageId? = CoreLanguageId.example(),
            name: String = "PokedexName Name",
            pokedexId: CorePokedexId? = CorePokedexId.example(),
        ): CorePokedexName {
            return CorePokedexName(
                id = id,
                languageId = languageId,
                name = name,
                pokedexId = pokedexId,
            )
        }

    }

}

