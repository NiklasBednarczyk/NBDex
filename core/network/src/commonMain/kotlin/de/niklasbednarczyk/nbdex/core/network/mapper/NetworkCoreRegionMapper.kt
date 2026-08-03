package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreRegion
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreRegion

object NetworkCoreRegionMapper : NBNetworkMapper<CoreRegion, NetworkCoreRegion> {

    override fun networkToModel(network: NetworkCoreRegion): CoreRegion {
        return CoreRegion(
            id = CoreRegionId.from(network.id),
            name = network.name,
        )
    }

}