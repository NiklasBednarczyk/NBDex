package de.niklasbednarczyk.nbdex.feature.about.impl.ui

import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBViewModel
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator

internal class AboutViewModel(
    private val navigator: NBNavigator,
) : NBViewModel() {

    val uiState: AboutUiState = AboutUiState

    fun navigateBack() {
        navigator.onBack()
    }

}