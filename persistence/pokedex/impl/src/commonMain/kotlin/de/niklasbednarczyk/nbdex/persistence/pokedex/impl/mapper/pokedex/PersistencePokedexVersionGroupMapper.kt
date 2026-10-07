package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokedex

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreVersionGroupMapper
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexVersionGroup
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex.PersistencePokedexVersionGroup

internal object PersistencePokedexVersionGroupMapper :
    NBPersistenceFeatureMapper<PokedexVersionGroup, PersistencePokedexVersionGroup, CoreLanguageId> {
    override fun persistenceToModel(
        persistence: PersistencePokedexVersionGroup,
        input: CoreLanguageId,
    ): PokedexVersionGroup {
        return PokedexVersionGroup(
            versionGroup = PersistenceCoreVersionGroupMapper.persistenceToModel(
                persistence = persistence.versionGroup,
            ),
            versions = PersistencePokedexVersionMapper
                .persistenceListToModelList(
                    persistenceList = persistence.versions,
                    input = input,
                )
                .sortedBy { version -> version.version.id },
        )
    }
}
