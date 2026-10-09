package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonSpeciesName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonSpeciesName

object PersistenceCorePokemonSpeciesNameMapper :
    NBPersistenceCoreInputMapper<CorePokemonSpeciesName, PersistenceCorePokemonSpeciesName, CoreLanguageId> {
    override fun modelToPersistence(
        model: CorePokemonSpeciesName,
    ): PersistenceCorePokemonSpeciesName {
        return PersistenceCorePokemonSpeciesName(
            id = model.id,
            genus = model.genus,
            languageId = model.languageId,
            name = model.name,
            pokemonSpeciesId = model.pokemonSpeciesId,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCorePokemonSpeciesName,
    ): CorePokemonSpeciesName {
        return CorePokemonSpeciesName(
            id = persistence.id,
            genus = persistence.genus,
            languageId = persistence.languageId,
            name = persistence.name,
            pokemonSpeciesId = persistence.pokemonSpeciesId,
        )
    }

    override fun persistenceToInput(
        persistence: PersistenceCorePokemonSpeciesName,
    ): CoreLanguageId? {
        return persistence.languageId
    }
}
