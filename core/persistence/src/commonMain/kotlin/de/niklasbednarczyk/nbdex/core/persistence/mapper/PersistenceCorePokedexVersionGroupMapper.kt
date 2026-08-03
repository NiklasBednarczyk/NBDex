package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexVersionGroup
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexVersionGroup

object PersistenceCorePokedexVersionGroupMapper :
    NBPersistenceCoreMapper<CorePokedexVersionGroup, PersistenceCorePokedexVersionGroup> {

    override fun modelToPersistence(model: CorePokedexVersionGroup): PersistenceCorePokedexVersionGroup {
        return PersistenceCorePokedexVersionGroup(
            id = model.id,
            pokedexId = model.pokedexId,
            versionGroupId = model.versionGroupId,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCorePokedexVersionGroup): CorePokedexVersionGroup {
        return CorePokedexVersionGroup(
            id = persistence.id,
            pokedexId = persistence.pokedexId,
            versionGroupId = persistence.versionGroupId,
        )
    }

}