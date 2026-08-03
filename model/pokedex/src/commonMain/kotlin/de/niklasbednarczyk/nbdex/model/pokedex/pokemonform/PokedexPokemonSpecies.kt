package de.niklasbednarczyk.nbdex.model.pokedex.pokemonform

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonDexNumber
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonSpecies
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonSpeciesName

data class PokedexPokemonSpecies(
    val pokemonSpecies: CorePokemonSpecies,
    val pokemonDexNumber: CorePokemonDexNumber,
    val pokemonSpeciesName: CorePokemonSpeciesName,
) {

    companion object {

        fun example(
            pokemonSpecies: CorePokemonSpecies = CorePokemonSpecies.example(),
            pokemonDexNumber: CorePokemonDexNumber = CorePokemonDexNumber.example(),
            pokemonSpeciesName: CorePokemonSpeciesName = CorePokemonSpeciesName.example(),
        ): PokedexPokemonSpecies {
            return PokedexPokemonSpecies(
                pokemonSpecies = pokemonSpecies,
                pokemonDexNumber = pokemonDexNumber,
                pokemonSpeciesName = pokemonSpeciesName,
            )
        }

    }

}
