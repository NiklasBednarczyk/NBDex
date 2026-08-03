package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreEvolutionChainId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGrowthRateId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonColorId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonHabitatId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonShapeId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId

data class CorePokemonSpecies(
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
) {

    companion object {

        fun example(
            id: CorePokemonSpeciesId = CorePokemonSpeciesId.example(),
            baseHappiness: Int? = -1,
            captureRate: Int? = -1,
            evolutionChainId: CoreEvolutionChainId? = CoreEvolutionChainId.example(),
            evolvesFromSpeciesId: CorePokemonSpeciesId? = CorePokemonSpeciesId.example(),
            formsSwitchable: Boolean = false,
            genderRate: Int? = -1,
            generationId: CoreGenerationId? = CoreGenerationId.example(),
            growthRateId: CoreGrowthRateId? = CoreGrowthRateId.example(),
            hasGenderDifferences: Boolean = false,
            hatchCounter: Int? = -1,
            isBaby: Boolean = false,
            isLegendary: Boolean = false,
            isMythical: Boolean = false,
            name: String = "PokemonSpecies Name",
            order: Int? = -1,
            pokemonColorId: CorePokemonColorId? = CorePokemonColorId.example(),
            pokemonHabitatId: CorePokemonHabitatId? = CorePokemonHabitatId.example(),
            pokemonShapeId: CorePokemonShapeId? = CorePokemonShapeId.example(),
        ): CorePokemonSpecies {
            return CorePokemonSpecies(
                id = id,
                baseHappiness = baseHappiness,
                captureRate = captureRate,
                evolutionChainId = evolutionChainId,
                evolvesFromSpeciesId = evolvesFromSpeciesId,
                formsSwitchable = formsSwitchable,
                genderRate = genderRate,
                generationId = generationId,
                growthRateId = growthRateId,
                hasGenderDifferences = hasGenderDifferences,
                hatchCounter = hatchCounter,
                isBaby = isBaby,
                isLegendary = isLegendary,
                isMythical = isMythical,
                name = name,
                order = order,
                pokemonColorId = pokemonColorId,
                pokemonHabitatId = pokemonHabitatId,
                pokemonShapeId = pokemonShapeId,
            )
        }

    }

}