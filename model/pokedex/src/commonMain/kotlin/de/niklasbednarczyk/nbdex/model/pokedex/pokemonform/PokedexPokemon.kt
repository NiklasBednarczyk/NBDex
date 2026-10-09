package de.niklasbednarczyk.nbdex.model.pokedex.pokemonform

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemon
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

data class PokedexPokemon(
    val pokemon: CorePokemon,
    val pokemonSpecies: PokedexPokemonSpecies?,
    val pokemonTypes: ImmutableList<PokedexPokemonType>,
) {
    companion object {
        fun example(
            pokemon: CorePokemon = CorePokemon.example(),
            pokemonSpecies: PokedexPokemonSpecies = PokedexPokemonSpecies.example(),
            pokemonTypes: ImmutableList<PokedexPokemonType> = persistentListOf(PokedexPokemonType.example()),
        ): PokedexPokemon {
            return PokedexPokemon(
                pokemon = pokemon,
                pokemonSpecies = pokemonSpecies,
                pokemonTypes = pokemonTypes,
            )
        }
    }
}
