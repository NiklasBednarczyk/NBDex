package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CorePokemonId {
            return CorePokemonId(value)
        }

        fun from(
            value: Int,
        ): CorePokemonId {
            return CorePokemonId(value)
        }

        fun from(
            value: Int?,
        ): CorePokemonId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
