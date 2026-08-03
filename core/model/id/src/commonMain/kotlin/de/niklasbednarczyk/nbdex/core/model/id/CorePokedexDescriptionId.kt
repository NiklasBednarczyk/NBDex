package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokedexDescriptionId private constructor(override val value: Int) : NBId {

    companion object {

        fun example(value: Int = NBId.EXAMPLE_VALUE): CorePokedexDescriptionId {
            return CorePokedexDescriptionId(value)
        }

        fun from(value: Int): CorePokedexDescriptionId {
            return CorePokedexDescriptionId(value)
        }

        fun from(value: Int?): CorePokedexDescriptionId? {
            return NBId.fromNullable(value, ::from)
        }

    }

}