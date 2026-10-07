package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.datasource

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreGenerationDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreGenerationNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokedexDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokedexDescriptionDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokedexNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokedexVersionGroupDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonDexNumberDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonFormDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonFormNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonSpeciesDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonSpeciesNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonTypeDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreRegionDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreRegionNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreTypeDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreTypeNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreVersionDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreVersionGroupDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreVersionNameDao
import de.niklasbednarczyk.nbdex.core.persistence.datasource.NBPersistenceDataSourceImpl
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreGenerationMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreGenerationNameMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokedexDescriptionMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokedexMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokedexNameMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokedexVersionGroupMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonDexNumberMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonFormMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonFormNameMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonSpeciesMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonSpeciesNameMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonTypeMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreRegionMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreRegionNameMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreTypeMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreTypeNameMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreVersionGroupMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreVersionMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreVersionNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.endpoints.PokedexEndpoints
import de.niklasbednarczyk.nbdex.model.pokedex.generation.PokedexGeneration
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexPokedex
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexRegion
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonForm
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import de.niklasbednarczyk.nbdex.model.pokedex.type.PokedexType
import de.niklasbednarczyk.nbdex.persistence.pokedex.api.datasource.PokedexPersistenceDataSource
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao.PokedexGenerationDao
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao.PokedexPokedexDao
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao.PokedexPokemonFormDao
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao.PokedexTypeDao
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.generation.PersistencePokedexGenerationMapper
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokedex.PersistencePokedexPokedexMapper
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokemonform.PersistencePokedexPokemonFormMapper
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.type.PersistencePokedexTypeMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

internal class PokedexPersistenceDataSourceImpl : NBPersistenceDataSourceImpl(), PokedexPersistenceDataSource, KoinComponent {
    // Core
    private val coreGenerationDao: CoreGenerationDao by inject()
    private val coreGenerationNameDao: CoreGenerationNameDao by inject()
    private val corePokedexDao: CorePokedexDao by inject()
    private val corePokedexDescriptionDao: CorePokedexDescriptionDao by inject()
    private val corePokedexNameDao: CorePokedexNameDao by inject()
    private val corePokedexVersionGroupDao: CorePokedexVersionGroupDao by inject()
    private val corePokemonDao: CorePokemonDao by inject()
    private val corePokemonDexNumberDao: CorePokemonDexNumberDao by inject()
    private val corePokemonFormDao: CorePokemonFormDao by inject()
    private val corePokemonFormNameDao: CorePokemonFormNameDao by inject()
    private val corePokemonSpeciesDao: CorePokemonSpeciesDao by inject()
    private val corePokemonSpeciesNameDao: CorePokemonSpeciesNameDao by inject()
    private val corePokemonTypeDao: CorePokemonTypeDao by inject()
    private val coreRegionDao: CoreRegionDao by inject()
    private val coreRegionNameDao: CoreRegionNameDao by inject()
    private val coreTypeDao: CoreTypeDao by inject()
    private val coreTypeNameDao: CoreTypeNameDao by inject()
    private val coreVersionDao: CoreVersionDao by inject()
    private val coreVersionGroupDao: CoreVersionGroupDao by inject()
    private val coreVersionNameDao: CoreVersionNameDao by inject()

    // Pokedex
    private val pokedexGenerationDao: PokedexGenerationDao by inject()
    private val pokedexPokedexDao: PokedexPokedexDao by inject()
    private val pokedexPokemonFormDao: PokedexPokemonFormDao by inject()
    private val pokedexTypeDao: PokedexTypeDao by inject()

    override suspend fun hasEndpoints(
        languageId: CoreLanguageId,
    ): Boolean {
        return coreGenerationDao.hasGenerations() &&
            coreGenerationNameDao.hasGenerationNames() &&
            corePokedexDao.hasPokedexes() &&
            corePokedexDescriptionDao.hasPokedexDescriptions() &&
            corePokedexNameDao.hasPokedexNames() &&
            corePokedexVersionGroupDao.hasPokedexVersionGroups() &&
            corePokemonDao.hasPokemon() &&
            corePokemonDexNumberDao.hasPokemonDexNumbers() &&
            corePokemonFormDao.hasPokemonForms() &&
            corePokemonFormNameDao.hasPokemonFormNames() &&
            corePokemonSpeciesDao.hasPokemonSpecies() &&
            corePokemonSpeciesNameDao.hasPokemonSpeciesNames() &&
            corePokemonTypeDao.hasPokemonTypes() &&
            coreRegionDao.hasRegions() &&
            coreRegionNameDao.hasRegionNames() &&
            coreTypeDao.hasTypes() &&
            coreTypeNameDao.hasTypeNames() &&
            coreVersionDao.hasVersions() &&
            coreVersionGroupDao.hasVersionGroups() &&
            coreVersionNameDao.hasVersionNames()
    }

