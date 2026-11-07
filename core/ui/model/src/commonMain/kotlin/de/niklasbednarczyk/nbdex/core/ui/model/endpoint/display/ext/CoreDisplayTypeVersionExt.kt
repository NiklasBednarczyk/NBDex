package de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersion
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.DexExtendedColor
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

val CoreDisplayTypeVersion.extendedColor: DexExtendedColor
    @Composable @ReadOnlyComposable
    get() = when (this) {
        CoreDisplayTypeVersion.RED -> DexTheme.extendedColors.version.red
        CoreDisplayTypeVersion.BLUE -> DexTheme.extendedColors.version.blue
        CoreDisplayTypeVersion.YELLOW -> DexTheme.extendedColors.version.yellow
        CoreDisplayTypeVersion.GOLD -> DexTheme.extendedColors.version.gold
        CoreDisplayTypeVersion.SILVER -> DexTheme.extendedColors.version.silver
        CoreDisplayTypeVersion.CRYSTAL -> DexTheme.extendedColors.version.crystal
        CoreDisplayTypeVersion.RUBY -> DexTheme.extendedColors.version.ruby
        CoreDisplayTypeVersion.SAPPHIRE -> DexTheme.extendedColors.version.sapphire
        CoreDisplayTypeVersion.EMERALD -> DexTheme.extendedColors.version.emerald
        CoreDisplayTypeVersion.FIRE_RED -> DexTheme.extendedColors.version.fireRed
        CoreDisplayTypeVersion.LEAF_GREEN -> DexTheme.extendedColors.version.leafGreen
        CoreDisplayTypeVersion.DIAMOND -> DexTheme.extendedColors.version.diamond
        CoreDisplayTypeVersion.PEARL -> DexTheme.extendedColors.version.pearl
        CoreDisplayTypeVersion.PLATINUM -> DexTheme.extendedColors.version.platinum
        CoreDisplayTypeVersion.HEART_GOLD -> DexTheme.extendedColors.version.heartGold
        CoreDisplayTypeVersion.SOUL_SILVER -> DexTheme.extendedColors.version.soulSilver
        CoreDisplayTypeVersion.BLACK -> DexTheme.extendedColors.version.black
        CoreDisplayTypeVersion.WHITE -> DexTheme.extendedColors.version.white
        CoreDisplayTypeVersion.COLOSSEUM -> DexTheme.extendedColors.version.colosseum
        CoreDisplayTypeVersion.XD -> DexTheme.extendedColors.version.xd
        CoreDisplayTypeVersion.BLACK_2 -> DexTheme.extendedColors.version.black2
        CoreDisplayTypeVersion.WHITE_2 -> DexTheme.extendedColors.version.white2
        CoreDisplayTypeVersion.X -> DexTheme.extendedColors.version.x
        CoreDisplayTypeVersion.Y -> DexTheme.extendedColors.version.y
        CoreDisplayTypeVersion.OMEGA_RUBY -> DexTheme.extendedColors.version.omegaRuby
        CoreDisplayTypeVersion.ALPHA_SAPPHIRE -> DexTheme.extendedColors.version.alphaSapphire
        CoreDisplayTypeVersion.SUN -> DexTheme.extendedColors.version.sun
        CoreDisplayTypeVersion.MOON -> DexTheme.extendedColors.version.moon
        CoreDisplayTypeVersion.ULTRA_SUN -> DexTheme.extendedColors.version.ultraSun
        CoreDisplayTypeVersion.ULTRA_MOON -> DexTheme.extendedColors.version.ultraMoon
        CoreDisplayTypeVersion.LETS_GO_PIKACHU -> DexTheme.extendedColors.version.letsGoPikachu
        CoreDisplayTypeVersion.LETS_GO_EEVEE -> DexTheme.extendedColors.version.letsGoEevee
        CoreDisplayTypeVersion.SWORD -> DexTheme.extendedColors.version.sword
        CoreDisplayTypeVersion.SHIELD -> DexTheme.extendedColors.version.shield
        CoreDisplayTypeVersion.THE_ISLE_OF_ARMOR_SWORD -> DexTheme.extendedColors.version.theIsleOfArmor
        CoreDisplayTypeVersion.THE_CROWN_TUNDRA_SWORD -> DexTheme.extendedColors.version.theCrownTundra
        CoreDisplayTypeVersion.BRILLIANT_DIAMOND -> DexTheme.extendedColors.version.brilliantDiamond
        CoreDisplayTypeVersion.SHINING_PEARL -> DexTheme.extendedColors.version.shiningPearl
        CoreDisplayTypeVersion.LEGENDS_ARCEUS -> DexTheme.extendedColors.version.legendsArceus
        CoreDisplayTypeVersion.SCARLET -> DexTheme.extendedColors.version.scarlet
        CoreDisplayTypeVersion.VIOLET -> DexTheme.extendedColors.version.violet
        CoreDisplayTypeVersion.THE_TEAL_MASK_SCARLET -> DexTheme.extendedColors.version.theTealMask
        CoreDisplayTypeVersion.THE_INDIGO_DISK_SCARLET -> DexTheme.extendedColors.version.theIndigoDisk
        CoreDisplayTypeVersion.RED_JAPAN -> DexTheme.extendedColors.version.red
        CoreDisplayTypeVersion.GREEN_JAPAN -> DexTheme.extendedColors.version.green
        CoreDisplayTypeVersion.BLUE_JAPAN -> DexTheme.extendedColors.version.blue
        CoreDisplayTypeVersion.LEGENDS_ZA -> DexTheme.extendedColors.version.legendsZa
        CoreDisplayTypeVersion.MEGA_DIMENSION -> DexTheme.extendedColors.version.megaDimension
        CoreDisplayTypeVersion.CHAMPIONS -> DexTheme.extendedColors.version.champions
        CoreDisplayTypeVersion.THE_ISLE_OF_ARMOR_SHIELD -> DexTheme.extendedColors.version.theIsleOfArmor
        CoreDisplayTypeVersion.THE_CROWN_TUNDRA_SHIELD -> DexTheme.extendedColors.version.theCrownTundra
        CoreDisplayTypeVersion.THE_TEAL_MASK_VIOLET -> DexTheme.extendedColors.version.theTealMask
        CoreDisplayTypeVersion.THE_INDIGO_DISK_VIOLET -> DexTheme.extendedColors.version.theIndigoDisk
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
