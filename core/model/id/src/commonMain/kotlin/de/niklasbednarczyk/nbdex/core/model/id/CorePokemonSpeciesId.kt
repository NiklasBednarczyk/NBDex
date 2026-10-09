package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonSpeciesId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CorePokemonSpeciesId {
            return CorePokemonSpeciesId(value)
        }

        fun from(
            value: Int,
        ): CorePokemonSpeciesId {
            return CorePokemonSpeciesId(value)
        }

        fun from(
            value: Int?,
        ): CorePokemonSpeciesId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
