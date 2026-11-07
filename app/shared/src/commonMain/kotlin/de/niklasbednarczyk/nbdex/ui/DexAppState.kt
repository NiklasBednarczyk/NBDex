package de.niklasbednarczyk.nbdex.ui

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme

sealed interface DexAppState {
    data object Initial : DexAppState

    data class Success(
        val paneExpansionAnchor: CoreSettingsPaneExpansionAnchor?,
        val theme: CoreSettingsTheme,
        val contrast: CoreSettingsContrast,
    ) : DexAppState
}
