package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonColorId private constructor(override val value: Int) : NBId {

    companion object {

        fun example(value: Int = NBId.EXAMPLE_VALUE): CorePokemonColorId {
            return CorePokemonColorId(value)
        }

        fun from(value: Int): CorePokemonColorId {
            return CorePokemonColorId(value)
        }

        fun from(value: Int?): CorePokemonColorId? {
            return NBId.fromNullable(value, ::from)
        }

    }

}