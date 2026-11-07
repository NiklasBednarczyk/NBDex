package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonFormId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CorePokemonFormId {
            return CorePokemonFormId(value)
        }

        fun from(
            value: Int,
        ): CorePokemonFormId {
            return CorePokemonFormId(value)
        }

        fun from(
            value: Int?,
        ): CorePokemonFormId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
