package de.niklasbednarczyk.nbdex.core.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import de.niklasbednarczyk.nbdex.core.common.util.string.dexCapitalize
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
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

enum class DexTopLevelDestination {
    POKEDEX,
    INFO,
    MORE,
    ;

    val titleStringResource: StringResource
        get() = when (this) {
            POKEDEX -> Res.string.pokedex_title
            INFO -> Res.string.info_title
            MORE -> Res.string.more_title
        }

    val selectedIcon: ImageVector
        get() = when (this) {
            POKEDEX -> DexIcons.Material.MenuBookFilled
            INFO -> DexIcons.Material.Lightbulb2Filled
            MORE -> DexIcons.Material.MoreHoriz
        }

    val unselectedIcon: ImageVector
        get() = when (this) {
            POKEDEX -> DexIcons.Material.MenuBook
            INFO -> DexIcons.Material.Lightbulb2
            MORE -> DexIcons.Material.MoreHoriz
        }

    val sceneKey: String
        get() = "SceneKey${name.dexCapitalize()}"
}
