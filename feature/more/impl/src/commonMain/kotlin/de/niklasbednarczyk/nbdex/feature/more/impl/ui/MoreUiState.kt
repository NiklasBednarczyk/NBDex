package de.niklasbednarczyk.nbdex.feature.more.impl.ui

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.feature.more.impl.ui.model.MoreDestination
import de.niklasbednarczyk.nbdex.feature.more.impl.ui.model.MoreSection
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.persistentMapOf

internal sealed interface MoreUiState {
    data object Initial : MoreUiState

    data class Success(
        val selectedDestination: MoreDestination?,
        val selectedTheme: CoreSettingsTheme,
        val selectedContrast: CoreSettingsContrast,
    ) : MoreUiState {
        val sectionsWithDestinations: ImmutableMap<MoreSection, List<MoreDestination>>
            get() = persistentMapOf(
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
