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

internal sealed interface PokedexUiState {

    data object Error : PokedexUiState

    data object Loading : PokedexUiState

    data class Success(
        val selectedFilter: PokedexFilter?,
        val pokedexesMap: Map<PokedexRegion?, List<PokedexPokedex>>,
        val selectedPokedex: PokedexPokedex,
        val generations: List<PokedexGeneration>,
        val selectedGeneration: PokedexGeneration?,
        val types: List<PokedexType>,
        val selectedType: PokedexType?,
        val selectedCategories: Set<PokedexPreferencesCategory>,
        val pokemonForms: List<PokedexPokemonForm>,
        val selectedPokemonFormId: CorePokemonFormId?,
    ) : PokedexUiState {

        val filters: List<PokedexFilter>
            get() = listOf(
                PokedexFilter.POKEDEX,
                PokedexFilter.GENERATION,
                PokedexFilter.TYPE,
                PokedexFilter.CATEGORY,
            )

        val categories: List<PokedexPreferencesCategory>
            get() = PokedexPreferencesCategory
                .entries
                .sortedBy { category -> category.order }

    }

}