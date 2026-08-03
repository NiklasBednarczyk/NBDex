package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGenerationName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreGenerationName

object PersistenceCoreGenerationNameMapper :
    NBPersistenceCoreInputMapper<CoreGenerationName, PersistenceCoreGenerationName, CoreLanguageId> {

    override fun modelToPersistence(model: CoreGenerationName): PersistenceCoreGenerationName {
        return PersistenceCoreGenerationName(
            id = model.id,
            generationId = model.generationId,
            languageId = model.languageId,
            name = model.name,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCoreGenerationName): CoreGenerationName {
        return CoreGenerationName(
            id = persistence.id,
            generationId = persistence.generationId,
            languageId = persistence.languageId,
            name = persistence.name,
        )
    }

    override fun persistenceToInput(persistence: PersistenceCoreGenerationName): CoreLanguageId? {
        return persistence.languageId
    }

}