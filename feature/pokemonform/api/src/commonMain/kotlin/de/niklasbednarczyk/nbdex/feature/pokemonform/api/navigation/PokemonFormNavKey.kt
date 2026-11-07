package de.niklasbednarczyk.nbdex.feature.pokemonform.api.navigation

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator
import kotlinx.serialization.Serializable

@Serializable
data class PokemonFormNavKey(
    val id: CorePokemonFormId,
) : DexNavKey

fun DexNavigator.navigateToPokemonForm(
    id: CorePokemonFormId,
) {
    navigate(
        PokemonFormNavKey(
            id = id,
        ),
    )
}
