package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionName

object PersistenceCoreVersionNameMapper :
    NBPersistenceCoreInputMapper<CoreVersionName, PersistenceCoreVersionName, CoreLanguageId> {
    override fun modelToPersistence(
        model: CoreVersionName,
    ): PersistenceCoreVersionName {
        return PersistenceCoreVersionName(
            id = model.id,
            languageId = model.languageId,
            name = model.name,
            versionId = model.versionId,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCoreVersionName,
    ): CoreVersionName {
        return CoreVersionName(
            id = persistence.id,
            languageId = persistence.languageId,
            name = persistence.name,
            versionId = persistence.versionId,
        )
    }

    override fun persistenceToInput(
        persistence: PersistenceCoreVersionName,
    ): CoreLanguageId? {
        return persistence.languageId
    }
}
