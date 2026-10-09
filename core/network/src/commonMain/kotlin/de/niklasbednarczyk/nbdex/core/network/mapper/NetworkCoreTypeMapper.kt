package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreType
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreMoveDamageClassId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreType

object NetworkCoreTypeMapper : NBNetworkMapper<CoreType, NetworkCoreType> {
    override fun networkToModel(
        network: NetworkCoreType,
    ): CoreType {
        return CoreType(
            id = CoreTypeId.from(network.id),
            generationId = CoreGenerationId.from(network.generationId),
            moveDamageClassId = CoreMoveDamageClassId.from(network.moveDamageClassId),
            name = network.name,
        )
    }
}
