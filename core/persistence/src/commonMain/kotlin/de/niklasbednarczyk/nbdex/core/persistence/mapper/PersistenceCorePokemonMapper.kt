package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemon
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemon

object PersistenceCorePokemonMapper : NBPersistenceCoreMapper<CorePokemon, PersistenceCorePokemon> {
    override fun modelToPersistence(
        model: CorePokemon,
    ): PersistenceCorePokemon {
        return PersistenceCorePokemon(
            id = model.id,
            baseExperience = model.baseExperience,
            height = model.height,
            isDefault = model.isDefault,
            name = model.name,
            order = model.order,
            pokemonSpeciesId = model.pokemonSpeciesId,
            weight = model.weight,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCorePokemon,
    ): CorePokemon {
        return CorePokemon(
            id = persistence.id,
            baseExperience = persistence.baseExperience,
            height = persistence.height,
            isDefault = persistence.isDefault,
            name = persistence.name,
            order = persistence.order,
            pokemonSpeciesId = persistence.pokemonSpeciesId,
            weight = persistence.weight,
        )
    }
}
