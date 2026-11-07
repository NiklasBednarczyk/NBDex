package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokedexId private constructor(override val value: Int) : DexId {
    companion object {
        /** national */
        val default: CorePokedexId = CorePokedexId(1)

        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CorePokedexId {
            return CorePokedexId(value)
        }

        fun from(
            value: Int,
        ): CorePokedexId {
            return CorePokedexId(value)
        }

        fun from(
            value: Int?,
        ): CorePokedexId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
