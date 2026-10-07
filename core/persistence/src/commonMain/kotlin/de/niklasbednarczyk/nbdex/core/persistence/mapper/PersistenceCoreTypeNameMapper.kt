package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreTypeName

object PersistenceCoreTypeNameMapper :
    NBPersistenceCoreInputMapper<CoreTypeName, PersistenceCoreTypeName, CoreLanguageId> {
    override fun modelToPersistence(
        model: CoreTypeName,
    ): PersistenceCoreTypeName {
        return PersistenceCoreTypeName(
            id = model.id,
            languageId = model.languageId,
            name = model.name,
            typeId = model.typeId,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCoreTypeName,
    ): CoreTypeName {
        return CoreTypeName(
            id = persistence.id,
            languageId = persistence.languageId,
            name = persistence.name,
            typeId = persistence.typeId,
        )
    }

    override fun persistenceToInput(
        persistence: PersistenceCoreTypeName,
    ): CoreLanguageId? {
        return persistence.languageId
    }
}
