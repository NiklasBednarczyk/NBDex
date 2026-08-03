package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonForm
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokemonForm

object NetworkCorePokemonFormMapper : NBNetworkMapper<CorePokemonForm, NetworkCorePokemonForm> {

    override fun networkToModel(network: NetworkCorePokemonForm): CorePokemonForm {
        return CorePokemonForm(
            id = CorePokemonFormId.from(network.id),
            formName = network.formName,
            formOrder = network.formOrder,
            isBattleOnly = network.isBattleOnly,
            isDefault = network.isDefault,
            isMega = network.isMega,
            name = network.name,
            order = network.order,
            pokemonId = CorePokemonId.from(network.pokemonId),
            versionGroupId = CoreVersionGroupId.from(network.versionGroupId),
        )
    }

}