    override fun getGenerations(
        languageId: CoreLanguageId,
    ): Flow<List<PokedexGeneration>> {
        return pokedexGenerationDao
            .getPokedexGenerations()
            .map { generations ->
                generations
                    .filter { generation ->
                        corePokemonSpeciesDao.hasPokemonSpeciesWithGenerationId(
                            generationId = generation.generation.id,
                        )
                    }
                    .asSequence()
                    .map { generation ->
                        PersistencePokedexGenerationMapper.persistenceToModel(
                            persistence = generation,
                            input = languageId,
                        )
                    }
                    .sortedBy { generation -> generation.generation.id }
                    .toList()
            }
    }

    override fun getPokedexesMap(
        languageId: CoreLanguageId,
    ): Flow<Map<PokedexRegion?, List<PokedexPokedex>>> {
        return pokedexPokedexDao
            .getPokedexPokedexes()
            .map { pokedexes ->
                pokedexes
                    .filter { pokedex ->
                        corePokemonDexNumberDao.hasPokemonDexNumbersWithPokedexId(
                            pokedexId = pokedex.pokedex.id,
                        )
                    }
                    .asSequence()
                    .map { pokedex ->
                        PersistencePokedexPokedexMapper.persistenceToModel(
                            persistence = pokedex,
                            input = languageId,
                        )
                    }
                    .sortedWith(
                        compareBy(
                            { pokedex -> pokedex.pokedex.regionId },
                            { pokedex -> pokedex.pokedex.id },
                        ),
                    )
                    .groupBy { pokedex -> pokedex.region }
            }
    }

    override fun getPokemonForms(
        languageId: CoreLanguageId,
        preferences: PokedexPreferences,
    ): Flow<List<PokedexPokemonForm>> {
        return pokedexPokemonFormDao
            .getPokedexForms()
            .map { pokemonForms ->
                pokemonForms
                    .asSequence()
                    .filter { pokemonForm ->
                        val isDefault = pokemonForm.pokemonForm.isDefault

                        val isPokedex = pokemonForm.pokemon?.pokemonSpecies?.pokemonDexNumbers
                            ?.any { pokemonDexNumber -> pokemonDexNumber.pokedexId == preferences.pokedexId } == true

                        val isGeneration = preferences.generationId?.let { generationId ->
                            pokemonForm.versionGroup?.generationId == generationId
                        } != false

                        val isType = preferences.typeId?.let { typeId ->
                            pokemonForm.pokemon?.pokemonTypes
                                ?.any { pokemonType -> pokemonType.pokemonType.typeId == typeId } == true
                        } != false

                        val isCategories = preferences.categories.all { category ->
                            when (category) {
                                PokedexPreferencesCategory.DEFAULT -> pokemonForm.pokemon?.pokemon?.isDefault
                                PokedexPreferencesCategory.BABY -> pokemonForm.pokemon?.pokemonSpecies?.pokemonSpecies?.isBaby
                                PokedexPreferencesCategory.BATTLE_ONLY -> pokemonForm.pokemonForm.isBattleOnly
                                PokedexPreferencesCategory.LEGENDARY -> pokemonForm.pokemon?.pokemonSpecies?.pokemonSpecies?.isLegendary
                                PokedexPreferencesCategory.MEGA -> pokemonForm.pokemonForm.isMega
                                PokedexPreferencesCategory.MYTHICAL -> pokemonForm.pokemon?.pokemonSpecies?.pokemonSpecies?.isMythical
                            } == true
                        }

                        isDefault && isPokedex && isGeneration && isType && isCategories
                    }
                    .map { pokemonForm ->
                        PersistencePokedexPokemonFormMapper.persistenceToModel(
                            persistence = pokemonForm,
                            input = Pair(languageId, preferences.pokedexId),
                        )
                    }
                    .sortedWith(
                        compareBy(
                            { pokemonForm -> pokemonForm.pokemon?.pokemonSpecies?.pokemonDexNumber?.pokedexNumber },
                            { pokemonForm -> pokemonForm.pokemon?.pokemon?.id },
                        ),
                    )
                    .toList()
            }
    }

