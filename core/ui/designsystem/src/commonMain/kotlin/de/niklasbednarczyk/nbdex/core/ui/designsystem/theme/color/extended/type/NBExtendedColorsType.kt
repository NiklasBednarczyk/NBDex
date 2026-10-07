package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.type

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.NBExtendedColor

@Immutable
data class NBExtendedColorsType(
    /** Source color #91A119 from https://bulbapedia.bulbagarden.net/wiki/Template:Bug_color */
    val bug: NBExtendedColor,
    /** Source color #624D4E from https://bulbapedia.bulbagarden.net/wiki/Template:Dark_color */
    val dark: NBExtendedColor,
    /** Source color #5060E1 from https://bulbapedia.bulbagarden.net/wiki/Template:Dragon_color */
    val dragon: NBExtendedColor,
    /** Source color #FAC000 from https://bulbapedia.bulbagarden.net/wiki/Template:Electric_color */
    val electric: NBExtendedColor,
    /** Source color #EF70EF from https://bulbapedia.bulbagarden.net/wiki/Template:Fairy_color */
    val fairy: NBExtendedColor,
    /** Source color #FF8000 from https://bulbapedia.bulbagarden.net/wiki/Template:Fighting_color */
    val fighting: NBExtendedColor,
    /** Source color #E62829 from https://bulbapedia.bulbagarden.net/wiki/Template:Fire_color */
    val fire: NBExtendedColor,
    /** Source color #81B9EF from https://bulbapedia.bulbagarden.net/wiki/Template:Flying_color */
    val flying: NBExtendedColor,
    /** Source color #704170 from https://bulbapedia.bulbagarden.net/wiki/Template:Ghost_color */
    val ghost: NBExtendedColor,
    /** Source color #3FA129 from https://bulbapedia.bulbagarden.net/wiki/Template:Grass_color */
    val grass: NBExtendedColor,
    /** Source color #915121 from https://bulbapedia.bulbagarden.net/wiki/Template:Ground_color */
    val ground: NBExtendedColor,
    /** Source color #3DCEF3 from https://bulbapedia.bulbagarden.net/wiki/Template:Ice_color */
    val ice: NBExtendedColor,
    /** Source color #9FA19F from https://bulbapedia.bulbagarden.net/wiki/Template:Normal_color */
    val normal: NBExtendedColor,
    /** Source color #9141CB from https://bulbapedia.bulbagarden.net/wiki/Template:Poison_color */
    val poison: NBExtendedColor,
    /** Source color #EF4179 from https://bulbapedia.bulbagarden.net/wiki/Template:Psychic_color */
    val psychic: NBExtendedColor,
    /** Source color #AFA981 from https://bulbapedia.bulbagarden.net/wiki/Template:Rock_color */
    val rock: NBExtendedColor,
    /** Source color #604E82 from https://bulbapedia.bulbagarden.net/wiki/Template:XD_color */
    val shadow: NBExtendedColor,
    /** Source color #60A1B8 from https://bulbapedia.bulbagarden.net/wiki/Template:Steel_color */
    val steel: NBExtendedColor,
    /** Source color #40B5A5 from https://bulbapedia.bulbagarden.net/wiki/Template:Stellar_color */
    val stellar: NBExtendedColor,
    /** Source color #68A090 from https://bulbapedia.bulbagarden.net/wiki/Template:Unknown_color */
    val unknown: NBExtendedColor,
    /** Source color #2980EF from https://bulbapedia.bulbagarden.net/wiki/Template:Water_color */
    val water: NBExtendedColor,
) {
    companion object {
        private val extendedColorsTypeLightStandardContrast = NBExtendedColorsType(
            bug = NBExtendedColor(
                color = typeBugLightStandardContrast,
                onColor = onTypeBugLightStandardContrast,
            ),
            dark = NBExtendedColor(
                color = typeDarkLightStandardContrast,
                onColor = onTypeDarkLightStandardContrast,
            ),
            dragon = NBExtendedColor(
                color = typeDragonLightStandardContrast,
                onColor = onTypeDragonLightStandardContrast,
            ),
            electric = NBExtendedColor(
                color = typeElectricLightStandardContrast,
                onColor = onTypeElectricLightStandardContrast,
            ),
            fairy = NBExtendedColor(
                color = typeFairyLightStandardContrast,
                onColor = onTypeFairyLightStandardContrast,
            ),
            fighting = NBExtendedColor(
                color = typeFightingLightStandardContrast,
                onColor = onTypeFightingLightStandardContrast,
            ),
            fire = NBExtendedColor(
                color = typeFireLightStandardContrast,
                onColor = onTypeFireLightStandardContrast,
            ),
            flying = NBExtendedColor(
                color = typeFlyingLightStandardContrast,
                onColor = onTypeFlyingLightStandardContrast,
            ),
            ghost = NBExtendedColor(
                color = typeGhostLightStandardContrast,
                onColor = onTypeGhostLightStandardContrast,
            ),
            grass = NBExtendedColor(
                color = typeGrassLightStandardContrast,
                onColor = onTypeGrassLightStandardContrast,
            ),
            ground = NBExtendedColor(
                color = typeGroundLightStandardContrast,
                onColor = onTypeGroundLightStandardContrast,
            ),
            ice = NBExtendedColor(
                color = typeIceLightStandardContrast,
                onColor = onTypeIceLightStandardContrast,
            ),
            normal = NBExtendedColor(
                color = typeNormalLightStandardContrast,
                onColor = onTypeNormalLightStandardContrast,
            ),
            poison = NBExtendedColor(
                color = typePoisonLightStandardContrast,
                onColor = onTypePoisonLightStandardContrast,
            ),
            psychic = NBExtendedColor(
                color = typePsychicLightStandardContrast,
                onColor = onTypePsychicLightStandardContrast,
            ),
            rock = NBExtendedColor(
                color = typeRockLightStandardContrast,
                onColor = onTypeRockLightStandardContrast,
            ),
            shadow = NBExtendedColor(
                color = typeShadowLightStandardContrast,
                onColor = onTypeShadowLightStandardContrast,
            ),
            steel = NBExtendedColor(
                color = typeSteelLightStandardContrast,
                onColor = onTypeSteelLightStandardContrast,
            ),
            stellar = NBExtendedColor(
                color = typeStellarLightStandardContrast,
                onColor = onTypeStellarLightStandardContrast,
            ),
            unknown = NBExtendedColor(
                color = typeUnknownLightStandardContrast,
                onColor = onTypeUnknownLightStandardContrast,
            ),
            water = NBExtendedColor(
                color = typeWaterLightStandardContrast,
                onColor = onTypeWaterLightStandardContrast,
            ),
        )

        private val extendedColorsTypeLightMediumContrast = NBExtendedColorsType(
            bug = NBExtendedColor(
                color = typeBugLightMediumContrast,
                onColor = onTypeBugLightMediumContrast,
            ),
            dark = NBExtendedColor(
                color = typeDarkLightMediumContrast,
                onColor = onTypeDarkLightMediumContrast,
            ),
            dragon = NBExtendedColor(
                color = typeDragonLightMediumContrast,
                onColor = onTypeDragonLightMediumContrast,
            ),
            electric = NBExtendedColor(
                color = typeElectricLightMediumContrast,
                onColor = onTypeElectricLightMediumContrast,
            ),
            fairy = NBExtendedColor(
                color = typeFairyLightMediumContrast,
                onColor = onTypeFairyLightMediumContrast,
            ),
            fighting = NBExtendedColor(
                color = typeFightingLightMediumContrast,
                onColor = onTypeFightingLightMediumContrast,
            ),
            fire = NBExtendedColor(
                color = typeFireLightMediumContrast,
                onColor = onTypeFireLightMediumContrast,
            ),
            flying = NBExtendedColor(
                color = typeFlyingLightMediumContrast,
                onColor = onTypeFlyingLightMediumContrast,
            ),
            ghost = NBExtendedColor(
                color = typeGhostLightMediumContrast,
                onColor = onTypeGhostLightMediumContrast,
            ),
            grass = NBExtendedColor(
                color = typeGrassLightMediumContrast,
                onColor = onTypeGrassLightMediumContrast,
            ),
            ground = NBExtendedColor(
                color = typeGroundLightMediumContrast,
                onColor = onTypeGroundLightMediumContrast,
            ),
            ice = NBExtendedColor(
                color = typeIceLightMediumContrast,
                onColor = onTypeIceLightMediumContrast,
            ),
            normal = NBExtendedColor(
                color = typeNormalLightMediumContrast,
                onColor = onTypeNormalLightMediumContrast,
            ),
            poison = NBExtendedColor(
                color = typePoisonLightMediumContrast,
                onColor = onTypePoisonLightMediumContrast,
            ),
            psychic = NBExtendedColor(
                color = typePsychicLightMediumContrast,
                onColor = onTypePsychicLightMediumContrast,
            ),
            rock = NBExtendedColor(
                color = typeRockLightMediumContrast,
                onColor = onTypeRockLightMediumContrast,
            ),
            shadow = NBExtendedColor(
                color = typeShadowLightMediumContrast,
                onColor = onTypeShadowLightMediumContrast,
            ),
            steel = NBExtendedColor(
                color = typeSteelLightMediumContrast,
                onColor = onTypeSteelLightMediumContrast,
            ),
            stellar = NBExtendedColor(
                color = typeStellarLightMediumContrast,
                onColor = onTypeStellarLightMediumContrast,
            ),
            unknown = NBExtendedColor(
                color = typeUnknownLightMediumContrast,
                onColor = onTypeUnknownLightMediumContrast,
            ),
            water = NBExtendedColor(
                color = typeWaterLightMediumContrast,
                onColor = onTypeWaterLightMediumContrast,
            ),
        )

        private val extendedColorsTypeLightHighContrast = NBExtendedColorsType(
            bug = NBExtendedColor(
                color = typeBugLightHighContrast,
                onColor = onTypeBugLightHighContrast,
            ),
            dark = NBExtendedColor(
                color = typeDarkLightHighContrast,
                onColor = onTypeDarkLightHighContrast,
            ),
            dragon = NBExtendedColor(
                color = typeDragonLightHighContrast,
                onColor = onTypeDragonLightHighContrast,
            ),
            electric = NBExtendedColor(
                color = typeElectricLightHighContrast,
                onColor = onTypeElectricLightHighContrast,
            ),
            fairy = NBExtendedColor(
                color = typeFairyLightHighContrast,
                onColor = onTypeFairyLightHighContrast,
            ),
            fighting = NBExtendedColor(
                color = typeFightingLightHighContrast,
                onColor = onTypeFightingLightHighContrast,
            ),
            fire = NBExtendedColor(
                color = typeFireLightHighContrast,
                onColor = onTypeFireLightHighContrast,
            ),
            flying = NBExtendedColor(
                color = typeFlyingLightHighContrast,
                onColor = onTypeFlyingLightHighContrast,
            ),
            ghost = NBExtendedColor(
                color = typeGhostLightHighContrast,
                onColor = onTypeGhostLightHighContrast,
            ),
            grass = NBExtendedColor(
                color = typeGrassLightHighContrast,
                onColor = onTypeGrassLightHighContrast,
            ),
            ground = NBExtendedColor(
                color = typeGroundLightHighContrast,
                onColor = onTypeGroundLightHighContrast,
            ),
            ice = NBExtendedColor(
                color = typeIceLightHighContrast,
                onColor = onTypeIceLightHighContrast,
            ),
            normal = NBExtendedColor(
                color = typeNormalLightHighContrast,
                onColor = onTypeNormalLightHighContrast,
            ),
            poison = NBExtendedColor(
                color = typePoisonLightHighContrast,
                onColor = onTypePoisonLightHighContrast,
            ),
            psychic = NBExtendedColor(
                color = typePsychicLightHighContrast,
                onColor = onTypePsychicLightHighContrast,
            ),
            rock = NBExtendedColor(
                color = typeRockLightHighContrast,
                onColor = onTypeRockLightHighContrast,
            ),
            shadow = NBExtendedColor(
                color = typeShadowLightHighContrast,
                onColor = onTypeShadowLightHighContrast,
            ),
            steel = NBExtendedColor(
                color = typeSteelLightHighContrast,
                onColor = onTypeSteelLightHighContrast,
            ),
            stellar = NBExtendedColor(
                color = typeStellarLightHighContrast,
                onColor = onTypeStellarLightHighContrast,
            ),
            unknown = NBExtendedColor(
                color = typeUnknownLightHighContrast,
                onColor = onTypeUnknownLightHighContrast,
            ),
            water = NBExtendedColor(
                color = typeWaterLightHighContrast,
                onColor = onTypeWaterLightHighContrast,
            ),
        )

        private val extendedColorsTypeDarkStandardContrast = NBExtendedColorsType(
            bug = NBExtendedColor(
                color = typeBugDarkStandardContrast,
                onColor = onTypeBugDarkStandardContrast,
            ),
            dark = NBExtendedColor(
                color = typeDarkDarkStandardContrast,
                onColor = onTypeDarkDarkStandardContrast,
            ),
            dragon = NBExtendedColor(
                color = typeDragonDarkStandardContrast,
                onColor = onTypeDragonDarkStandardContrast,
            ),
            electric = NBExtendedColor(
                color = typeElectricDarkStandardContrast,
                onColor = onTypeElectricDarkStandardContrast,
            ),
            fairy = NBExtendedColor(
                color = typeFairyDarkStandardContrast,
                onColor = onTypeFairyDarkStandardContrast,
            ),
            fighting = NBExtendedColor(
                color = typeFightingDarkStandardContrast,
                onColor = onTypeFightingDarkStandardContrast,
            ),
            fire = NBExtendedColor(
                color = typeFireDarkStandardContrast,
                onColor = onTypeFireDarkStandardContrast,
            ),
            flying = NBExtendedColor(
                color = typeFlyingDarkStandardContrast,
                onColor = onTypeFlyingDarkStandardContrast,
            ),
            ghost = NBExtendedColor(
                color = typeGhostDarkStandardContrast,
                onColor = onTypeGhostDarkStandardContrast,
            ),
            grass = NBExtendedColor(
                color = typeGrassDarkStandardContrast,
                onColor = onTypeGrassDarkStandardContrast,
            ),
            ground = NBExtendedColor(
                color = typeGroundDarkStandardContrast,
                onColor = onTypeGroundDarkStandardContrast,
            ),
            ice = NBExtendedColor(
                color = typeIceDarkStandardContrast,
                onColor = onTypeIceDarkStandardContrast,
            ),
            normal = NBExtendedColor(
                color = typeNormalDarkStandardContrast,
                onColor = onTypeNormalDarkStandardContrast,
            ),
            poison = NBExtendedColor(
                color = typePoisonDarkStandardContrast,
                onColor = onTypePoisonDarkStandardContrast,
            ),
            psychic = NBExtendedColor(
                color = typePsychicDarkStandardContrast,
                onColor = onTypePsychicDarkStandardContrast,
            ),
            rock = NBExtendedColor(
                color = typeRockDarkStandardContrast,
                onColor = onTypeRockDarkStandardContrast,
            ),
            shadow = NBExtendedColor(
                color = typeShadowDarkStandardContrast,
                onColor = onTypeShadowDarkStandardContrast,
            ),
            steel = NBExtendedColor(
                color = typeSteelDarkStandardContrast,
                onColor = onTypeSteelDarkStandardContrast,
            ),
            stellar = NBExtendedColor(
                color = typeStellarDarkStandardContrast,
                onColor = onTypeStellarDarkStandardContrast,
            ),
            unknown = NBExtendedColor(
                color = typeUnknownDarkStandardContrast,
                onColor = onTypeUnknownDarkStandardContrast,
            ),
            water = NBExtendedColor(
                color = typeWaterDarkStandardContrast,
                onColor = onTypeWaterDarkStandardContrast,
            ),
        )

        private val extendedColorsTypeDarkMediumContrast = NBExtendedColorsType(
            bug = NBExtendedColor(
                color = typeBugDarkMediumContrast,
                onColor = onTypeBugDarkMediumContrast,
            ),
            dark = NBExtendedColor(
                color = typeDarkDarkMediumContrast,
                onColor = onTypeDarkDarkMediumContrast,
            ),
            dragon = NBExtendedColor(
                color = typeDragonDarkMediumContrast,
                onColor = onTypeDragonDarkMediumContrast,
            ),
            electric = NBExtendedColor(
                color = typeElectricDarkMediumContrast,
                onColor = onTypeElectricDarkMediumContrast,
            ),
            fairy = NBExtendedColor(
                color = typeFairyDarkMediumContrast,
                onColor = onTypeFairyDarkMediumContrast,
            ),
            fighting = NBExtendedColor(
                color = typeFightingDarkMediumContrast,
                onColor = onTypeFightingDarkMediumContrast,
            ),
            fire = NBExtendedColor(
                color = typeFireDarkMediumContrast,
                onColor = onTypeFireDarkMediumContrast,
            ),
            flying = NBExtendedColor(
                color = typeFlyingDarkMediumContrast,
                onColor = onTypeFlyingDarkMediumContrast,
            ),
            ghost = NBExtendedColor(
                color = typeGhostDarkMediumContrast,
                onColor = onTypeGhostDarkMediumContrast,
            ),
            grass = NBExtendedColor(
                color = typeGrassDarkMediumContrast,
                onColor = onTypeGrassDarkMediumContrast,
            ),
            ground = NBExtendedColor(
                color = typeGroundDarkMediumContrast,
                onColor = onTypeGroundDarkMediumContrast,
            ),
            ice = NBExtendedColor(
                color = typeIceDarkMediumContrast,
                onColor = onTypeIceDarkMediumContrast,
            ),
            normal = NBExtendedColor(
                color = typeNormalDarkMediumContrast,
                onColor = onTypeNormalDarkMediumContrast,
            ),
            poison = NBExtendedColor(
                color = typePoisonDarkMediumContrast,
                onColor = onTypePoisonDarkMediumContrast,
            ),
            psychic = NBExtendedColor(
                color = typePsychicDarkMediumContrast,
                onColor = onTypePsychicDarkMediumContrast,
            ),
            rock = NBExtendedColor(
                color = typeRockDarkMediumContrast,
                onColor = onTypeRockDarkMediumContrast,
            ),
            shadow = NBExtendedColor(
                color = typeShadowDarkMediumContrast,
                onColor = onTypeShadowDarkMediumContrast,
            ),
            steel = NBExtendedColor(
                color = typeSteelDarkMediumContrast,
                onColor = onTypeSteelDarkMediumContrast,
            ),
            stellar = NBExtendedColor(
                color = typeStellarDarkMediumContrast,
                onColor = onTypeStellarDarkMediumContrast,
            ),
            unknown = NBExtendedColor(
                color = typeUnknownDarkMediumContrast,
                onColor = onTypeUnknownDarkMediumContrast,
            ),
            water = NBExtendedColor(
                color = typeWaterDarkMediumContrast,
                onColor = onTypeWaterDarkMediumContrast,
            ),
        )

        private val extendedColorsTypeDarkHighContrast = NBExtendedColorsType(
            bug = NBExtendedColor(
                color = typeBugDarkHighContrast,
                onColor = onTypeBugDarkHighContrast,
            ),
            dark = NBExtendedColor(
                color = typeDarkDarkHighContrast,
                onColor = onTypeDarkDarkHighContrast,
            ),
            dragon = NBExtendedColor(
                color = typeDragonDarkHighContrast,
                onColor = onTypeDragonDarkHighContrast,
            ),
            electric = NBExtendedColor(
                color = typeElectricDarkHighContrast,
                onColor = onTypeElectricDarkHighContrast,
            ),
            fairy = NBExtendedColor(
                color = typeFairyDarkHighContrast,
                onColor = onTypeFairyDarkHighContrast,
            ),
            fighting = NBExtendedColor(
                color = typeFightingDarkHighContrast,
                onColor = onTypeFightingDarkHighContrast,
            ),
            fire = NBExtendedColor(
                color = typeFireDarkHighContrast,
                onColor = onTypeFireDarkHighContrast,
            ),
            flying = NBExtendedColor(
                color = typeFlyingDarkHighContrast,
                onColor = onTypeFlyingDarkHighContrast,
            ),
            ghost = NBExtendedColor(
                color = typeGhostDarkHighContrast,
                onColor = onTypeGhostDarkHighContrast,
            ),
            grass = NBExtendedColor(
                color = typeGrassDarkHighContrast,
                onColor = onTypeGrassDarkHighContrast,
            ),
            ground = NBExtendedColor(
                color = typeGroundDarkHighContrast,
                onColor = onTypeGroundDarkHighContrast,
            ),
            ice = NBExtendedColor(
                color = typeIceDarkHighContrast,
                onColor = onTypeIceDarkHighContrast,
            ),
            normal = NBExtendedColor(
                color = typeNormalDarkHighContrast,
                onColor = onTypeNormalDarkHighContrast,
            ),
            poison = NBExtendedColor(
                color = typePoisonDarkHighContrast,
                onColor = onTypePoisonDarkHighContrast,
            ),
            psychic = NBExtendedColor(
                color = typePsychicDarkHighContrast,
                onColor = onTypePsychicDarkHighContrast,
            ),
            rock = NBExtendedColor(
                color = typeRockDarkHighContrast,
                onColor = onTypeRockDarkHighContrast,
            ),
            shadow = NBExtendedColor(
                color = typeShadowDarkHighContrast,
                onColor = onTypeShadowDarkHighContrast,
            ),
            steel = NBExtendedColor(
                color = typeSteelDarkHighContrast,
                onColor = onTypeSteelDarkHighContrast,
            ),
            stellar = NBExtendedColor(
                color = typeStellarDarkHighContrast,
                onColor = onTypeStellarDarkHighContrast,
            ),
            unknown = NBExtendedColor(
                color = typeUnknownDarkHighContrast,
                onColor = onTypeUnknownDarkHighContrast,
            ),
            water = NBExtendedColor(
                color = typeWaterDarkHighContrast,
                onColor = onTypeWaterDarkHighContrast,
            ),
        )

        internal fun from(
            isDarkTheme: Boolean,
            contrast: CoreSettingsContrast,
        ): NBExtendedColorsType {
            return if (isDarkTheme) {
                when (contrast) {
                    CoreSettingsContrast.STANDARD -> extendedColorsTypeDarkStandardContrast
                    CoreSettingsContrast.MEDIUM -> extendedColorsTypeDarkMediumContrast
                    CoreSettingsContrast.HIGH -> extendedColorsTypeDarkHighContrast
                }
            } else {
                when (contrast) {
                    CoreSettingsContrast.STANDARD -> extendedColorsTypeLightStandardContrast
                    CoreSettingsContrast.MEDIUM -> extendedColorsTypeLightMediumContrast
                    CoreSettingsContrast.HIGH -> extendedColorsTypeLightHighContrast
                }
            }
        }
    }
}
