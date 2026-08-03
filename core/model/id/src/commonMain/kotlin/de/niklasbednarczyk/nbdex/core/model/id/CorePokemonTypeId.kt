package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonTypeId private constructor(override val value: Int) : NBId {

    companion object {

        fun example(value: Int = NBId.EXAMPLE_VALUE): CorePokemonTypeId {
            return CorePokemonTypeId(value)
        }

        fun from(value: Int): CorePokemonTypeId {
            return CorePokemonTypeId(value)
        }

        fun from(value: Int?): CorePokemonTypeId? {
            return NBId.fromNullable(value, ::from)
        }

    }

}