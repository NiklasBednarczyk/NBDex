package de.niklasbednarczyk.nbdex.feature.more.impl.ui.model

import androidx.compose.ui.graphics.vector.ImageVector
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Contrast
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Info
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.LightMode
import de.niklasbednarczyk.nbdex.feature.about.api.navigation.AboutNavKey
import de.niklasbednarczyk.nbdex.feature.contrast.api.navigation.ContrastNavKey
import de.niklasbednarczyk.nbdex.feature.theme.api.navigation.ThemeNavKey
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.about_title
import nbdex.core.ui.resource.generated.resources.contrast_title
import nbdex.core.ui.resource.generated.resources.theme_title
import org.jetbrains.compose.resources.StringResource

internal enum class MoreDestination {
    ABOUT,
    CONTRAST,
    THEME,
    ;

    val navKey: NBNavKey
        get() = when (this) {
            ABOUT -> AboutNavKey
            CONTRAST -> ContrastNavKey
            THEME -> ThemeNavKey
        }

    val titleStringResource: StringResource
        get() = when (this) {
            ABOUT -> Res.string.about_title
            CONTRAST -> Res.string.contrast_title
            THEME -> Res.string.theme_title
        }

    val leadingIcon: ImageVector
        get() = when (this) {
            ABOUT -> NBIcons.Material.Info
            CONTRAST -> NBIcons.Material.Contrast
            THEME -> NBIcons.Material.LightMode
        }
}
