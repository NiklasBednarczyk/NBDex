package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedex
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokedex

object NetworkCorePokedexMapper : NBNetworkMapper<CorePokedex, NetworkCorePokedex> {

    override fun networkToModel(network: NetworkCorePokedex): CorePokedex {
        return CorePokedex(
            id = CorePokedexId.from(network.id),
            isMainSeries = network.isMainSeries,
            name = network.name,
            regionId = CoreRegionId.from(network.regionId),
        )
    }

}