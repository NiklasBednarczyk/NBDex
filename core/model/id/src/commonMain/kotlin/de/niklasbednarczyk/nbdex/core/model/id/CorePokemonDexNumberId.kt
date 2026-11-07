package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonDexNumberId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CorePokemonDexNumberId {
            return CorePokemonDexNumberId(value)
        }

        fun from(
            value: Int,
        ): CorePokemonDexNumberId {
            return CorePokemonDexNumberId(value)
        }

        fun from(
            value: Int?,
        ): CorePokemonDexNumberId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
