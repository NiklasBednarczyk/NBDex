package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreRegionNameId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
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
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
