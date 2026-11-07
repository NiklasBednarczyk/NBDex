package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokedexDescriptionId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CorePokedexDescriptionId {
            return CorePokedexDescriptionId(value)
        }

        fun from(
            value: Int,
        ): CorePokedexDescriptionId {
            return CorePokedexDescriptionId(value)
        }

        fun from(
            value: Int?,
        ): CorePokedexDescriptionId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
