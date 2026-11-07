package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokedexNameId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CorePokedexNameId {
            return CorePokedexNameId(value)
        }

        fun from(
            value: Int,
        ): CorePokedexNameId {
            return CorePokedexNameId(value)
        }

        fun from(
            value: Int?,
        ): CorePokedexNameId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
