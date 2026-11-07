package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.version

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.DexExtendedColor

@Immutable
data class DexExtendedColorsVersion(
    /** Source color #26649C from https://bulbapedia.bulbagarden.net/wiki/Template:Alpha_Sapphire_color */
    val alphaSapphire: DexExtendedColor,
    /** Source color #444444 from https://bulbapedia.bulbagarden.net/wiki/Template:Black_color */
    val black: DexExtendedColor,
    /** Source color #303E51 from https://bulbapedia.bulbagarden.net/wiki/Template:Black_2_color */
    val black2: DexExtendedColor,
    /** Source color #2E50D8 from https://bulbapedia.bulbagarden.net/wiki/Template:Blue_color */
    val blue: DexExtendedColor,
    /** Source color #44BAE5 from https://bulbapedia.bulbagarden.net/wiki/Template:Brilliant_Diamond_color */
    val brilliantDiamond: DexExtendedColor,
    /** Source color #8477FB from https://bulbapedia.bulbagarden.net/wiki/Template:Champions_color */
    val champions: DexExtendedColor,
    /** Source color #B6CAE4 from https://bulbapedia.bulbagarden.net/wiki/Template:Colo_color */
    val colosseum: DexExtendedColor,
    /** Source color #4FD9FF from https://bulbapedia.bulbagarden.net/wiki/Template:Crystal_color */
    val crystal: DexExtendedColor,
    /** Source color #90BEED from https://bulbapedia.bulbagarden.net/wiki/Template:Diamond_color */
    val diamond: DexExtendedColor,
    /** Source color #009652 from https://bulbapedia.bulbagarden.net/wiki/Template:Emerald_color */
    val emerald: DexExtendedColor,
    /** Source color #F15C01 from https://bulbapedia.bulbagarden.net/wiki/Template:FireRed_color */
    val fireRed: DexExtendedColor,
    /** Source color #DAA520 from https://bulbapedia.bulbagarden.net/wiki/Template:Gold_color */
    val gold: DexExtendedColor,
    /** Source color #24A724 from https://bulbapedia.bulbagarden.net/wiki/Template:Green_color */
    val green: DexExtendedColor,
    /** Source color #E8B502 from https://bulbapedia.bulbagarden.net/wiki/Template:HeartGold_color */
    val heartGold: DexExtendedColor,
    /** Source color #9FDC00 from https://bulbapedia.bulbagarden.net/wiki/Template:LeafGreen_color */
    val leafGreen: DexExtendedColor,
    /** Source color #36597B from https://bulbapedia.bulbagarden.net/wiki/Template:Legends_Arceus_color */
    val legendsArceus: DexExtendedColor,
    /** Source color #31CA56 from https://bulbapedia.bulbagarden.net/wiki/Template:Legends_Z-A_color */
    val legendsZa: DexExtendedColor,
    /** Source color #D4924B from https://bulbapedia.bulbagarden.net/wiki/Template:Let%27s_Go_Eevee_color */
    val letsGoEevee: DexExtendedColor,
    /** Source color #F5DA26 from https://bulbapedia.bulbagarden.net/wiki/Template:Let%27s_Go_Pikachu_color */
    val letsGoPikachu: DexExtendedColor,
    /** Source color #C57DDC from https://bulbapedia.bulbagarden.net/wiki/Template:Mega_Dimension_color */
    val megaDimension: DexExtendedColor,
    /** Source color #5599CA from https://bulbapedia.bulbagarden.net/wiki/Template:Moon_color */
    val moon: DexExtendedColor,
    /** Source color #AB2813 from https://bulbapedia.bulbagarden.net/wiki/Template:Omega_Ruby_color */
    val omegaRuby: DexExtendedColor,
    /** Source color #DD7CB1 from https://bulbapedia.bulbagarden.net/wiki/Template:Pearl_color */
    val pearl: DexExtendedColor,
    /** Source color #A0A08D from https://bulbapedia.bulbagarden.net/wiki/Template:Platinum_color */
    val platinum: DexExtendedColor,
    /** Source color #DA3914 from https://bulbapedia.bulbagarden.net/wiki/Template:Red_color */
    val red: DexExtendedColor,
    /** Source color #CD2236 from https://bulbapedia.bulbagarden.net/wiki/Template:Ruby_color */
    val ruby: DexExtendedColor,
    /** Source color #3D51A7 from https://bulbapedia.bulbagarden.net/wiki/Template:Sapphire_color */
    val sapphire: DexExtendedColor,
    /** Source color #F34134 from https://bulbapedia.bulbagarden.net/wiki/Template:Scarlet_color */
    val scarlet: DexExtendedColor,
    /** Source color #BF004F from https://bulbapedia.bulbagarden.net/wiki/Template:Shield_color */
    val shield: DexExtendedColor,
    /** Source color #DA7D99 from https://bulbapedia.bulbagarden.net/wiki/Template:Shining_Pearl_color */
    val shiningPearl: DexExtendedColor,
    /** Source color #C0C0C0 from https://bulbapedia.bulbagarden.net/wiki/Template:Silver_color */
    val silver: DexExtendedColor,
    /** Source color #AAB9CF from https://bulbapedia.bulbagarden.net/wiki/Template:SoulSilver_color */
    val soulSilver: DexExtendedColor,
    /** Source color #F1912B from https://bulbapedia.bulbagarden.net/wiki/Template:Sun_color */
    val sun: DexExtendedColor,
    /** Source color #00A1E9 from https://bulbapedia.bulbagarden.net/wiki/Template:Sword_color */
    val sword: DexExtendedColor,
    /** Source color #15AE68 from https://bulbapedia.bulbagarden.net/wiki/Template:Crown_Tundra_color */
    val theCrownTundra: DexExtendedColor,
    /** Source color #004878 from https://bulbapedia.bulbagarden.net/wiki/Template:Indigo_Disk_color */
    val theIndigoDisk: DexExtendedColor,
    /** Source color #FCD00B from https://bulbapedia.bulbagarden.net/wiki/Template:Isle_of_Armor_color */
    val theIsleOfArmor: DexExtendedColor,
    /** Source color #00A398 from https://bulbapedia.bulbagarden.net/wiki/Template:Teal_Mask_color */
    val theTealMask: DexExtendedColor,
    /** Source color #226DB5 from https://bulbapedia.bulbagarden.net/wiki/Template:Ultra_Moon_color */
    val ultraMoon: DexExtendedColor,
    /** Source color #E95B2B from https://bulbapedia.bulbagarden.net/wiki/Template:Ultra_Sun_color */
    val ultraSun: DexExtendedColor,
    /** Source color #8334B7 from https://bulbapedia.bulbagarden.net/wiki/Template:Violet_color */
    val violet: DexExtendedColor,
    /** Source color #E1E1E1 from https://bulbapedia.bulbagarden.net/wiki/Template:White_color */
    val white: DexExtendedColor,
    /** Source color #EBC5C3 from https://bulbapedia.bulbagarden.net/wiki/Template:White_2_color */
    val white2: DexExtendedColor,
    /** Source color #025DA6 from https://bulbapedia.bulbagarden.net/wiki/Template:X_color */
    val x: DexExtendedColor,
    /** Source color #604E82 from https://bulbapedia.bulbagarden.net/wiki/Template:XD_color */
    val xd: DexExtendedColor,
    /** Source color #EA1A3E from https://bulbapedia.bulbagarden.net/wiki/Template:Y_color */
    val y: DexExtendedColor,
    /** Source color #FFD733 from https://bulbapedia.bulbagarden.net/wiki/Template:Yellow_color */
    val yellow: DexExtendedColor,
) {
    companion object {
        private val extendedColorsVersionLightStandardContrast = DexExtendedColorsVersion(
            alphaSapphire = DexExtendedColor(
                color = versionAlphaSapphireLightStandardContrast,
                onColor = onVersionAlphaSapphireLightStandardContrast,
            ),
            black = DexExtendedColor(
                color = versionBlackLightStandardContrast,
                onColor = onVersionBlackLightStandardContrast,
            ),
            black2 = DexExtendedColor(
                color = versionBlack2LightStandardContrast,
                onColor = onVersionBlack2LightStandardContrast,
            ),
            blue = DexExtendedColor(
                color = versionBlueLightStandardContrast,
                onColor = onVersionBlueLightStandardContrast,
            ),
            brilliantDiamond = DexExtendedColor(
                color = versionBrilliantDiamondLightStandardContrast,
                onColor = onVersionBrilliantDiamondLightStandardContrast,
            ),
            champions = DexExtendedColor(
                color = versionChampionsLightStandardContrast,
                onColor = onVersionChampionsLightStandardContrast,
            ),
            colosseum = DexExtendedColor(
                color = versionColosseumLightStandardContrast,
                onColor = onVersionColosseumLightStandardContrast,
            ),
            crystal = DexExtendedColor(
                color = versionCrystalLightStandardContrast,
                onColor = onVersionCrystalLightStandardContrast,
            ),
            diamond = DexExtendedColor(
                color = versionDiamondLightStandardContrast,
                onColor = onVersionDiamondLightStandardContrast,
            ),
            emerald = DexExtendedColor(
                color = versionEmeraldLightStandardContrast,
                onColor = onVersionEmeraldLightStandardContrast,
            ),
            fireRed = DexExtendedColor(
                color = versionFireRedLightStandardContrast,
                onColor = onVersionFireRedLightStandardContrast,
            ),
            gold = DexExtendedColor(
                color = versionGoldLightStandardContrast,
                onColor = onVersionGoldLightStandardContrast,
            ),
            green = DexExtendedColor(
                color = versionGreenLightStandardContrast,
                onColor = onVersionGreenLightStandardContrast,
            ),
            heartGold = DexExtendedColor(
                color = versionHeartGoldLightStandardContrast,
                onColor = onVersionHeartGoldLightStandardContrast,
            ),
            leafGreen = DexExtendedColor(
                color = versionLeafGreenLightStandardContrast,
                onColor = onVersionLeafGreenLightStandardContrast,
            ),
            legendsArceus = DexExtendedColor(
                color = versionLegendsArceusLightStandardContrast,
                onColor = onVersionLegendsArceusLightStandardContrast,
            ),
            legendsZa = DexExtendedColor(
                color = versionLegendsZaLightStandardContrast,
                onColor = onVersionLegendsZaLightStandardContrast,
            ),
            letsGoEevee = DexExtendedColor(
                color = versionLetsGoEeveeLightStandardContrast,
                onColor = onVersionLetsGoEeveeLightStandardContrast,
            ),
            letsGoPikachu = DexExtendedColor(
                color = versionLetsGoPikachuLightStandardContrast,
                onColor = onVersionLetsGoPikachuLightStandardContrast,
            ),
            megaDimension = DexExtendedColor(
                color = versionMegaDimensionLightStandardContrast,
                onColor = onVersionMegaDimensionLightStandardContrast,
            ),
            moon = DexExtendedColor(
                color = versionMoonLightStandardContrast,
                onColor = onVersionMoonLightStandardContrast,
            ),
            omegaRuby = DexExtendedColor(
                color = versionOmegaRubyLightStandardContrast,
                onColor = onVersionOmegaRubyLightStandardContrast,
            ),
            pearl = DexExtendedColor(
                color = versionPearlLightStandardContrast,
                onColor = onVersionPearlLightStandardContrast,
            ),
            platinum = DexExtendedColor(
                color = versionPlatinumLightStandardContrast,
                onColor = onVersionPlatinumLightStandardContrast,
            ),
            red = DexExtendedColor(
                color = versionRedLightStandardContrast,
                onColor = onVersionRedLightStandardContrast,
            ),
            ruby = DexExtendedColor(
                color = versionRubyLightStandardContrast,
                onColor = onVersionRubyLightStandardContrast,
            ),
            sapphire = DexExtendedColor(
                color = versionSapphireLightStandardContrast,
                onColor = onVersionSapphireLightStandardContrast,
            ),
            scarlet = DexExtendedColor(
                color = versionScarletLightStandardContrast,
                onColor = onVersionScarletLightStandardContrast,
            ),
            shield = DexExtendedColor(
                color = versionShieldLightStandardContrast,
                onColor = onVersionShieldLightStandardContrast,
            ),
            shiningPearl = DexExtendedColor(
                color = versionShiningPearlLightStandardContrast,
                onColor = onVersionShiningPearlLightStandardContrast,
            ),
            silver = DexExtendedColor(
                color = versionSilverLightStandardContrast,
                onColor = onVersionSilverLightStandardContrast,
            ),
            soulSilver = DexExtendedColor(
                color = versionSoulSilverLightStandardContrast,
                onColor = onVersionSoulSilverLightStandardContrast,
            ),
            sun = DexExtendedColor(
                color = versionSunLightStandardContrast,
                onColor = onVersionSunLightStandardContrast,
            ),
            sword = DexExtendedColor(
                color = versionSwordLightStandardContrast,
                onColor = onVersionSwordLightStandardContrast,
            ),
            theCrownTundra = DexExtendedColor(
                color = versionTheCrownTundraLightStandardContrast,
                onColor = onVersionTheCrownTundraLightStandardContrast,
            ),
            theIndigoDisk = DexExtendedColor(
                color = versionTheIndigoDiskLightStandardContrast,
                onColor = onVersionTheIndigoDiskLightStandardContrast,
            ),
            theIsleOfArmor = DexExtendedColor(
                color = versionTheIsleOfArmorLightStandardContrast,
                onColor = onVersionTheIsleOfArmorLightStandardContrast,
            ),
            theTealMask = DexExtendedColor(
                color = versionTheTealMaskLightStandardContrast,
                onColor = onVersionTheTealMaskLightStandardContrast,
            ),
            ultraMoon = DexExtendedColor(
                color = versionUltraMoonLightStandardContrast,
                onColor = onVersionUltraMoonLightStandardContrast,
            ),
            ultraSun = DexExtendedColor(
                color = versionUltraSunLightStandardContrast,
                onColor = onVersionUltraSunLightStandardContrast,
            ),
            violet = DexExtendedColor(
                color = versionVioletLightStandardContrast,
                onColor = onVersionVioletLightStandardContrast,
            ),
            white = DexExtendedColor(
                color = versionWhiteLightStandardContrast,
                onColor = onVersionWhiteLightStandardContrast,
            ),
            white2 = DexExtendedColor(
                color = versionWhite2LightStandardContrast,
                onColor = onVersionWhite2LightStandardContrast,
            ),
            x = DexExtendedColor(
                color = versionXLightStandardContrast,
                onColor = onVersionXLightStandardContrast,
            ),
            xd = DexExtendedColor(
                color = versionXdLightStandardContrast,
                onColor = onVersionXdLightStandardContrast,
            ),
            y = DexExtendedColor(
                color = versionYLightStandardContrast,
                onColor = onVersionYLightStandardContrast,
            ),
            yellow = DexExtendedColor(
                color = versionYellowLightStandardContrast,
                onColor = onVersionYellowLightStandardContrast,
            ),
        )

        private val extendedColorsVersionLightMediumContrast = DexExtendedColorsVersion(
            alphaSapphire = DexExtendedColor(
                color = versionAlphaSapphireLightMediumContrast,
                onColor = onVersionAlphaSapphireLightMediumContrast,
            ),
            black = DexExtendedColor(
                color = versionBlackLightMediumContrast,
                onColor = onVersionBlackLightMediumContrast,
            ),
            black2 = DexExtendedColor(
                color = versionBlack2LightMediumContrast,
                onColor = onVersionBlack2LightMediumContrast,
            ),
            blue = DexExtendedColor(
                color = versionBlueLightMediumContrast,
                onColor = onVersionBlueLightMediumContrast,
            ),
            brilliantDiamond = DexExtendedColor(
                color = versionBrilliantDiamondLightMediumContrast,
                onColor = onVersionBrilliantDiamondLightMediumContrast,
            ),
            champions = DexExtendedColor(
                color = versionChampionsLightMediumContrast,
                onColor = onVersionChampionsLightMediumContrast,
            ),
            colosseum = DexExtendedColor(
                color = versionColosseumLightMediumContrast,
                onColor = onVersionColosseumLightMediumContrast,
            ),
            crystal = DexExtendedColor(
                color = versionCrystalLightMediumContrast,
                onColor = onVersionCrystalLightMediumContrast,
            ),
            diamond = DexExtendedColor(
                color = versionDiamondLightMediumContrast,
                onColor = onVersionDiamondLightMediumContrast,
            ),
            emerald = DexExtendedColor(
                color = versionEmeraldLightMediumContrast,
                onColor = onVersionEmeraldLightMediumContrast,
            ),
            fireRed = DexExtendedColor(
                color = versionFireRedLightMediumContrast,
                onColor = onVersionFireRedLightMediumContrast,
            ),
            gold = DexExtendedColor(
                color = versionGoldLightMediumContrast,
                onColor = onVersionGoldLightMediumContrast,
            ),
            green = DexExtendedColor(
                color = versionGreenLightMediumContrast,
                onColor = onVersionGreenLightMediumContrast,
            ),
            heartGold = DexExtendedColor(
                color = versionHeartGoldLightMediumContrast,
                onColor = onVersionHeartGoldLightMediumContrast,
            ),
            leafGreen = DexExtendedColor(
                color = versionLeafGreenLightMediumContrast,
                onColor = onVersionLeafGreenLightMediumContrast,
            ),
            legendsArceus = DexExtendedColor(
                color = versionLegendsArceusLightMediumContrast,
                onColor = onVersionLegendsArceusLightMediumContrast,
            ),
            legendsZa = DexExtendedColor(
                color = versionLegendsZaLightMediumContrast,
                onColor = onVersionLegendsZaLightMediumContrast,
            ),
            letsGoEevee = DexExtendedColor(
                color = versionLetsGoEeveeLightMediumContrast,
                onColor = onVersionLetsGoEeveeLightMediumContrast,
            ),
            letsGoPikachu = DexExtendedColor(
                color = versionLetsGoPikachuLightMediumContrast,
                onColor = onVersionLetsGoPikachuLightMediumContrast,
            ),
            megaDimension = DexExtendedColor(
                color = versionMegaDimensionLightMediumContrast,
                onColor = onVersionMegaDimensionLightMediumContrast,
            ),
            moon = DexExtendedColor(
                color = versionMoonLightMediumContrast,
                onColor = onVersionMoonLightMediumContrast,
            ),
            omegaRuby = DexExtendedColor(
                color = versionOmegaRubyLightMediumContrast,
                onColor = onVersionOmegaRubyLightMediumContrast,
            ),
            pearl = DexExtendedColor(
                color = versionPearlLightMediumContrast,
                onColor = onVersionPearlLightMediumContrast,
            ),
            platinum = DexExtendedColor(
                color = versionPlatinumLightMediumContrast,
                onColor = onVersionPlatinumLightMediumContrast,
            ),
            red = DexExtendedColor(
                color = versionRedLightMediumContrast,
                onColor = onVersionRedLightMediumContrast,
            ),
            ruby = DexExtendedColor(
                color = versionRubyLightMediumContrast,
                onColor = onVersionRubyLightMediumContrast,
            ),
            sapphire = DexExtendedColor(
                color = versionSapphireLightMediumContrast,
                onColor = onVersionSapphireLightMediumContrast,
            ),
            scarlet = DexExtendedColor(
                color = versionScarletLightMediumContrast,
                onColor = onVersionScarletLightMediumContrast,
            ),
            shield = DexExtendedColor(
                color = versionShieldLightMediumContrast,
                onColor = onVersionShieldLightMediumContrast,
            ),
            shiningPearl = DexExtendedColor(
                color = versionShiningPearlLightMediumContrast,
                onColor = onVersionShiningPearlLightMediumContrast,
            ),
            silver = DexExtendedColor(
                color = versionSilverLightMediumContrast,
                onColor = onVersionSilverLightMediumContrast,
            ),
            soulSilver = DexExtendedColor(
                color = versionSoulSilverLightMediumContrast,
                onColor = onVersionSoulSilverLightMediumContrast,
            ),
            sun = DexExtendedColor(
                color = versionSunLightMediumContrast,
                onColor = onVersionSunLightMediumContrast,
            ),
            sword = DexExtendedColor(
                color = versionSwordLightMediumContrast,
                onColor = onVersionSwordLightMediumContrast,
            ),
            theCrownTundra = DexExtendedColor(
                color = versionTheCrownTundraLightMediumContrast,
                onColor = onVersionTheCrownTundraLightMediumContrast,
            ),
            theIndigoDisk = DexExtendedColor(
                color = versionTheIndigoDiskLightMediumContrast,
                onColor = onVersionTheIndigoDiskLightMediumContrast,
            ),
            theIsleOfArmor = DexExtendedColor(
                color = versionTheIsleOfArmorLightMediumContrast,
                onColor = onVersionTheIsleOfArmorLightMediumContrast,
            ),
            theTealMask = DexExtendedColor(
                color = versionTheTealMaskLightMediumContrast,
                onColor = onVersionTheTealMaskLightMediumContrast,
            ),
            ultraMoon = DexExtendedColor(
                color = versionUltraMoonLightMediumContrast,
                onColor = onVersionUltraMoonLightMediumContrast,
            ),
            ultraSun = DexExtendedColor(
                color = versionUltraSunLightMediumContrast,
                onColor = onVersionUltraSunLightMediumContrast,
            ),
            violet = DexExtendedColor(
                color = versionVioletLightMediumContrast,
                onColor = onVersionVioletLightMediumContrast,
            ),
            white = DexExtendedColor(
                color = versionWhiteLightMediumContrast,
                onColor = onVersionWhiteLightMediumContrast,
            ),
            white2 = DexExtendedColor(
                color = versionWhite2LightMediumContrast,
                onColor = onVersionWhite2LightMediumContrast,
            ),
            x = DexExtendedColor(
                color = versionXLightMediumContrast,
                onColor = onVersionXLightMediumContrast,
            ),
            xd = DexExtendedColor(
                color = versionXdLightMediumContrast,
                onColor = onVersionXdLightMediumContrast,
            ),
            y = DexExtendedColor(
                color = versionYLightMediumContrast,
                onColor = onVersionYLightMediumContrast,
            ),
            yellow = DexExtendedColor(
                color = versionYellowLightMediumContrast,
                onColor = onVersionYellowLightMediumContrast,
            ),
        )

        private val extendedColorsVersionLightHighContrast = DexExtendedColorsVersion(
            alphaSapphire = DexExtendedColor(
                color = versionAlphaSapphireLightHighContrast,
                onColor = onVersionAlphaSapphireLightHighContrast,
            ),
            black = DexExtendedColor(
                color = versionBlackLightHighContrast,
                onColor = onVersionBlackLightHighContrast,
            ),
            black2 = DexExtendedColor(
                color = versionBlack2LightHighContrast,
                onColor = onVersionBlack2LightHighContrast,
            ),
            blue = DexExtendedColor(
                color = versionBlueLightHighContrast,
                onColor = onVersionBlueLightHighContrast,
            ),
            brilliantDiamond = DexExtendedColor(
                color = versionBrilliantDiamondLightHighContrast,
                onColor = onVersionBrilliantDiamondLightHighContrast,
            ),
            champions = DexExtendedColor(
                color = versionChampionsLightHighContrast,
                onColor = onVersionChampionsLightHighContrast,
            ),
            colosseum = DexExtendedColor(
                color = versionColosseumLightHighContrast,
                onColor = onVersionColosseumLightHighContrast,
            ),
            crystal = DexExtendedColor(
                color = versionCrystalLightHighContrast,
                onColor = onVersionCrystalLightHighContrast,
            ),
            diamond = DexExtendedColor(
                color = versionDiamondLightHighContrast,
                onColor = onVersionDiamondLightHighContrast,
            ),
            emerald = DexExtendedColor(
                color = versionEmeraldLightHighContrast,
                onColor = onVersionEmeraldLightHighContrast,
            ),
            fireRed = DexExtendedColor(
                color = versionFireRedLightHighContrast,
                onColor = onVersionFireRedLightHighContrast,
            ),
            gold = DexExtendedColor(
                color = versionGoldLightHighContrast,
                onColor = onVersionGoldLightHighContrast,
            ),
            green = DexExtendedColor(
                color = versionGreenLightHighContrast,
                onColor = onVersionGreenLightHighContrast,
            ),
            heartGold = DexExtendedColor(
                color = versionHeartGoldLightHighContrast,
                onColor = onVersionHeartGoldLightHighContrast,
            ),
            leafGreen = DexExtendedColor(
                color = versionLeafGreenLightHighContrast,
                onColor = onVersionLeafGreenLightHighContrast,
            ),
            legendsArceus = DexExtendedColor(
                color = versionLegendsArceusLightHighContrast,
                onColor = onVersionLegendsArceusLightHighContrast,
            ),
            legendsZa = DexExtendedColor(
                color = versionLegendsZaLightHighContrast,
                onColor = onVersionLegendsZaLightHighContrast,
            ),
            letsGoEevee = DexExtendedColor(
                color = versionLetsGoEeveeLightHighContrast,
                onColor = onVersionLetsGoEeveeLightHighContrast,
            ),
            letsGoPikachu = DexExtendedColor(
                color = versionLetsGoPikachuLightHighContrast,
                onColor = onVersionLetsGoPikachuLightHighContrast,
            ),
            megaDimension = DexExtendedColor(
                color = versionMegaDimensionLightHighContrast,
                onColor = onVersionMegaDimensionLightHighContrast,
            ),
            moon = DexExtendedColor(
                color = versionMoonLightHighContrast,
                onColor = onVersionMoonLightHighContrast,
            ),
            omegaRuby = DexExtendedColor(
                color = versionOmegaRubyLightHighContrast,
                onColor = onVersionOmegaRubyLightHighContrast,
            ),
            pearl = DexExtendedColor(
                color = versionPearlLightHighContrast,
                onColor = onVersionPearlLightHighContrast,
            ),
            platinum = DexExtendedColor(
                color = versionPlatinumLightHighContrast,
                onColor = onVersionPlatinumLightHighContrast,
            ),
            red = DexExtendedColor(
                color = versionRedLightHighContrast,
                onColor = onVersionRedLightHighContrast,
            ),
            ruby = DexExtendedColor(
                color = versionRubyLightHighContrast,
                onColor = onVersionRubyLightHighContrast,
            ),
            sapphire = DexExtendedColor(
                color = versionSapphireLightHighContrast,
                onColor = onVersionSapphireLightHighContrast,
            ),
            scarlet = DexExtendedColor(
                color = versionScarletLightHighContrast,
                onColor = onVersionScarletLightHighContrast,
            ),
            shield = DexExtendedColor(
                color = versionShieldLightHighContrast,
                onColor = onVersionShieldLightHighContrast,
            ),
            shiningPearl = DexExtendedColor(
                color = versionShiningPearlLightHighContrast,
                onColor = onVersionShiningPearlLightHighContrast,
            ),
            silver = DexExtendedColor(
                color = versionSilverLightHighContrast,
                onColor = onVersionSilverLightHighContrast,
            ),
            soulSilver = DexExtendedColor(
                color = versionSoulSilverLightHighContrast,
                onColor = onVersionSoulSilverLightHighContrast,
            ),
            sun = DexExtendedColor(
                color = versionSunLightHighContrast,
                onColor = onVersionSunLightHighContrast,
            ),
            sword = DexExtendedColor(
                color = versionSwordLightHighContrast,
                onColor = onVersionSwordLightHighContrast,
            ),
            theCrownTundra = DexExtendedColor(
                color = versionTheCrownTundraLightHighContrast,
                onColor = onVersionTheCrownTundraLightHighContrast,
            ),
            theIndigoDisk = DexExtendedColor(
                color = versionTheIndigoDiskLightHighContrast,
                onColor = onVersionTheIndigoDiskLightHighContrast,
            ),
            theIsleOfArmor = DexExtendedColor(
                color = versionTheIsleOfArmorLightHighContrast,
                onColor = onVersionTheIsleOfArmorLightHighContrast,
            ),
            theTealMask = DexExtendedColor(
                color = versionTheTealMaskLightHighContrast,
                onColor = onVersionTheTealMaskLightHighContrast,
            ),
            ultraMoon = DexExtendedColor(
                color = versionUltraMoonLightHighContrast,
                onColor = onVersionUltraMoonLightHighContrast,
            ),
            ultraSun = DexExtendedColor(
                color = versionUltraSunLightHighContrast,
                onColor = onVersionUltraSunLightHighContrast,
            ),
            violet = DexExtendedColor(
                color = versionVioletLightHighContrast,
                onColor = onVersionVioletLightHighContrast,
            ),
            white = DexExtendedColor(
                color = versionWhiteLightHighContrast,
                onColor = onVersionWhiteLightHighContrast,
            ),
            white2 = DexExtendedColor(
                color = versionWhite2LightHighContrast,
                onColor = onVersionWhite2LightHighContrast,
            ),
            x = DexExtendedColor(
                color = versionXLightHighContrast,
                onColor = onVersionXLightHighContrast,
            ),
            xd = DexExtendedColor(
                color = versionXdLightHighContrast,
                onColor = onVersionXdLightHighContrast,
            ),
            y = DexExtendedColor(
                color = versionYLightHighContrast,
                onColor = onVersionYLightHighContrast,
            ),
            yellow = DexExtendedColor(
                color = versionYellowLightHighContrast,
                onColor = onVersionYellowLightHighContrast,
            ),
        )

        private val extendedColorsVersionDarkStandardContrast = DexExtendedColorsVersion(
            alphaSapphire = DexExtendedColor(
                color = versionAlphaSapphireDarkStandardContrast,
                onColor = onVersionAlphaSapphireDarkStandardContrast,
            ),
            black = DexExtendedColor(
                color = versionBlackDarkStandardContrast,
                onColor = onVersionBlackDarkStandardContrast,
            ),
            black2 = DexExtendedColor(
                color = versionBlack2DarkStandardContrast,
                onColor = onVersionBlack2DarkStandardContrast,
            ),
            blue = DexExtendedColor(
                color = versionBlueDarkStandardContrast,
                onColor = onVersionBlueDarkStandardContrast,
            ),
            brilliantDiamond = DexExtendedColor(
                color = versionBrilliantDiamondDarkStandardContrast,
                onColor = onVersionBrilliantDiamondDarkStandardContrast,
            ),
            champions = DexExtendedColor(
                color = versionChampionsDarkStandardContrast,
                onColor = onVersionChampionsDarkStandardContrast,
            ),
            colosseum = DexExtendedColor(
                color = versionColosseumDarkStandardContrast,
                onColor = onVersionColosseumDarkStandardContrast,
            ),
            crystal = DexExtendedColor(
                color = versionCrystalDarkStandardContrast,
                onColor = onVersionCrystalDarkStandardContrast,
            ),
            diamond = DexExtendedColor(
                color = versionDiamondDarkStandardContrast,
                onColor = onVersionDiamondDarkStandardContrast,
            ),
            emerald = DexExtendedColor(
                color = versionEmeraldDarkStandardContrast,
                onColor = onVersionEmeraldDarkStandardContrast,
            ),
            fireRed = DexExtendedColor(
                color = versionFireRedDarkStandardContrast,
                onColor = onVersionFireRedDarkStandardContrast,
            ),
            gold = DexExtendedColor(
                color = versionGoldDarkStandardContrast,
                onColor = onVersionGoldDarkStandardContrast,
            ),
            green = DexExtendedColor(
                color = versionGreenDarkStandardContrast,
                onColor = onVersionGreenDarkStandardContrast,
            ),
            heartGold = DexExtendedColor(
                color = versionHeartGoldDarkStandardContrast,
                onColor = onVersionHeartGoldDarkStandardContrast,
            ),
            leafGreen = DexExtendedColor(
                color = versionLeafGreenDarkStandardContrast,
                onColor = onVersionLeafGreenDarkStandardContrast,
            ),
            legendsArceus = DexExtendedColor(
                color = versionLegendsArceusDarkStandardContrast,
                onColor = onVersionLegendsArceusDarkStandardContrast,
            ),
            legendsZa = DexExtendedColor(
                color = versionLegendsZaDarkStandardContrast,
                onColor = onVersionLegendsZaDarkStandardContrast,
            ),
            letsGoEevee = DexExtendedColor(
                color = versionLetsGoEeveeDarkStandardContrast,
                onColor = onVersionLetsGoEeveeDarkStandardContrast,
            ),
            letsGoPikachu = DexExtendedColor(
                color = versionLetsGoPikachuDarkStandardContrast,
                onColor = onVersionLetsGoPikachuDarkStandardContrast,
            ),
            megaDimension = DexExtendedColor(
                color = versionMegaDimensionDarkStandardContrast,
                onColor = onVersionMegaDimensionDarkStandardContrast,
            ),
            moon = DexExtendedColor(
                color = versionMoonDarkStandardContrast,
                onColor = onVersionMoonDarkStandardContrast,
            ),
            omegaRuby = DexExtendedColor(
                color = versionOmegaRubyDarkStandardContrast,
                onColor = onVersionOmegaRubyDarkStandardContrast,
            ),
            pearl = DexExtendedColor(
                color = versionPearlDarkStandardContrast,
                onColor = onVersionPearlDarkStandardContrast,
            ),
            platinum = DexExtendedColor(
                color = versionPlatinumDarkStandardContrast,
                onColor = onVersionPlatinumDarkStandardContrast,
            ),
            red = DexExtendedColor(
                color = versionRedDarkStandardContrast,
                onColor = onVersionRedDarkStandardContrast,
            ),
            ruby = DexExtendedColor(
                color = versionRubyDarkStandardContrast,
                onColor = onVersionRubyDarkStandardContrast,
            ),
            sapphire = DexExtendedColor(
                color = versionSapphireDarkStandardContrast,
                onColor = onVersionSapphireDarkStandardContrast,
            ),
            scarlet = DexExtendedColor(
                color = versionScarletDarkStandardContrast,
                onColor = onVersionScarletDarkStandardContrast,
            ),
            shield = DexExtendedColor(
                color = versionShieldDarkStandardContrast,
                onColor = onVersionShieldDarkStandardContrast,
            ),
            shiningPearl = DexExtendedColor(
                color = versionShiningPearlDarkStandardContrast,
                onColor = onVersionShiningPearlDarkStandardContrast,
            ),
            silver = DexExtendedColor(
                color = versionSilverDarkStandardContrast,
                onColor = onVersionSilverDarkStandardContrast,
            ),
            soulSilver = DexExtendedColor(
                color = versionSoulSilverDarkStandardContrast,
                onColor = onVersionSoulSilverDarkStandardContrast,
            ),
            sun = DexExtendedColor(
                color = versionSunDarkStandardContrast,
                onColor = onVersionSunDarkStandardContrast,
            ),
            sword = DexExtendedColor(
                color = versionSwordDarkStandardContrast,
                onColor = onVersionSwordDarkStandardContrast,
            ),
            theCrownTundra = DexExtendedColor(
                color = versionTheCrownTundraDarkStandardContrast,
                onColor = onVersionTheCrownTundraDarkStandardContrast,
            ),
            theIndigoDisk = DexExtendedColor(
                color = versionTheIndigoDiskDarkStandardContrast,
                onColor = onVersionTheIndigoDiskDarkStandardContrast,
            ),
            theIsleOfArmor = DexExtendedColor(
                color = versionTheIsleOfArmorDarkStandardContrast,
                onColor = onVersionTheIsleOfArmorDarkStandardContrast,
            ),
            theTealMask = DexExtendedColor(
                color = versionTheTealMaskDarkStandardContrast,
                onColor = onVersionTheTealMaskDarkStandardContrast,
            ),
            ultraMoon = DexExtendedColor(
                color = versionUltraMoonDarkStandardContrast,
                onColor = onVersionUltraMoonDarkStandardContrast,
            ),
            ultraSun = DexExtendedColor(
                color = versionUltraSunDarkStandardContrast,
                onColor = onVersionUltraSunDarkStandardContrast,
            ),
            violet = DexExtendedColor(
                color = versionVioletDarkStandardContrast,
                onColor = onVersionVioletDarkStandardContrast,
            ),
            white = DexExtendedColor(
                color = versionWhiteDarkStandardContrast,
                onColor = onVersionWhiteDarkStandardContrast,
            ),
            white2 = DexExtendedColor(
                color = versionWhite2DarkStandardContrast,
                onColor = onVersionWhite2DarkStandardContrast,
            ),
            x = DexExtendedColor(
                color = versionXDarkStandardContrast,
                onColor = onVersionXDarkStandardContrast,
            ),
            xd = DexExtendedColor(
                color = versionXdDarkStandardContrast,
                onColor = onVersionXdDarkStandardContrast,
            ),
            y = DexExtendedColor(
                color = versionYDarkStandardContrast,
                onColor = onVersionYDarkStandardContrast,
            ),
            yellow = DexExtendedColor(
                color = versionYellowDarkStandardContrast,
                onColor = onVersionYellowDarkStandardContrast,
            ),
        )

        private val extendedColorsVersionDarkMediumContrast = DexExtendedColorsVersion(
            alphaSapphire = DexExtendedColor(
                color = versionAlphaSapphireDarkMediumContrast,
                onColor = onVersionAlphaSapphireDarkMediumContrast,
            ),
            black = DexExtendedColor(
                color = versionBlackDarkMediumContrast,
                onColor = onVersionBlackDarkMediumContrast,
            ),
            black2 = DexExtendedColor(
                color = versionBlack2DarkMediumContrast,
                onColor = onVersionBlack2DarkMediumContrast,
            ),
            blue = DexExtendedColor(
                color = versionBlueDarkMediumContrast,
                onColor = onVersionBlueDarkMediumContrast,
            ),
            brilliantDiamond = DexExtendedColor(
                color = versionBrilliantDiamondDarkMediumContrast,
                onColor = onVersionBrilliantDiamondDarkMediumContrast,
            ),
            champions = DexExtendedColor(
                color = versionChampionsDarkMediumContrast,
                onColor = onVersionChampionsDarkMediumContrast,
            ),
            colosseum = DexExtendedColor(
                color = versionColosseumDarkMediumContrast,
                onColor = onVersionColosseumDarkMediumContrast,
            ),
            crystal = DexExtendedColor(
                color = versionCrystalDarkMediumContrast,
                onColor = onVersionCrystalDarkMediumContrast,
            ),
            diamond = DexExtendedColor(
                color = versionDiamondDarkMediumContrast,
                onColor = onVersionDiamondDarkMediumContrast,
            ),
            emerald = DexExtendedColor(
                color = versionEmeraldDarkMediumContrast,
                onColor = onVersionEmeraldDarkMediumContrast,
            ),
            fireRed = DexExtendedColor(
                color = versionFireRedDarkMediumContrast,
                onColor = onVersionFireRedDarkMediumContrast,
            ),
            gold = DexExtendedColor(
                color = versionGoldDarkMediumContrast,
                onColor = onVersionGoldDarkMediumContrast,
            ),
            green = DexExtendedColor(
                color = versionGreenDarkMediumContrast,
                onColor = onVersionGreenDarkMediumContrast,
            ),
            heartGold = DexExtendedColor(
                color = versionHeartGoldDarkMediumContrast,
                onColor = onVersionHeartGoldDarkMediumContrast,
            ),
            leafGreen = DexExtendedColor(
                color = versionLeafGreenDarkMediumContrast,
                onColor = onVersionLeafGreenDarkMediumContrast,
            ),
            legendsArceus = DexExtendedColor(
                color = versionLegendsArceusDarkMediumContrast,
                onColor = onVersionLegendsArceusDarkMediumContrast,
            ),
            legendsZa = DexExtendedColor(
                color = versionLegendsZaDarkMediumContrast,
                onColor = onVersionLegendsZaDarkMediumContrast,
            ),
            letsGoEevee = DexExtendedColor(
                color = versionLetsGoEeveeDarkMediumContrast,
                onColor = onVersionLetsGoEeveeDarkMediumContrast,
            ),
            letsGoPikachu = DexExtendedColor(
                color = versionLetsGoPikachuDarkMediumContrast,
                onColor = onVersionLetsGoPikachuDarkMediumContrast,
            ),
            megaDimension = DexExtendedColor(
                color = versionMegaDimensionDarkMediumContrast,
                onColor = onVersionMegaDimensionDarkMediumContrast,
            ),
            moon = DexExtendedColor(
                color = versionMoonDarkMediumContrast,
                onColor = onVersionMoonDarkMediumContrast,
            ),
            omegaRuby = DexExtendedColor(
                color = versionOmegaRubyDarkMediumContrast,
                onColor = onVersionOmegaRubyDarkMediumContrast,
            ),
            pearl = DexExtendedColor(
                color = versionPearlDarkMediumContrast,
                onColor = onVersionPearlDarkMediumContrast,
            ),
            platinum = DexExtendedColor(
                color = versionPlatinumDarkMediumContrast,
                onColor = onVersionPlatinumDarkMediumContrast,
            ),
            red = DexExtendedColor(
                color = versionRedDarkMediumContrast,
                onColor = onVersionRedDarkMediumContrast,
            ),
            ruby = DexExtendedColor(
                color = versionRubyDarkMediumContrast,
                onColor = onVersionRubyDarkMediumContrast,
            ),
            sapphire = DexExtendedColor(
                color = versionSapphireDarkMediumContrast,
                onColor = onVersionSapphireDarkMediumContrast,
            ),
            scarlet = DexExtendedColor(
                color = versionScarletDarkMediumContrast,
                onColor = onVersionScarletDarkMediumContrast,
            ),
            shield = DexExtendedColor(
                color = versionShieldDarkMediumContrast,
                onColor = onVersionShieldDarkMediumContrast,
            ),
            shiningPearl = DexExtendedColor(
                color = versionShiningPearlDarkMediumContrast,
                onColor = onVersionShiningPearlDarkMediumContrast,
            ),
            silver = DexExtendedColor(
                color = versionSilverDarkMediumContrast,
                onColor = onVersionSilverDarkMediumContrast,
            ),
            soulSilver = DexExtendedColor(
                color = versionSoulSilverDarkMediumContrast,
                onColor = onVersionSoulSilverDarkMediumContrast,
            ),
            sun = DexExtendedColor(
                color = versionSunDarkMediumContrast,
                onColor = onVersionSunDarkMediumContrast,
            ),
            sword = DexExtendedColor(
                color = versionSwordDarkMediumContrast,
                onColor = onVersionSwordDarkMediumContrast,
            ),
            theCrownTundra = DexExtendedColor(
                color = versionTheCrownTundraDarkMediumContrast,
                onColor = onVersionTheCrownTundraDarkMediumContrast,
            ),
            theIndigoDisk = DexExtendedColor(
                color = versionTheIndigoDiskDarkMediumContrast,
                onColor = onVersionTheIndigoDiskDarkMediumContrast,
            ),
            theIsleOfArmor = DexExtendedColor(
                color = versionTheIsleOfArmorDarkMediumContrast,
                onColor = onVersionTheIsleOfArmorDarkMediumContrast,
            ),
            theTealMask = DexExtendedColor(
                color = versionTheTealMaskDarkMediumContrast,
                onColor = onVersionTheTealMaskDarkMediumContrast,
            ),
            ultraMoon = DexExtendedColor(
                color = versionUltraMoonDarkMediumContrast,
                onColor = onVersionUltraMoonDarkMediumContrast,
            ),
            ultraSun = DexExtendedColor(
                color = versionUltraSunDarkMediumContrast,
                onColor = onVersionUltraSunDarkMediumContrast,
            ),
            violet = DexExtendedColor(
                color = versionVioletDarkMediumContrast,
                onColor = onVersionVioletDarkMediumContrast,
            ),
            white = DexExtendedColor(
                color = versionWhiteDarkMediumContrast,
                onColor = onVersionWhiteDarkMediumContrast,
            ),
            white2 = DexExtendedColor(
                color = versionWhite2DarkMediumContrast,
                onColor = onVersionWhite2DarkMediumContrast,
            ),
            x = DexExtendedColor(
                color = versionXDarkMediumContrast,
                onColor = onVersionXDarkMediumContrast,
            ),
            xd = DexExtendedColor(
                color = versionXdDarkMediumContrast,
                onColor = onVersionXdDarkMediumContrast,
            ),
            y = DexExtendedColor(
                color = versionYDarkMediumContrast,
                onColor = onVersionYDarkMediumContrast,
            ),
            yellow = DexExtendedColor(
                color = versionYellowDarkMediumContrast,
                onColor = onVersionYellowDarkMediumContrast,
            ),
        )

        private val extendedColorsVersionDarkHighContrast = DexExtendedColorsVersion(
            alphaSapphire = DexExtendedColor(
                color = versionAlphaSapphireDarkHighContrast,
                onColor = onVersionAlphaSapphireDarkHighContrast,
            ),
            black = DexExtendedColor(
                color = versionBlackDarkHighContrast,
                onColor = onVersionBlackDarkHighContrast,
            ),
            black2 = DexExtendedColor(
                color = versionBlack2DarkHighContrast,
                onColor = onVersionBlack2DarkHighContrast,
            ),
            blue = DexExtendedColor(
                color = versionBlueDarkHighContrast,
                onColor = onVersionBlueDarkHighContrast,
            ),
            brilliantDiamond = DexExtendedColor(
                color = versionBrilliantDiamondDarkHighContrast,
                onColor = onVersionBrilliantDiamondDarkHighContrast,
            ),
            champions = DexExtendedColor(
                color = versionChampionsDarkHighContrast,
                onColor = onVersionChampionsDarkHighContrast,
            ),
            colosseum = DexExtendedColor(
                color = versionColosseumDarkHighContrast,
                onColor = onVersionColosseumDarkHighContrast,
            ),
            crystal = DexExtendedColor(
                color = versionCrystalDarkHighContrast,
                onColor = onVersionCrystalDarkHighContrast,
            ),
            diamond = DexExtendedColor(
                color = versionDiamondDarkHighContrast,
                onColor = onVersionDiamondDarkHighContrast,
            ),
            emerald = DexExtendedColor(
                color = versionEmeraldDarkHighContrast,
                onColor = onVersionEmeraldDarkHighContrast,
            ),
            fireRed = DexExtendedColor(
                color = versionFireRedDarkHighContrast,
                onColor = onVersionFireRedDarkHighContrast,
            ),
            gold = DexExtendedColor(
                color = versionGoldDarkHighContrast,
                onColor = onVersionGoldDarkHighContrast,
            ),
            green = DexExtendedColor(
                color = versionGreenDarkHighContrast,
                onColor = onVersionGreenDarkHighContrast,
            ),
            heartGold = DexExtendedColor(
                color = versionHeartGoldDarkHighContrast,
                onColor = onVersionHeartGoldDarkHighContrast,
            ),
            leafGreen = DexExtendedColor(
                color = versionLeafGreenDarkHighContrast,
                onColor = onVersionLeafGreenDarkHighContrast,
            ),
            legendsArceus = DexExtendedColor(
                color = versionLegendsArceusDarkHighContrast,
                onColor = onVersionLegendsArceusDarkHighContrast,
            ),
            legendsZa = DexExtendedColor(
                color = versionLegendsZaDarkHighContrast,
                onColor = onVersionLegendsZaDarkHighContrast,
            ),
            letsGoEevee = DexExtendedColor(
                color = versionLetsGoEeveeDarkHighContrast,
                onColor = onVersionLetsGoEeveeDarkHighContrast,
            ),
            letsGoPikachu = DexExtendedColor(
                color = versionLetsGoPikachuDarkHighContrast,
                onColor = onVersionLetsGoPikachuDarkHighContrast,
            ),
            megaDimension = DexExtendedColor(
                color = versionMegaDimensionDarkHighContrast,
                onColor = onVersionMegaDimensionDarkHighContrast,
            ),
            moon = DexExtendedColor(
                color = versionMoonDarkHighContrast,
                onColor = onVersionMoonDarkHighContrast,
            ),
            omegaRuby = DexExtendedColor(
                color = versionOmegaRubyDarkHighContrast,
                onColor = onVersionOmegaRubyDarkHighContrast,
            ),
            pearl = DexExtendedColor(
                color = versionPearlDarkHighContrast,
                onColor = onVersionPearlDarkHighContrast,
            ),
            platinum = DexExtendedColor(
                color = versionPlatinumDarkHighContrast,
                onColor = onVersionPlatinumDarkHighContrast,
            ),
            red = DexExtendedColor(
                color = versionRedDarkHighContrast,
                onColor = onVersionRedDarkHighContrast,
            ),
            ruby = DexExtendedColor(
                color = versionRubyDarkHighContrast,
                onColor = onVersionRubyDarkHighContrast,
            ),
            sapphire = DexExtendedColor(
                color = versionSapphireDarkHighContrast,
                onColor = onVersionSapphireDarkHighContrast,
            ),
            scarlet = DexExtendedColor(
                color = versionScarletDarkHighContrast,
                onColor = onVersionScarletDarkHighContrast,
            ),
            shield = DexExtendedColor(
                color = versionShieldDarkHighContrast,
                onColor = onVersionShieldDarkHighContrast,
            ),
            shiningPearl = DexExtendedColor(
                color = versionShiningPearlDarkHighContrast,
                onColor = onVersionShiningPearlDarkHighContrast,
            ),
            silver = DexExtendedColor(
                color = versionSilverDarkHighContrast,
                onColor = onVersionSilverDarkHighContrast,
            ),
            soulSilver = DexExtendedColor(
                color = versionSoulSilverDarkHighContrast,
                onColor = onVersionSoulSilverDarkHighContrast,
            ),
            sun = DexExtendedColor(
                color = versionSunDarkHighContrast,
                onColor = onVersionSunDarkHighContrast,
            ),
            sword = DexExtendedColor(
                color = versionSwordDarkHighContrast,
                onColor = onVersionSwordDarkHighContrast,
            ),
            theCrownTundra = DexExtendedColor(
                color = versionTheCrownTundraDarkHighContrast,
                onColor = onVersionTheCrownTundraDarkHighContrast,
            ),
            theIndigoDisk = DexExtendedColor(
                color = versionTheIndigoDiskDarkHighContrast,
                onColor = onVersionTheIndigoDiskDarkHighContrast,
            ),
            theIsleOfArmor = DexExtendedColor(
                color = versionTheIsleOfArmorDarkHighContrast,
                onColor = onVersionTheIsleOfArmorDarkHighContrast,
            ),
            theTealMask = DexExtendedColor(
                color = versionTheTealMaskDarkHighContrast,
                onColor = onVersionTheTealMaskDarkHighContrast,
            ),
            ultraMoon = DexExtendedColor(
                color = versionUltraMoonDarkHighContrast,
                onColor = onVersionUltraMoonDarkHighContrast,
            ),
            ultraSun = DexExtendedColor(
                color = versionUltraSunDarkHighContrast,
                onColor = onVersionUltraSunDarkHighContrast,
            ),
            violet = DexExtendedColor(
                color = versionVioletDarkHighContrast,
                onColor = onVersionVioletDarkHighContrast,
            ),
            white = DexExtendedColor(
                color = versionWhiteDarkHighContrast,
                onColor = onVersionWhiteDarkHighContrast,
            ),
            white2 = DexExtendedColor(
                color = versionWhite2DarkHighContrast,
                onColor = onVersionWhite2DarkHighContrast,
            ),
            x = DexExtendedColor(
                color = versionXDarkHighContrast,
                onColor = onVersionXDarkHighContrast,
            ),
            xd = DexExtendedColor(
                color = versionXdDarkHighContrast,
                onColor = onVersionXdDarkHighContrast,
            ),
            y = DexExtendedColor(
                color = versionYDarkHighContrast,
                onColor = onVersionYDarkHighContrast,
            ),
            yellow = DexExtendedColor(
                color = versionYellowDarkHighContrast,
                onColor = onVersionYellowDarkHighContrast,
            ),
        )

        internal fun from(
            isDarkTheme: Boolean,
            contrast: CoreSettingsContrast,
        ): DexExtendedColorsVersion {
            return if (isDarkTheme) {
                when (contrast) {
                    CoreSettingsContrast.STANDARD -> extendedColorsVersionDarkStandardContrast
                    CoreSettingsContrast.MEDIUM -> extendedColorsVersionDarkMediumContrast
                    CoreSettingsContrast.HIGH -> extendedColorsVersionDarkHighContrast
                }
            } else {
                when (contrast) {
                    CoreSettingsContrast.STANDARD -> extendedColorsVersionLightStandardContrast
                    CoreSettingsContrast.MEDIUM -> extendedColorsVersionLightMediumContrast
                    CoreSettingsContrast.HIGH -> extendedColorsVersionLightHighContrast
                }
            }
        }
    }
}
