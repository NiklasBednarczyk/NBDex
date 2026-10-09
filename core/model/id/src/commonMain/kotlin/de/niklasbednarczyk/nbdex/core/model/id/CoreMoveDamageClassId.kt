package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreMoveDamageClassId private constructor(override val value: Int) : NBId {
    companion object {
        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
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
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
