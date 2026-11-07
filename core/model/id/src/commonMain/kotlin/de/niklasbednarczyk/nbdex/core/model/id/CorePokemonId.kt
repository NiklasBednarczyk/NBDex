package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
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
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
