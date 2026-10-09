package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreVersionGroupId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CoreVersionGroupId {
            return CoreVersionGroupId(value)
        }

        fun from(
            value: Int,
        ): CoreVersionGroupId {
            return CoreVersionGroupId(value)
        }

        fun from(
            value: Int?,
        ): CoreVersionGroupId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
