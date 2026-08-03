package de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.vector.ImageVector
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeType
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.NBExtendedColor
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
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

val CoreDisplayTypeType.extendedColor: NBExtendedColor
    @Composable @ReadOnlyComposable
    get() = when (this) {
        CoreDisplayTypeType.NORMAL -> NBTheme.extendedColors.type.normal
        CoreDisplayTypeType.FIGHTING -> NBTheme.extendedColors.type.fighting
        CoreDisplayTypeType.FLYING -> NBTheme.extendedColors.type.flying
        CoreDisplayTypeType.POISON -> NBTheme.extendedColors.type.poison
        CoreDisplayTypeType.GROUND -> NBTheme.extendedColors.type.ground
        CoreDisplayTypeType.ROCK -> NBTheme.extendedColors.type.rock
        CoreDisplayTypeType.BUG -> NBTheme.extendedColors.type.bug
        CoreDisplayTypeType.GHOST -> NBTheme.extendedColors.type.ghost
        CoreDisplayTypeType.STEEL -> NBTheme.extendedColors.type.steel
        CoreDisplayTypeType.FIRE -> NBTheme.extendedColors.type.fire
        CoreDisplayTypeType.WATER -> NBTheme.extendedColors.type.water
        CoreDisplayTypeType.GRASS -> NBTheme.extendedColors.type.grass
        CoreDisplayTypeType.ELECTRIC -> NBTheme.extendedColors.type.electric
        CoreDisplayTypeType.PSYCHIC -> NBTheme.extendedColors.type.psychic
        CoreDisplayTypeType.ICE -> NBTheme.extendedColors.type.ice
        CoreDisplayTypeType.DRAGON -> NBTheme.extendedColors.type.dragon
        CoreDisplayTypeType.DARK -> NBTheme.extendedColors.type.dark
        CoreDisplayTypeType.FAIRY -> NBTheme.extendedColors.type.fairy
        CoreDisplayTypeType.STELLAR -> NBTheme.extendedColors.type.stellar
        CoreDisplayTypeType.UNKNOWN -> NBTheme.extendedColors.type.unknown
        CoreDisplayTypeType.SHADOW -> NBTheme.extendedColors.type.shadow
    }

val CoreDisplayTypeType.icon: ImageVector?
    get() = when (this) {
        CoreDisplayTypeType.NORMAL -> NBIcons.Type.Normal
        CoreDisplayTypeType.FIGHTING -> NBIcons.Type.Fighting
        CoreDisplayTypeType.FLYING -> NBIcons.Type.Flying
        CoreDisplayTypeType.POISON -> NBIcons.Type.Poison
        CoreDisplayTypeType.GROUND -> NBIcons.Type.Ground
        CoreDisplayTypeType.ROCK -> NBIcons.Type.Rock
        CoreDisplayTypeType.BUG -> NBIcons.Type.Bug
        CoreDisplayTypeType.GHOST -> NBIcons.Type.Ghost
        CoreDisplayTypeType.STEEL -> NBIcons.Type.Steel
        CoreDisplayTypeType.FIRE -> NBIcons.Type.Fire
        CoreDisplayTypeType.WATER -> NBIcons.Type.Water
        CoreDisplayTypeType.GRASS -> NBIcons.Type.Grass
        CoreDisplayTypeType.ELECTRIC -> NBIcons.Type.Electric
        CoreDisplayTypeType.PSYCHIC -> NBIcons.Type.Psychic
        CoreDisplayTypeType.ICE -> NBIcons.Type.Ice
        CoreDisplayTypeType.DRAGON -> NBIcons.Type.Dragon
        CoreDisplayTypeType.DARK -> NBIcons.Type.Dark
        CoreDisplayTypeType.FAIRY -> NBIcons.Type.Fairy
        CoreDisplayTypeType.STELLAR,
        CoreDisplayTypeType.UNKNOWN,
        CoreDisplayTypeType.SHADOW -> null
    }
