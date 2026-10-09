package de.niklasbednarczyk.nbdex.feature.pokemonform.impl.ui

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBViewModel
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.feature.pokemonform.api.navigation.PokemonFormNavKey
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf

internal class PokemonFormViewModel(
    navKey: PokemonFormNavKey,
    private val navigator: NBNavigator,
) : NBViewModel() {
    val id: StateFlow<CorePokemonFormId?> = flowOf(navKey.id).nbStateIn(null)

    fun navigateBack() {
        navigator.onBack()
    }
}
