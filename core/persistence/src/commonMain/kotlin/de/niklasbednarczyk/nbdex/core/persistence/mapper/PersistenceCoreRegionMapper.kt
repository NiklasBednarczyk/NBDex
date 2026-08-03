package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreRegion
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreRegion

object PersistenceCoreRegionMapper : NBPersistenceCoreMapper<CoreRegion, PersistenceCoreRegion> {

    override fun modelToPersistence(model: CoreRegion): PersistenceCoreRegion {
        return PersistenceCoreRegion(
            id = model.id,
            name = model.name,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCoreRegion): CoreRegion {
        return CoreRegion(
            id = persistence.id,
            name = persistence.name,
        )
    }

}