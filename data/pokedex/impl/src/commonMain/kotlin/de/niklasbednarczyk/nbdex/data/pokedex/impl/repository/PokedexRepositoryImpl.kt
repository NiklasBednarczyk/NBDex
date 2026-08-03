package de.niklasbednarczyk.nbdex.data.pokedex.impl.repository

import de.niklasbednarczyk.nbdex.core.common.result.NBResult
import de.niklasbednarczyk.nbdex.core.data.mediator.ResultMediator
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.data.pokedex.api.repository.PokedexRepository
import de.niklasbednarczyk.nbdex.disk.pokedex.api.datasource.PokedexDiskDataSource
import de.niklasbednarczyk.nbdex.model.pokedex.PokedexData
import de.niklasbednarczyk.nbdex.model.pokedex.endpoints.PokedexEndpoints
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import de.niklasbednarczyk.nbdex.network.pokedex.api.datasource.PokedexNetworkDataSource
import de.niklasbednarczyk.nbdex.persistence.pokedex.api.datasource.PokedexPersistenceDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map

internal class PokedexRepositoryImpl(
    private val diskDataSource: PokedexDiskDataSource,
    private val networkDataSource: PokedexNetworkDataSource,
    private val persistenceDataSource: PokedexPersistenceDataSource,
) : PokedexRepository {

    override fun getResult(
        languageId: CoreLanguageId,
    ): Flow<NBResult<PokedexData>> {
        return object : ResultMediator<PokedexEndpoints, PokedexData>() {
            override val loggerName: String
                get() = "PokedexRepositoryImpl.getResult"

            override suspend fun shouldGetNetwork(): Boolean {
                return !persistenceDataSource.hasEndpoints(
                    languageId = languageId,
                )
            }

            override suspend fun getNetworkInput(): PokedexEndpoints {
                return networkDataSource.getEndpoints(
                    languageId = languageId,
                )
            }

            override suspend fun insertPersistenceInput(input: PokedexEndpoints) {
                persistenceDataSource.insertEndpoints(
                    endpoints = input,
                )
            }

            override fun getOutput(): Flow<PokedexData> {
                return combine(
                    persistenceDataSource.getGenerations(
                        languageId = languageId,
                    ),
                    persistenceDataSource.getPokedexesMap(
                        languageId = languageId,
                    ),
                    diskDataSource.getPreferences(),
                    persistenceDataSource.getTypes(
                        languageId = languageId,
                    )
                ) { generations, pokedexesMap, preferences, types ->
                    Triple(generations, pokedexesMap, types) to preferences
                }
                    .flatMapLatest { (persistence, preferences) ->
                        val (generations, pokedexesMap, types) = persistence

                        persistenceDataSource
                            .getPokemonForms(
                                languageId = languageId,
                                preferences = preferences,
                            )
                            .map { pokemonForms ->
                                PokedexData(
                                    generations = generations,
                                    pokedexesMap = pokedexesMap,
                                    pokemonForms = pokemonForms,
                                    preferences = preferences,
                                    types = types,
                                )
                            }
                    }
            }
        }()
    }

    override suspend fun updatePreferencesGenerationId(
        generationId: CoreGenerationId?,
    ) {
        diskDataSource.updateGenerationId(
            generationId = generationId,
        )
    }

    override suspend fun updatePreferencesPokedexId(
        pokedexId: CorePokedexId,
    ) {
        diskDataSource.updatePokedexId(
            pokedexId = pokedexId,
        )
    }

    override suspend fun updatePreferencesTypeId(
        typeId: CoreTypeId?,
    ) {
        diskDataSource.updateTypeId(
            typeId = typeId,
        )
    }

    override suspend fun updatePreferencesCategory(
        category: PokedexPreferencesCategory,
    ) {
        diskDataSource.updateCategory(
            category = category,
        )
    }

}