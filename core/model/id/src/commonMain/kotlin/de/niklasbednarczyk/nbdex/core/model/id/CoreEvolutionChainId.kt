package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreEvolutionChainId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CoreEvolutionChainId {
            return CoreEvolutionChainId(value)
        }

        fun from(
            value: Int,
        ): CoreEvolutionChainId {
            return CoreEvolutionChainId(value)
        }

        fun from(
            value: Int?,
        ): CoreEvolutionChainId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
