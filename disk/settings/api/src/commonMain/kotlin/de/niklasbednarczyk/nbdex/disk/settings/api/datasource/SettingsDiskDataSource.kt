package de.niklasbednarczyk.nbdex.disk.settings.api.datasource

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettings
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import kotlinx.coroutines.flow.Flow

interface SettingsDiskDataSource {

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