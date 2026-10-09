package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionGroup
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreVersionGroup

object NetworkCoreVersionGroupMapper : NBNetworkMapper<CoreVersionGroup, NetworkCoreVersionGroup> {
    override fun networkToModel(
        network: NetworkCoreVersionGroup,
    ): CoreVersionGroup {
        return CoreVersionGroup(
            id = CoreVersionGroupId.from(network.id),
            generationId = CoreGenerationId.from(network.generationId),
            name = network.name,
            order = network.order,
        )
    }
}
