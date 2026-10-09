package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreRegionName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreRegionName

object PersistenceCoreRegionNameMapper :
    NBPersistenceCoreInputMapper<CoreRegionName, PersistenceCoreRegionName, CoreLanguageId> {
    override fun modelToPersistence(
        model: CoreRegionName,
    ): PersistenceCoreRegionName {
        return PersistenceCoreRegionName(
            id = model.id,
            languageId = model.languageId,
            name = model.name,
            regionId = model.regionId,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCoreRegionName,
    ): CoreRegionName {
        return CoreRegionName(
            id = persistence.id,
            languageId = persistence.languageId,
            name = persistence.name,
            regionId = persistence.regionId,
        )
    }

    override fun persistenceToInput(
        persistence: PersistenceCoreRegionName,
    ): CoreLanguageId? {
        return persistence.languageId
    }
}
