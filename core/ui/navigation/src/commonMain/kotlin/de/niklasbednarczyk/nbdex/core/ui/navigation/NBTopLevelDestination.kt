package de.niklasbednarczyk.nbdex.core.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import de.niklasbednarczyk.nbdex.core.common.util.string.nbCapitalize
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Lightbulb2
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Lightbulb2Filled
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.MenuBook
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.MenuBookFilled
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.MoreHoriz
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.info_title
import nbdex.core.ui.resource.generated.resources.more_title
import nbdex.core.ui.resource.generated.resources.pokedex_title
import org.jetbrains.compose.resources.StringResource

enum class NBTopLevelDestination {
    POKEDEX,
    INFO,
    MORE;

    val titleStringResource: StringResource
        get() = when (this) {
            POKEDEX -> Res.string.pokedex_title
            INFO -> Res.string.info_title
            MORE -> Res.string.more_title
        }

    val selectedIcon: ImageVector
        get() = when (this) {
            POKEDEX -> NBIcons.Material.MenuBookFilled
            INFO -> NBIcons.Material.Lightbulb2Filled
            MORE -> NBIcons.Material.MoreHoriz
        }

    val unselectedIcon: ImageVector
        get() = when (this) {
            POKEDEX -> NBIcons.Material.MenuBook
            INFO -> NBIcons.Material.Lightbulb2
            MORE -> NBIcons.Material.MoreHoriz
        }

    val sceneKey: String
        get() = "SceneKey${name.nbCapitalize()}"
}
