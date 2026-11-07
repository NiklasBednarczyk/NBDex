package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonHabitatId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CorePokemonHabitatId {
            return CorePokemonHabitatId(value)
        }

        fun from(
            value: Int,
        ): CorePokemonHabitatId {
            return CorePokemonHabitatId(value)
        }

        fun from(
            value: Int?,
        ): CorePokemonHabitatId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
