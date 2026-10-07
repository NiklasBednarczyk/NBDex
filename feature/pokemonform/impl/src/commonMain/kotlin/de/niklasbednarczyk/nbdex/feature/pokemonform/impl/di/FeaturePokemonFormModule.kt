package de.niklasbednarczyk.nbdex.feature.pokemonform.impl.di

import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.pokemonform.api.navigation.PokemonFormNavKey
import de.niklasbednarczyk.nbdex.feature.pokemonform.impl.ui.PokemonFormScreen
import de.niklasbednarczyk.nbdex.feature.pokemonform.impl.ui.PokemonFormViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val featurePokemonFormModule = module {
    viewModelOf(::PokemonFormViewModel)

    navigation<PokemonFormNavKey>(
        metadata = ListDetailSceneStrategy.detailPane(NBTopLevelDestination.POKEDEX.sceneKey),
    ) { navKey ->
        PokemonFormScreen(
            navKey = navKey,
        )
    }
}
