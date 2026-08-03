package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGeneration
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreGeneration

object PersistenceCoreGenerationMapper : NBPersistenceCoreMapper<CoreGeneration, PersistenceCoreGeneration> {

    override fun modelToPersistence(model: CoreGeneration): PersistenceCoreGeneration {
        return PersistenceCoreGeneration(
            id = model.id,
            name = model.name,
            regionId = model.regionId,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCoreGeneration): CoreGeneration {
        return CoreGeneration(
            id = persistence.id,
            name = persistence.name,
            regionId = persistence.regionId,
        )
    }

}