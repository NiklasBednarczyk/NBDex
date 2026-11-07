package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreVersionGroupId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
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
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
