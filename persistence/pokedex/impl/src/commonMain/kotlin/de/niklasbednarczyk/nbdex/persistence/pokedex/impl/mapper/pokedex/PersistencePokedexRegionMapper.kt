package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokedex

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreRegionMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreRegionNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexRegion
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex.PersistencePokedexRegion

internal object PersistencePokedexRegionMapper :
    NBPersistenceFeatureMapper<PokedexRegion, PersistencePokedexRegion, CoreLanguageId> {
    override fun persistenceToModel(
        persistence: PersistencePokedexRegion,
        input: CoreLanguageId,
    ): PokedexRegion {
        return PokedexRegion(
            region = PersistenceCoreRegionMapper.persistenceToModel(
                persistence = persistence.region,
            ),
            regionName = PersistenceCoreRegionNameMapper.persistenceListToModel(
                persistenceList = persistence.regionNames,
                input = input,
            ),
        )
    }
}
