package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeNameId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreTypeName

object NetworkCoreTypeNameMapper : NBNetworkMapper<CoreTypeName, NetworkCoreTypeName> {

    override fun networkToModel(network: NetworkCoreTypeName): CoreTypeName {
        return CoreTypeName(
            id = CoreTypeNameId.from(network.id),
            languageId = CoreLanguageId.from(network.languageId),
            name = network.name,
            typeId = CoreTypeId.from(network.typeId),
        )
    }

}