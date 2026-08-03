package de.niklasbednarczyk.nbdex.core.model.id

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@Serializable
@JvmInline
value class CoreGrowthRateId private constructor(override val value: Int) : NBId {

    companion object {

        fun example(value: Int = NBId.EXAMPLE_VALUE): CoreGrowthRateId {
            return CoreGrowthRateId(value)
        }

        fun from(value: Int): CoreGrowthRateId {
            return CoreGrowthRateId(value)
        }

        fun from(value: Int?): CoreGrowthRateId? {
            return NBId.fromNullable(value, ::from)
        }

    }

}