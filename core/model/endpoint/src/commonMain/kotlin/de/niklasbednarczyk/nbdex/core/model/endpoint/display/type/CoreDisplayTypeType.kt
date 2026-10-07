package de.niklasbednarczyk.nbdex.core.model.endpoint.display.type

import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId

enum class CoreDisplayTypeType : NBDisplayType<CoreTypeId> {
    NORMAL,
    FIGHTING,
    FLYING,
    POISON,
    GROUND,
    ROCK,
    BUG,
    GHOST,
    STEEL,
    FIRE,
    WATER,
    GRASS,
    ELECTRIC,
    PSYCHIC,
    ICE,
    DRAGON,
    DARK,
    FAIRY,
    STELLAR,
    UNKNOWN,
    SHADOW,
    ;

    override val id: CoreTypeId
        get() {
            val idValue = when (this) {
                NORMAL -> 1
                FIGHTING -> 2
                FLYING -> 3
                POISON -> 4
                GROUND -> 5
                ROCK -> 6
                BUG -> 7
                GHOST -> 8
                STEEL -> 9
                FIRE -> 10
                WATER -> 11
                GRASS -> 12
                ELECTRIC -> 13
                PSYCHIC -> 14
                ICE -> 15
                DRAGON -> 16
                DARK -> 17
                FAIRY -> 18
                STELLAR -> 19
                UNKNOWN -> 10_001
                SHADOW -> 10_002
            }
            return CoreTypeId.from(idValue)
        }

    companion object {
        internal fun from(
            id: CoreTypeId?,
        ): CoreDisplayTypeType? {
            return entries.firstOrNull { displayType -> displayType.id == id }
        }
    }
}
