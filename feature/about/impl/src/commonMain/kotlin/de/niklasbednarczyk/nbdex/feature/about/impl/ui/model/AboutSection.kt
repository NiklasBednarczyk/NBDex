package de.niklasbednarczyk.nbdex.feature.about.impl.ui.model

import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.about_section_app_info
import nbdex.core.ui.resource.generated.resources.about_section_credits
import nbdex.core.ui.resource.generated.resources.about_section_disclaimer
import org.jetbrains.compose.resources.StringResource

enum class AboutSection {
    APP_INFO,
    CREDITS,
    DISCLAIMER;

    val titleStringResource: StringResource
        get() = when (this) {
            APP_INFO -> Res.string.about_section_app_info
            CREDITS -> Res.string.about_section_credits
            DISCLAIMER -> Res.string.about_section_disclaimer
        }

}