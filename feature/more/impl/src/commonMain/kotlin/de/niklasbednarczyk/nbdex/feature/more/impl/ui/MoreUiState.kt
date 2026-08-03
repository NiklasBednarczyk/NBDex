package de.niklasbednarczyk.nbdex.feature.more.impl.ui

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.feature.more.impl.ui.model.MoreDestination
import de.niklasbednarczyk.nbdex.feature.more.impl.ui.model.MoreSection

internal sealed interface MoreUiState {

    data object Initial : MoreUiState

    data class Success(
        val selectedDestination: MoreDestination?,
        val selectedTheme: CoreSettingsTheme,
        val selectedContrast: CoreSettingsContrast,
    ) : MoreUiState {

        val sectionsWithDestinations: Map<MoreSection, List<MoreDestination>>
            get() = mapOf(
                MoreSection.SETTINGS to listOf(
                    MoreDestination.THEME,
                    MoreDestination.CONTRAST,
                ),
                MoreSection.OTHER to listOf(
                    MoreDestination.ABOUT,
                ),
            )

    }

}