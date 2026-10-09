package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreVersionId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CoreVersionId {
            return CoreVersionId(value)
        }

        fun from(
            value: Int,
        ): CoreVersionId {
            return CoreVersionId(value)
        }

        fun from(
            value: Int?,
        ): CoreVersionId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
