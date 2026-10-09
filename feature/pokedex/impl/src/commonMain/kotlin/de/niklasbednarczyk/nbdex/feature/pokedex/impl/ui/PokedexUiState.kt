package de.niklasbednarczyk.nbdex.feature.pokedex.impl.ui

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.ext.order
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.ui.model.PokedexFilter
import de.niklasbednarczyk.nbdex.model.pokedex.generation.PokedexGeneration
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexPokedex
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexRegion
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonForm
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import de.niklasbednarczyk.nbdex.model.pokedex.type.PokedexType
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList

internal sealed interface PokedexUiState {
    data object Error : PokedexUiState

    data object Loading : PokedexUiState

    data class Success(
        val selectedFilter: PokedexFilter?,
        val pokedexesMap: ImmutableMap<PokedexRegion?, List<PokedexPokedex>>,
        val selectedPokedex: PokedexPokedex,
        val generations: ImmutableList<PokedexGeneration>,
        val selectedGeneration: PokedexGeneration?,
        val types: ImmutableList<PokedexType>,
        val selectedType: PokedexType?,
        val selectedCategories: ImmutableSet<PokedexPreferencesCategory>,
        val pokemonForms: ImmutableList<PokedexPokemonForm>,
        val selectedPokemonFormId: CorePokemonFormId?,
    ) : PokedexUiState {
        val filters: ImmutableList<PokedexFilter>
            get() = persistentListOf(
                PokedexFilter.POKEDEX,
                PokedexFilter.GENERATION,
                PokedexFilter.TYPE,
                PokedexFilter.CATEGORY,
            )

        val categories: ImmutableList<PokedexPreferencesCategory>
            get() = PokedexPreferencesCategory
                .entries
                .sortedBy { category -> category.order }
                .toImmutableList()
    }
}
