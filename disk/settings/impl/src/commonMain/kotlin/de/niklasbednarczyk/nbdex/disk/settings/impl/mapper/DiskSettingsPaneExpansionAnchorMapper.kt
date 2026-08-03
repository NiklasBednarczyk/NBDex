package de.niklasbednarczyk.nbdex.disk.settings.impl.mapper

import de.niklasbednarczyk.nbdex.core.disk.mapper.NBDiskEnumMapper
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.disk.settings.impl.proto.DiskSettings

internal object DiskSettingsPaneExpansionAnchorMapper :
    NBDiskEnumMapper<CoreSettingsPaneExpansionAnchor, DiskSettings.PaneExpansionAnchor> {

    override fun modelToDisk(model: CoreSettingsPaneExpansionAnchor): DiskSettings.PaneExpansionAnchor {
        return when (model) {
            CoreSettingsPaneExpansionAnchor.FULL_LIST -> DiskSettings.PaneExpansionAnchor.FULL_LIST
            CoreSettingsPaneExpansionAnchor.FULL_DETAIL -> DiskSettings.PaneExpansionAnchor.FULL_DETAIL
            CoreSettingsPaneExpansionAnchor.HALF_LIST_HALF_DETAIL -> DiskSettings.PaneExpansionAnchor.HALF_LIST_HALF_DETAIL
            CoreSettingsPaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH -> DiskSettings.PaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH
            CoreSettingsPaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH_XL -> DiskSettings.PaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH_XL
        }
    }

    override fun diskToModel(disk: DiskSettings.PaneExpansionAnchor): CoreSettingsPaneExpansionAnchor {
        return when (disk) {
            DiskSettings.PaneExpansionAnchor.FULL_LIST -> CoreSettingsPaneExpansionAnchor.FULL_LIST
            DiskSettings.PaneExpansionAnchor.FULL_DETAIL -> CoreSettingsPaneExpansionAnchor.FULL_DETAIL
            DiskSettings.PaneExpansionAnchor.HALF_LIST_HALF_DETAIL -> CoreSettingsPaneExpansionAnchor.HALF_LIST_HALF_DETAIL
            DiskSettings.PaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH -> CoreSettingsPaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH
            DiskSettings.PaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH_XL -> CoreSettingsPaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH_XL
        }
    }

}