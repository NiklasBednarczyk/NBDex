package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreTypeId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
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
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
