package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokedexVersionGroupId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CorePokedexVersionGroupId {
            return CorePokedexVersionGroupId(value)
        }

        fun from(
            value: Int,
        ): CorePokedexVersionGroupId {
            return CorePokedexVersionGroupId(value)
        }

        fun from(
            value: Int?,
        ): CorePokedexVersionGroupId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