    override fun getTypes(
        languageId: CoreLanguageId,
    ): Flow<List<PokedexType>> {
        return pokedexTypeDao
            .getPokedexTypes()
            .map { types ->
                types
                    .filter { type ->
                        corePokemonTypeDao.hasPokemonTypesWithTypeId(
                            typeId = type.type.id,
                        )
                    }
                    .asSequence()
                    .map { type ->
                        PersistencePokedexTypeMapper.persistenceToModel(
                            persistence = type,
                            input = languageId,
                        )
                    }
                    .sortedBy { type -> type.typeName.name }
                    .toList()
            }
    }

    override suspend fun insertEndpoints(
        endpoints: PokedexEndpoints,
    ) {
        insertList(
            modelList = endpoints.generations,
            mapper = PersistenceCoreGenerationMapper,
            insert = coreGenerationDao::insertGenerations,
        )
        insertList(
            modelList = endpoints.generationNames,
            mapper = PersistenceCoreGenerationNameMapper,
            insert = coreGenerationNameDao::insertGenerationNames,
        )
        insertList(
            modelList = endpoints.pokedexes,
            mapper = PersistenceCorePokedexMapper,
            insert = corePokedexDao::insertPokedexes,
        )
        insertList(
            modelList = endpoints.pokedexDescriptions,
            mapper = PersistenceCorePokedexDescriptionMapper,
            insert = corePokedexDescriptionDao::insertPokedexDescriptions,
        )
        insertList(
            modelList = endpoints.pokedexNames,
            mapper = PersistenceCorePokedexNameMapper,
            insert = corePokedexNameDao::insertPokedexNames,
        )
        insertList(
            modelList = endpoints.pokedexVersionGroups,
            mapper = PersistenceCorePokedexVersionGroupMapper,
            insert = corePokedexVersionGroupDao::insertPokedexVersionGroups,
        )
        insertList(
            modelList = endpoints.pokemon,
            mapper = PersistenceCorePokemonMapper,
            insert = corePokemonDao::insertPokemon,
        )
        insertList(
            modelList = endpoints.pokemonDexNumbers,
            mapper = PersistenceCorePokemonDexNumberMapper,
            insert = corePokemonDexNumberDao::insertPokemonDexNumbers,
        )
        insertList(
            modelList = endpoints.pokemonForms,
            mapper = PersistenceCorePokemonFormMapper,
            insert = corePokemonFormDao::insertPokemonForms,
        )
        insertList(
            modelList = endpoints.pokemonFormNames,
            mapper = PersistenceCorePokemonFormNameMapper,
            insert = corePokemonFormNameDao::insertPokemonFormNames,
        )
        insertList(
            modelList = endpoints.pokemonSpecies,
            mapper = PersistenceCorePokemonSpeciesMapper,
            insert = corePokemonSpeciesDao::insertPokemonSpecies,
        )
        insertList(
            modelList = endpoints.pokemonSpeciesNames,
            mapper = PersistenceCorePokemonSpeciesNameMapper,
            insert = corePokemonSpeciesNameDao::insertPokemonSpeciesNames,
        )
        insertList(
            modelList = endpoints.pokemonTypes,
            mapper = PersistenceCorePokemonTypeMapper,
            insert = corePokemonTypeDao::insertPokemonTypes,
        )
        insertList(
            modelList = endpoints.regions,
            mapper = PersistenceCoreRegionMapper,
            insert = coreRegionDao::insertRegions,
        )
        insertList(
            modelList = endpoints.regionNames,
            mapper = PersistenceCoreRegionNameMapper,
            insert = coreRegionNameDao::insertRegionNames,
        )
        insertList(
            modelList = endpoints.types,
            mapper = PersistenceCoreTypeMapper,
            insert = coreTypeDao::insertTypes,
        )
        insertList(
            modelList = endpoints.typeNames,
            mapper = PersistenceCoreTypeNameMapper,
            insert = coreTypeNameDao::insertTypeNames,
        )
        insertList(
            modelList = endpoints.versions,
            mapper = PersistenceCoreVersionMapper,
            insert = coreVersionDao::insertVersions,
        )
        insertList(
            modelList = endpoints.versionGroups,
            mapper = PersistenceCoreVersionGroupMapper,
            insert = coreVersionGroupDao::insertVersionGroups,
        )
        insertList(
            modelList = endpoints.versionNames,
            mapper = PersistenceCoreVersionNameMapper,
            insert = coreVersionNameDao::insertVersionNames,
        )
    }
}
