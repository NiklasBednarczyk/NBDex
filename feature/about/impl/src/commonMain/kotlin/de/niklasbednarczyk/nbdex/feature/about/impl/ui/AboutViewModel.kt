package de.niklasbednarczyk.nbdex.feature.about.impl.ui

import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.DexViewModel
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator

internal class AboutViewModel(
    private val navigator: DexNavigator,
) : DexViewModel() {
    val uiState: AboutUiState = AboutUiState

    fun navigateBack() {
        navigator.onBack()
    }
}
