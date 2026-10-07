package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonSpeciesNameId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
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
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
