package de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersion
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.NBExtendedColor
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_alpha_sapphire
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_black
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_black_2
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_blue
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_brilliant_diamond
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_champions
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_colosseum
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_crystal
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_diamond
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_emerald
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_fire_red
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_gold
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_green
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_heart_gold
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_leaf_green
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_legends_arceus
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_legends_za
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_lets_go_eevee
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_lets_go_pikachu
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_mega_dimension
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_moon
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_omega_ruby
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_pearl
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_platinum
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_red
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_ruby
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_sapphire
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_scarlet
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_shield
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_shining_pearl
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_silver
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_soul_silver
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_sun
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_sword
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_the_crown_tundra
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_the_indigo_disk
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_the_isle_of_armor
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_the_teal_mask
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_ultra_moon
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_ultra_sun
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_violet
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_white
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_white_2
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_x
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_xd
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_y
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_yellow
import org.jetbrains.compose.resources.StringResource

val CoreDisplayTypeVersion.extendedColor: NBExtendedColor
    @Composable @ReadOnlyComposable
    get() = when (this) {
        CoreDisplayTypeVersion.RED -> NBTheme.extendedColors.version.red
        CoreDisplayTypeVersion.BLUE -> NBTheme.extendedColors.version.blue
        CoreDisplayTypeVersion.YELLOW -> NBTheme.extendedColors.version.yellow
        CoreDisplayTypeVersion.GOLD -> NBTheme.extendedColors.version.gold
        CoreDisplayTypeVersion.SILVER -> NBTheme.extendedColors.version.silver
        CoreDisplayTypeVersion.CRYSTAL -> NBTheme.extendedColors.version.crystal
        CoreDisplayTypeVersion.RUBY -> NBTheme.extendedColors.version.ruby
        CoreDisplayTypeVersion.SAPPHIRE -> NBTheme.extendedColors.version.sapphire
        CoreDisplayTypeVersion.EMERALD -> NBTheme.extendedColors.version.emerald
        CoreDisplayTypeVersion.FIRE_RED -> NBTheme.extendedColors.version.fireRed
        CoreDisplayTypeVersion.LEAF_GREEN -> NBTheme.extendedColors.version.leafGreen
        CoreDisplayTypeVersion.DIAMOND -> NBTheme.extendedColors.version.diamond
        CoreDisplayTypeVersion.PEARL -> NBTheme.extendedColors.version.pearl
        CoreDisplayTypeVersion.PLATINUM -> NBTheme.extendedColors.version.platinum
        CoreDisplayTypeVersion.HEART_GOLD -> NBTheme.extendedColors.version.heartGold
        CoreDisplayTypeVersion.SOUL_SILVER -> NBTheme.extendedColors.version.soulSilver
        CoreDisplayTypeVersion.BLACK -> NBTheme.extendedColors.version.black
        CoreDisplayTypeVersion.WHITE -> NBTheme.extendedColors.version.white
        CoreDisplayTypeVersion.COLOSSEUM -> NBTheme.extendedColors.version.colosseum
        CoreDisplayTypeVersion.XD -> NBTheme.extendedColors.version.xd
        CoreDisplayTypeVersion.BLACK_2 -> NBTheme.extendedColors.version.black2
        CoreDisplayTypeVersion.WHITE_2 -> NBTheme.extendedColors.version.white2
        CoreDisplayTypeVersion.X -> NBTheme.extendedColors.version.x
        CoreDisplayTypeVersion.Y -> NBTheme.extendedColors.version.y
        CoreDisplayTypeVersion.OMEGA_RUBY -> NBTheme.extendedColors.version.omegaRuby
        CoreDisplayTypeVersion.ALPHA_SAPPHIRE -> NBTheme.extendedColors.version.alphaSapphire
        CoreDisplayTypeVersion.SUN -> NBTheme.extendedColors.version.sun
        CoreDisplayTypeVersion.MOON -> NBTheme.extendedColors.version.moon
        CoreDisplayTypeVersion.ULTRA_SUN -> NBTheme.extendedColors.version.ultraSun
        CoreDisplayTypeVersion.ULTRA_MOON -> NBTheme.extendedColors.version.ultraMoon
        CoreDisplayTypeVersion.LETS_GO_PIKACHU -> NBTheme.extendedColors.version.letsGoPikachu
        CoreDisplayTypeVersion.LETS_GO_EEVEE -> NBTheme.extendedColors.version.letsGoEevee
        CoreDisplayTypeVersion.SWORD -> NBTheme.extendedColors.version.sword
        CoreDisplayTypeVersion.SHIELD -> NBTheme.extendedColors.version.shield
        CoreDisplayTypeVersion.THE_ISLE_OF_ARMOR_SWORD -> NBTheme.extendedColors.version.theIsleOfArmor
        CoreDisplayTypeVersion.THE_CROWN_TUNDRA_SWORD -> NBTheme.extendedColors.version.theCrownTundra
        CoreDisplayTypeVersion.BRILLIANT_DIAMOND -> NBTheme.extendedColors.version.brilliantDiamond
        CoreDisplayTypeVersion.SHINING_PEARL -> NBTheme.extendedColors.version.shiningPearl
        CoreDisplayTypeVersion.LEGENDS_ARCEUS -> NBTheme.extendedColors.version.legendsArceus
        CoreDisplayTypeVersion.SCARLET -> NBTheme.extendedColors.version.scarlet
        CoreDisplayTypeVersion.VIOLET -> NBTheme.extendedColors.version.violet
        CoreDisplayTypeVersion.THE_TEAL_MASK_SCARLET -> NBTheme.extendedColors.version.theTealMask
        CoreDisplayTypeVersion.THE_INDIGO_DISK_SCARLET -> NBTheme.extendedColors.version.theIndigoDisk
        CoreDisplayTypeVersion.RED_JAPAN -> NBTheme.extendedColors.version.red
        CoreDisplayTypeVersion.GREEN_JAPAN -> NBTheme.extendedColors.version.green
        CoreDisplayTypeVersion.BLUE_JAPAN -> NBTheme.extendedColors.version.blue
        CoreDisplayTypeVersion.LEGENDS_ZA -> NBTheme.extendedColors.version.legendsZa
        CoreDisplayTypeVersion.MEGA_DIMENSION -> NBTheme.extendedColors.version.megaDimension
        CoreDisplayTypeVersion.CHAMPIONS -> NBTheme.extendedColors.version.champions
        CoreDisplayTypeVersion.THE_ISLE_OF_ARMOR_SHIELD -> NBTheme.extendedColors.version.theIsleOfArmor
        CoreDisplayTypeVersion.THE_CROWN_TUNDRA_SHIELD -> NBTheme.extendedColors.version.theCrownTundra
        CoreDisplayTypeVersion.THE_TEAL_MASK_VIOLET -> NBTheme.extendedColors.version.theTealMask
        CoreDisplayTypeVersion.THE_INDIGO_DISK_VIOLET -> NBTheme.extendedColors.version.theIndigoDisk
    }

