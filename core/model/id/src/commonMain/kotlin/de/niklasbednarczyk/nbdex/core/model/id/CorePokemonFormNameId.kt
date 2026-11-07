package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonFormNameId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
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
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
