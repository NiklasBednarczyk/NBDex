package de.niklasbednarczyk.nbdex.feature.pokedex.impl.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGeneration
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGenerationName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedex
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemon
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonDexNumber
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonForm
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonFormName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonType
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreType
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionGroup
import de.niklasbednarczyk.nbdex.core.model.endpoint.values.CorePokedexNumber
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.ui.designsystem.image.DexAsyncImage
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.DexCenteredTopAppBar
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.DexErrorContent
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.DexInfoContent
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.DexLoadingContent
import de.niklasbednarczyk.nbdex.core.ui.designsystem.selection.DexMultiSelection
import de.niklasbednarczyk.nbdex.core.ui.designsystem.selection.DexSingleSelectionGroupNullable
import de.niklasbednarczyk.nbdex.core.ui.designsystem.selection.DexSingleSelectionWithNull
import de.niklasbednarczyk.nbdex.core.ui.designsystem.selection.isSelectionDropdownMenu
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.DexTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.icon
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.view.CoreDisplayViewTypes
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.view.CoreDisplayViewVersionGroups
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.SearchOff
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.ext.stringResource
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.ui.model.PokedexFilter
import de.niklasbednarczyk.nbdex.model.pokedex.generation.PokedexGeneration
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexPokedex
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexRegion
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemon
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonForm
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonSpecies
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonType
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import de.niklasbednarczyk.nbdex.model.pokedex.type.PokedexType
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf
import kotlinx.collections.immutable.persistentSetOf
import kotlinx.collections.immutable.toImmutableList
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.content_description_sprite_pokemon_official_artwork
import nbdex.core.ui.resource.generated.resources.pokedex_pokemon_forms_empty
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_categories_title
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_generation_title
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_generation_value_null
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_pokedex_region_value_null
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_pokedex_title
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_type_title
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_type_value_null
import nbdex.core.ui.resource.generated.resources.pokedex_title
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

private val pokemonFormMinWidth = 300.dp

@Composable
fun PokedexScreen() {
    val viewModel = koinViewModel<PokedexViewModel>()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    PokedexScreen(
        uiState = uiState,
        onReloadClick = viewModel::reload,
        onFilterChang = viewModel::updateSelectedFilter,
        onPokedexClick = viewModel::updateSelectedPokedex,
        onGenerationClick = viewModel::updateSelectedGeneration,
        onTypeClick = viewModel::updateSelectedType,
        onCategoryClick = viewModel::updateSelectedCategory,
        onPokemonFormClick = viewModel::navigateToPokemonForm,
    )
}

