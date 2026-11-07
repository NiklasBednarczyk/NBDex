package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreGrowthRateId private constructor(override val value: Int) : DexId {
    companion object {
        fun example(
            value: Int = DexId.EXAMPLE_VALUE,
        ): CoreGrowthRateId {
            return CoreGrowthRateId(value)
        }

        fun from(
            value: Int,
        ): CoreGrowthRateId {
            return CoreGrowthRateId(value)
        }

        fun from(
            value: Int?,
        ): CoreGrowthRateId? {
            return DexId.fromNullable(
                value = value,
                block = ::from,
            )
        }
    }
}
