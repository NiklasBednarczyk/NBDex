package de.niklasbednarczyk.nbdex.core.model.endpoint.display.type

import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId

sealed interface CoreDisplayTypeVersionGroup : NBDisplayType<CoreVersionGroupId> {

    sealed interface Basic : CoreDisplayTypeVersionGroup

    sealed interface SameVersions : CoreDisplayTypeVersionGroup

    data object RedBlue : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(1)
    }

    data object Yellow : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(2)
    }

    data object GoldSilver : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(3)
    }

    data object Crystal : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(4)
    }

    data object RubySapphire : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(5)
    }

    data object Emerald : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(6)
    }

    data object FireRedLeafGreen : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(7)
    }

    data object DiamondPearl : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(8)
    }

    data object Platinum : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(9)
    }

    data object HeartGoldSoulSilver : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(10)
    }

    data object BlackWhite : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(11)
    }

    data object Colosseum : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(12)
    }

    data object XD : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(13)
    }

    data object Black2White2 : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(14)
    }

    data object XY : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(15)
    }

    data object OmegaRubyAlphaSapphire : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(16)
    }

    data object SunMoon : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(17)
    }

    data object UltraSunUltraMoon : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(18)
    }

    data object LetsGoPikachuLetsGoEevee : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(19)
    }

    data object SwordShield : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(20)
    }

    data object TheIsleOfArmor : SameVersions {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(21)
    }

    data object TheCrownTundra : SameVersions {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(22)
    }

    data object BrilliantDiamondShiningPearl : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(23)
    }

    data object LegendsArceus : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(24)
    }

    data object ScarletViolet : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(25)
    }

    data object TheTealMask : SameVersions {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(26)
    }

    data object TheIndigoDisk : SameVersions {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(27)
    }

    data object RedGreenJapan : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(28)
    }

    data object BlueJapan : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(29)
    }

    data object LegendsZa : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(30)
    }

    data object MegaDimension : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(31)
    }

    data object Champions : Basic {
        override val id: CoreVersionGroupId
            get() = CoreVersionGroupId.from(32)
    }

    companion object {

        private val entries: Set<CoreDisplayTypeVersionGroup> = setOf(
            RedBlue,
            Yellow,
            GoldSilver,
            Crystal,
            RubySapphire,
            Emerald,
            FireRedLeafGreen,
            DiamondPearl,
            Platinum,
            HeartGoldSoulSilver,
            BlackWhite,
            Colosseum,
            XD,
            Black2White2,
            XY,
            OmegaRubyAlphaSapphire,
            SunMoon,
            UltraSunUltraMoon,
            LetsGoPikachuLetsGoEevee,
            SwordShield,
            TheIsleOfArmor,
            TheCrownTundra,
            BrilliantDiamondShiningPearl,
            LegendsArceus,
            ScarletViolet,
            TheTealMask,
            TheIndigoDisk,
            RedGreenJapan,
            BlueJapan,
            LegendsZa,
            MegaDimension,
            Champions,
        )

        internal fun from(id: CoreVersionGroupId?): CoreDisplayTypeVersionGroup? {
            return entries.firstOrNull { displayType -> displayType.id == id }
        }

    }

}