@Composable
private fun PokedexScreen(
    uiState: PokedexUiState,
    onReloadClick: () -> Unit,
    onFilterChang: (filter: PokedexFilter?) -> Unit,
    onPokedexClick: (pokedex: PokedexPokedex) -> Unit,
    onGenerationClick: (generation: PokedexGeneration?) -> Unit,
    onTypeClick: (type: PokedexType?) -> Unit,
    onCategoryClick: (category: PokedexPreferencesCategory) -> Unit,
    onPokemonFormClick: (pokemonForm: PokedexPokemonForm) -> Unit,
    modifier: Modifier = Modifier,
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            DexCenteredTopAppBar(
                scrollBehavior = scrollBehavior,
                titleText = stringResource(Res.string.pokedex_title),
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            AnimatedContent(
                targetState = uiState,
                contentKey = { it::class },
            ) { state ->
                when (state) {
                    PokedexUiState.Error -> {
                        DexErrorContent(
                            onReloadClick = onReloadClick,
                        )
                    }

                    PokedexUiState.Loading -> {
                        DexLoadingContent()
                    }

                    is PokedexUiState.Success -> {
                        SuccessContent(
                            filters = state.filters,
                            selectedFilter = state.selectedFilter,
                            onFilterChange = onFilterChang,
                            pokedexesMap = state.pokedexesMap,
                            selectedPokedex = state.selectedPokedex,
                            onPokedexClick = onPokedexClick,
                            generations = state.generations,
                            selectedGeneration = state.selectedGeneration,
                            onGenerationClick = onGenerationClick,
                            types = state.types,
                            selectedType = state.selectedType,
                            onTypeClick = onTypeClick,
                            categories = state.categories,
                            selectedCategories = state.selectedCategories,
                            onCategoryClick = onCategoryClick,
                            pokemonForms = state.pokemonForms,
                            selectedPokemonFormId = state.selectedPokemonFormId,
                            onPokemonFormClick = onPokemonFormClick,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SuccessContent(
    filters: ImmutableList<PokedexFilter>,
    selectedFilter: PokedexFilter?,
    onFilterChange: (filter: PokedexFilter?) -> Unit,
    pokedexesMap: ImmutableMap<PokedexRegion?, List<PokedexPokedex>>,
    selectedPokedex: PokedexPokedex,
    onPokedexClick: (pokedex: PokedexPokedex) -> Unit,
    generations: ImmutableList<PokedexGeneration>,
    selectedGeneration: PokedexGeneration?,
    onGenerationClick: (generation: PokedexGeneration?) -> Unit,
    types: ImmutableList<PokedexType>,
    selectedType: PokedexType?,
    onTypeClick: (type: PokedexType?) -> Unit,
    categories: ImmutableList<PokedexPreferencesCategory>,
    selectedCategories: ImmutableSet<PokedexPreferencesCategory>,
    onCategoryClick: (category: PokedexPreferencesCategory) -> Unit,
    pokemonForms: ImmutableList<PokedexPokemonForm>,
    selectedPokemonFormId: CorePokemonFormId?,
    onPokemonFormClick: (pokemonForm: PokedexPokemonForm) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize(),
    ) {
        FilterRow(
            filters = filters,
            selectedFilter = selectedFilter,
            pokedexesMap = pokedexesMap,
            selectedPokedex = selectedPokedex,
            generations = generations,
            selectedGeneration = selectedGeneration,
            types = types,
            selectedType = selectedType,
            categories = categories,
            selectedCategories = selectedCategories,
            onFilterChange = onFilterChange,
            onPokedexClick = onPokedexClick,
            onGenerationClick = onGenerationClick,
            onTypeClick = onTypeClick,
            onCategoryClick = onCategoryClick,
        )
        if (pokemonForms.isEmpty()) {
            DexInfoContent(
                icon = DexIcons.Material.SearchOff,
                text = stringResource(Res.string.pokedex_pokemon_forms_empty),
            )
        } else {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(pokemonFormMinWidth),
                verticalArrangement = Arrangement.spacedBy(DexTheme.dimensions.padding.medium),
                horizontalArrangement = Arrangement.spacedBy(DexTheme.dimensions.padding.medium),
                contentPadding = DexTheme.dimensions.padding.screenPaddingValues,
            ) {
                items(
                    items = pokemonForms,
                    key = { pokemonForm -> pokemonForm.pokemonForm.id.value },
                ) { pokemonForm ->
                    PokemonForm(
                        pokemonForm = pokemonForm,
                        selected = selectedPokemonFormId == pokemonForm.pokemonForm.id,
                        onClick = { onPokemonFormClick(pokemonForm) },
                    )
                }
            }
        }
    }
}

@Composable
private fun FilterRow(
    filters: ImmutableList<PokedexFilter>,
    selectedFilter: PokedexFilter?,
    pokedexesMap: ImmutableMap<PokedexRegion?, List<PokedexPokedex>>,
    selectedPokedex: PokedexPokedex,
    generations: ImmutableList<PokedexGeneration>,
    selectedGeneration: PokedexGeneration?,
    types: ImmutableList<PokedexType>,
    selectedType: PokedexType?,
    categories: ImmutableList<PokedexPreferencesCategory>,
    selectedCategories: ImmutableSet<PokedexPreferencesCategory>,
    onFilterChange: (filter: PokedexFilter?) -> Unit,
    onPokedexClick: (pokedex: PokedexPokedex) -> Unit,
    onGenerationClick: (generation: PokedexGeneration?) -> Unit,
    onTypeClick: (type: PokedexType?) -> Unit,
    onCategoryClick: (category: PokedexPreferencesCategory) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(
            horizontal = DexTheme.dimensions.padding.medium,
        ),
        horizontalArrangement = Arrangement.spacedBy(DexTheme.dimensions.padding.medium),
    ) {
        items(
            items = filters,
            key = { filter -> filter },
        ) { filter ->
            val expanded = selectedFilter == filter
            val onExpandedChange: (Boolean) -> Unit = { newExpanded ->
                val newFilter = if (newExpanded) filter else null
                onFilterChange(newFilter)
            }

            when (filter) {
                PokedexFilter.CATEGORY -> {
                    DexMultiSelection(
                        expanded = expanded,
                        onExpandedChange = onExpandedChange,
                        title = stringResource(Res.string.pokedex_preferences_categories_title),
                        items = categories,
                        selectedItems = selectedCategories,
                        getKey = { category -> category },
                        getContentText = { category -> stringResource(category.stringResource) },
                        onClick = onCategoryClick,
                    )
                }

                PokedexFilter.GENERATION -> {
                    DexSingleSelectionWithNull(
                        expanded = expanded,
                        onExpandedChange = onExpandedChange,
                        title = stringResource(Res.string.pokedex_preferences_generation_title),
                        items = generations,
                        selectedItem = selectedGeneration,
                        getKey = { generation -> generation.generation.id.value },
                        getContentText = { generation ->
                            generation?.generationName?.name
                                ?: stringResource(Res.string.pokedex_preferences_generation_value_null)
                        },
                        onClick = onGenerationClick,
                    )
                }

                PokedexFilter.POKEDEX -> {
                    DexSingleSelectionGroupNullable(
                        expanded = selectedFilter == filter,
                        onExpandedChange = onExpandedChange,
                        title = stringResource(Res.string.pokedex_preferences_pokedex_title),
                        map = pokedexesMap,
                        selectedItem = selectedPokedex,
                        getKeyGroup = { region -> region.region.id.value },
                        getKeyItem = { pokedex -> pokedex.pokedex.id.value },
                        getContentTypeKlassGroup = { PokedexRegion::class },
                        getContentTypeKlassItem = { PokedexPokedex::class },
                        getGroupText = { region ->
                            region?.regionName?.name
                                ?: stringResource(Res.string.pokedex_preferences_pokedex_region_value_null)
                        },
                        getContentText = { pokedex -> pokedex.pokedexName.name },
                        getSupportingContent = { pokedex ->
                            val versionGroups = pokedex.versionGroups
                            val description = pokedex.pokedexDescription.description
                            if (versionGroups.isNotEmpty()) {
                                CoreDisplayViewVersionGroups(
                                    versionGroups = versionGroups,
                                    showAbbreviations = isSelectionDropdownMenu,
                                )
                            } else if (description.isNotBlank()) {
                                Text(
                                    text = description,
                                )
                            }
                        },
                        onClick = onPokedexClick,
                    )
                }

                PokedexFilter.TYPE -> {
                    DexSingleSelectionWithNull(
                        expanded = selectedFilter == filter,
                        onExpandedChange = onExpandedChange,
                        title = stringResource(Res.string.pokedex_preferences_type_title),
                        items = types,
                        selectedItem = selectedType,
                        getKey = { type -> type.type.id.value },
                        getContentText = { type ->
                            type?.typeName?.name
                                ?: stringResource(Res.string.pokedex_preferences_type_value_null)
                        },
                        onClick = onTypeClick,
                        getTrailingIcon = { type -> type?.displayType?.icon },
                    )
                }
            }
        }
    }
}

@Composable
private fun PokemonForm(
    pokemonForm: PokedexPokemonForm,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val showHighlight = selected && !DexTheme.isSinglePane
    val containerColor = if (showHighlight) {
        DexTheme.colorScheme.secondaryContainer
    } else {
        DexTheme.colorScheme.surfaceContainerLowest
    }
    val onContainerColor = if (showHighlight) {
        DexTheme.colorScheme.onSecondaryContainer
    } else {
        DexTheme.colorScheme.onSurface
    }

    Column(
        modifier = modifier
            .clip(DexTheme.shapes.medium)
            .background(containerColor)
            .clickable(onClick = onClick)
            .padding(DexTheme.dimensions.padding.large),
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
        ) {
            DexAsyncImage(
                imageUrl = pokemonForm.pokemonSprite?.getOfficialArtworkUrl(),
                modifier = Modifier.size(DexTheme.dimensions.component.listItem.leadingImageSize),
                contentDescription = stringResource(Res.string.content_description_sprite_pokemon_official_artwork),
            )
            Spacer(modifier = Modifier.width(DexTheme.dimensions.padding.large))
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceAround,
            ) {
                DexTextSingleLine(
                    text = pokemonForm.displayName,
                    style = DexTheme.typography.bodyLarge,
                    color = onContainerColor,
                )
                Spacer(modifier = Modifier.height(DexTheme.dimensions.padding.small))
                DexTextSingleLine(
                    text = pokemonForm.pokemon?.pokemonSpecies?.pokemonDexNumber?.pokedexNumber?.toString()
                        .orEmpty(),
                    style = DexTheme.typography.bodyMedium,
                    color = onContainerColor,
                )
            }
        }
        Spacer(modifier = Modifier.height(DexTheme.dimensions.padding.medium))
        CoreDisplayViewTypes(
            types = pokemonForm.pokemon?.pokemonTypes,
        )
    }
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        val pokedexesMap = persistentMapOf<PokedexRegion?, List<PokedexPokedex>>(
            null to listOf(
                PokedexPokedex.example(
                    pokedex = CorePokedex.example(
                        id = CorePokedexId.example(1),
                    ),
                    pokedexName = CorePokedexName.example(
                        name = "National",
                    ),
                ),
            ),
        )

        val generations = persistentListOf(
            PokedexGeneration.example(
                generation = CoreGeneration.example(
                    id = CoreGenerationId.example(1),
                ),
                generationName = CoreGenerationName.example(
                    name = "Generation I",
                ),
            ),
            PokedexGeneration.example(
                generation = CoreGeneration.example(
                    id = CoreGenerationId.example(2),
                ),
                generationName = CoreGenerationName.example(
                    name = "Generation II",
                ),
            ),
            PokedexGeneration.example(
                generation = CoreGeneration.example(
                    id = CoreGenerationId.example(3),
                ),
                generationName = CoreGenerationName.example(
                    name = "Generation III",
                ),
            ),
        )

        val types = persistentListOf(
            PokedexType.example(
                type = CoreType.example(
                    id = CoreTypeId.example(12),
                ),
                typeName = CoreTypeName.example(
                    name = "Grass",
                ),
            ),
            PokedexType.example(
                type = CoreType.example(
                    id = CoreTypeId.example(4),
                ),
                typeName = CoreTypeName.example(
                    name = "Poison",
                ),
            ),
            PokedexType.example(
                type = CoreType.example(
                    id = CoreTypeId.example(11),
                ),
                typeName = CoreTypeName.example(
                    name = "Water",
                ),
            ),
        )

        val pokemonForms = persistentListOf(
            PokedexPokemonForm.example(
                pokemonForm = CorePokemonForm.example(
                    id = CorePokemonFormId.example(1),
                ),
                pokemonFormName = CorePokemonFormName.example(
                    pokemonName = "Bulbasaur",
                ),
                versionGroup = CoreVersionGroup.example(
                    generationId = CoreGenerationId.example(1),
                ),
                pokemon = PokedexPokemon.example(
                    pokemon = CorePokemon.example(
                        id = CorePokemonId.example(1),
                    ),
                    pokemonSpecies = PokedexPokemonSpecies.example(
                        pokemonDexNumber = CorePokemonDexNumber.example(
                            pokedexNumber = CorePokedexNumber.example(1),
                        ),
                    ),
                    pokemonTypes = persistentListOf(
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(12),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Grass",
                                typeId = CoreTypeId.example(12),
                            ),
                        ),
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(4),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Poison",
                                typeId = CoreTypeId.example(4),
                            ),
                        ),
                    ),
                ),
            ),
            PokedexPokemonForm.example(
                pokemonForm = CorePokemonForm.example(
                    id = CorePokemonFormId.example(2),
                ),
                pokemonFormName = CorePokemonFormName.example(
                    pokemonName = "Ivysaur",
                ),
                versionGroup = CoreVersionGroup.example(
                    generationId = CoreGenerationId.example(1),
                ),
                pokemon = PokedexPokemon.example(
                    pokemon = CorePokemon.example(
                        id = CorePokemonId.example(2),
                    ),
                    pokemonSpecies = PokedexPokemonSpecies.example(
                        pokemonDexNumber = CorePokemonDexNumber.example(
                            pokedexNumber = CorePokedexNumber.example(2),
                        ),
                    ),
                    pokemonTypes = persistentListOf(
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(12),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Grass",
                                typeId = CoreTypeId.example(12),
                            ),
                        ),
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(4),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Poison",
                                typeId = CoreTypeId.example(4),
                            ),
                        ),
                    ),
                ),
            ),
            PokedexPokemonForm.example(
                pokemonForm = CorePokemonForm.example(
                    id = CorePokemonFormId.example(3),
                ),
                pokemonFormName = CorePokemonFormName.example(
                    pokemonName = "Venusaur",
                ),
                versionGroup = CoreVersionGroup.example(
                    generationId = CoreGenerationId.example(1),
                ),
                pokemon = PokedexPokemon.example(
                    pokemon = CorePokemon.example(
                        id = CorePokemonId.example(3),
                    ),
                    pokemonSpecies = PokedexPokemonSpecies.example(
                        pokemonDexNumber = CorePokemonDexNumber.example(
                            pokedexNumber = CorePokedexNumber.example(3),
                        ),
                    ),
                    pokemonTypes = persistentListOf(
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(12),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Grass",
                                typeId = CoreTypeId.example(12),
                            ),
                        ),
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(4),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Poison",
                                typeId = CoreTypeId.example(4),
                            ),
                        ),
                    ),
                ),
            ),
            PokedexPokemonForm.example(
                pokemonForm = CorePokemonForm.example(
                    id = CorePokemonFormId.example(152),
                ),
                pokemonFormName = CorePokemonFormName.example(
                    pokemonName = "Chikorita",
                ),
                versionGroup = CoreVersionGroup.example(
                    generationId = CoreGenerationId.example(2),
                ),
                pokemon = PokedexPokemon.example(
                    pokemon = CorePokemon.example(
                        id = CorePokemonId.example(152),
                    ),
                    pokemonSpecies = PokedexPokemonSpecies.example(
                        pokemonDexNumber = CorePokemonDexNumber.example(
                            pokedexNumber = CorePokedexNumber.example(152),
                        ),
                    ),
                    pokemonTypes = persistentListOf(
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(12),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Grass",
                                typeId = CoreTypeId.example(12),
                            ),
                        ),
                    ),
                ),
            ),
            PokedexPokemonForm.example(
                pokemonForm = CorePokemonForm.example(
                    id = CorePokemonFormId.example(153),
                ),
                pokemonFormName = CorePokemonFormName.example(
                    pokemonName = "Bayleef",
                ),
                versionGroup = CoreVersionGroup.example(
                    generationId = CoreGenerationId.example(2),
                ),
                pokemon = PokedexPokemon.example(
                    pokemon = CorePokemon.example(
                        id = CorePokemonId.example(153),
                    ),
                    pokemonSpecies = PokedexPokemonSpecies.example(
                        pokemonDexNumber = CorePokemonDexNumber.example(
                            pokedexNumber = CorePokedexNumber.example(153),
                        ),
                    ),
                    pokemonTypes = persistentListOf(
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(12),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Grass",
                                typeId = CoreTypeId.example(12),
                            ),
                        ),
                    ),
                ),
            ),
            PokedexPokemonForm.example(
                pokemonForm = CorePokemonForm.example(
                    id = CorePokemonFormId.example(154),
                ),
                pokemonFormName = CorePokemonFormName.example(
                    pokemonName = "Meganium",
                ),
                versionGroup = CoreVersionGroup.example(
                    generationId = CoreGenerationId.example(2),
                ),
                pokemon = PokedexPokemon.example(
                    pokemon = CorePokemon.example(
                        id = CorePokemonId.example(154),
                    ),
                    pokemonSpecies = PokedexPokemonSpecies.example(
                        pokemonDexNumber = CorePokemonDexNumber.example(
                            pokedexNumber = CorePokedexNumber.example(154),
                        ),
                    ),
                    pokemonTypes = persistentListOf(
                        PokedexPokemonType.example(
                            pokemonType = CorePokemonType.example(
                                typeId = CoreTypeId.example(12),
                            ),
                            typeName = CoreTypeName.example(
                                name = "Grass",
                                typeId = CoreTypeId.example(12),
                            ),
                        ),
                    ),
                ),
            ),
        )

        val selectedPokedex = pokedexesMap
            .values
            .first()
            .first()
        var selectedFilter: PokedexFilter? by remember { mutableStateOf(null) }
        var selectedGeneration: PokedexGeneration? by remember { mutableStateOf(null) }
        var selectedType: PokedexType? by remember { mutableStateOf(null) }
        val selectedPokemonForms = pokemonForms
            .asSequence()
            .filter { pokemonForm ->
                selectedGeneration == null ||
                    pokemonForm.versionGroup?.generationId == selectedGeneration?.generation?.id
            }
            .filter { pokemonForm ->
                selectedType == null ||
                    pokemonForm.pokemon?.pokemonTypes?.any { pokemonType ->
                        pokemonType.pokemonType.typeId == selectedType?.type?.id
                    } == true
            }
            .toImmutableList()

        PokedexScreen(
            uiState = PokedexUiState.Success(
                selectedFilter = selectedFilter,
                pokedexesMap = pokedexesMap,
                selectedPokedex = selectedPokedex,
                generations = generations,
                selectedGeneration = selectedGeneration,
                types = types,
                selectedType = selectedType,
                selectedCategories = persistentSetOf(),
                pokemonForms = selectedPokemonForms,
                selectedPokemonFormId = null,
            ),
            onReloadClick = {},
            onFilterChang = { filter -> selectedFilter = filter },
            onPokedexClick = {},
            onGenerationClick = { generation -> selectedGeneration = generation },
            onTypeClick = { type -> selectedType = type },
            onCategoryClick = {},
            onPokemonFormClick = {},
        )
    }
}

@Composable
@Preview
private fun ErrorPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        PokedexScreen(
            uiState = PokedexUiState.Error,
            onReloadClick = {},
            onFilterChang = {},
            onPokedexClick = {},
            onGenerationClick = {},
            onTypeClick = {},
            onCategoryClick = {},
            onPokemonFormClick = {},
        )
    }
}

@Composable
@Preview
private fun LoadingPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        PokedexScreen(
            uiState = PokedexUiState.Loading,
            onReloadClick = {},
            onFilterChang = {},
            onPokedexClick = {},
            onGenerationClick = {},
            onTypeClick = {},
            onCategoryClick = {},
            onPokemonFormClick = {},
        )
    }
}
