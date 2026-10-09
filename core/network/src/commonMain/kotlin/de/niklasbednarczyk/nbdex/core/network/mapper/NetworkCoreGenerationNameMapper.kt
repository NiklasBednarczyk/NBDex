package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGenerationName
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationNameId
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCoreGenerationName

object NetworkCoreGenerationNameMapper : NBNetworkMapper<CoreGenerationName, NetworkCoreGenerationName> {
    override fun networkToModel(
        network: NetworkCoreGenerationName,
    ): CoreGenerationName {
        return CoreGenerationName(
            id = CoreGenerationNameId.from(network.id),
            generationId = CoreGenerationId.from(network.generationId),
            languageId = CoreLanguageId.from(network.languageId),
            name = network.name,
        )
    }
}
