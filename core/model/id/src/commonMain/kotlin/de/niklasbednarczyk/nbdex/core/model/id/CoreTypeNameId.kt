package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreTypeNameId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CoreTypeNameId {
            return CoreTypeNameId(value)
        }

        fun from(
            value: Int,
        ): CoreTypeNameId {
            return CoreTypeNameId(value)
        }

        fun from(
            value: Int?,
        ): CoreTypeNameId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
