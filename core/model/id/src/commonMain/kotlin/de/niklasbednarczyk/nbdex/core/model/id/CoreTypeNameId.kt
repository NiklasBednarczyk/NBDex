package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreTypeNameId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
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
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