val CoreDisplayTypeVersion.stringResourceAbbreviation: StringResource
    @Composable @ReadOnlyComposable
    get() = when (this) {
        CoreDisplayTypeVersion.RED -> Res.string.common_endpoint_version_abbreviation_red
        CoreDisplayTypeVersion.BLUE -> Res.string.common_endpoint_version_abbreviation_blue
        CoreDisplayTypeVersion.YELLOW -> Res.string.common_endpoint_version_abbreviation_yellow
        CoreDisplayTypeVersion.GOLD -> Res.string.common_endpoint_version_abbreviation_gold
        CoreDisplayTypeVersion.SILVER -> Res.string.common_endpoint_version_abbreviation_silver
        CoreDisplayTypeVersion.CRYSTAL -> Res.string.common_endpoint_version_abbreviation_crystal
        CoreDisplayTypeVersion.RUBY -> Res.string.common_endpoint_version_abbreviation_ruby
        CoreDisplayTypeVersion.SAPPHIRE -> Res.string.common_endpoint_version_abbreviation_sapphire
        CoreDisplayTypeVersion.EMERALD -> Res.string.common_endpoint_version_abbreviation_emerald
        CoreDisplayTypeVersion.FIRE_RED -> Res.string.common_endpoint_version_abbreviation_fire_red
        CoreDisplayTypeVersion.LEAF_GREEN -> Res.string.common_endpoint_version_abbreviation_leaf_green
        CoreDisplayTypeVersion.DIAMOND -> Res.string.common_endpoint_version_abbreviation_diamond
        CoreDisplayTypeVersion.PEARL -> Res.string.common_endpoint_version_abbreviation_pearl
        CoreDisplayTypeVersion.PLATINUM -> Res.string.common_endpoint_version_abbreviation_platinum
        CoreDisplayTypeVersion.HEART_GOLD -> Res.string.common_endpoint_version_abbreviation_heart_gold
        CoreDisplayTypeVersion.SOUL_SILVER -> Res.string.common_endpoint_version_abbreviation_soul_silver
        CoreDisplayTypeVersion.BLACK -> Res.string.common_endpoint_version_abbreviation_black
        CoreDisplayTypeVersion.WHITE -> Res.string.common_endpoint_version_abbreviation_white
        CoreDisplayTypeVersion.COLOSSEUM -> Res.string.common_endpoint_version_abbreviation_colosseum
        CoreDisplayTypeVersion.XD -> Res.string.common_endpoint_version_abbreviation_xd
        CoreDisplayTypeVersion.BLACK_2 -> Res.string.common_endpoint_version_abbreviation_black_2
        CoreDisplayTypeVersion.WHITE_2 -> Res.string.common_endpoint_version_abbreviation_white_2
        CoreDisplayTypeVersion.X -> Res.string.common_endpoint_version_abbreviation_x
        CoreDisplayTypeVersion.Y -> Res.string.common_endpoint_version_abbreviation_y
        CoreDisplayTypeVersion.OMEGA_RUBY -> Res.string.common_endpoint_version_abbreviation_omega_ruby
        CoreDisplayTypeVersion.ALPHA_SAPPHIRE -> Res.string.common_endpoint_version_abbreviation_alpha_sapphire
        CoreDisplayTypeVersion.SUN -> Res.string.common_endpoint_version_abbreviation_sun
        CoreDisplayTypeVersion.MOON -> Res.string.common_endpoint_version_abbreviation_moon
        CoreDisplayTypeVersion.ULTRA_SUN -> Res.string.common_endpoint_version_abbreviation_ultra_sun
        CoreDisplayTypeVersion.ULTRA_MOON -> Res.string.common_endpoint_version_abbreviation_ultra_moon
        CoreDisplayTypeVersion.LETS_GO_PIKACHU -> Res.string.common_endpoint_version_abbreviation_lets_go_pikachu
        CoreDisplayTypeVersion.LETS_GO_EEVEE -> Res.string.common_endpoint_version_abbreviation_lets_go_eevee
        CoreDisplayTypeVersion.SWORD -> Res.string.common_endpoint_version_abbreviation_sword
        CoreDisplayTypeVersion.SHIELD -> Res.string.common_endpoint_version_abbreviation_shield
        CoreDisplayTypeVersion.THE_ISLE_OF_ARMOR_SWORD -> Res.string.common_endpoint_version_abbreviation_the_isle_of_armor
        CoreDisplayTypeVersion.THE_CROWN_TUNDRA_SWORD -> Res.string.common_endpoint_version_abbreviation_the_crown_tundra
        CoreDisplayTypeVersion.BRILLIANT_DIAMOND -> Res.string.common_endpoint_version_abbreviation_brilliant_diamond
        CoreDisplayTypeVersion.SHINING_PEARL -> Res.string.common_endpoint_version_abbreviation_shining_pearl
        CoreDisplayTypeVersion.LEGENDS_ARCEUS -> Res.string.common_endpoint_version_abbreviation_legends_arceus
        CoreDisplayTypeVersion.SCARLET -> Res.string.common_endpoint_version_abbreviation_scarlet
        CoreDisplayTypeVersion.VIOLET -> Res.string.common_endpoint_version_abbreviation_violet
        CoreDisplayTypeVersion.THE_TEAL_MASK_SCARLET -> Res.string.common_endpoint_version_abbreviation_the_teal_mask
        CoreDisplayTypeVersion.THE_INDIGO_DISK_SCARLET -> Res.string.common_endpoint_version_abbreviation_the_indigo_disk
        CoreDisplayTypeVersion.RED_JAPAN -> Res.string.common_endpoint_version_abbreviation_red
        CoreDisplayTypeVersion.GREEN_JAPAN -> Res.string.common_endpoint_version_abbreviation_green
        CoreDisplayTypeVersion.BLUE_JAPAN -> Res.string.common_endpoint_version_abbreviation_blue
        CoreDisplayTypeVersion.LEGENDS_ZA -> Res.string.common_endpoint_version_abbreviation_legends_za
        CoreDisplayTypeVersion.MEGA_DIMENSION -> Res.string.common_endpoint_version_abbreviation_mega_dimension
        CoreDisplayTypeVersion.CHAMPIONS -> Res.string.common_endpoint_version_abbreviation_champions
        CoreDisplayTypeVersion.THE_ISLE_OF_ARMOR_SHIELD -> Res.string.common_endpoint_version_abbreviation_the_isle_of_armor
        CoreDisplayTypeVersion.THE_CROWN_TUNDRA_SHIELD -> Res.string.common_endpoint_version_abbreviation_the_crown_tundra
        CoreDisplayTypeVersion.THE_TEAL_MASK_VIOLET -> Res.string.common_endpoint_version_abbreviation_the_teal_mask
        CoreDisplayTypeVersion.THE_INDIGO_DISK_VIOLET -> Res.string.common_endpoint_version_abbreviation_the_indigo_disk
    }
