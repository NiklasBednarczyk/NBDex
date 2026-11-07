package de.niklasbednarczyk.nbdex.feature.pokemonform.impl.ui

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.DexViewModel
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator
import de.niklasbednarczyk.nbdex.feature.pokemonform.api.navigation.PokemonFormNavKey
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf

internal class PokemonFormViewModel(
    navKey: PokemonFormNavKey,
    private val navigator: DexNavigator,
) : DexViewModel() {
    val id: StateFlow<CorePokemonFormId?> = flowOf(navKey.id).dexStateIn(null)

    fun navigateBack() {
        navigator.onBack()
    }
}
