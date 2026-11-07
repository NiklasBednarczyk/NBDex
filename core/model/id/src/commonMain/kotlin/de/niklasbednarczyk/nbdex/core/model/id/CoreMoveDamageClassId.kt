package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreMoveDamageClassId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CoreMoveDamageClassId {
            return CoreMoveDamageClassId(value)
        }

        fun from(
            value: Int,
        ): CoreMoveDamageClassId {
            return CoreMoveDamageClassId(value)
        }

        fun from(
            value: Int?,
        ): CoreMoveDamageClassId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
