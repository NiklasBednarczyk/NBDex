package de.niklasbednarczyk.nbdex.disk.settings.impl.mapper

import de.niklasbednarczyk.nbdex.core.disk.mapper.NBDiskMessageMapper
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettings
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.disk.settings.impl.proto.DiskSettings

internal object DiskSettingsMapper : NBDiskMessageMapper<CoreSettings, DiskSettings> {

    override fun diskToModel(disk: DiskSettings): CoreSettings {
        return CoreSettings(
            paneExpansionAnchor = DiskSettingsPaneExpansionAnchorMapper.diskToModelNullable(
                disk = disk.paneExpansionAnchor,
            ),
            theme = DiskSettingsThemeMapper.diskToModelNullable(
                disk = disk.theme,
            ) ?: CoreSettingsTheme.SYSTEM_DEFAULT,
            contrast = DiskSettingsContrastMapper.diskToModelNullable(
                disk = disk.contrast,
            ) ?: CoreSettingsContrast.STANDARD,
        )
    }

}