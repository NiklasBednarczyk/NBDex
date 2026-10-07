package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexName

object PersistenceCorePokedexNameMapper :
    NBPersistenceCoreInputMapper<CorePokedexName, PersistenceCorePokedexName, CoreLanguageId> {
    override fun modelToPersistence(
        model: CorePokedexName,
    ): PersistenceCorePokedexName {
        return PersistenceCorePokedexName(
            id = model.id,
            languageId = model.languageId,
            name = model.name,
            pokedexId = model.pokedexId,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCorePokedexName,
    ): CorePokedexName {
        return CorePokedexName(
            id = persistence.id,
            languageId = persistence.languageId,
            name = persistence.name,
            pokedexId = persistence.pokedexId,
        )
    }

    override fun persistenceToInput(
        persistence: PersistenceCorePokedexName,
    ): CoreLanguageId? {
        return persistence.languageId
    }
}
