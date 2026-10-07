package de.niklasbednarczyk.nbdex.model.pokedex.pokemonform

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonForm
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonFormName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionGroup
import de.niklasbednarczyk.nbdex.core.model.endpoint.sprites.CorePokemonSprite

data class PokedexPokemonForm(
    val pokemonForm: CorePokemonForm,
    val pokemonFormName: CorePokemonFormName?,
    val versionGroup: CoreVersionGroup?,
    val pokemon: PokedexPokemon?,
) {
    val displayName: String
        get() {
            val name = if (pokemon?.pokemon?.isDefault == true) {
                pokemon.pokemonSpecies?.pokemonSpeciesName?.name
            } else {
                pokemonFormName?.pokemonName
            }
            return name.orEmpty()
        }

    val pokemonSprite: CorePokemonSprite?
        get() = CorePokemonSprite.from(pokemon?.pokemon?.id)

    companion object {
        fun example(
            pokemonForm: CorePokemonForm = CorePokemonForm.example(),
            pokemonFormName: CorePokemonFormName? = CorePokemonFormName.example(),
            versionGroup: CoreVersionGroup = CoreVersionGroup.example(),
            pokemon: PokedexPokemon = PokedexPokemon.example(),
        ): PokedexPokemonForm {
            return PokedexPokemonForm(
                pokemonForm = pokemonForm,
                pokemonFormName = pokemonFormName,
                versionGroup = versionGroup,
                pokemon = pokemon,
            )
        }
    }
}
