package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokemonform

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonMapper
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemon
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform.PersistencePokedexPokemon

internal object PersistencePokedexPokemonMapper :
    NBPersistenceFeatureMapper<PokedexPokemon, PersistencePokedexPokemon, Pair<CoreLanguageId, CorePokedexId>> {

    override fun persistenceToModel(
        persistence: PersistencePokedexPokemon,
        input: Pair<CoreLanguageId, CorePokedexId>
    ): PokedexPokemon {
        val (languageId) = input
        return PokedexPokemon(
            pokemon = PersistenceCorePokemonMapper.persistenceToModel(
                persistence = persistence.pokemon,
            ),
            pokemonSpecies = PersistencePokedexPokemonSpeciesMapper.persistenceToModelNullable(
                persistence = persistence.pokemonSpecies,
                input = input,
            ),
            pokemonTypes = PersistencePokedexPokemonTypeMapper
                .persistenceListToModelList(
                    persistenceList = persistence.pokemonTypes,
                    input = languageId,
                )
                .sortedBy { pokemonType -> pokemonType.pokemonType.slot }
        )
    }

}