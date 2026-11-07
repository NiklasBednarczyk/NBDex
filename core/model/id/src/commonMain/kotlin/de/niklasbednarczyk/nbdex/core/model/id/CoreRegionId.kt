package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreRegionId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
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
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
