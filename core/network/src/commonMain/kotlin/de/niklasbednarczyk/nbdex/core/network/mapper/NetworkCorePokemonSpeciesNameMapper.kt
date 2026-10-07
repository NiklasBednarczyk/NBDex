package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonSpeciesName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesNameId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokemonSpeciesName

object NetworkCorePokemonSpeciesNameMapper : NBNetworkMapper<CorePokemonSpeciesName, NetworkCorePokemonSpeciesName> {
    override fun networkToModel(
        network: NetworkCorePokemonSpeciesName,
    ): CorePokemonSpeciesName {
        return CorePokemonSpeciesName(
            id = CorePokemonSpeciesNameId.from(network.id),
            genus = network.genus,
            languageId = CoreLanguageId.from(network.languageId),
            name = network.name,
            pokemonSpeciesId = CorePokemonSpeciesId.from(network.pokemonSpeciesId),
        )
    }
}
