package de.niklasbednarczyk.nbdex.feature.pokedex.impl.di

import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.NBDetailPlaceholderContent
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.pokedex.api.navigation.PokedexNavKey
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.ui.PokedexScreen
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.ui.PokedexViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val featurePokedexModule = module {
    viewModelOf(::PokedexViewModel)

    navigation<PokedexNavKey>(
        metadata = ListDetailSceneStrategy.listPane(
            sceneKey = NBTopLevelDestination.POKEDEX.sceneKey,
            detailPlaceholder = { NBDetailPlaceholderContent() }
        ),
    ) {
        PokedexScreen()
    }
}
