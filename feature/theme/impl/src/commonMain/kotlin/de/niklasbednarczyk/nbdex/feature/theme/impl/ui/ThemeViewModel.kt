package de.niklasbednarczyk.nbdex.feature.theme.impl.ui

import androidx.lifecycle.viewModelScope
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBViewModel
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.data.settings.api.repository.SettingsRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

internal class ThemeViewModel(
    private val navigation: NBNavigator,
    private val settingsRepository: SettingsRepository,
) : NBViewModel() {

    val uiState: StateFlow<ThemeUiState> = settingsRepository
        .getSettings()
        .map { settings ->
            ThemeUiState.Success(
                selectedTheme = settings.theme,
            )
        }
        .nbStateIn(ThemeUiState.Initial)

    fun navigateBack() {
        navigation.onBack()
    }

    fun updateTheme(
        theme: CoreSettingsTheme,
    ) {
        viewModelScope.launch {
            settingsRepository.updateTheme(
                theme = theme,
            )
        }
    }

}