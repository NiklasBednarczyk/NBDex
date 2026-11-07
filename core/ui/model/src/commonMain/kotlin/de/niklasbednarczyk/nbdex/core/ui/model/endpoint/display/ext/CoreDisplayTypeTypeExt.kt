package de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.vector.ImageVector
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeType
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.DexExtendedColor
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Bug
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Dark
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Dragon
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Electric
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Fairy
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Fighting
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Fire
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Flying
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Ghost
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Grass
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Ground
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Ice
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Normal
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Poison
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Psychic
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Rock
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Steel
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.type.Water

val CoreDisplayTypeType.extendedColor: DexExtendedColor
    @Composable @ReadOnlyComposable
    get() = when (this) {
        CoreDisplayTypeType.NORMAL -> DexTheme.extendedColors.type.normal
        CoreDisplayTypeType.FIGHTING -> DexTheme.extendedColors.type.fighting
        CoreDisplayTypeType.FLYING -> DexTheme.extendedColors.type.flying
        CoreDisplayTypeType.POISON -> DexTheme.extendedColors.type.poison
        CoreDisplayTypeType.GROUND -> DexTheme.extendedColors.type.ground
        CoreDisplayTypeType.ROCK -> DexTheme.extendedColors.type.rock
        CoreDisplayTypeType.BUG -> DexTheme.extendedColors.type.bug
        CoreDisplayTypeType.GHOST -> DexTheme.extendedColors.type.ghost
        CoreDisplayTypeType.STEEL -> DexTheme.extendedColors.type.steel
        CoreDisplayTypeType.FIRE -> DexTheme.extendedColors.type.fire
        CoreDisplayTypeType.WATER -> DexTheme.extendedColors.type.water
        CoreDisplayTypeType.GRASS -> DexTheme.extendedColors.type.grass
        CoreDisplayTypeType.ELECTRIC -> DexTheme.extendedColors.type.electric
        CoreDisplayTypeType.PSYCHIC -> DexTheme.extendedColors.type.psychic
        CoreDisplayTypeType.ICE -> DexTheme.extendedColors.type.ice
        CoreDisplayTypeType.DRAGON -> DexTheme.extendedColors.type.dragon
        CoreDisplayTypeType.DARK -> DexTheme.extendedColors.type.dark
        CoreDisplayTypeType.FAIRY -> DexTheme.extendedColors.type.fairy
        CoreDisplayTypeType.STELLAR -> DexTheme.extendedColors.type.stellar
        CoreDisplayTypeType.UNKNOWN -> DexTheme.extendedColors.type.unknown
        CoreDisplayTypeType.SHADOW -> DexTheme.extendedColors.type.shadow
    }

val CoreDisplayTypeType.icon: ImageVector?
    get() = when (this) {
        CoreDisplayTypeType.NORMAL -> DexIcons.Type.Normal
        CoreDisplayTypeType.FIGHTING -> DexIcons.Type.Fighting
        CoreDisplayTypeType.FLYING -> DexIcons.Type.Flying
        CoreDisplayTypeType.POISON -> DexIcons.Type.Poison
        CoreDisplayTypeType.GROUND -> DexIcons.Type.Ground
        CoreDisplayTypeType.ROCK -> DexIcons.Type.Rock
        CoreDisplayTypeType.BUG -> DexIcons.Type.Bug
        CoreDisplayTypeType.GHOST -> DexIcons.Type.Ghost
        CoreDisplayTypeType.STEEL -> DexIcons.Type.Steel
        CoreDisplayTypeType.FIRE -> DexIcons.Type.Fire
        CoreDisplayTypeType.WATER -> DexIcons.Type.Water
        CoreDisplayTypeType.GRASS -> DexIcons.Type.Grass
        CoreDisplayTypeType.ELECTRIC -> DexIcons.Type.Electric
        CoreDisplayTypeType.PSYCHIC -> DexIcons.Type.Psychic
        CoreDisplayTypeType.ICE -> DexIcons.Type.Ice
        CoreDisplayTypeType.DRAGON -> DexIcons.Type.Dragon
        CoreDisplayTypeType.DARK -> DexIcons.Type.Dark
        CoreDisplayTypeType.FAIRY -> DexIcons.Type.Fairy
        CoreDisplayTypeType.STELLAR -> null
        CoreDisplayTypeType.UNKNOWN -> null
        CoreDisplayTypeType.SHADOW -> null
    }
