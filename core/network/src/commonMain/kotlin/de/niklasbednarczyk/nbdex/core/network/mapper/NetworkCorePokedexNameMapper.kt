package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexNameId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokedexName

object NetworkCorePokedexNameMapper : NBNetworkMapper<CorePokedexName, NetworkCorePokedexName> {
    override fun networkToModel(
        network: NetworkCorePokedexName,
    ): CorePokedexName {
        return CorePokedexName(
            id = CorePokedexNameId.from(network.id),
            languageId = CoreLanguageId.from(network.languageId),
            name = network.name,
            pokedexId = CorePokedexId.from(network.pokedexId),
        )
    }
}
