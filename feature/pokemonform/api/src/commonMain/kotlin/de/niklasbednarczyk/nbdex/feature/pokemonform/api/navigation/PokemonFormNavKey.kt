package de.niklasbednarczyk.nbdex.feature.pokemonform.api.navigation

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import kotlinx.serialization.Serializable

@Serializable
data class PokemonFormNavKey(
    val id: CorePokemonFormId,
) : NBNavKey

fun NBNavigator.navigateToPokemonForm(
    id: CorePokemonFormId,
) {
    navigate(
        PokemonFormNavKey(
            id = id,
        ),
    )
}
