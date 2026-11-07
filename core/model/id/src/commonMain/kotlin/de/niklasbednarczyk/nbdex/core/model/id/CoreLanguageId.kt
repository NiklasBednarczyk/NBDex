package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreLanguageId private constructor(override val value: Int) : DexId {
    companion object {
        /** en */
        val default: CoreLanguageId = CoreLanguageId(9)

        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
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
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
