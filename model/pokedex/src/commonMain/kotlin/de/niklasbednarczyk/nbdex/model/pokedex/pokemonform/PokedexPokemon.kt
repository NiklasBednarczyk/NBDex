package de.niklasbednarczyk.nbdex.model.pokedex.pokemonform

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemon

data class PokedexPokemon(
    val pokemon: CorePokemon,
    val pokemonSpecies: PokedexPokemonSpecies?,
    val pokemonTypes: List<PokedexPokemonType>,
) {

    companion object {

        fun example(
            pokemon: CorePokemon = CorePokemon.example(),
            pokemonSpecies: PokedexPokemonSpecies = PokedexPokemonSpecies.example(),
            pokemonTypes: List<PokedexPokemonType> = listOf(PokedexPokemonType.example()),
        ): PokedexPokemon {
            return PokedexPokemon(
                pokemon = pokemon,
                pokemonSpecies = pokemonSpecies,
                pokemonTypes = pokemonTypes,
            )
        }

    }

}