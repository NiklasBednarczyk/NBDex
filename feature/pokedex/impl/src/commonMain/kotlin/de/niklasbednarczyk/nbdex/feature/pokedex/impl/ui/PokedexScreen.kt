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
import de.niklasbednarczyk.nbdex.core.ui.designsystem.image.NBAsyncImage
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBCenteredTopAppBar
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.NBErrorContent
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.NBInfoContent
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.NBLoadingContent
import de.niklasbednarczyk.nbdex.core.ui.designsystem.selection.NBMultiSelection
import de.niklasbednarczyk.nbdex.core.ui.designsystem.selection.NBSingleSelectionGroupNullable
import de.niklasbednarczyk.nbdex.core.ui.designsystem.selection.NBSingleSelectionWithNull
import de.niklasbednarczyk.nbdex.core.ui.designsystem.selection.selectionIsDropdownMenu
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.icon
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.view.CoreDisplayViewTypes
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.view.CoreDisplayViewVersionGroups
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
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
        onReloadClicked = viewModel::reload,
        onFilterChanged = viewModel::updateSelectedFilter,
        onPokedexClicked = viewModel::updateSelectedPokedex,
        onGenerationClicked = viewModel::updateSelectedGeneration,
        onTypeClicked = viewModel::updateSelectedType,
        onCategoryClicked = viewModel::updateSelectedCategory,
        onPokemonFormClicked = viewModel::navigateToPokemonForm,
    )
}

@Composable
private fun PokedexScreen(
    uiState: PokedexUiState,
    onReloadClicked: () -> Unit,
    onFilterChanged: (filter: PokedexFilter?) -> Unit,
    onPokedexClicked: (pokedex: PokedexPokedex) -> Unit,
    onGenerationClicked: (generation: PokedexGeneration?) -> Unit,
    onTypeClicked: (type: PokedexType?) -> Unit,
    onCategoryClicked: (category: PokedexPreferencesCategory) -> Unit,
    onPokemonFormClicked: (pokemonForm: PokedexPokemonForm) -> Unit,
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            NBCenteredTopAppBar(
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
                        NBErrorContent(
                            onReloadClicked = onReloadClicked,
                        )
                    }

                    PokedexUiState.Loading -> {
                        NBLoadingContent()
                    }

                    is PokedexUiState.Success -> {
                        SuccessContent(
                            filters = state.filters,
                            selectedFilter = state.selectedFilter,
                            onFilterChanged = onFilterChanged,
                            pokedexesMap = state.pokedexesMap,
                            selectedPokedex = state.selectedPokedex,
                            onPokedexClicked = onPokedexClicked,
                            generations = state.generations,
                            selectedGeneration = state.selectedGeneration,
                            onGenerationClicked = onGenerationClicked,
                            types = state.types,
                            selectedType = state.selectedType,
                            onTypeClicked = onTypeClicked,
                            categories = state.categories,
                            selectedCategories = state.selectedCategories,
                            onCategoryClicked = onCategoryClicked,
                            pokemonForms = state.pokemonForms,
                            selectedPokemonFormId = state.selectedPokemonFormId,
                            onPokemonFormClicked = onPokemonFormClicked,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SuccessContent(
    filters: List<PokedexFilter>,
    selectedFilter: PokedexFilter?,
    onFilterChanged: (filter: PokedexFilter?) -> Unit,
    pokedexesMap: Map<PokedexRegion?, List<PokedexPokedex>>,
    selectedPokedex: PokedexPokedex,
    onPokedexClicked: (pokedex: PokedexPokedex) -> Unit,
    generations: List<PokedexGeneration>,
    selectedGeneration: PokedexGeneration?,
    onGenerationClicked: (generation: PokedexGeneration?) -> Unit,
    types: List<PokedexType>,
    selectedType: PokedexType?,
    onTypeClicked: (type: PokedexType?) -> Unit,
    categories: List<PokedexPreferencesCategory>,
    selectedCategories: Set<PokedexPreferencesCategory>,
    onCategoryClicked: (category: PokedexPreferencesCategory) -> Unit,
    pokemonForms: List<PokedexPokemonForm>,
    selectedPokemonFormId: CorePokemonFormId?,
    onPokemonFormClicked: (pokemonForm: PokedexPokemonForm) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
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
            onFilterChanged = onFilterChanged,
            onPokedexClicked = onPokedexClicked,
            onGenerationClicked = onGenerationClicked,
            onTypeClicked = onTypeClicked,
            onCategoryClicked = onCategoryClicked,
        )
        if (pokemonForms.isEmpty()) {
            NBInfoContent(
                icon = NBIcons.Material.SearchOff,
                text = stringResource(Res.string.pokedex_pokemon_forms_empty),
            )
        } else {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(pokemonFormMinWidth),
                verticalArrangement = Arrangement.spacedBy(NBTheme.dimensions.padding.medium),
                horizontalArrangement = Arrangement.spacedBy(NBTheme.dimensions.padding.medium),
                contentPadding = NBTheme.dimensions.padding.screenPaddingValues,
            ) {
                items(
                    items = pokemonForms,
                    key = { pokemonForm -> pokemonForm.pokemonForm.id.value },
                ) { pokemonForm ->
                    PokemonForm(
                        pokemonForm = pokemonForm,
                        selected = selectedPokemonFormId == pokemonForm.pokemonForm.id,
                        onClick = { onPokemonFormClicked(pokemonForm) },
                    )
                }
            }
        }
    }
}

