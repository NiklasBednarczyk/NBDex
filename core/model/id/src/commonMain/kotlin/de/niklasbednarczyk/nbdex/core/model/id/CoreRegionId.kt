package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreRegionId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CoreRegionId {
            return CoreRegionId(value)
        }

        fun from(
            value: Int,
        ): CoreRegionId {
            return CoreRegionId(value)
        }

        fun from(
            value: Int?,
        ): CoreRegionId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
