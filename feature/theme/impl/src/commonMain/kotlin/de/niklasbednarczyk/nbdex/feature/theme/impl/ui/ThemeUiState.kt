package de.niklasbednarczyk.nbdex.feature.theme.impl.ui

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme

internal sealed interface ThemeUiState {

    data object Initial : ThemeUiState

    data class Success(
        val selectedTheme: CoreSettingsTheme,
    ) : ThemeUiState {

        val themes: List<CoreSettingsTheme>
            get() = CoreSettingsTheme.entries

    }

}