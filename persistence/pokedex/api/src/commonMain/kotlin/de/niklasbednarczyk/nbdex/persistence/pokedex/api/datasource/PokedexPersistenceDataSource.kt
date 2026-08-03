package de.niklasbednarczyk.nbdex.persistence.pokedex.api.datasource

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.model.pokedex.endpoints.PokedexEndpoints
import de.niklasbednarczyk.nbdex.model.pokedex.generation.PokedexGeneration
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexPokedex
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexRegion
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonForm
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.type.PokedexType
import kotlinx.coroutines.flow.Flow

interface PokedexPersistenceDataSource {

    suspend fun hasEndpoints(
        languageId: CoreLanguageId,
    ): Boolean

    fun getGenerations(
        languageId: CoreLanguageId,
    ): Flow<List<PokedexGeneration>>

    fun getPokedexesMap(
        languageId: CoreLanguageId,
    ): Flow<Map<PokedexRegion?, List<PokedexPokedex>>>

    fun getPokemonForms(
        languageId: CoreLanguageId,
        preferences: PokedexPreferences,
    ): Flow<List<PokedexPokemonForm>>

    fun getTypes(
        languageId: CoreLanguageId,
    ): Flow<List<PokedexType>>

    suspend fun insertEndpoints(
        endpoints: PokedexEndpoints,
    )

}