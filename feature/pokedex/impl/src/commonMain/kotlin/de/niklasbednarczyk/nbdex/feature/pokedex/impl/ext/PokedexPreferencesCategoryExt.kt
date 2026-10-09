package de.niklasbednarczyk.nbdex.feature.pokedex.impl.ext

import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_categories_value_baby
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_categories_value_battle_only
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_categories_value_default
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_categories_value_legendary
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_categories_value_mega
import nbdex.core.ui.resource.generated.resources.pokedex_preferences_categories_value_mythical
import org.jetbrains.compose.resources.StringResource

internal val PokedexPreferencesCategory.stringResource: StringResource
    get() = when (this) {
        PokedexPreferencesCategory.DEFAULT -> Res.string.pokedex_preferences_categories_value_default
        PokedexPreferencesCategory.BABY -> Res.string.pokedex_preferences_categories_value_baby
        PokedexPreferencesCategory.BATTLE_ONLY -> Res.string.pokedex_preferences_categories_value_battle_only
        PokedexPreferencesCategory.LEGENDARY -> Res.string.pokedex_preferences_categories_value_legendary
        PokedexPreferencesCategory.MEGA -> Res.string.pokedex_preferences_categories_value_mega
        PokedexPreferencesCategory.MYTHICAL -> Res.string.pokedex_preferences_categories_value_mythical
    }

internal val PokedexPreferencesCategory.order: Int
    get() = when (this) {
        PokedexPreferencesCategory.DEFAULT -> 1
        PokedexPreferencesCategory.BABY -> 4
        PokedexPreferencesCategory.BATTLE_ONLY -> 2
        PokedexPreferencesCategory.LEGENDARY -> 5
        PokedexPreferencesCategory.MEGA -> 3
        PokedexPreferencesCategory.MYTHICAL -> 6
    }
