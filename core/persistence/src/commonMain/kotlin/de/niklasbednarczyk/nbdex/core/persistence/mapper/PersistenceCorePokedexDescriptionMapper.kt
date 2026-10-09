package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexDescription
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexDescription

object PersistenceCorePokedexDescriptionMapper :
    NBPersistenceCoreInputMapper<CorePokedexDescription, PersistenceCorePokedexDescription, CoreLanguageId> {
    override fun modelToPersistence(
        model: CorePokedexDescription,
    ): PersistenceCorePokedexDescription {
        return PersistenceCorePokedexDescription(
            id = model.id,
            description = model.description,
            languageId = model.languageId,
            pokedexId = model.pokedexId,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCorePokedexDescription,
    ): CorePokedexDescription {
        return CorePokedexDescription(
            id = persistence.id,
            description = persistence.description,
            languageId = persistence.languageId,
            pokedexId = persistence.pokedexId,
        )
    }

    override fun persistenceToInput(
        persistence: PersistenceCorePokedexDescription,
    ): CoreLanguageId? {
        return persistence.languageId
    }
}
