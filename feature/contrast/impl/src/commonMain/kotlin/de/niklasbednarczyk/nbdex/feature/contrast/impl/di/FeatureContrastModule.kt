package de.niklasbednarczyk.nbdex.feature.contrast.impl.di

import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.contrast.api.navigation.ContrastNavKey
import de.niklasbednarczyk.nbdex.feature.contrast.impl.ui.ContrastScreen
import de.niklasbednarczyk.nbdex.feature.contrast.impl.ui.ContrastViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val featureContrastModule = module {
    viewModelOf(::ContrastViewModel)

    navigation<ContrastNavKey>(
        metadata = ListDetailSceneStrategy.detailPane(NBTopLevelDestination.MORE.sceneKey),
    ) {
        ContrastScreen()
    }
}