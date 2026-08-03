package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersion
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreVersion

object NetworkCoreVersionMapper : NBNetworkMapper<CoreVersion, NetworkCoreVersion> {

    override fun networkToModel(network: NetworkCoreVersion): CoreVersion {
        return CoreVersion(
            id = CoreVersionId.from(network.id),
            name = network.name,
            versionGroupId = CoreVersionGroupId.from(network.versionGroupId),
        )
    }

}