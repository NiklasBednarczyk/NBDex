package de.niklasbednarczyk.nbdex.feature.contrast.impl.ui

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

internal sealed interface ContrastUiState {
    data object Initial : ContrastUiState

    data class Success(
        val selectedContrast: CoreSettingsContrast,
    ) : ContrastUiState {
        val contrasts: ImmutableList<CoreSettingsContrast>
            get() = CoreSettingsContrast.entries.toImmutableList()
    }
}
