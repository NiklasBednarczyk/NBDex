package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreEvolutionChainId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGrowthRateId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonColorId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonHabitatId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonShapeId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEMON_SPECIES,
)
data class PersistenceCorePokemonSpecies(
    @PrimaryKey
    val id: CorePokemonSpeciesId,
    val baseHappiness: Int?,
    val captureRate: Int?,
    val evolutionChainId: CoreEvolutionChainId?,
    val evolvesFromSpeciesId: CorePokemonSpeciesId?,
    val formsSwitchable: Boolean,
    val genderRate: Int?,
    val generationId: CoreGenerationId?,
    val growthRateId: CoreGrowthRateId?,
    val hasGenderDifferences: Boolean,
    val hatchCounter: Int?,
    val isBaby: Boolean,
    val isLegendary: Boolean,
    val isMythical: Boolean,
    val name: String,
    val order: Int?,
    val pokemonColorId: CorePokemonColorId?,
    val pokemonHabitatId: CorePokemonHabitatId?,
    val pokemonShapeId: CorePokemonShapeId?,
)
