package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonDexNumber
import de.niklasbednarczyk.nbdex.core.model.endpoint.values.CorePokedexNumber
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonDexNumberId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokemonDexNumber

object NetworkCorePokemonDexNumberMapper : NBNetworkMapper<CorePokemonDexNumber, NetworkCorePokemonDexNumber> {

    override fun networkToModel(network: NetworkCorePokemonDexNumber): CorePokemonDexNumber {
        return CorePokemonDexNumber(
            id = CorePokemonDexNumberId.from(network.id),
            pokedexId = CorePokedexId.from(network.pokedexId),
            pokedexNumber = CorePokedexNumber.from(network.pokedexNumber),
            pokemonSpeciesId = CorePokemonSpeciesId.from(network.pokemonSpeciesId),
        )
    }

}