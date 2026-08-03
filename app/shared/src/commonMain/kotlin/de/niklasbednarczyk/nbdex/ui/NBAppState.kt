package de.niklasbednarczyk.nbdex.ui

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme

sealed interface NBAppState {

    data object Initial : NBAppState

    data class Success(
        val paneExpansionAnchor: CoreSettingsPaneExpansionAnchor?,
        val theme: CoreSettingsTheme,
        val contrast: CoreSettingsContrast,
    ) : NBAppState

}