@Composable
private fun FilterRow(
    filters: List<PokedexFilter>,
    selectedFilter: PokedexFilter?,
    pokedexesMap: Map<PokedexRegion?, List<PokedexPokedex>>,
    selectedPokedex: PokedexPokedex,
    generations: List<PokedexGeneration>,
    selectedGeneration: PokedexGeneration?,
    types: List<PokedexType>,
    selectedType: PokedexType?,
    categories: List<PokedexPreferencesCategory>,
    selectedCategories: Set<PokedexPreferencesCategory>,
    onFilterChanged: (filter: PokedexFilter?) -> Unit,
    onPokedexClicked: (pokedex: PokedexPokedex) -> Unit,
    onGenerationClicked: (generation: PokedexGeneration?) -> Unit,
    onTypeClicked: (type: PokedexType?) -> Unit,
    onCategoryClicked: (category: PokedexPreferencesCategory) -> Unit,
) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(
            horizontal = NBTheme.dimensions.padding.medium,
        ),
        horizontalArrangement = Arrangement.spacedBy(NBTheme.dimensions.padding.medium),
    ) {
        items(
            items = filters,
            key = { filter -> filter }
        ) { filter ->
            val expanded = selectedFilter == filter
            val onExpandedChanged: (Boolean) -> Unit = { newExpanded ->
                val newFilter = if (newExpanded) filter else null
                onFilterChanged(newFilter)
            }

            when (filter) {
                PokedexFilter.CATEGORY -> {
                    NBMultiSelection(
                        expanded = expanded,
                        onExpandedChanged = onExpandedChanged,
                        title = stringResource(Res.string.pokedex_preferences_categories_title),
                        items = categories,
                        selectedItems = selectedCategories,
                        getKey = { category -> category },
                        getContentText = { category -> stringResource(category.stringResource) },
                        onClick = onCategoryClicked,
                    )
                }

                PokedexFilter.GENERATION -> {
                    NBSingleSelectionWithNull(
                        expanded = expanded,
                        onExpandedChanged = onExpandedChanged,
                        title = stringResource(Res.string.pokedex_preferences_generation_title),
                        items = generations,
                        selectedItem = selectedGeneration,
                        getKey = { generation -> generation.generation.id.value },
                        getContentText = { generation ->
                            generation?.generationName?.name
                                ?: stringResource(Res.string.pokedex_preferences_generation_value_null)
                        },
                        onClick = onGenerationClicked,
                    )
                }

                PokedexFilter.POKEDEX -> {
                    NBSingleSelectionGroupNullable(
                        expanded = selectedFilter == filter,
                        onExpandedChanged = onExpandedChanged,
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
                                    showAbbreviations = selectionIsDropdownMenu,
                                )
                            } else if (description.isNotBlank()) {
                                Text(
                                    text = description,
                                )
                            }

                        },
                        onClick = onPokedexClicked,
                    )
                }

                PokedexFilter.TYPE -> {
                    NBSingleSelectionWithNull(
                        expanded = selectedFilter == filter,
                        onExpandedChanged = onExpandedChanged,
                        title = stringResource(Res.string.pokedex_preferences_type_title),
                        items = types,
                        selectedItem = selectedType,
                        getKey = { type -> type.type.id.value },
                        getContentText = { type ->
                            type?.typeName?.name
                                ?: stringResource(Res.string.pokedex_preferences_type_value_null)
                        },
                        onClick = onTypeClicked,
                        getTrailingIcon = { type -> type?.displayType?.icon }
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
) {
    val showHighlight = selected && !NBTheme.isSinglePane
    val containerColor = if (showHighlight) {
        NBTheme.colorScheme.secondaryContainer
    } else {
        NBTheme.colorScheme.surfaceContainerLowest
    }
    val onContainerColor = if (showHighlight) {
        NBTheme.colorScheme.onSecondaryContainer
    } else {
        NBTheme.colorScheme.onSurface
    }

    Column(
        modifier = Modifier
            .clip(NBTheme.shapes.medium)
            .background(containerColor)
            .clickable(onClick = onClick)
            .padding(NBTheme.dimensions.padding.large),
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
        ) {
            NBAsyncImage(
                imageUrl = pokemonForm.pokemonSprite?.getOfficialArtworkUrl(),
                modifier = Modifier.size(NBTheme.dimensions.component.listItem.leadingImageSize),
                contentDescription = stringResource(Res.string.content_description_sprite_pokemon_official_artwork),
            )
            Spacer(modifier = Modifier.width(NBTheme.dimensions.padding.large))
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceAround,
            ) {
                NBTextSingleLine(
                    text = pokemonForm.displayName,
                    style = NBTheme.typography.bodyLarge,
                    color = onContainerColor,
                )
                Spacer(modifier = Modifier.height(NBTheme.dimensions.padding.small))
                NBTextSingleLine(
                    text = pokemonForm.pokemon?.pokemonSpecies?.pokemonDexNumber?.pokedexNumber?.toString()
                        .orEmpty(),
                    style = NBTheme.typography.bodyMedium,
                    color = onContainerColor,
                )
            }
        }
        Spacer(modifier = Modifier.height(NBTheme.dimensions.padding.medium))
        CoreDisplayViewTypes(
            types = pokemonForm.pokemon?.pokemonTypes,
        )
    }
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        val pokedexesMap = mapOf<PokedexRegion?, List<PokedexPokedex>>(
            null to listOf(
                PokedexPokedex.example(
                    pokedex = CorePokedex.example(
                        id = CorePokedexId.example(1),
                    ),
                    pokedexName = CorePokedexName.example(
                        name = "National",
                    )
                ),
            )
        )

        val generations = listOf(
            PokedexGeneration.example(
                generation = CoreGeneration.example(
                    id = CoreGenerationId.example(1),
                ),
                generationName = CoreGenerationName.example(
                    name = "Generation I",
                )
            ),
            PokedexGeneration.example(
                generation = CoreGeneration.example(
                    id = CoreGenerationId.example(2),
                ),
                generationName = CoreGenerationName.example(
                    name = "Generation II",
                )
            ),
            PokedexGeneration.example(
                generation = CoreGeneration.example(
                    id = CoreGenerationId.example(3),
                ),
                generationName = CoreGenerationName.example(
                    name = "Generation III",
                )
            ),
        )

        val types = listOf(
            PokedexType.example(
                type = CoreType.example(
                    id = CoreTypeId.example(12),
                ),
                typeName = CoreTypeName.example(
                    name = "Grass",
                )
            ),
            PokedexType.example(
                type = CoreType.example(
                    id = CoreTypeId.example(4),
                ),
                typeName = CoreTypeName.example(
                    name = "Poison",
                )
            ),
            PokedexType.example(
                type = CoreType.example(
                    id = CoreTypeId.example(11),
                ),
                typeName = CoreTypeName.example(
                    name = "Water",
                )
            ),
        )

        val pokemonForms = listOf(
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
                    pokemonTypes = listOf(
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
                    pokemonTypes = listOf(
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
                    pokemonTypes = listOf(
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
                    pokemonTypes = listOf(
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
                    pokemonTypes = listOf(
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
                    pokemonTypes = listOf(
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
            .filter { pokemonForm -> selectedGeneration == null || pokemonForm.versionGroup?.generationId == selectedGeneration?.generation?.id }
            .filter { pokemonForm -> selectedType == null || pokemonForm.pokemon?.pokemonTypes?.any { pokemonType -> pokemonType.pokemonType.typeId == selectedType?.type?.id } == true }

        PokedexScreen(
            uiState = PokedexUiState.Success(
                selectedFilter = selectedFilter,
                pokedexesMap = pokedexesMap,
                selectedPokedex = selectedPokedex,
                generations = generations,
                selectedGeneration = selectedGeneration,
                types = types,
                selectedType = selectedType,
                selectedCategories = setOf(),
                pokemonForms = selectedPokemonForms,
                selectedPokemonFormId = null,
            ),
            onReloadClicked = {},
            onFilterChanged = { filter -> selectedFilter = filter },
            onPokedexClicked = {},
            onGenerationClicked = { generation -> selectedGeneration = generation },
            onTypeClicked = { type -> selectedType = type },
            onCategoryClicked = {},
            onPokemonFormClicked = {},
        )
    }
}

@Composable
@Preview
private fun PreviewError(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        PokedexScreen(
            uiState = PokedexUiState.Error,
            onReloadClicked = {},
            onFilterChanged = {},
            onPokedexClicked = {},
            onGenerationClicked = {},
            onTypeClicked = {},
            onCategoryClicked = {},
            onPokemonFormClicked = {},
        )
    }
}

@Composable
@Preview
private fun PreviewLoading(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        PokedexScreen(
            uiState = PokedexUiState.Loading,
            onReloadClicked = {},
            onFilterChanged = {},
            onPokedexClicked = {},
            onGenerationClicked = {},
            onTypeClicked = {},
            onCategoryClicked = {},
            onPokemonFormClicked = {},
        )
    }
}
