package de.niklasbednarczyk.nbdex.feature.more.impl.ui.model

import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.more_section_other
import nbdex.core.ui.resource.generated.resources.more_section_settings
import org.jetbrains.compose.resources.StringResource

enum class MoreSection {
    OTHER,
    SETTINGS,
    ;

    val titleStringResource: StringResource
        get() = when (this) {
            OTHER -> Res.string.more_section_other
            SETTINGS -> Res.string.more_section_settings
        }
}
