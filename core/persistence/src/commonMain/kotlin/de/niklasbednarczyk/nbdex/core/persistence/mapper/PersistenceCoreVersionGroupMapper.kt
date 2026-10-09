package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionGroup
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionGroup

object PersistenceCoreVersionGroupMapper : NBPersistenceCoreMapper<CoreVersionGroup, PersistenceCoreVersionGroup> {
    override fun modelToPersistence(
        model: CoreVersionGroup,
    ): PersistenceCoreVersionGroup {
        return PersistenceCoreVersionGroup(
            id = model.id,
            generationId = model.generationId,
            name = model.name,
            order = model.order,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCoreVersionGroup,
    ): CoreVersionGroup {
        return CoreVersionGroup(
            id = persistence.id,
            generationId = persistence.generationId,
            name = persistence.name,
            order = persistence.order,
        )
    }
}
