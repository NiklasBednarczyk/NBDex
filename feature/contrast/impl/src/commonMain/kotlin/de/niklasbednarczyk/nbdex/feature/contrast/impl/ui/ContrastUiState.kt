package de.niklasbednarczyk.nbdex.feature.contrast.impl.ui

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast

internal sealed interface ContrastUiState {

    data object Initial : ContrastUiState

    data class Success(
        val selectedContrast: CoreSettingsContrast,
    ) : ContrastUiState {

        val contrasts: List<CoreSettingsContrast>
            get() = CoreSettingsContrast.entries

    }

}