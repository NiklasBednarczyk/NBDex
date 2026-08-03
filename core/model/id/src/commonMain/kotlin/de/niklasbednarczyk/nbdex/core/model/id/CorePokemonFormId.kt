package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonFormId private constructor(override val value: Int) : NBId {

    companion object {

        fun example(value: Int = NBId.EXAMPLE_VALUE): CorePokemonFormId {
            return CorePokemonFormId(value)
        }

        fun from(value: Int): CorePokemonFormId {
            return CorePokemonFormId(value)
        }

        fun from(value: Int?): CorePokemonFormId? {
            return NBId.fromNullable(value, ::from)
        }

    }

}