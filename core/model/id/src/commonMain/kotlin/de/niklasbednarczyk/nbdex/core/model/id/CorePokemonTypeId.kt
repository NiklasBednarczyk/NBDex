package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonTypeId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CorePokemonTypeId {
            return CorePokemonTypeId(value)
        }

        fun from(
            value: Int,
        ): CorePokemonTypeId {
            return CorePokemonTypeId(value)
        }

        fun from(
            value: Int?,
        ): CorePokemonTypeId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
