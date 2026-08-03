package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.endpoint.values.CorePokedexNumber
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonDexNumberId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId

data class CorePokemonDexNumber(
    val id: CorePokemonDexNumberId,
    val pokedexId: CorePokedexId?,
    val pokedexNumber: CorePokedexNumber,
    val pokemonSpeciesId: CorePokemonSpeciesId?,
) {

    companion object {

        fun example(
            id: CorePokemonDexNumberId = CorePokemonDexNumberId.example(),
            pokedexId: CorePokedexId? = CorePokedexId.example(),
            pokedexNumber: CorePokedexNumber = CorePokedexNumber.example(),
            pokemonSpeciesId: CorePokemonSpeciesId? = CorePokemonSpeciesId.example(),
        ): CorePokemonDexNumber {
            return CorePokemonDexNumber(
                id = id,
                pokedexId = pokedexId,
                pokedexNumber = pokedexNumber,
                pokemonSpeciesId = pokemonSpeciesId,
            )
        }

    }

}