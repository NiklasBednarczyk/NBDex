package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.generation

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreGenerationMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreGenerationNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.generation.PokedexGeneration
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.generation.PersistencePokedexGeneration

internal object PersistencePokedexGenerationMapper :
    NBPersistenceFeatureMapper<PokedexGeneration, PersistencePokedexGeneration, CoreLanguageId> {
    override fun persistenceToModel(
        persistence: PersistencePokedexGeneration,
        input: CoreLanguageId,
    ): PokedexGeneration {
        return PokedexGeneration(
            generation = PersistenceCoreGenerationMapper.persistenceToModel(
                persistence = persistence.generation,
            ),
            generationName = PersistenceCoreGenerationNameMapper.persistenceListToModel(
                persistenceList = persistence.generationNames,
                input = input,
            ),
        )
    }
}
