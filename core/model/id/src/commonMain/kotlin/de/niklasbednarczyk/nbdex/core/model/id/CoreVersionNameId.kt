package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreVersionNameId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CoreVersionNameId {
            return CoreVersionNameId(value)
        }

        fun from(
            value: Int,
        ): CoreVersionNameId {
            return CoreVersionNameId(value)
        }

        fun from(
            value: Int?,
        ): CoreVersionNameId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
