package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonType
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonTypeId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokemonType

object NetworkCorePokemonTypeMapper : NBNetworkMapper<CorePokemonType, NetworkCorePokemonType> {
    override fun networkToModel(
        network: NetworkCorePokemonType,
    ): CorePokemonType {
        return CorePokemonType(
            id = CorePokemonTypeId.from(network.id),
            pokemonId = CorePokemonId.from(network.pokemonId),
            slot = network.slot,
            typeId = CoreTypeId.from(network.typeId),
        )
    }
}
