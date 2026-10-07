package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreType
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreType

object PersistenceCoreTypeMapper : NBPersistenceCoreMapper<CoreType, PersistenceCoreType> {
    override fun modelToPersistence(
        model: CoreType,
    ): PersistenceCoreType {
        return PersistenceCoreType(
            id = model.id,
            generationId = model.generationId,
            moveDamageClassId = model.moveDamageClassId,
            name = model.name,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCoreType,
    ): CoreType {
        return CoreType(
            id = persistence.id,
            generationId = persistence.generationId,
            moveDamageClassId = persistence.moveDamageClassId,
            name = persistence.name,
        )
    }
}
