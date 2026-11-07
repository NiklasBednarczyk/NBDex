package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonSpeciesNameId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CorePokemonSpeciesNameId {
            return CorePokemonSpeciesNameId(value)
        }

        fun from(
            value: Int,
        ): CorePokemonSpeciesNameId {
            return CorePokemonSpeciesNameId(value)
        }

        fun from(
            value: Int?,
        ): CorePokemonSpeciesNameId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
