package de.niklasbednarczyk.nbdex.feature.theme.impl.ui

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

internal sealed interface ThemeUiState {
    data object Initial : ThemeUiState

    data class Success(
        val selectedTheme: CoreSettingsTheme,
    ) : ThemeUiState {
        val themes: ImmutableList<CoreSettingsTheme>
            get() = CoreSettingsTheme.entries.toImmutableList()
    }
}
