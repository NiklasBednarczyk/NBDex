package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonFormName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormNameId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokemonFormName

object NetworkCorePokemonFormNameMapper : NBNetworkMapper<CorePokemonFormName, NetworkCorePokemonFormName> {
    override fun networkToModel(
        network: NetworkCorePokemonFormName,
    ): CorePokemonFormName {
        return CorePokemonFormName(
            id = CorePokemonFormNameId.from(network.id),
            languageId = CoreLanguageId.from(network.languageId),
            name = network.name,
            pokemonFormId = CorePokemonFormId.from(network.pokemonFormId),
            pokemonName = network.pokemonName,
        )
    }
}
