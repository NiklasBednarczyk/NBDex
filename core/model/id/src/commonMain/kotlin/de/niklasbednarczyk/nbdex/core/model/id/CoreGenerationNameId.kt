package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreGenerationNameId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CoreGenerationNameId {
            return CoreGenerationNameId(value)
        }

        fun from(
            value: Int,
        ): CoreGenerationNameId {
            return CoreGenerationNameId(value)
        }

        fun from(
            value: Int?,
        ): CoreGenerationNameId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
