package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokedexId private constructor(override val value: Int) : NBId {
    companion object {
        /** national */
        val default: CorePokedexId = CorePokedexId(1)

        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
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
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
