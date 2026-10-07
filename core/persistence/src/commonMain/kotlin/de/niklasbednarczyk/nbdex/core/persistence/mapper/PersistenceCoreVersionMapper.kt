package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersion
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersion

object PersistenceCoreVersionMapper : NBPersistenceCoreMapper<CoreVersion, PersistenceCoreVersion> {
    override fun modelToPersistence(
        model: CoreVersion,
    ): PersistenceCoreVersion {
        return PersistenceCoreVersion(
            id = model.id,
            name = model.name,
            versionGroupId = model.versionGroupId,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCoreVersion,
    ): CoreVersion {
        return CoreVersion(
            id = persistence.id,
            name = persistence.name,
            versionGroupId = persistence.versionGroupId,
        )
    }
}
