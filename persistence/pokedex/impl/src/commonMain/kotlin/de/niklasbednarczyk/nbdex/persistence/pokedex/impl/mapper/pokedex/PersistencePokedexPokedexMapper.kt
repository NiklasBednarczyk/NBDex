package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokedex

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokedexDescriptionMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokedexMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokedexNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexPokedex
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex.PersistencePokedexPokedex

internal object PersistencePokedexPokedexMapper :
    NBPersistenceFeatureMapper<PokedexPokedex, PersistencePokedexPokedex, CoreLanguageId> {

    override fun persistenceToModel(
        persistence: PersistencePokedexPokedex,
        input: CoreLanguageId,
    ): PokedexPokedex {
        return PokedexPokedex(
            pokedex = PersistenceCorePokedexMapper.persistenceToModel(
                persistence = persistence.pokedex,
            ),
            pokedexDescription = PersistenceCorePokedexDescriptionMapper.persistenceListToModel(
                persistenceList = persistence.pokedexDescriptions,
                input = input,
            ),
            pokedexName = PersistenceCorePokedexNameMapper.persistenceListToModel(
                persistenceList = persistence.pokedexNames,
                input = input,
            ),
            region = PersistencePokedexRegionMapper.persistenceToModelNullable(
                persistence = persistence.region,
                input = input,
            ),
            versionGroups = PersistencePokedexVersionGroupMapper
                .persistenceListToModelList(
                    persistenceList = persistence.versionGroups,
                    input = input,
                )
                .sortedBy { versionGroup -> versionGroup.versionGroup.order }
        )
    }

}