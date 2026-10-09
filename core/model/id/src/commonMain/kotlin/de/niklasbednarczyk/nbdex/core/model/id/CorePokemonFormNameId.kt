package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonFormNameId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CorePokemonFormNameId {
            return CorePokemonFormNameId(value)
        }

        fun from(
            value: Int,
        ): CorePokemonFormNameId {
            return CorePokemonFormNameId(value)
        }

        fun from(
            value: Int?,
        ): CorePokemonFormNameId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
