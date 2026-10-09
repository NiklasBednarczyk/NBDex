package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexVersionGroup
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexVersionGroupId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokedexVersionGroup

object NetworkCorePokedexVersionGroupMapper :
    NBNetworkMapper<CorePokedexVersionGroup, NetworkCorePokedexVersionGroup> {
    override fun networkToModel(
        network: NetworkCorePokedexVersionGroup,
    ): CorePokedexVersionGroup {
        return CorePokedexVersionGroup(
            id = CorePokedexVersionGroupId.from(network.id),
            pokedexId = CorePokedexId.from(network.pokedexId),
            versionGroupId = CoreVersionGroupId.from(network.versionGroupId),
        )
    }
}
