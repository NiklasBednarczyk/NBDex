package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexDescription
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexDescriptionId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokedexDescription

object NetworkCorePokedexDescriptionMapper :
    NBNetworkMapper<CorePokedexDescription, NetworkCorePokedexDescription> {
    override fun networkToModel(
        network: NetworkCorePokedexDescription,
    ): CorePokedexDescription {
        return CorePokedexDescription(
            id = CorePokedexDescriptionId.from(network.id),
            description = network.description,
            languageId = CoreLanguageId.from(network.languageId),
            pokedexId = CorePokedexId.from(network.pokedexId),
        )
    }
}
