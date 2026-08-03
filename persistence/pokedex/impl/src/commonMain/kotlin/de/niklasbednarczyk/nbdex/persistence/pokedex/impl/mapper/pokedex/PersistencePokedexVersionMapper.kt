package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokedex

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreVersionMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreVersionNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexVersion
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex.PersistencePokedexVersion

internal object PersistencePokedexVersionMapper :
    NBPersistenceFeatureMapper<PokedexVersion, PersistencePokedexVersion, CoreLanguageId> {

    override fun persistenceToModel(
        persistence: PersistencePokedexVersion,
        input: CoreLanguageId,
    ): PokedexVersion {
        return PokedexVersion(
            version = PersistenceCoreVersionMapper.persistenceToModel(
                persistence = persistence.version,
            ),
            versionName = PersistenceCoreVersionNameMapper.persistenceListToModel(
                persistenceList = persistence.versionNames,
                input = input,
            ),
        )
    }

}