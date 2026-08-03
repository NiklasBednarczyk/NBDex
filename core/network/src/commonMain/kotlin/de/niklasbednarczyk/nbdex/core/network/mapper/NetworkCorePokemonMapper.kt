package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemon
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokemon

object NetworkCorePokemonMapper : NBNetworkMapper<CorePokemon, NetworkCorePokemon> {

    override fun networkToModel(network: NetworkCorePokemon): CorePokemon {
        return CorePokemon(
            id = CorePokemonId.from(network.id),
            baseExperience = network.baseExperience,
            height = network.height,
            isDefault = network.isDefault,
            name = network.name,
            order = network.order,
            pokemonSpeciesId = CorePokemonSpeciesId.from(network.pokemonSpeciesId),
            weight = network.weight,
        )
    }

}