package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokemonShapeId private constructor(override val value: Int) : NBId {

    companion object {

        fun example(value: Int = NBId.EXAMPLE_VALUE): CorePokemonShapeId {
            return CorePokemonShapeId(value)
        }
        
        fun from(value: Int): CorePokemonShapeId {
            return CorePokemonShapeId(value)
        }

        fun from(value: Int?): CorePokemonShapeId? {
            return NBId.fromNullable(value, ::from)
        }

    }

}