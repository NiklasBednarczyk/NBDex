package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreLanguageId private constructor(override val value: Int) : NBId {
    companion object {
        /** en */
        val default: CoreLanguageId = CoreLanguageId(9)

        fun example(
            value: Int = NBId.EXAMPLE_VALUE,
        ): CoreLanguageId {
            return CoreLanguageId(value)
        }

        fun from(
            value: Int,
        ): CoreLanguageId {
            return CoreLanguageId(value)
        }

        fun from(
            value: Int?,
        ): CoreLanguageId? {
            return NBId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
