package de.niklasbednarczyk.nbdex.disk.settings.impl.datasource

import de.niklasbednarczyk.nbdex.core.disk.constant.NBDataStoreName
import de.niklasbednarczyk.nbdex.core.disk.datasource.NBDiskDataSourceImpl
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettings
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.disk.settings.api.datasource.SettingsDiskDataSource
import de.niklasbednarczyk.nbdex.disk.settings.impl.mapper.DiskSettingsContrastMapper
import de.niklasbednarczyk.nbdex.disk.settings.impl.mapper.DiskSettingsMapper
import de.niklasbednarczyk.nbdex.disk.settings.impl.mapper.DiskSettingsPaneExpansionAnchorMapper
import de.niklasbednarczyk.nbdex.disk.settings.impl.mapper.DiskSettingsThemeMapper
import de.niklasbednarczyk.nbdex.disk.settings.impl.proto.DiskSettings
import kotlinx.coroutines.flow.Flow

internal class SettingsDiskDataSourceImpl : NBDiskDataSourceImpl<DiskSettings>(), SettingsDiskDataSource {
    override val dataStoreName: String
        get() = NBDataStoreName.SETTINGS

    override fun getSettings(): Flow<CoreSettings> {
        return getModelFlow(
            mapper = DiskSettingsMapper,
        )
    }

    override suspend fun updatePaneExpansionAnchor(
        paneExpansionAnchor: CoreSettingsPaneExpansionAnchor,
    ) {
        dataStore.updateData { settings ->
            settings.copy(
                paneExpansionAnchor = DiskSettingsPaneExpansionAnchorMapper.modelToDisk(
                    model = paneExpansionAnchor,
                ),
            )
        }
    }

    override suspend fun updateTheme(
        theme: CoreSettingsTheme,
    ) {
        dataStore.updateData { settings ->
            settings.copy(
                theme = DiskSettingsThemeMapper.modelToDisk(
                    model = theme,
                ),
            )
        }
    }

    override suspend fun updateContrast(
        contrast: CoreSettingsContrast,
    ) {
        dataStore.updateData { settings ->
            settings.copy(
                contrast = DiskSettingsContrastMapper.modelToDisk(
                    model = contrast,
                ),
            )
        }
    }
}
