package de.niklasbednarczyk.nbdex.disk.settings.impl.mapper

import de.niklasbednarczyk.nbdex.core.disk.mapper.NBDiskEnumMapper
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.disk.settings.impl.proto.DiskSettings

internal object DiskSettingsThemeMapper :
    NBDiskEnumMapper<CoreSettingsTheme, DiskSettings.Theme> {

    override fun modelToDisk(model: CoreSettingsTheme): DiskSettings.Theme {
        return when (model) {
            CoreSettingsTheme.SYSTEM_DEFAULT -> DiskSettings.Theme.SYSTEM_DEFAULT
            CoreSettingsTheme.LIGHT -> DiskSettings.Theme.LIGHT
            CoreSettingsTheme.DARK -> DiskSettings.Theme.DARK
        }
    }

    override fun diskToModel(disk: DiskSettings.Theme): CoreSettingsTheme {
        return when (disk) {
            DiskSettings.Theme.SYSTEM_DEFAULT -> CoreSettingsTheme.SYSTEM_DEFAULT
            DiskSettings.Theme.LIGHT -> CoreSettingsTheme.LIGHT
            DiskSettings.Theme.DARK -> CoreSettingsTheme.DARK
        }
    }

}