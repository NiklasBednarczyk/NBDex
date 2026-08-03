package de.niklasbednarczyk.nbdex.data.settings.impl.repository

import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettings
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.data.settings.api.repository.SettingsRepository
import de.niklasbednarczyk.nbdex.disk.settings.api.datasource.SettingsDiskDataSource
import kotlinx.coroutines.flow.Flow

internal class SettingsRepositoryImpl(
    private val diskDataSource: SettingsDiskDataSource,
) : SettingsRepository {

    override fun getSettings(): Flow<CoreSettings> {
        return diskDataSource.getSettings()
    }

    override suspend fun updatePaneExpansionAnchor(
        paneExpansionAnchor: CoreSettingsPaneExpansionAnchor,
    ) {
        diskDataSource.updatePaneExpansionAnchor(
            paneExpansionAnchor = paneExpansionAnchor,
        )
    }

    override suspend fun updateTheme(
        theme: CoreSettingsTheme,
    ) {
        diskDataSource.updateTheme(
            theme = theme,
        )
    }

    override suspend fun updateContrast(
        contrast: CoreSettingsContrast,
    ) {
        diskDataSource.updateContrast(
            contrast = contrast,
        )
    }

}