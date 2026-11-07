package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreTypeId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CoreTypeId {
            return CoreTypeId(value)
        }

        fun from(
            value: Int,
        ): CoreTypeId {
            return CoreTypeId(value)
        }

        fun from(
            value: Int?,
        ): CoreTypeId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
