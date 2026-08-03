package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokemonform

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonDexNumberMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonSpeciesMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonSpeciesNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonSpecies
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform.PersistencePokedexPokemonSpecies

internal object PersistencePokedexPokemonSpeciesMapper :
    NBPersistenceFeatureMapper<PokedexPokemonSpecies, PersistencePokedexPokemonSpecies, Pair<CoreLanguageId, CorePokedexId>> {

    override fun persistenceToModel(
        persistence: PersistencePokedexPokemonSpecies,
        input: Pair<CoreLanguageId, CorePokedexId>
    ): PokedexPokemonSpecies {
        val (languageId, pokedexId) = input
        return PokedexPokemonSpecies(
            pokemonSpecies = PersistenceCorePokemonSpeciesMapper.persistenceToModel(
                persistence = persistence.pokemonSpecies,
            ),
            pokemonDexNumber = PersistenceCorePokemonDexNumberMapper.persistenceListToModel(
                persistenceList = persistence.pokemonDexNumbers,
                input = pokedexId,
            ),
            pokemonSpeciesName = PersistenceCorePokemonSpeciesNameMapper.persistenceListToModel(
                persistenceList = persistence.pokemonSpeciesNames,
                input = languageId,
            ),
        )
    }

}