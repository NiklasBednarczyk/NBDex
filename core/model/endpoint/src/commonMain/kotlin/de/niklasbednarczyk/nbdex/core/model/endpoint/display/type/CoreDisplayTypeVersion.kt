package de.niklasbednarczyk.nbdex.core.model.endpoint.display.type

import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId

enum class CoreDisplayTypeVersion : NBDisplayType<CoreVersionId> {
    RED,
    BLUE,
    YELLOW,
    GOLD,
    SILVER,
    CRYSTAL,
    RUBY,
    SAPPHIRE,
    EMERALD,
    FIRE_RED,
    LEAF_GREEN,
    DIAMOND,
    PEARL,
    PLATINUM,
    HEART_GOLD,
    SOUL_SILVER,
    BLACK,
    WHITE,
    COLOSSEUM,
    XD,
    BLACK_2,
    WHITE_2,
    X,
    Y,
    OMEGA_RUBY,
    ALPHA_SAPPHIRE,
    SUN,
    MOON,
    ULTRA_SUN,
    ULTRA_MOON,
    LETS_GO_PIKACHU,
    LETS_GO_EEVEE,
    SWORD,
    SHIELD,
    THE_ISLE_OF_ARMOR_SWORD,
    THE_CROWN_TUNDRA_SWORD,
    BRILLIANT_DIAMOND,
    SHINING_PEARL,
    LEGENDS_ARCEUS,
    SCARLET,
    VIOLET,
    THE_TEAL_MASK_SCARLET,
    THE_INDIGO_DISK_SCARLET,
    RED_JAPAN,
    GREEN_JAPAN,
    BLUE_JAPAN,
    LEGENDS_ZA,
    MEGA_DIMENSION,
    CHAMPIONS,
    THE_ISLE_OF_ARMOR_SHIELD,
    THE_CROWN_TUNDRA_SHIELD,
    THE_TEAL_MASK_VIOLET,
    THE_INDIGO_DISK_VIOLET,
    ;

    override val id: CoreVersionId
        get() {
            val idValue = when (this) {
                RED -> 1
                BLUE -> 2
                YELLOW -> 3
                GOLD -> 4
                SILVER -> 5
                CRYSTAL -> 6
                RUBY -> 7
                SAPPHIRE -> 8
                EMERALD -> 9
                FIRE_RED -> 10
                LEAF_GREEN -> 11
                DIAMOND -> 12
                PEARL -> 13
                PLATINUM -> 14
                HEART_GOLD -> 15
                SOUL_SILVER -> 16
                BLACK -> 17
                WHITE -> 18
                COLOSSEUM -> 19
                XD -> 20
                BLACK_2 -> 21
                WHITE_2 -> 22
                X -> 23
                Y -> 24
                OMEGA_RUBY -> 25
                ALPHA_SAPPHIRE -> 26
                SUN -> 27
                MOON -> 28
                ULTRA_SUN -> 29
                ULTRA_MOON -> 30
                LETS_GO_PIKACHU -> 31
                LETS_GO_EEVEE -> 32
                SWORD -> 33
                SHIELD -> 34
                THE_ISLE_OF_ARMOR_SWORD -> 35
                THE_CROWN_TUNDRA_SWORD -> 36
                BRILLIANT_DIAMOND -> 37
                SHINING_PEARL -> 38
                LEGENDS_ARCEUS -> 39
                SCARLET -> 40
                VIOLET -> 41
                THE_TEAL_MASK_SCARLET -> 42
                THE_INDIGO_DISK_SCARLET -> 43
                RED_JAPAN -> 44
                GREEN_JAPAN -> 45
                BLUE_JAPAN -> 46
                LEGENDS_ZA -> 47
                MEGA_DIMENSION -> 48
                CHAMPIONS -> 49
                THE_ISLE_OF_ARMOR_SHIELD -> 50
                THE_CROWN_TUNDRA_SHIELD -> 51
                THE_TEAL_MASK_VIOLET -> 52
                THE_INDIGO_DISK_VIOLET -> 53
            }
            return CoreVersionId.from(idValue)
        }

    companion object {
        internal fun from(
            id: CoreVersionId?,
        ): CoreDisplayTypeVersion? {
            return entries.firstOrNull { displayType -> displayType.id == id }
        }
    }
}
