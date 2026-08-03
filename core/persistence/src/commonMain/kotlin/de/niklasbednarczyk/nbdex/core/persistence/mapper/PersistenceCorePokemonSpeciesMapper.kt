package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonSpecies
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonSpecies

object PersistenceCorePokemonSpeciesMapper : NBPersistenceCoreMapper<CorePokemonSpecies, PersistenceCorePokemonSpecies> {

    override fun modelToPersistence(model: CorePokemonSpecies): PersistenceCorePokemonSpecies {
        return PersistenceCorePokemonSpecies(
            id = model.id,
            baseHappiness = model.baseHappiness,
            captureRate = model.captureRate,
            evolutionChainId = model.evolutionChainId,
            evolvesFromSpeciesId = model.evolvesFromSpeciesId,
            formsSwitchable = model.formsSwitchable,
            genderRate = model.genderRate,
            generationId = model.generationId,
            growthRateId = model.growthRateId,
            hasGenderDifferences = model.hasGenderDifferences,
            hatchCounter = model.hatchCounter,
            isBaby = model.isBaby,
            isLegendary = model.isLegendary,
            isMythical = model.isMythical,
            name = model.name,
            order = model.order,
            pokemonColorId = model.pokemonColorId,
            pokemonHabitatId = model.pokemonHabitatId,
            pokemonShapeId = model.pokemonShapeId,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCorePokemonSpecies): CorePokemonSpecies {
        return CorePokemonSpecies(
            id = persistence.id,
            baseHappiness = persistence.baseHappiness,
            captureRate = persistence.captureRate,
            evolutionChainId = persistence.evolutionChainId,
            evolvesFromSpeciesId = persistence.evolvesFromSpeciesId,
            formsSwitchable = persistence.formsSwitchable,
            genderRate = persistence.genderRate,
            generationId = persistence.generationId,
            growthRateId = persistence.growthRateId,
            hasGenderDifferences = persistence.hasGenderDifferences,
            hatchCounter = persistence.hatchCounter,
            isBaby = persistence.isBaby,
            isLegendary = persistence.isLegendary,
            isMythical = persistence.isMythical,
            name = persistence.name,
            order = persistence.order,
            pokemonColorId = persistence.pokemonColorId,
            pokemonHabitatId = persistence.pokemonHabitatId,
            pokemonShapeId = persistence.pokemonShapeId,
        )
    }

}