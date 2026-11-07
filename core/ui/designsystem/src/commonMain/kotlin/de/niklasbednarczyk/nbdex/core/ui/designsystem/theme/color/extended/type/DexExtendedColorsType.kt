package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.type

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.DexExtendedColor

@Immutable
data class DexExtendedColorsType(
    /** Source color #91A119 from https://bulbapedia.bulbagarden.net/wiki/Template:Bug_color */
    val bug: DexExtendedColor,
    /** Source color #624D4E from https://bulbapedia.bulbagarden.net/wiki/Template:Dark_color */
    val dark: DexExtendedColor,
    /** Source color #5060E1 from https://bulbapedia.bulbagarden.net/wiki/Template:Dragon_color */
    val dragon: DexExtendedColor,
    /** Source color #FAC000 from https://bulbapedia.bulbagarden.net/wiki/Template:Electric_color */
    val electric: DexExtendedColor,
    /** Source color #EF70EF from https://bulbapedia.bulbagarden.net/wiki/Template:Fairy_color */
    val fairy: DexExtendedColor,
    /** Source color #FF8000 from https://bulbapedia.bulbagarden.net/wiki/Template:Fighting_color */
    val fighting: DexExtendedColor,
    /** Source color #E62829 from https://bulbapedia.bulbagarden.net/wiki/Template:Fire_color */
    val fire: DexExtendedColor,
    /** Source color #81B9EF from https://bulbapedia.bulbagarden.net/wiki/Template:Flying_color */
    val flying: DexExtendedColor,
    /** Source color #704170 from https://bulbapedia.bulbagarden.net/wiki/Template:Ghost_color */
    val ghost: DexExtendedColor,
    /** Source color #3FA129 from https://bulbapedia.bulbagarden.net/wiki/Template:Grass_color */
    val grass: DexExtendedColor,
    /** Source color #915121 from https://bulbapedia.bulbagarden.net/wiki/Template:Ground_color */
    val ground: DexExtendedColor,
    /** Source color #3DCEF3 from https://bulbapedia.bulbagarden.net/wiki/Template:Ice_color */
    val ice: DexExtendedColor,
    /** Source color #9FA19F from https://bulbapedia.bulbagarden.net/wiki/Template:Normal_color */
    val normal: DexExtendedColor,
    /** Source color #9141CB from https://bulbapedia.bulbagarden.net/wiki/Template:Poison_color */
    val poison: DexExtendedColor,
    /** Source color #EF4179 from https://bulbapedia.bulbagarden.net/wiki/Template:Psychic_color */
    val psychic: DexExtendedColor,
    /** Source color #AFA981 from https://bulbapedia.bulbagarden.net/wiki/Template:Rock_color */
    val rock: DexExtendedColor,
    /** Source color #604E82 from https://bulbapedia.bulbagarden.net/wiki/Template:XD_color */
    val shadow: DexExtendedColor,
    /** Source color #60A1B8 from https://bulbapedia.bulbagarden.net/wiki/Template:Steel_color */
    val steel: DexExtendedColor,
    /** Source color #40B5A5 from https://bulbapedia.bulbagarden.net/wiki/Template:Stellar_color */
    val stellar: DexExtendedColor,
    /** Source color #68A090 from https://bulbapedia.bulbagarden.net/wiki/Template:Unknown_color */
    val unknown: DexExtendedColor,
    /** Source color #2980EF from https://bulbapedia.bulbagarden.net/wiki/Template:Water_color */
    val water: DexExtendedColor,
) {
    companion object {
        private val extendedColorsTypeLightStandardContrast = DexExtendedColorsType(
            bug = DexExtendedColor(
                color = typeBugLightStandardContrast,
                onColor = onTypeBugLightStandardContrast,
            ),
            dark = DexExtendedColor(
                color = typeDarkLightStandardContrast,
                onColor = onTypeDarkLightStandardContrast,
            ),
            dragon = DexExtendedColor(
                color = typeDragonLightStandardContrast,
                onColor = onTypeDragonLightStandardContrast,
            ),
            electric = DexExtendedColor(
                color = typeElectricLightStandardContrast,
                onColor = onTypeElectricLightStandardContrast,
            ),
            fairy = DexExtendedColor(
                color = typeFairyLightStandardContrast,
                onColor = onTypeFairyLightStandardContrast,
            ),
            fighting = DexExtendedColor(
                color = typeFightingLightStandardContrast,
                onColor = onTypeFightingLightStandardContrast,
            ),
            fire = DexExtendedColor(
                color = typeFireLightStandardContrast,
                onColor = onTypeFireLightStandardContrast,
            ),
            flying = DexExtendedColor(
                color = typeFlyingLightStandardContrast,
                onColor = onTypeFlyingLightStandardContrast,
            ),
            ghost = DexExtendedColor(
                color = typeGhostLightStandardContrast,
                onColor = onTypeGhostLightStandardContrast,
            ),
            grass = DexExtendedColor(
                color = typeGrassLightStandardContrast,
                onColor = onTypeGrassLightStandardContrast,
            ),
            ground = DexExtendedColor(
                color = typeGroundLightStandardContrast,
                onColor = onTypeGroundLightStandardContrast,
            ),
            ice = DexExtendedColor(
                color = typeIceLightStandardContrast,
                onColor = onTypeIceLightStandardContrast,
            ),
            normal = DexExtendedColor(
                color = typeNormalLightStandardContrast,
                onColor = onTypeNormalLightStandardContrast,
            ),
            poison = DexExtendedColor(
                color = typePoisonLightStandardContrast,
                onColor = onTypePoisonLightStandardContrast,
            ),
            psychic = DexExtendedColor(
                color = typePsychicLightStandardContrast,
                onColor = onTypePsychicLightStandardContrast,
            ),
            rock = DexExtendedColor(
                color = typeRockLightStandardContrast,
                onColor = onTypeRockLightStandardContrast,
            ),
            shadow = DexExtendedColor(
                color = typeShadowLightStandardContrast,
                onColor = onTypeShadowLightStandardContrast,
            ),
            steel = DexExtendedColor(
                color = typeSteelLightStandardContrast,
                onColor = onTypeSteelLightStandardContrast,
            ),
            stellar = DexExtendedColor(
                color = typeStellarLightStandardContrast,
                onColor = onTypeStellarLightStandardContrast,
            ),
            unknown = DexExtendedColor(
                color = typeUnknownLightStandardContrast,
                onColor = onTypeUnknownLightStandardContrast,
            ),
            water = DexExtendedColor(
                color = typeWaterLightStandardContrast,
                onColor = onTypeWaterLightStandardContrast,
            ),
        )

        private val extendedColorsTypeLightMediumContrast = DexExtendedColorsType(
            bug = DexExtendedColor(
                color = typeBugLightMediumContrast,
                onColor = onTypeBugLightMediumContrast,
            ),
            dark = DexExtendedColor(
                color = typeDarkLightMediumContrast,
                onColor = onTypeDarkLightMediumContrast,
            ),
            dragon = DexExtendedColor(
                color = typeDragonLightMediumContrast,
                onColor = onTypeDragonLightMediumContrast,
            ),
            electric = DexExtendedColor(
                color = typeElectricLightMediumContrast,
                onColor = onTypeElectricLightMediumContrast,
            ),
            fairy = DexExtendedColor(
                color = typeFairyLightMediumContrast,
                onColor = onTypeFairyLightMediumContrast,
            ),
            fighting = DexExtendedColor(
                color = typeFightingLightMediumContrast,
                onColor = onTypeFightingLightMediumContrast,
            ),
            fire = DexExtendedColor(
                color = typeFireLightMediumContrast,
                onColor = onTypeFireLightMediumContrast,
            ),
            flying = DexExtendedColor(
                color = typeFlyingLightMediumContrast,
                onColor = onTypeFlyingLightMediumContrast,
            ),
            ghost = DexExtendedColor(
                color = typeGhostLightMediumContrast,
                onColor = onTypeGhostLightMediumContrast,
            ),
            grass = DexExtendedColor(
                color = typeGrassLightMediumContrast,
                onColor = onTypeGrassLightMediumContrast,
            ),
            ground = DexExtendedColor(
                color = typeGroundLightMediumContrast,
                onColor = onTypeGroundLightMediumContrast,
            ),
            ice = DexExtendedColor(
                color = typeIceLightMediumContrast,
                onColor = onTypeIceLightMediumContrast,
            ),
            normal = DexExtendedColor(
                color = typeNormalLightMediumContrast,
                onColor = onTypeNormalLightMediumContrast,
            ),
            poison = DexExtendedColor(
                color = typePoisonLightMediumContrast,
                onColor = onTypePoisonLightMediumContrast,
            ),
            psychic = DexExtendedColor(
                color = typePsychicLightMediumContrast,
                onColor = onTypePsychicLightMediumContrast,
            ),
            rock = DexExtendedColor(
                color = typeRockLightMediumContrast,
                onColor = onTypeRockLightMediumContrast,
            ),
            shadow = DexExtendedColor(
                color = typeShadowLightMediumContrast,
                onColor = onTypeShadowLightMediumContrast,
            ),
            steel = DexExtendedColor(
                color = typeSteelLightMediumContrast,
                onColor = onTypeSteelLightMediumContrast,
            ),
            stellar = DexExtendedColor(
                color = typeStellarLightMediumContrast,
                onColor = onTypeStellarLightMediumContrast,
            ),
            unknown = DexExtendedColor(
                color = typeUnknownLightMediumContrast,
                onColor = onTypeUnknownLightMediumContrast,
            ),
            water = DexExtendedColor(
                color = typeWaterLightMediumContrast,
                onColor = onTypeWaterLightMediumContrast,
            ),
        )

        private val extendedColorsTypeLightHighContrast = DexExtendedColorsType(
            bug = DexExtendedColor(
                color = typeBugLightHighContrast,
                onColor = onTypeBugLightHighContrast,
            ),
            dark = DexExtendedColor(
                color = typeDarkLightHighContrast,
                onColor = onTypeDarkLightHighContrast,
            ),
            dragon = DexExtendedColor(
                color = typeDragonLightHighContrast,
                onColor = onTypeDragonLightHighContrast,
            ),
            electric = DexExtendedColor(
                color = typeElectricLightHighContrast,
                onColor = onTypeElectricLightHighContrast,
            ),
            fairy = DexExtendedColor(
                color = typeFairyLightHighContrast,
                onColor = onTypeFairyLightHighContrast,
            ),
            fighting = DexExtendedColor(
                color = typeFightingLightHighContrast,
                onColor = onTypeFightingLightHighContrast,
            ),
            fire = DexExtendedColor(
                color = typeFireLightHighContrast,
                onColor = onTypeFireLightHighContrast,
            ),
            flying = DexExtendedColor(
                color = typeFlyingLightHighContrast,
                onColor = onTypeFlyingLightHighContrast,
            ),
            ghost = DexExtendedColor(
                color = typeGhostLightHighContrast,
                onColor = onTypeGhostLightHighContrast,
            ),
            grass = DexExtendedColor(
                color = typeGrassLightHighContrast,
                onColor = onTypeGrassLightHighContrast,
            ),
            ground = DexExtendedColor(
                color = typeGroundLightHighContrast,
                onColor = onTypeGroundLightHighContrast,
            ),
            ice = DexExtendedColor(
                color = typeIceLightHighContrast,
                onColor = onTypeIceLightHighContrast,
            ),
            normal = DexExtendedColor(
                color = typeNormalLightHighContrast,
                onColor = onTypeNormalLightHighContrast,
            ),
            poison = DexExtendedColor(
                color = typePoisonLightHighContrast,
                onColor = onTypePoisonLightHighContrast,
            ),
            psychic = DexExtendedColor(
                color = typePsychicLightHighContrast,
                onColor = onTypePsychicLightHighContrast,
            ),
            rock = DexExtendedColor(
                color = typeRockLightHighContrast,
                onColor = onTypeRockLightHighContrast,
            ),
            shadow = DexExtendedColor(
                color = typeShadowLightHighContrast,
                onColor = onTypeShadowLightHighContrast,
            ),
            steel = DexExtendedColor(
                color = typeSteelLightHighContrast,
                onColor = onTypeSteelLightHighContrast,
            ),
            stellar = DexExtendedColor(
                color = typeStellarLightHighContrast,
                onColor = onTypeStellarLightHighContrast,
            ),
            unknown = DexExtendedColor(
                color = typeUnknownLightHighContrast,
                onColor = onTypeUnknownLightHighContrast,
            ),
            water = DexExtendedColor(
                color = typeWaterLightHighContrast,
                onColor = onTypeWaterLightHighContrast,
            ),
        )

        private val extendedColorsTypeDarkStandardContrast = DexExtendedColorsType(
            bug = DexExtendedColor(
                color = typeBugDarkStandardContrast,
                onColor = onTypeBugDarkStandardContrast,
            ),
            dark = DexExtendedColor(
                color = typeDarkDarkStandardContrast,
                onColor = onTypeDarkDarkStandardContrast,
            ),
            dragon = DexExtendedColor(
                color = typeDragonDarkStandardContrast,
                onColor = onTypeDragonDarkStandardContrast,
            ),
            electric = DexExtendedColor(
                color = typeElectricDarkStandardContrast,
                onColor = onTypeElectricDarkStandardContrast,
            ),
            fairy = DexExtendedColor(
                color = typeFairyDarkStandardContrast,
                onColor = onTypeFairyDarkStandardContrast,
            ),
            fighting = DexExtendedColor(
                color = typeFightingDarkStandardContrast,
                onColor = onTypeFightingDarkStandardContrast,
            ),
            fire = DexExtendedColor(
                color = typeFireDarkStandardContrast,
                onColor = onTypeFireDarkStandardContrast,
            ),
            flying = DexExtendedColor(
                color = typeFlyingDarkStandardContrast,
                onColor = onTypeFlyingDarkStandardContrast,
            ),
            ghost = DexExtendedColor(
                color = typeGhostDarkStandardContrast,
                onColor = onTypeGhostDarkStandardContrast,
            ),
            grass = DexExtendedColor(
                color = typeGrassDarkStandardContrast,
                onColor = onTypeGrassDarkStandardContrast,
            ),
            ground = DexExtendedColor(
                color = typeGroundDarkStandardContrast,
                onColor = onTypeGroundDarkStandardContrast,
            ),
            ice = DexExtendedColor(
                color = typeIceDarkStandardContrast,
                onColor = onTypeIceDarkStandardContrast,
            ),
            normal = DexExtendedColor(
                color = typeNormalDarkStandardContrast,
                onColor = onTypeNormalDarkStandardContrast,
            ),
            poison = DexExtendedColor(
                color = typePoisonDarkStandardContrast,
                onColor = onTypePoisonDarkStandardContrast,
            ),
            psychic = DexExtendedColor(
                color = typePsychicDarkStandardContrast,
                onColor = onTypePsychicDarkStandardContrast,
            ),
            rock = DexExtendedColor(
                color = typeRockDarkStandardContrast,
                onColor = onTypeRockDarkStandardContrast,
            ),
            shadow = DexExtendedColor(
                color = typeShadowDarkStandardContrast,
                onColor = onTypeShadowDarkStandardContrast,
            ),
            steel = DexExtendedColor(
                color = typeSteelDarkStandardContrast,
                onColor = onTypeSteelDarkStandardContrast,
            ),
            stellar = DexExtendedColor(
                color = typeStellarDarkStandardContrast,
                onColor = onTypeStellarDarkStandardContrast,
            ),
            unknown = DexExtendedColor(
                color = typeUnknownDarkStandardContrast,
                onColor = onTypeUnknownDarkStandardContrast,
            ),
            water = DexExtendedColor(
                color = typeWaterDarkStandardContrast,
                onColor = onTypeWaterDarkStandardContrast,
            ),
        )

        private val extendedColorsTypeDarkMediumContrast = DexExtendedColorsType(
            bug = DexExtendedColor(
                color = typeBugDarkMediumContrast,
                onColor = onTypeBugDarkMediumContrast,
            ),
            dark = DexExtendedColor(
                color = typeDarkDarkMediumContrast,
                onColor = onTypeDarkDarkMediumContrast,
            ),
            dragon = DexExtendedColor(
                color = typeDragonDarkMediumContrast,
                onColor = onTypeDragonDarkMediumContrast,
            ),
            electric = DexExtendedColor(
                color = typeElectricDarkMediumContrast,
                onColor = onTypeElectricDarkMediumContrast,
            ),
            fairy = DexExtendedColor(
                color = typeFairyDarkMediumContrast,
                onColor = onTypeFairyDarkMediumContrast,
            ),
            fighting = DexExtendedColor(
                color = typeFightingDarkMediumContrast,
                onColor = onTypeFightingDarkMediumContrast,
            ),
            fire = DexExtendedColor(
                color = typeFireDarkMediumContrast,
                onColor = onTypeFireDarkMediumContrast,
            ),
            flying = DexExtendedColor(
                color = typeFlyingDarkMediumContrast,
                onColor = onTypeFlyingDarkMediumContrast,
            ),
            ghost = DexExtendedColor(
                color = typeGhostDarkMediumContrast,
                onColor = onTypeGhostDarkMediumContrast,
            ),
            grass = DexExtendedColor(
                color = typeGrassDarkMediumContrast,
                onColor = onTypeGrassDarkMediumContrast,
            ),
            ground = DexExtendedColor(
                color = typeGroundDarkMediumContrast,
                onColor = onTypeGroundDarkMediumContrast,
            ),
            ice = DexExtendedColor(
                color = typeIceDarkMediumContrast,
                onColor = onTypeIceDarkMediumContrast,
            ),
            normal = DexExtendedColor(
                color = typeNormalDarkMediumContrast,
                onColor = onTypeNormalDarkMediumContrast,
            ),
            poison = DexExtendedColor(
                color = typePoisonDarkMediumContrast,
                onColor = onTypePoisonDarkMediumContrast,
            ),
            psychic = DexExtendedColor(
                color = typePsychicDarkMediumContrast,
                onColor = onTypePsychicDarkMediumContrast,
            ),
            rock = DexExtendedColor(
                color = typeRockDarkMediumContrast,
                onColor = onTypeRockDarkMediumContrast,
            ),
            shadow = DexExtendedColor(
                color = typeShadowDarkMediumContrast,
                onColor = onTypeShadowDarkMediumContrast,
            ),
            steel = DexExtendedColor(
                color = typeSteelDarkMediumContrast,
                onColor = onTypeSteelDarkMediumContrast,
            ),
            stellar = DexExtendedColor(
                color = typeStellarDarkMediumContrast,
                onColor = onTypeStellarDarkMediumContrast,
            ),
            unknown = DexExtendedColor(
                color = typeUnknownDarkMediumContrast,
                onColor = onTypeUnknownDarkMediumContrast,
            ),
            water = DexExtendedColor(
                color = typeWaterDarkMediumContrast,
                onColor = onTypeWaterDarkMediumContrast,
            ),
        )

        private val extendedColorsTypeDarkHighContrast = DexExtendedColorsType(
            bug = DexExtendedColor(
                color = typeBugDarkHighContrast,
                onColor = onTypeBugDarkHighContrast,
            ),
            dark = DexExtendedColor(
                color = typeDarkDarkHighContrast,
                onColor = onTypeDarkDarkHighContrast,
            ),
            dragon = DexExtendedColor(
                color = typeDragonDarkHighContrast,
                onColor = onTypeDragonDarkHighContrast,
            ),
            electric = DexExtendedColor(
                color = typeElectricDarkHighContrast,
                onColor = onTypeElectricDarkHighContrast,
            ),
            fairy = DexExtendedColor(
                color = typeFairyDarkHighContrast,
                onColor = onTypeFairyDarkHighContrast,
            ),
            fighting = DexExtendedColor(
                color = typeFightingDarkHighContrast,
                onColor = onTypeFightingDarkHighContrast,
            ),
            fire = DexExtendedColor(
                color = typeFireDarkHighContrast,
                onColor = onTypeFireDarkHighContrast,
            ),
            flying = DexExtendedColor(
                color = typeFlyingDarkHighContrast,
                onColor = onTypeFlyingDarkHighContrast,
            ),
            ghost = DexExtendedColor(
                color = typeGhostDarkHighContrast,
                onColor = onTypeGhostDarkHighContrast,
            ),
            grass = DexExtendedColor(
                color = typeGrassDarkHighContrast,
                onColor = onTypeGrassDarkHighContrast,
            ),
            ground = DexExtendedColor(
                color = typeGroundDarkHighContrast,
                onColor = onTypeGroundDarkHighContrast,
            ),
            ice = DexExtendedColor(
                color = typeIceDarkHighContrast,
                onColor = onTypeIceDarkHighContrast,
            ),
            normal = DexExtendedColor(
                color = typeNormalDarkHighContrast,
                onColor = onTypeNormalDarkHighContrast,
            ),
            poison = DexExtendedColor(
                color = typePoisonDarkHighContrast,
                onColor = onTypePoisonDarkHighContrast,
            ),
            psychic = DexExtendedColor(
                color = typePsychicDarkHighContrast,
                onColor = onTypePsychicDarkHighContrast,
            ),
            rock = DexExtendedColor(
                color = typeRockDarkHighContrast,
                onColor = onTypeRockDarkHighContrast,
            ),
            shadow = DexExtendedColor(
                color = typeShadowDarkHighContrast,
                onColor = onTypeShadowDarkHighContrast,
            ),
            steel = DexExtendedColor(
                color = typeSteelDarkHighContrast,
                onColor = onTypeSteelDarkHighContrast,
            ),
            stellar = DexExtendedColor(
                color = typeStellarDarkHighContrast,
                onColor = onTypeStellarDarkHighContrast,
            ),
            unknown = DexExtendedColor(
                color = typeUnknownDarkHighContrast,
                onColor = onTypeUnknownDarkHighContrast,
            ),
            water = DexExtendedColor(
                color = typeWaterDarkHighContrast,
                onColor = onTypeWaterDarkHighContrast,
            ),
        )

        internal fun from(
            isDarkTheme: Boolean,
            contrast: CoreSettingsContrast,
        ): DexExtendedColorsType {
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
