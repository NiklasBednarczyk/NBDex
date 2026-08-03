package de.niklasbednarczyk.nbdex.disk.settings.impl.mapper

import de.niklasbednarczyk.nbdex.core.disk.mapper.NBDiskEnumMapper
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.disk.settings.impl.proto.DiskSettings

internal object DiskSettingsContrastMapper :
    NBDiskEnumMapper<CoreSettingsContrast, DiskSettings.Contrast> {

    override fun modelToDisk(model: CoreSettingsContrast): DiskSettings.Contrast {
        return when (model) {
            CoreSettingsContrast.STANDARD -> DiskSettings.Contrast.STANDARD
            CoreSettingsContrast.MEDIUM -> DiskSettings.Contrast.MEDIUM
            CoreSettingsContrast.HIGH -> DiskSettings.Contrast.HIGH
        }
    }

    override fun diskToModel(disk: DiskSettings.Contrast): CoreSettingsContrast {
        return when (disk) {
            DiskSettings.Contrast.STANDARD -> CoreSettingsContrast.STANDARD
            DiskSettings.Contrast.MEDIUM -> CoreSettingsContrast.MEDIUM
            DiskSettings.Contrast.HIGH -> CoreSettingsContrast.HIGH
        }
    }

}