package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreGenerationId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CoreGenerationId {
            return CoreGenerationId(value)
        }

        fun from(
            value: Int,
        ): CoreGenerationId {
            return CoreGenerationId(value)
        }

        fun from(
            value: Int?,
        ): CoreGenerationId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
