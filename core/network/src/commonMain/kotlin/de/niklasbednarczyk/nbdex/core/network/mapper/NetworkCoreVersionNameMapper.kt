package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionNameId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreVersionName

object NetworkCoreVersionNameMapper : NBNetworkMapper<CoreVersionName, NetworkCoreVersionName> {

    override fun networkToModel(network: NetworkCoreVersionName): CoreVersionName {
        return CoreVersionName(
            id = CoreVersionNameId.from(network.id),
            languageId = CoreLanguageId.from(network.languageId),
            name = network.name,
            versionId = CoreVersionId.from(network.versionId),
        )
    }

}