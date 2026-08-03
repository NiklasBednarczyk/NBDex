package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesNameId

data class CorePokemonSpeciesName(
    val id: CorePokemonSpeciesNameId,
    val genus: String,
    val languageId: CoreLanguageId?,
    val name: String,
    val pokemonSpeciesId: CorePokemonSpeciesId?,
) {

    companion object {

        fun example(
            id: CorePokemonSpeciesNameId = CorePokemonSpeciesNameId.example(),
            genus: String = "PokemonSpeciesName Genus",
            languageId: CoreLanguageId? = CoreLanguageId.example(),
            name: String = "PokemonSpeciesName Name",
            pokemonSpeciesId: CorePokemonSpeciesId? = CorePokemonSpeciesId.example(),
        ): CorePokemonSpeciesName {
            return CorePokemonSpeciesName(
                id = id,
                genus = genus,
                languageId = languageId,
                name = name,
                pokemonSpeciesId = pokemonSpeciesId,
            )
        }

    }

}