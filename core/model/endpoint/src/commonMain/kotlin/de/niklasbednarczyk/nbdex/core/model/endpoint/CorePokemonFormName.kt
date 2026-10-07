package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormNameId

data class CorePokemonFormName(
    val id: CorePokemonFormNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val pokemonFormId: CorePokemonFormId?,
    val pokemonName: String,
) {
    companion object {
        fun example(
            id: CorePokemonFormNameId = CorePokemonFormNameId.example(),
            languageId: CoreLanguageId? = CoreLanguageId.example(),
            name: String = "PokemonFormName Name",
            pokemonFormId: CorePokemonFormId? = CorePokemonFormId.example(),
            pokemonName: String = "PokemonFormName PokemonName",
        ): CorePokemonFormName {
            return CorePokemonFormName(
                id = id,
                languageId = languageId,
                name = name,
                pokemonFormId = pokemonFormId,
                pokemonName = pokemonName,
            )
        }
    }
}
