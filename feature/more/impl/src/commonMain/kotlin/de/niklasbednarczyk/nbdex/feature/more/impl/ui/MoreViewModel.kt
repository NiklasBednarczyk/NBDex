package de.niklasbednarczyk.nbdex.feature.more.impl.ui

import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBViewModel
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.data.settings.api.repository.SettingsRepository
import de.niklasbednarczyk.nbdex.feature.about.api.navigation.navigateToAbout
import de.niklasbednarczyk.nbdex.feature.contrast.api.navigation.navigateToContrast
import de.niklasbednarczyk.nbdex.feature.more.impl.ui.model.MoreDestination
import de.niklasbednarczyk.nbdex.feature.theme.api.navigation.navigateToTheme
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine

internal class MoreViewModel(
    private val navigator: NBNavigator,
    settingsRepository: SettingsRepository,
) : NBViewModel() {
    val uiState: StateFlow<MoreUiState> = combine(
        settingsRepository.getSettings(),
        navigator.state.currentKeyFlow,
    ) { settings, currentNavKey ->
        val selectedDestination = MoreDestination
            .entries
            .firstOrNull { destination -> destination.navKey == currentNavKey }

        MoreUiState.Success(
            selectedDestination = selectedDestination,
            selectedTheme = settings.theme,
            selectedContrast = settings.contrast,
        )
    }
        .nbStateIn(MoreUiState.Initial)

    fun navigateToAbout() {
        navigator.navigateToAbout()
    }

    fun navigateToContrast() {
        navigator.navigateToContrast()
    }

    fun navigateToTheme() {
        navigator.navigateToTheme()
    }
}
