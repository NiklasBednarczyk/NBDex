package de.niklasbednarczyk.nbdex.core.model.endpoint.values

import kotlin.jvm.JvmInline

@JvmInline
value class CorePokedexNumber private constructor(val value: Int) : Comparable<CorePokedexNumber> {

    override fun toString(): String {
        val positiveValue = maxOf(0, value)
        val formattedValue = positiveValue
            .toString()
            .padStart(4, '0')
        return "#$formattedValue"
    }

    override fun compareTo(other: CorePokedexNumber): Int {
        return compareValuesBy(this, other) { pokedexNumber -> pokedexNumber.value }
    }

    companion object {

        fun example(value: Int = -1): CorePokedexNumber {
            return CorePokedexNumber(value)
        }

        fun from(value: Int): CorePokedexNumber {
            return CorePokedexNumber(value)
        }

    }

}