package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CorePokedexNameId private constructor(override val value: Int) : NBId {

    companion object {

        fun example(value: Int = NBId.EXAMPLE_VALUE): CorePokedexNameId {
            return CorePokedexNameId(value)
        }

        fun from(value: Int): CorePokedexNameId {
            return CorePokedexNameId(value)
        }

        fun from(value: Int?): CorePokedexNameId? {
            return NBId.fromNullable(value, ::from)
        }

    }

}