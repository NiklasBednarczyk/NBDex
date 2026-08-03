package de.niklasbednarczyk.nbdex.core.network.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonSpecies
import de.niklasbednarczyk.nbdex.core.model.id.CoreEvolutionChainId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreGrowthRateId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonColorId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonHabitatId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonShapeId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.network.apollo.fragment.NetworkCorePokemonSpecies

object NetworkCorePokemonSpeciesMapper : NBNetworkMapper<CorePokemonSpecies, NetworkCorePokemonSpecies> {

    override fun networkToModel(network: NetworkCorePokemonSpecies): CorePokemonSpecies {
        return CorePokemonSpecies(
            id = CorePokemonSpeciesId.from(network.id),
            baseHappiness = network.baseHappiness,
            captureRate = network.captureRate,
            evolutionChainId = CoreEvolutionChainId.from(network.evolutionChainId),
            evolvesFromSpeciesId = CorePokemonSpeciesId.from(network.evolvesFromSpeciesId),
            formsSwitchable = network.formsSwitchable,
            genderRate = network.genderRate,
            generationId = CoreGenerationId.from(network.generationId),
            growthRateId = CoreGrowthRateId.from(network.growthRateId),
            hasGenderDifferences = network.hasGenderDifferences,
            hatchCounter = network.hatchCounter,
            isBaby = network.isBaby,
            isLegendary = network.isLegendary,
            isMythical = network.isMythical,
            name = network.name,
            order = network.order,
            pokemonColorId = CorePokemonColorId.from(network.pokemonColorId),
            pokemonHabitatId = CorePokemonHabitatId.from(network.pokemonHabitatId),
            pokemonShapeId = CorePokemonShapeId.from(network.pokemonShapeId),
        )
    }

}