package de.niklasbednarczyk.nbdex.feature.pokedex.impl.ui

import androidx.lifecycle.viewModelScope
import de.niklasbednarczyk.nbdex.core.common.logging.NBLogger
import de.niklasbednarczyk.nbdex.core.common.result.NBResult
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBViewModel
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.data.pokedex.api.repository.PokedexRepository
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.ext.order
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.ui.model.PokedexFilter
import de.niklasbednarczyk.nbdex.feature.pokemonform.api.navigation.PokemonFormNavKey
import de.niklasbednarczyk.nbdex.feature.pokemonform.api.navigation.navigateToPokemonForm
import de.niklasbednarczyk.nbdex.model.pokedex.PokedexData
import de.niklasbednarczyk.nbdex.model.pokedex.generation.PokedexGeneration
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexPokedex
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonForm
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import de.niklasbednarczyk.nbdex.model.pokedex.type.PokedexType
import kotlinx.collections.immutable.toImmutableSet
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

internal class PokedexViewModel(
    private val navigator: NBNavigator,
    private val pokedexRepository: PokedexRepository,
) : NBViewModel() {
    private val logger = NBLogger(this::class)

    private val selectedFilter: MutableStateFlow<PokedexFilter?> = MutableStateFlow(null)

    private val reload: MutableSharedFlow<Unit> = MutableSharedFlow()

    val uiState: StateFlow<PokedexUiState> = reload
        .onStart { emit(Unit) }
        .flatMapLatest {
            combine(
                pokedexRepository.getResult(
                    languageId = CoreLanguageId.default,
                ),
                navigator.state.currentKeyFlow,
                selectedFilter,
            ) { result, currentNavKey, filter ->
                when (result) {
                    is NBResult.Error -> {
                        PokedexUiState.Error
                    }

                    is NBResult.Loading -> {
                        PokedexUiState.Loading
                    }

                    is NBResult.Success<PokedexData> -> {
                        val preferences = result.data.preferences

                        val pokedexesMap = result.data.pokedexesMap
                        val selectedPokedex = pokedexesMap
                            .values
                            .flatten()
                            .first { pokedex -> pokedex.pokedex.id == preferences.pokedexId }

                        val generations = result.data.generations
                        val selectedGeneration = generations.firstOrNull { generation ->
                            generation.generation.id == preferences.generationId
                        }

                        val types = result.data.types
                        val selectedType = types.firstOrNull { type ->
                            type.type.id == preferences.typeId
                        }

                        val selectedCategories = preferences
                            .categories
                            .sortedBy { category -> category.order }
                            .toImmutableSet()

                        val selectedPokemonFormId = if (currentNavKey is PokemonFormNavKey) {
                            currentNavKey.id
                        } else {
                            null
                        }

                        PokedexUiState.Success(
                            selectedFilter = filter,
                            pokedexesMap = pokedexesMap,
                            selectedPokedex = selectedPokedex,
                            generations = generations,
                            selectedGeneration = selectedGeneration,
                            types = types,
                            selectedType = selectedType,
                            selectedCategories = selectedCategories,
                            pokemonForms = result.data.pokemonForms,
                            selectedPokemonFormId = selectedPokemonFormId,
                        )
                    }
                }
            }
        }
        .catch { throwable ->
            logger.catching(throwable)
            emit(PokedexUiState.Error)
        }
        .nbStateIn(PokedexUiState.Loading)

    fun navigateToPokemonForm(
        pokemonForm: PokedexPokemonForm,
    ) {
        navigator.navigateToPokemonForm(pokemonForm.pokemonForm.id)
    }

    fun reload() {
        viewModelScope.launch {
            reload.emit(Unit)
        }
    }

    fun updateSelectedFilter(
        filter: PokedexFilter?,
    ) {
        selectedFilter.update { filter }
    }

    fun updateSelectedPokedex(
        pokedex: PokedexPokedex,
    ) {
        viewModelScope.launch {
            pokedexRepository.updatePreferencesPokedexId(
                pokedexId = pokedex.pokedex.id,
            )
        }
    }

    fun updateSelectedGeneration(
        generation: PokedexGeneration?,
    ) {
        viewModelScope.launch {
            pokedexRepository.updatePreferencesGenerationId(
                generationId = generation?.generation?.id,
            )
        }
    }

    fun updateSelectedType(
        type: PokedexType?,
    ) {
        viewModelScope.launch {
            pokedexRepository.updatePreferencesTypeId(
                typeId = type?.type?.id,
            )
        }
    }

    fun updateSelectedCategory(
        category: PokedexPreferencesCategory,
    ) {
        viewModelScope.launch {
            pokedexRepository.updatePreferencesCategory(
                category = category,
            )
        }
    }
}
