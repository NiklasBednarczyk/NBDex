package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreRegionName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionNameId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreRegionName

object NetworkCoreRegionNameMapper : NBNetworkMapper<CoreRegionName, NetworkCoreRegionName> {
    override fun networkToModel(
        network: NetworkCoreRegionName,
    ): CoreRegionName {
        return CoreRegionName(
            id = CoreRegionNameId.from(network.id),
            languageId = CoreLanguageId.from(network.languageId),
            name = network.name,
            regionId = CoreRegionId.from(network.regionId),
        )
    }
}
