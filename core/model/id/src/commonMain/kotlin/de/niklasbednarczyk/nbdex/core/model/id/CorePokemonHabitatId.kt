package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonHabitatId private constructor(override val value: Int) : NBId {

    companion object {

        fun example(value: Int = NBId.EXAMPLE_VALUE): CorePokemonHabitatId {
            return CorePokemonHabitatId(value)
        }

        fun from(value: Int): CorePokemonHabitatId {
            return CorePokemonHabitatId(value)
        }

        fun from(value: Int?): CorePokemonHabitatId? {
            return NBId.fromNullable(value, ::from)
        }

    }

}