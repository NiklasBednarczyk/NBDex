package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokemonform

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonTypeMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreTypeNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonType
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform.PersistencePokedexPokemonType

internal object PersistencePokedexPokemonTypeMapper :
    NBPersistenceFeatureMapper<PokedexPokemonType, PersistencePokedexPokemonType, CoreLanguageId> {

    override fun persistenceToModel(
        persistence: PersistencePokedexPokemonType,
        input: CoreLanguageId,
    ): PokedexPokemonType {
        return PokedexPokemonType(
            pokemonType = PersistenceCorePokemonTypeMapper.persistenceToModel(
                persistence = persistence.pokemonType,
            ),
            typeName = PersistenceCoreTypeNameMapper.persistenceListToModel(
                persistenceList = persistence.typeNames,
                input = input,
            ),
        )
    }

}