package de.niklasbednarczyk.nbdex.persistence.converter

import androidx.room3.ColumnTypeConverter
import de.niklasbednarczyk.nbdex.core.model.endpoint.values.CorePokedexNumber

internal class NBColumnTypeConvertersValues {
    @ColumnTypeConverter
    fun intToCorePokedexNumber(
        value: Int,
    ): CorePokedexNumber {
        return CorePokedexNumber.from(value)
    }

    @ColumnTypeConverter
    fun corePokedexNumberToInt(
        pokedexNumber: CorePokedexNumber,
    ): Int {
        return pokedexNumber.value
    }
}
