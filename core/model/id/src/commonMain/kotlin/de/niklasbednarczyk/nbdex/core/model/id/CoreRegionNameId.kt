package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreRegionNameId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CoreRegionNameId {
            return CoreRegionNameId(value)
        }

        fun from(
            value: Int,
        ): CoreRegionNameId {
            return CoreRegionNameId(value)
        }

        fun from(
            value: Int?,
        ): CoreRegionNameId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
