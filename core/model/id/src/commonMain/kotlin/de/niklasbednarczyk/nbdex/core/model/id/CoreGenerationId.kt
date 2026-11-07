package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreGenerationId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
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
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
