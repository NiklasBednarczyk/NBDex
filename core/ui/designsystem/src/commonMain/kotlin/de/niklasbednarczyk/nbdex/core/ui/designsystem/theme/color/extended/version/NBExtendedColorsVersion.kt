package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.version

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.NBExtendedColor

@Immutable
data class NBExtendedColorsVersion(
    val alphaSapphire: NBExtendedColor,
    val black: NBExtendedColor,
    val black2: NBExtendedColor,
    val blue: NBExtendedColor,
    val brilliantDiamond: NBExtendedColor,
    val champions: NBExtendedColor,
    val colosseum: NBExtendedColor,
    val crystal: NBExtendedColor,
    val diamond: NBExtendedColor,
    val emerald: NBExtendedColor,
    val fireRed: NBExtendedColor,
    val gold: NBExtendedColor,
    val green: NBExtendedColor,
    val heartGold: NBExtendedColor,
    val leafGreen: NBExtendedColor,
    val legendsArceus: NBExtendedColor,
    val legendsZa: NBExtendedColor,
    val letsGoEevee: NBExtendedColor,
    val letsGoPikachu: NBExtendedColor,
    val megaDimension: NBExtendedColor,
    val moon: NBExtendedColor,
    val omegaRuby: NBExtendedColor,
    val pearl: NBExtendedColor,
    val platinum: NBExtendedColor,
    val red: NBExtendedColor,
    val ruby: NBExtendedColor,
    val sapphire: NBExtendedColor,
    val scarlet: NBExtendedColor,
    val shield: NBExtendedColor,
    val shiningPearl: NBExtendedColor,
    val silver: NBExtendedColor,
    val soulSilver: NBExtendedColor,
    val sun: NBExtendedColor,
    val sword: NBExtendedColor,
    val theCrownTundra: NBExtendedColor,
    val theIndigoDisk: NBExtendedColor,
    val theIsleOfArmor: NBExtendedColor,
    val theTealMask: NBExtendedColor,
    val ultraMoon: NBExtendedColor,
    val ultraSun: NBExtendedColor,
    val violet: NBExtendedColor,
    val white: NBExtendedColor,
    val white2: NBExtendedColor,
    val x: NBExtendedColor,
    val xd: NBExtendedColor,
    val y: NBExtendedColor,
    val yellow: NBExtendedColor,
) {

    companion object {

        private val extendedColorsVersionLightStandardContrast = NBExtendedColorsVersion(
            alphaSapphire = NBExtendedColor(
                color = versionAlphaSapphireLightStandardContrast,
                onColor = onVersionAlphaSapphireLightStandardContrast,
            ),
            black = NBExtendedColor(
                color = versionBlackLightStandardContrast,
                onColor = onVersionBlackLightStandardContrast,
            ),
            black2 = NBExtendedColor(
                color = versionBlack2LightStandardContrast,
                onColor = onVersionBlack2LightStandardContrast,
            ),
            blue = NBExtendedColor(
                color = versionBlueLightStandardContrast,
                onColor = onVersionBlueLightStandardContrast,
            ),
            brilliantDiamond = NBExtendedColor(
                color = versionBrilliantDiamondLightStandardContrast,
                onColor = onVersionBrilliantDiamondLightStandardContrast,
            ),
            champions = NBExtendedColor(
                color = versionChampionsLightStandardContrast,
                onColor = onVersionChampionsLightStandardContrast,
            ),
            colosseum = NBExtendedColor(
                color = versionColosseumLightStandardContrast,
                onColor = onVersionColosseumLightStandardContrast,
            ),
            crystal = NBExtendedColor(
                color = versionCrystalLightStandardContrast,
                onColor = onVersionCrystalLightStandardContrast,
            ),
            diamond = NBExtendedColor(
                color = versionDiamondLightStandardContrast,
                onColor = onVersionDiamondLightStandardContrast,
            ),
            emerald = NBExtendedColor(
                color = versionEmeraldLightStandardContrast,
                onColor = onVersionEmeraldLightStandardContrast,
            ),
            fireRed = NBExtendedColor(
                color = versionFireRedLightStandardContrast,
                onColor = onVersionFireRedLightStandardContrast,
            ),
            gold = NBExtendedColor(
                color = versionGoldLightStandardContrast,
                onColor = onVersionGoldLightStandardContrast,
            ),
            green = NBExtendedColor(
                color = versionGreenLightStandardContrast,
                onColor = onVersionGreenLightStandardContrast,
            ),
            heartGold = NBExtendedColor(
                color = versionHeartGoldLightStandardContrast,
                onColor = onVersionHeartGoldLightStandardContrast,
            ),
            leafGreen = NBExtendedColor(
                color = versionLeafGreenLightStandardContrast,
                onColor = onVersionLeafGreenLightStandardContrast,
            ),
            legendsArceus = NBExtendedColor(
                color = versionLegendsArceusLightStandardContrast,
                onColor = onVersionLegendsArceusLightStandardContrast,
            ),
            legendsZa = NBExtendedColor(
                color = versionLegendsZaLightStandardContrast,
                onColor = onVersionLegendsZaLightStandardContrast,
            ),
            letsGoEevee = NBExtendedColor(
                color = versionLetsGoEeveeLightStandardContrast,
                onColor = onVersionLetsGoEeveeLightStandardContrast,
            ),
            letsGoPikachu = NBExtendedColor(
                color = versionLetsGoPikachuLightStandardContrast,
                onColor = onVersionLetsGoPikachuLightStandardContrast,
            ),
            megaDimension = NBExtendedColor(
                color = versionMegaDimensionLightStandardContrast,
                onColor = onVersionMegaDimensionLightStandardContrast,
            ),
            moon = NBExtendedColor(
                color = versionMoonLightStandardContrast,
                onColor = onVersionMoonLightStandardContrast,
            ),
            omegaRuby = NBExtendedColor(
                color = versionOmegaRubyLightStandardContrast,
                onColor = onVersionOmegaRubyLightStandardContrast,
            ),
            pearl = NBExtendedColor(
                color = versionPearlLightStandardContrast,
                onColor = onVersionPearlLightStandardContrast,
            ),
            platinum = NBExtendedColor(
                color = versionPlatinumLightStandardContrast,
                onColor = onVersionPlatinumLightStandardContrast,
            ),
            red = NBExtendedColor(
                color = versionRedLightStandardContrast,
                onColor = onVersionRedLightStandardContrast,
            ),
            ruby = NBExtendedColor(
                color = versionRubyLightStandardContrast,
                onColor = onVersionRubyLightStandardContrast,
            ),
            sapphire = NBExtendedColor(
                color = versionSapphireLightStandardContrast,
                onColor = onVersionSapphireLightStandardContrast,
            ),
            scarlet = NBExtendedColor(
                color = versionScarletLightStandardContrast,
                onColor = onVersionScarletLightStandardContrast,
            ),
            shield = NBExtendedColor(
                color = versionShieldLightStandardContrast,
                onColor = onVersionShieldLightStandardContrast,
            ),
            shiningPearl = NBExtendedColor(
                color = versionShiningPearlLightStandardContrast,
                onColor = onVersionShiningPearlLightStandardContrast,
            ),
            silver = NBExtendedColor(
                color = versionSilverLightStandardContrast,
                onColor = onVersionSilverLightStandardContrast,
            ),
            soulSilver = NBExtendedColor(
                color = versionSoulSilverLightStandardContrast,
                onColor = onVersionSoulSilverLightStandardContrast,
            ),
            sun = NBExtendedColor(
                color = versionSunLightStandardContrast,
                onColor = onVersionSunLightStandardContrast,
            ),
            sword = NBExtendedColor(
                color = versionSwordLightStandardContrast,
                onColor = onVersionSwordLightStandardContrast,
            ),
            theCrownTundra = NBExtendedColor(
                color = versionTheCrownTundraLightStandardContrast,
                onColor = onVersionTheCrownTundraLightStandardContrast,
            ),
            theIndigoDisk = NBExtendedColor(
                color = versionTheIndigoDiskLightStandardContrast,
                onColor = onVersionTheIndigoDiskLightStandardContrast,
            ),
            theIsleOfArmor = NBExtendedColor(
                color = versionTheIsleOfArmorLightStandardContrast,
                onColor = onVersionTheIsleOfArmorLightStandardContrast,
            ),
            theTealMask = NBExtendedColor(
                color = versionTheTealMaskLightStandardContrast,
                onColor = onVersionTheTealMaskLightStandardContrast,
            ),
            ultraMoon = NBExtendedColor(
                color = versionUltraMoonLightStandardContrast,
                onColor = onVersionUltraMoonLightStandardContrast,
            ),
            ultraSun = NBExtendedColor(
                color = versionUltraSunLightStandardContrast,
                onColor = onVersionUltraSunLightStandardContrast,
            ),
            violet = NBExtendedColor(
                color = versionVioletLightStandardContrast,
                onColor = onVersionVioletLightStandardContrast,
            ),
            white = NBExtendedColor(
                color = versionWhiteLightStandardContrast,
                onColor = onVersionWhiteLightStandardContrast,
            ),
            white2 = NBExtendedColor(
                color = versionWhite2LightStandardContrast,
                onColor = onVersionWhite2LightStandardContrast,
            ),
            x = NBExtendedColor(
                color = versionXLightStandardContrast,
                onColor = onVersionXLightStandardContrast,
            ),
            xd = NBExtendedColor(
                color = versionXdLightStandardContrast,
                onColor = onVersionXdLightStandardContrast,
            ),
            y = NBExtendedColor(
                color = versionYLightStandardContrast,
                onColor = onVersionYLightStandardContrast,
            ),
            yellow = NBExtendedColor(
                color = versionYellowLightStandardContrast,
                onColor = onVersionYellowLightStandardContrast,
            ),
        )

        private val extendedColorsVersionLightMediumContrast = NBExtendedColorsVersion(
            alphaSapphire = NBExtendedColor(
                color = versionAlphaSapphireLightMediumContrast,
                onColor = onVersionAlphaSapphireLightMediumContrast,
            ),
            black = NBExtendedColor(
                color = versionBlackLightMediumContrast,
                onColor = onVersionBlackLightMediumContrast,
            ),
            black2 = NBExtendedColor(
                color = versionBlack2LightMediumContrast,
                onColor = onVersionBlack2LightMediumContrast,
            ),
            blue = NBExtendedColor(
                color = versionBlueLightMediumContrast,
                onColor = onVersionBlueLightMediumContrast,
            ),
            brilliantDiamond = NBExtendedColor(
                color = versionBrilliantDiamondLightMediumContrast,
                onColor = onVersionBrilliantDiamondLightMediumContrast,
            ),
            champions = NBExtendedColor(
                color = versionChampionsLightMediumContrast,
                onColor = onVersionChampionsLightMediumContrast,
            ),
            colosseum = NBExtendedColor(
                color = versionColosseumLightMediumContrast,
                onColor = onVersionColosseumLightMediumContrast,
            ),
            crystal = NBExtendedColor(
                color = versionCrystalLightMediumContrast,
                onColor = onVersionCrystalLightMediumContrast,
            ),
            diamond = NBExtendedColor(
                color = versionDiamondLightMediumContrast,
                onColor = onVersionDiamondLightMediumContrast,
            ),
            emerald = NBExtendedColor(
                color = versionEmeraldLightMediumContrast,
                onColor = onVersionEmeraldLightMediumContrast,
            ),
            fireRed = NBExtendedColor(
                color = versionFireRedLightMediumContrast,
                onColor = onVersionFireRedLightMediumContrast,
            ),
            gold = NBExtendedColor(
                color = versionGoldLightMediumContrast,
                onColor = onVersionGoldLightMediumContrast,
            ),
            green = NBExtendedColor(
                color = versionGreenLightMediumContrast,
                onColor = onVersionGreenLightMediumContrast,
            ),
            heartGold = NBExtendedColor(
                color = versionHeartGoldLightMediumContrast,
                onColor = onVersionHeartGoldLightMediumContrast,
            ),
            leafGreen = NBExtendedColor(
                color = versionLeafGreenLightMediumContrast,
                onColor = onVersionLeafGreenLightMediumContrast,
            ),
            legendsArceus = NBExtendedColor(
                color = versionLegendsArceusLightMediumContrast,
                onColor = onVersionLegendsArceusLightMediumContrast,
            ),
            legendsZa = NBExtendedColor(
                color = versionLegendsZaLightMediumContrast,
                onColor = onVersionLegendsZaLightMediumContrast,
            ),
            letsGoEevee = NBExtendedColor(
                color = versionLetsGoEeveeLightMediumContrast,
                onColor = onVersionLetsGoEeveeLightMediumContrast,
            ),
            letsGoPikachu = NBExtendedColor(
                color = versionLetsGoPikachuLightMediumContrast,
                onColor = onVersionLetsGoPikachuLightMediumContrast,
            ),
            megaDimension = NBExtendedColor(
                color = versionMegaDimensionLightMediumContrast,
                onColor = onVersionMegaDimensionLightMediumContrast,
            ),
            moon = NBExtendedColor(
                color = versionMoonLightMediumContrast,
                onColor = onVersionMoonLightMediumContrast,
            ),
            omegaRuby = NBExtendedColor(
                color = versionOmegaRubyLightMediumContrast,
                onColor = onVersionOmegaRubyLightMediumContrast,
            ),
            pearl = NBExtendedColor(
                color = versionPearlLightMediumContrast,
                onColor = onVersionPearlLightMediumContrast,
            ),
            platinum = NBExtendedColor(
                color = versionPlatinumLightMediumContrast,
                onColor = onVersionPlatinumLightMediumContrast,
            ),
            red = NBExtendedColor(
                color = versionRedLightMediumContrast,
                onColor = onVersionRedLightMediumContrast,
            ),
            ruby = NBExtendedColor(
                color = versionRubyLightMediumContrast,
                onColor = onVersionRubyLightMediumContrast,
            ),
            sapphire = NBExtendedColor(
                color = versionSapphireLightMediumContrast,
                onColor = onVersionSapphireLightMediumContrast,
            ),
            scarlet = NBExtendedColor(
                color = versionScarletLightMediumContrast,
                onColor = onVersionScarletLightMediumContrast,
            ),
            shield = NBExtendedColor(
                color = versionShieldLightMediumContrast,
                onColor = onVersionShieldLightMediumContrast,
            ),
            shiningPearl = NBExtendedColor(
                color = versionShiningPearlLightMediumContrast,
                onColor = onVersionShiningPearlLightMediumContrast,
            ),
            silver = NBExtendedColor(
                color = versionSilverLightMediumContrast,
                onColor = onVersionSilverLightMediumContrast,
            ),
            soulSilver = NBExtendedColor(
                color = versionSoulSilverLightMediumContrast,
                onColor = onVersionSoulSilverLightMediumContrast,
            ),
            sun = NBExtendedColor(
                color = versionSunLightMediumContrast,
                onColor = onVersionSunLightMediumContrast,
            ),
            sword = NBExtendedColor(
                color = versionSwordLightMediumContrast,
                onColor = onVersionSwordLightMediumContrast,
            ),
            theCrownTundra = NBExtendedColor(
                color = versionTheCrownTundraLightMediumContrast,
                onColor = onVersionTheCrownTundraLightMediumContrast,
            ),
            theIndigoDisk = NBExtendedColor(
                color = versionTheIndigoDiskLightMediumContrast,
                onColor = onVersionTheIndigoDiskLightMediumContrast,
            ),
            theIsleOfArmor = NBExtendedColor(
                color = versionTheIsleOfArmorLightMediumContrast,
                onColor = onVersionTheIsleOfArmorLightMediumContrast,
            ),
            theTealMask = NBExtendedColor(
                color = versionTheTealMaskLightMediumContrast,
                onColor = onVersionTheTealMaskLightMediumContrast,
            ),
            ultraMoon = NBExtendedColor(
                color = versionUltraMoonLightMediumContrast,
                onColor = onVersionUltraMoonLightMediumContrast,
            ),
            ultraSun = NBExtendedColor(
                color = versionUltraSunLightMediumContrast,
                onColor = onVersionUltraSunLightMediumContrast,
            ),
            violet = NBExtendedColor(
                color = versionVioletLightMediumContrast,
                onColor = onVersionVioletLightMediumContrast,
            ),
            white = NBExtendedColor(
                color = versionWhiteLightMediumContrast,
                onColor = onVersionWhiteLightMediumContrast,
            ),
            white2 = NBExtendedColor(
                color = versionWhite2LightMediumContrast,
                onColor = onVersionWhite2LightMediumContrast,
            ),
            x = NBExtendedColor(
                color = versionXLightMediumContrast,
                onColor = onVersionXLightMediumContrast,
            ),
            xd = NBExtendedColor(
                color = versionXdLightMediumContrast,
                onColor = onVersionXdLightMediumContrast,
            ),
            y = NBExtendedColor(
                color = versionYLightMediumContrast,
                onColor = onVersionYLightMediumContrast,
            ),
            yellow = NBExtendedColor(
                color = versionYellowLightMediumContrast,
                onColor = onVersionYellowLightMediumContrast,
            ),
        )

        private val extendedColorsVersionLightHighContrast = NBExtendedColorsVersion(
            alphaSapphire = NBExtendedColor(
                color = versionAlphaSapphireLightHighContrast,
                onColor = onVersionAlphaSapphireLightHighContrast,
            ),
            black = NBExtendedColor(
                color = versionBlackLightHighContrast,
                onColor = onVersionBlackLightHighContrast,
            ),
            black2 = NBExtendedColor(
                color = versionBlack2LightHighContrast,
                onColor = onVersionBlack2LightHighContrast,
            ),
            blue = NBExtendedColor(
                color = versionBlueLightHighContrast,
                onColor = onVersionBlueLightHighContrast,
            ),
            brilliantDiamond = NBExtendedColor(
                color = versionBrilliantDiamondLightHighContrast,
                onColor = onVersionBrilliantDiamondLightHighContrast,
            ),
            champions = NBExtendedColor(
                color = versionChampionsLightHighContrast,
                onColor = onVersionChampionsLightHighContrast,
            ),
            colosseum = NBExtendedColor(
                color = versionColosseumLightHighContrast,
                onColor = onVersionColosseumLightHighContrast,
            ),
            crystal = NBExtendedColor(
                color = versionCrystalLightHighContrast,
                onColor = onVersionCrystalLightHighContrast,
            ),
            diamond = NBExtendedColor(
                color = versionDiamondLightHighContrast,
                onColor = onVersionDiamondLightHighContrast,
            ),
            emerald = NBExtendedColor(
                color = versionEmeraldLightHighContrast,
                onColor = onVersionEmeraldLightHighContrast,
            ),
            fireRed = NBExtendedColor(
                color = versionFireRedLightHighContrast,
                onColor = onVersionFireRedLightHighContrast,
            ),
            gold = NBExtendedColor(
                color = versionGoldLightHighContrast,
                onColor = onVersionGoldLightHighContrast,
            ),
            green = NBExtendedColor(
                color = versionGreenLightHighContrast,
                onColor = onVersionGreenLightHighContrast,
            ),
            heartGold = NBExtendedColor(
                color = versionHeartGoldLightHighContrast,
                onColor = onVersionHeartGoldLightHighContrast,
            ),
            leafGreen = NBExtendedColor(
                color = versionLeafGreenLightHighContrast,
                onColor = onVersionLeafGreenLightHighContrast,
            ),
            legendsArceus = NBExtendedColor(
                color = versionLegendsArceusLightHighContrast,
                onColor = onVersionLegendsArceusLightHighContrast,
            ),
            legendsZa = NBExtendedColor(
                color = versionLegendsZaLightHighContrast,
                onColor = onVersionLegendsZaLightHighContrast,
            ),
            letsGoEevee = NBExtendedColor(
                color = versionLetsGoEeveeLightHighContrast,
                onColor = onVersionLetsGoEeveeLightHighContrast,
            ),
            letsGoPikachu = NBExtendedColor(
                color = versionLetsGoPikachuLightHighContrast,
                onColor = onVersionLetsGoPikachuLightHighContrast,
            ),
            megaDimension = NBExtendedColor(
                color = versionMegaDimensionLightHighContrast,
                onColor = onVersionMegaDimensionLightHighContrast,
            ),
            moon = NBExtendedColor(
                color = versionMoonLightHighContrast,
                onColor = onVersionMoonLightHighContrast,
            ),
            omegaRuby = NBExtendedColor(
                color = versionOmegaRubyLightHighContrast,
                onColor = onVersionOmegaRubyLightHighContrast,
            ),
            pearl = NBExtendedColor(
                color = versionPearlLightHighContrast,
                onColor = onVersionPearlLightHighContrast,
            ),
            platinum = NBExtendedColor(
                color = versionPlatinumLightHighContrast,
                onColor = onVersionPlatinumLightHighContrast,
            ),
            red = NBExtendedColor(
                color = versionRedLightHighContrast,
                onColor = onVersionRedLightHighContrast,
            ),
            ruby = NBExtendedColor(
                color = versionRubyLightHighContrast,
                onColor = onVersionRubyLightHighContrast,
            ),
            sapphire = NBExtendedColor(
                color = versionSapphireLightHighContrast,
                onColor = onVersionSapphireLightHighContrast,
            ),
            scarlet = NBExtendedColor(
                color = versionScarletLightHighContrast,
                onColor = onVersionScarletLightHighContrast,
            ),
            shield = NBExtendedColor(
                color = versionShieldLightHighContrast,
                onColor = onVersionShieldLightHighContrast,
            ),
            shiningPearl = NBExtendedColor(
                color = versionShiningPearlLightHighContrast,
                onColor = onVersionShiningPearlLightHighContrast,
            ),
            silver = NBExtendedColor(
                color = versionSilverLightHighContrast,
                onColor = onVersionSilverLightHighContrast,
            ),
            soulSilver = NBExtendedColor(
                color = versionSoulSilverLightHighContrast,
                onColor = onVersionSoulSilverLightHighContrast,
            ),
            sun = NBExtendedColor(
                color = versionSunLightHighContrast,
                onColor = onVersionSunLightHighContrast,
            ),
            sword = NBExtendedColor(
                color = versionSwordLightHighContrast,
                onColor = onVersionSwordLightHighContrast,
            ),
            theCrownTundra = NBExtendedColor(
                color = versionTheCrownTundraLightHighContrast,
                onColor = onVersionTheCrownTundraLightHighContrast,
            ),
            theIndigoDisk = NBExtendedColor(
                color = versionTheIndigoDiskLightHighContrast,
                onColor = onVersionTheIndigoDiskLightHighContrast,
            ),
            theIsleOfArmor = NBExtendedColor(
                color = versionTheIsleOfArmorLightHighContrast,
                onColor = onVersionTheIsleOfArmorLightHighContrast,
            ),
            theTealMask = NBExtendedColor(
                color = versionTheTealMaskLightHighContrast,
                onColor = onVersionTheTealMaskLightHighContrast,
            ),
            ultraMoon = NBExtendedColor(
                color = versionUltraMoonLightHighContrast,
                onColor = onVersionUltraMoonLightHighContrast,
            ),
            ultraSun = NBExtendedColor(
                color = versionUltraSunLightHighContrast,
                onColor = onVersionUltraSunLightHighContrast,
            ),
            violet = NBExtendedColor(
                color = versionVioletLightHighContrast,
                onColor = onVersionVioletLightHighContrast,
            ),
            white = NBExtendedColor(
                color = versionWhiteLightHighContrast,
                onColor = onVersionWhiteLightHighContrast,
            ),
            white2 = NBExtendedColor(
                color = versionWhite2LightHighContrast,
                onColor = onVersionWhite2LightHighContrast,
            ),
            x = NBExtendedColor(
                color = versionXLightHighContrast,
                onColor = onVersionXLightHighContrast,
            ),
            xd = NBExtendedColor(
                color = versionXdLightHighContrast,
                onColor = onVersionXdLightHighContrast,
            ),
            y = NBExtendedColor(
                color = versionYLightHighContrast,
                onColor = onVersionYLightHighContrast,
            ),
            yellow = NBExtendedColor(
                color = versionYellowLightHighContrast,
                onColor = onVersionYellowLightHighContrast,
            ),
        )

        private val extendedColorsVersionDarkStandardContrast = NBExtendedColorsVersion(
            alphaSapphire = NBExtendedColor(
                color = versionAlphaSapphireDarkStandardContrast,
                onColor = onVersionAlphaSapphireDarkStandardContrast,
            ),
            black = NBExtendedColor(
                color = versionBlackDarkStandardContrast,
                onColor = onVersionBlackDarkStandardContrast,
            ),
            black2 = NBExtendedColor(
                color = versionBlack2DarkStandardContrast,
                onColor = onVersionBlack2DarkStandardContrast,
            ),
            blue = NBExtendedColor(
                color = versionBlueDarkStandardContrast,
                onColor = onVersionBlueDarkStandardContrast,
            ),
            brilliantDiamond = NBExtendedColor(
                color = versionBrilliantDiamondDarkStandardContrast,
                onColor = onVersionBrilliantDiamondDarkStandardContrast,
            ),
            champions = NBExtendedColor(
                color = versionChampionsDarkStandardContrast,
                onColor = onVersionChampionsDarkStandardContrast,
            ),
            colosseum = NBExtendedColor(
                color = versionColosseumDarkStandardContrast,
                onColor = onVersionColosseumDarkStandardContrast,
            ),
            crystal = NBExtendedColor(
                color = versionCrystalDarkStandardContrast,
                onColor = onVersionCrystalDarkStandardContrast,
            ),
            diamond = NBExtendedColor(
                color = versionDiamondDarkStandardContrast,
                onColor = onVersionDiamondDarkStandardContrast,
            ),
            emerald = NBExtendedColor(
                color = versionEmeraldDarkStandardContrast,
                onColor = onVersionEmeraldDarkStandardContrast,
            ),
            fireRed = NBExtendedColor(
                color = versionFireRedDarkStandardContrast,
                onColor = onVersionFireRedDarkStandardContrast,
            ),
            gold = NBExtendedColor(
                color = versionGoldDarkStandardContrast,
                onColor = onVersionGoldDarkStandardContrast,
            ),
            green = NBExtendedColor(
                color = versionGreenDarkStandardContrast,
                onColor = onVersionGreenDarkStandardContrast,
            ),
            heartGold = NBExtendedColor(
                color = versionHeartGoldDarkStandardContrast,
                onColor = onVersionHeartGoldDarkStandardContrast,
            ),
            leafGreen = NBExtendedColor(
                color = versionLeafGreenDarkStandardContrast,
                onColor = onVersionLeafGreenDarkStandardContrast,
            ),
            legendsArceus = NBExtendedColor(
                color = versionLegendsArceusDarkStandardContrast,
                onColor = onVersionLegendsArceusDarkStandardContrast,
            ),
            legendsZa = NBExtendedColor(
                color = versionLegendsZaDarkStandardContrast,
                onColor = onVersionLegendsZaDarkStandardContrast,
            ),
            letsGoEevee = NBExtendedColor(
                color = versionLetsGoEeveeDarkStandardContrast,
                onColor = onVersionLetsGoEeveeDarkStandardContrast,
            ),
            letsGoPikachu = NBExtendedColor(
                color = versionLetsGoPikachuDarkStandardContrast,
                onColor = onVersionLetsGoPikachuDarkStandardContrast,
            ),
            megaDimension = NBExtendedColor(
                color = versionMegaDimensionDarkStandardContrast,
                onColor = onVersionMegaDimensionDarkStandardContrast,
            ),
            moon = NBExtendedColor(
                color = versionMoonDarkStandardContrast,
                onColor = onVersionMoonDarkStandardContrast,
            ),
            omegaRuby = NBExtendedColor(
                color = versionOmegaRubyDarkStandardContrast,
                onColor = onVersionOmegaRubyDarkStandardContrast,
            ),
            pearl = NBExtendedColor(
                color = versionPearlDarkStandardContrast,
                onColor = onVersionPearlDarkStandardContrast,
            ),
            platinum = NBExtendedColor(
                color = versionPlatinumDarkStandardContrast,
                onColor = onVersionPlatinumDarkStandardContrast,
            ),
            red = NBExtendedColor(
                color = versionRedDarkStandardContrast,
                onColor = onVersionRedDarkStandardContrast,
            ),
            ruby = NBExtendedColor(
                color = versionRubyDarkStandardContrast,
                onColor = onVersionRubyDarkStandardContrast,
            ),
            sapphire = NBExtendedColor(
                color = versionSapphireDarkStandardContrast,
                onColor = onVersionSapphireDarkStandardContrast,
            ),
            scarlet = NBExtendedColor(
                color = versionScarletDarkStandardContrast,
                onColor = onVersionScarletDarkStandardContrast,
            ),
            shield = NBExtendedColor(
                color = versionShieldDarkStandardContrast,
                onColor = onVersionShieldDarkStandardContrast,
            ),
            shiningPearl = NBExtendedColor(
                color = versionShiningPearlDarkStandardContrast,
                onColor = onVersionShiningPearlDarkStandardContrast,
            ),
            silver = NBExtendedColor(
                color = versionSilverDarkStandardContrast,
                onColor = onVersionSilverDarkStandardContrast,
            ),
            soulSilver = NBExtendedColor(
                color = versionSoulSilverDarkStandardContrast,
                onColor = onVersionSoulSilverDarkStandardContrast,
            ),
            sun = NBExtendedColor(
                color = versionSunDarkStandardContrast,
                onColor = onVersionSunDarkStandardContrast,
            ),
            sword = NBExtendedColor(
                color = versionSwordDarkStandardContrast,
                onColor = onVersionSwordDarkStandardContrast,
            ),
            theCrownTundra = NBExtendedColor(
                color = versionTheCrownTundraDarkStandardContrast,
                onColor = onVersionTheCrownTundraDarkStandardContrast,
            ),
            theIndigoDisk = NBExtendedColor(
                color = versionTheIndigoDiskDarkStandardContrast,
                onColor = onVersionTheIndigoDiskDarkStandardContrast,
            ),
            theIsleOfArmor = NBExtendedColor(
                color = versionTheIsleOfArmorDarkStandardContrast,
                onColor = onVersionTheIsleOfArmorDarkStandardContrast,
            ),
            theTealMask = NBExtendedColor(
                color = versionTheTealMaskDarkStandardContrast,
                onColor = onVersionTheTealMaskDarkStandardContrast,
            ),
            ultraMoon = NBExtendedColor(
                color = versionUltraMoonDarkStandardContrast,
                onColor = onVersionUltraMoonDarkStandardContrast,
            ),
            ultraSun = NBExtendedColor(
                color = versionUltraSunDarkStandardContrast,
                onColor = onVersionUltraSunDarkStandardContrast,
            ),
            violet = NBExtendedColor(
                color = versionVioletDarkStandardContrast,
                onColor = onVersionVioletDarkStandardContrast,
            ),
            white = NBExtendedColor(
                color = versionWhiteDarkStandardContrast,
                onColor = onVersionWhiteDarkStandardContrast,
            ),
            white2 = NBExtendedColor(
                color = versionWhite2DarkStandardContrast,
                onColor = onVersionWhite2DarkStandardContrast,
            ),
            x = NBExtendedColor(
                color = versionXDarkStandardContrast,
                onColor = onVersionXDarkStandardContrast,
            ),
            xd = NBExtendedColor(
                color = versionXdDarkStandardContrast,
                onColor = onVersionXdDarkStandardContrast,
            ),
            y = NBExtendedColor(
                color = versionYDarkStandardContrast,
                onColor = onVersionYDarkStandardContrast,
            ),
            yellow = NBExtendedColor(
                color = versionYellowDarkStandardContrast,
                onColor = onVersionYellowDarkStandardContrast,
            ),
        )

        private val extendedColorsVersionDarkMediumContrast = NBExtendedColorsVersion(
            alphaSapphire = NBExtendedColor(
                color = versionAlphaSapphireDarkMediumContrast,
                onColor = onVersionAlphaSapphireDarkMediumContrast,
            ),
            black = NBExtendedColor(
                color = versionBlackDarkMediumContrast,
                onColor = onVersionBlackDarkMediumContrast,
            ),
            black2 = NBExtendedColor(
                color = versionBlack2DarkMediumContrast,
                onColor = onVersionBlack2DarkMediumContrast,
            ),
            blue = NBExtendedColor(
                color = versionBlueDarkMediumContrast,
                onColor = onVersionBlueDarkMediumContrast,
            ),
            brilliantDiamond = NBExtendedColor(
                color = versionBrilliantDiamondDarkMediumContrast,
                onColor = onVersionBrilliantDiamondDarkMediumContrast,
            ),
            champions = NBExtendedColor(
                color = versionChampionsDarkMediumContrast,
                onColor = onVersionChampionsDarkMediumContrast,
            ),
            colosseum = NBExtendedColor(
                color = versionColosseumDarkMediumContrast,
                onColor = onVersionColosseumDarkMediumContrast,
            ),
            crystal = NBExtendedColor(
                color = versionCrystalDarkMediumContrast,
                onColor = onVersionCrystalDarkMediumContrast,
            ),
            diamond = NBExtendedColor(
                color = versionDiamondDarkMediumContrast,
                onColor = onVersionDiamondDarkMediumContrast,
            ),
            emerald = NBExtendedColor(
                color = versionEmeraldDarkMediumContrast,
                onColor = onVersionEmeraldDarkMediumContrast,
            ),
            fireRed = NBExtendedColor(
                color = versionFireRedDarkMediumContrast,
                onColor = onVersionFireRedDarkMediumContrast,
            ),
            gold = NBExtendedColor(
                color = versionGoldDarkMediumContrast,
                onColor = onVersionGoldDarkMediumContrast,
            ),
            green = NBExtendedColor(
                color = versionGreenDarkMediumContrast,
                onColor = onVersionGreenDarkMediumContrast,
            ),
            heartGold = NBExtendedColor(
                color = versionHeartGoldDarkMediumContrast,
                onColor = onVersionHeartGoldDarkMediumContrast,
            ),
            leafGreen = NBExtendedColor(
                color = versionLeafGreenDarkMediumContrast,
                onColor = onVersionLeafGreenDarkMediumContrast,
            ),
            legendsArceus = NBExtendedColor(
                color = versionLegendsArceusDarkMediumContrast,
                onColor = onVersionLegendsArceusDarkMediumContrast,
            ),
            legendsZa = NBExtendedColor(
                color = versionLegendsZaDarkMediumContrast,
                onColor = onVersionLegendsZaDarkMediumContrast,
            ),
            letsGoEevee = NBExtendedColor(
                color = versionLetsGoEeveeDarkMediumContrast,
                onColor = onVersionLetsGoEeveeDarkMediumContrast,
            ),
            letsGoPikachu = NBExtendedColor(
                color = versionLetsGoPikachuDarkMediumContrast,
                onColor = onVersionLetsGoPikachuDarkMediumContrast,
            ),
            megaDimension = NBExtendedColor(
                color = versionMegaDimensionDarkMediumContrast,
                onColor = onVersionMegaDimensionDarkMediumContrast,
            ),
            moon = NBExtendedColor(
                color = versionMoonDarkMediumContrast,
                onColor = onVersionMoonDarkMediumContrast,
            ),
            omegaRuby = NBExtendedColor(
                color = versionOmegaRubyDarkMediumContrast,
                onColor = onVersionOmegaRubyDarkMediumContrast,
            ),
            pearl = NBExtendedColor(
                color = versionPearlDarkMediumContrast,
                onColor = onVersionPearlDarkMediumContrast,
            ),
            platinum = NBExtendedColor(
                color = versionPlatinumDarkMediumContrast,
                onColor = onVersionPlatinumDarkMediumContrast,
            ),
            red = NBExtendedColor(
                color = versionRedDarkMediumContrast,
                onColor = onVersionRedDarkMediumContrast,
            ),
            ruby = NBExtendedColor(
                color = versionRubyDarkMediumContrast,
                onColor = onVersionRubyDarkMediumContrast,
            ),
            sapphire = NBExtendedColor(
                color = versionSapphireDarkMediumContrast,
                onColor = onVersionSapphireDarkMediumContrast,
            ),
            scarlet = NBExtendedColor(
                color = versionScarletDarkMediumContrast,
                onColor = onVersionScarletDarkMediumContrast,
            ),
            shield = NBExtendedColor(
                color = versionShieldDarkMediumContrast,
                onColor = onVersionShieldDarkMediumContrast,
            ),
            shiningPearl = NBExtendedColor(
                color = versionShiningPearlDarkMediumContrast,
                onColor = onVersionShiningPearlDarkMediumContrast,
            ),
            silver = NBExtendedColor(
                color = versionSilverDarkMediumContrast,
                onColor = onVersionSilverDarkMediumContrast,
            ),
            soulSilver = NBExtendedColor(
                color = versionSoulSilverDarkMediumContrast,
                onColor = onVersionSoulSilverDarkMediumContrast,
            ),
            sun = NBExtendedColor(
                color = versionSunDarkMediumContrast,
                onColor = onVersionSunDarkMediumContrast,
            ),
            sword = NBExtendedColor(
                color = versionSwordDarkMediumContrast,
                onColor = onVersionSwordDarkMediumContrast,
            ),
            theCrownTundra = NBExtendedColor(
                color = versionTheCrownTundraDarkMediumContrast,
                onColor = onVersionTheCrownTundraDarkMediumContrast,
            ),
            theIndigoDisk = NBExtendedColor(
                color = versionTheIndigoDiskDarkMediumContrast,
                onColor = onVersionTheIndigoDiskDarkMediumContrast,
            ),
            theIsleOfArmor = NBExtendedColor(
                color = versionTheIsleOfArmorDarkMediumContrast,
                onColor = onVersionTheIsleOfArmorDarkMediumContrast,
            ),
            theTealMask = NBExtendedColor(
                color = versionTheTealMaskDarkMediumContrast,
                onColor = onVersionTheTealMaskDarkMediumContrast,
            ),
            ultraMoon = NBExtendedColor(
                color = versionUltraMoonDarkMediumContrast,
                onColor = onVersionUltraMoonDarkMediumContrast,
            ),
            ultraSun = NBExtendedColor(
                color = versionUltraSunDarkMediumContrast,
                onColor = onVersionUltraSunDarkMediumContrast,
            ),
            violet = NBExtendedColor(
                color = versionVioletDarkMediumContrast,
                onColor = onVersionVioletDarkMediumContrast,
            ),
            white = NBExtendedColor(
                color = versionWhiteDarkMediumContrast,
                onColor = onVersionWhiteDarkMediumContrast,
            ),
            white2 = NBExtendedColor(
                color = versionWhite2DarkMediumContrast,
                onColor = onVersionWhite2DarkMediumContrast,
            ),
            x = NBExtendedColor(
                color = versionXDarkMediumContrast,
                onColor = onVersionXDarkMediumContrast,
            ),
            xd = NBExtendedColor(
                color = versionXdDarkMediumContrast,
                onColor = onVersionXdDarkMediumContrast,
            ),
            y = NBExtendedColor(
                color = versionYDarkMediumContrast,
                onColor = onVersionYDarkMediumContrast,
            ),
            yellow = NBExtendedColor(
                color = versionYellowDarkMediumContrast,
                onColor = onVersionYellowDarkMediumContrast,
            ),
        )

        private val extendedColorsVersionDarkHighContrast = NBExtendedColorsVersion(
            alphaSapphire = NBExtendedColor(
                color = versionAlphaSapphireDarkHighContrast,
                onColor = onVersionAlphaSapphireDarkHighContrast,
            ),
            black = NBExtendedColor(
                color = versionBlackDarkHighContrast,
                onColor = onVersionBlackDarkHighContrast,
            ),
            black2 = NBExtendedColor(
                color = versionBlack2DarkHighContrast,
                onColor = onVersionBlack2DarkHighContrast,
            ),
            blue = NBExtendedColor(
                color = versionBlueDarkHighContrast,
                onColor = onVersionBlueDarkHighContrast,
            ),
            brilliantDiamond = NBExtendedColor(
                color = versionBrilliantDiamondDarkHighContrast,
                onColor = onVersionBrilliantDiamondDarkHighContrast,
            ),
            champions = NBExtendedColor(
                color = versionChampionsDarkHighContrast,
                onColor = onVersionChampionsDarkHighContrast,
            ),
            colosseum = NBExtendedColor(
                color = versionColosseumDarkHighContrast,
                onColor = onVersionColosseumDarkHighContrast,
            ),
            crystal = NBExtendedColor(
                color = versionCrystalDarkHighContrast,
                onColor = onVersionCrystalDarkHighContrast,
            ),
            diamond = NBExtendedColor(
                color = versionDiamondDarkHighContrast,
                onColor = onVersionDiamondDarkHighContrast,
            ),
            emerald = NBExtendedColor(
                color = versionEmeraldDarkHighContrast,
                onColor = onVersionEmeraldDarkHighContrast,
            ),
            fireRed = NBExtendedColor(
                color = versionFireRedDarkHighContrast,
                onColor = onVersionFireRedDarkHighContrast,
            ),
            gold = NBExtendedColor(
                color = versionGoldDarkHighContrast,
                onColor = onVersionGoldDarkHighContrast,
            ),
            green = NBExtendedColor(
                color = versionGreenDarkHighContrast,
                onColor = onVersionGreenDarkHighContrast,
            ),
            heartGold = NBExtendedColor(
                color = versionHeartGoldDarkHighContrast,
                onColor = onVersionHeartGoldDarkHighContrast,
            ),
            leafGreen = NBExtendedColor(
                color = versionLeafGreenDarkHighContrast,
                onColor = onVersionLeafGreenDarkHighContrast,
            ),
            legendsArceus = NBExtendedColor(
                color = versionLegendsArceusDarkHighContrast,
                onColor = onVersionLegendsArceusDarkHighContrast,
            ),
            legendsZa = NBExtendedColor(
                color = versionLegendsZaDarkHighContrast,
                onColor = onVersionLegendsZaDarkHighContrast,
            ),
            letsGoEevee = NBExtendedColor(
                color = versionLetsGoEeveeDarkHighContrast,
                onColor = onVersionLetsGoEeveeDarkHighContrast,
            ),
            letsGoPikachu = NBExtendedColor(
                color = versionLetsGoPikachuDarkHighContrast,
                onColor = onVersionLetsGoPikachuDarkHighContrast,
            ),
            megaDimension = NBExtendedColor(
                color = versionMegaDimensionDarkHighContrast,
                onColor = onVersionMegaDimensionDarkHighContrast,
            ),
            moon = NBExtendedColor(
                color = versionMoonDarkHighContrast,
                onColor = onVersionMoonDarkHighContrast,
            ),
            omegaRuby = NBExtendedColor(
                color = versionOmegaRubyDarkHighContrast,
                onColor = onVersionOmegaRubyDarkHighContrast,
            ),
            pearl = NBExtendedColor(
                color = versionPearlDarkHighContrast,
                onColor = onVersionPearlDarkHighContrast,
            ),
            platinum = NBExtendedColor(
                color = versionPlatinumDarkHighContrast,
                onColor = onVersionPlatinumDarkHighContrast,
            ),
            red = NBExtendedColor(
                color = versionRedDarkHighContrast,
                onColor = onVersionRedDarkHighContrast,
            ),
            ruby = NBExtendedColor(
                color = versionRubyDarkHighContrast,
                onColor = onVersionRubyDarkHighContrast,
            ),
            sapphire = NBExtendedColor(
                color = versionSapphireDarkHighContrast,
                onColor = onVersionSapphireDarkHighContrast,
            ),
            scarlet = NBExtendedColor(
                color = versionScarletDarkHighContrast,
                onColor = onVersionScarletDarkHighContrast,
            ),
            shield = NBExtendedColor(
                color = versionShieldDarkHighContrast,
                onColor = onVersionShieldDarkHighContrast,
            ),
            shiningPearl = NBExtendedColor(
                color = versionShiningPearlDarkHighContrast,
                onColor = onVersionShiningPearlDarkHighContrast,
            ),
            silver = NBExtendedColor(
                color = versionSilverDarkHighContrast,
                onColor = onVersionSilverDarkHighContrast,
            ),
            soulSilver = NBExtendedColor(
                color = versionSoulSilverDarkHighContrast,
                onColor = onVersionSoulSilverDarkHighContrast,
            ),
            sun = NBExtendedColor(
                color = versionSunDarkHighContrast,
                onColor = onVersionSunDarkHighContrast,
            ),
            sword = NBExtendedColor(
                color = versionSwordDarkHighContrast,
                onColor = onVersionSwordDarkHighContrast,
            ),
            theCrownTundra = NBExtendedColor(
                color = versionTheCrownTundraDarkHighContrast,
                onColor = onVersionTheCrownTundraDarkHighContrast,
            ),
            theIndigoDisk = NBExtendedColor(
                color = versionTheIndigoDiskDarkHighContrast,
                onColor = onVersionTheIndigoDiskDarkHighContrast,
            ),
            theIsleOfArmor = NBExtendedColor(
                color = versionTheIsleOfArmorDarkHighContrast,
                onColor = onVersionTheIsleOfArmorDarkHighContrast,
            ),
            theTealMask = NBExtendedColor(
                color = versionTheTealMaskDarkHighContrast,
                onColor = onVersionTheTealMaskDarkHighContrast,
            ),
            ultraMoon = NBExtendedColor(
                color = versionUltraMoonDarkHighContrast,
                onColor = onVersionUltraMoonDarkHighContrast,
            ),
            ultraSun = NBExtendedColor(
                color = versionUltraSunDarkHighContrast,
                onColor = onVersionUltraSunDarkHighContrast,
            ),
            violet = NBExtendedColor(
                color = versionVioletDarkHighContrast,
                onColor = onVersionVioletDarkHighContrast,
            ),
            white = NBExtendedColor(
                color = versionWhiteDarkHighContrast,
                onColor = onVersionWhiteDarkHighContrast,
            ),
            white2 = NBExtendedColor(
                color = versionWhite2DarkHighContrast,
                onColor = onVersionWhite2DarkHighContrast,
            ),
            x = NBExtendedColor(
                color = versionXDarkHighContrast,
                onColor = onVersionXDarkHighContrast,
            ),
            xd = NBExtendedColor(
                color = versionXdDarkHighContrast,
                onColor = onVersionXdDarkHighContrast,
            ),
            y = NBExtendedColor(
                color = versionYDarkHighContrast,
                onColor = onVersionYDarkHighContrast,
            ),
            yellow = NBExtendedColor(
                color = versionYellowDarkHighContrast,
                onColor = onVersionYellowDarkHighContrast,
            ),
        )

        internal fun from(
            isDarkTheme: Boolean,
            contrast: CoreSettingsContrast,
        ): NBExtendedColorsVersion {
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
