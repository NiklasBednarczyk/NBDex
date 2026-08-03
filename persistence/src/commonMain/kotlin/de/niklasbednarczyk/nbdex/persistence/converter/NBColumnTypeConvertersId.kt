package de.niklasbednarczyk.nbdex.persistence.converter

import androidx.room3.ColumnTypeConverter
import de.niklasbednarczyk.nbdex.core.model.id.CoreEvolutionChainId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationNameId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGrowthRateId
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CoreMoveDamageClassId
import de.niklasbednarczyk.nbdex.core.model.id.NBId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexDescriptionId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexNameId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexVersionGroupId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonColorId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonDexNumberId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormNameId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonHabitatId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonShapeId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesNameId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonTypeId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionNameId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeNameId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionNameId

internal class NBColumnTypeConvertersId {

    @ColumnTypeConverter
    fun intToCoreEvolutionChainId(value: Int): CoreEvolutionChainId {
        return CoreEvolutionChainId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreGenerationId(value: Int): CoreGenerationId {
        return CoreGenerationId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreGenerationNameId(value: Int): CoreGenerationNameId {
        return CoreGenerationNameId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreGrowthRateId(value: Int): CoreGrowthRateId {
        return CoreGrowthRateId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreLanguageId(value: Int): CoreLanguageId {
        return CoreLanguageId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreMoveDamageClassId(value: Int): CoreMoveDamageClassId {
        return CoreMoveDamageClassId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokedexId(value: Int): CorePokedexId {
        return CorePokedexId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokedexDescriptionId(value: Int): CorePokedexDescriptionId {
        return CorePokedexDescriptionId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokedexNameId(value: Int): CorePokedexNameId {
        return CorePokedexNameId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokedexVersionGroupId(value: Int): CorePokedexVersionGroupId {
        return CorePokedexVersionGroupId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonColorId(value: Int): CorePokemonColorId {
        return CorePokemonColorId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonDexNumberId(value: Int): CorePokemonDexNumberId {
        return CorePokemonDexNumberId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonFormId(value: Int): CorePokemonFormId {
        return CorePokemonFormId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonFormNameId(value: Int): CorePokemonFormNameId {
        return CorePokemonFormNameId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonHabitatId(value: Int): CorePokemonHabitatId {
        return CorePokemonHabitatId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonId(value: Int): CorePokemonId {
        return CorePokemonId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonShapeId(value: Int): CorePokemonShapeId {
        return CorePokemonShapeId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonSpeciesId(value: Int): CorePokemonSpeciesId {
        return CorePokemonSpeciesId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonSpeciesNameId(value: Int): CorePokemonSpeciesNameId {
        return CorePokemonSpeciesNameId.from(value)
    }

    @ColumnTypeConverter
    fun intToCorePokemonTypeId(value: Int): CorePokemonTypeId {
        return CorePokemonTypeId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreRegionId(value: Int): CoreRegionId {
        return CoreRegionId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreRegionNameId(value: Int): CoreRegionNameId {
        return CoreRegionNameId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreTypeId(value: Int): CoreTypeId {
        return CoreTypeId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreTypeNameId(value: Int): CoreTypeNameId {
        return CoreTypeNameId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreVersionId(value: Int): CoreVersionId {
        return CoreVersionId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreVersionGroupId(value: Int): CoreVersionGroupId {
        return CoreVersionGroupId.from(value)
    }

    @ColumnTypeConverter
    fun intToCoreVersionNameId(value: Int): CoreVersionNameId {
        return CoreVersionNameId.from(value)
    }

    @ColumnTypeConverter
    fun idToInt(id: NBId): Int {
        return id.value
    }

}