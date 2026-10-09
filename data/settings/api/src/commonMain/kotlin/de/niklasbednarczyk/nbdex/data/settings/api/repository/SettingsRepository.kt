package de.niklasbednarczyk.nbdex.data.settings.api.repository

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettings
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import kotlinx.coroutines.flow.Flow

interface SettingsRepository {
    fun getSettings(): Flow<CoreSettings>

    suspend fun updatePaneExpansionAnchor(
        paneExpansionAnchor: CoreSettingsPaneExpansionAnchor,
    )

    suspend fun updateTheme(
        theme: CoreSettingsTheme,
    )

    suspend fun updateContrast(
        contrast: CoreSettingsContrast,
    )
}
