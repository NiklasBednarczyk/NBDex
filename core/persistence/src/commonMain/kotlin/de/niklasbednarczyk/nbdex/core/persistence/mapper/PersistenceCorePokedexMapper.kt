package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedex
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedex

object PersistenceCorePokedexMapper : NBPersistenceCoreMapper<CorePokedex, PersistenceCorePokedex> {
    override fun modelToPersistence(
        model: CorePokedex,
    ): PersistenceCorePokedex {
        return PersistenceCorePokedex(
            id = model.id,
            isMainSeries = model.isMainSeries,
            name = model.name,
            regionId = model.regionId,
        )
    }

    override fun persistenceToModel(
        persistence: PersistenceCorePokedex,
    ): CorePokedex {
        return CorePokedex(
            id = persistence.id,
            isMainSeries = persistence.isMainSeries,
            name = persistence.name,
            regionId = persistence.regionId,
        )
    }
}
