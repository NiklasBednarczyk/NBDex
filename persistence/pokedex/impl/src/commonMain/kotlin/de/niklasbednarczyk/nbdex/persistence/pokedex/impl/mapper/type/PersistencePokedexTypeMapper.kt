package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.type

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreTypeMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreTypeNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.type.PokedexType
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.type.PersistencePokedexType

internal object PersistencePokedexTypeMapper :
    NBPersistenceFeatureMapper<PokedexType, PersistencePokedexType, CoreLanguageId> {
    override fun persistenceToModel(
        persistence: PersistencePokedexType,
        input: CoreLanguageId,
    ): PokedexType {
        return PokedexType(
            type = PersistenceCoreTypeMapper.persistenceToModel(
                persistence = persistence.type,
            ),
            typeName = PersistenceCoreTypeNameMapper.persistenceListToModel(
                persistenceList = persistence.typeNames,
                input = input,
            ),
        )
    }
}
