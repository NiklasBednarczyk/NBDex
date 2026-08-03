package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGeneration
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreGeneration

object NetworkCoreGenerationMapper : NBNetworkMapper<CoreGeneration, NetworkCoreGeneration> {

    override fun networkToModel(network: NetworkCoreGeneration): CoreGeneration {
        return CoreGeneration(
            id = CoreGenerationId.from(network.id),
            name = network.name,
            regionId = CoreRegionId.from(network.regionId),
        )
    }

}