package de.niklasbednarczyk.nbdex.feature.theme.impl.di

import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.theme.api.navigation.ThemeNavKey
import de.niklasbednarczyk.nbdex.feature.theme.impl.ui.ThemeScreen
import de.niklasbednarczyk.nbdex.feature.theme.impl.ui.ThemeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val featureThemeModule = module {
    viewModelOf(::ThemeViewModel)

    navigation<ThemeNavKey>(
        metadata = ListDetailSceneStrategy.detailPane(NBTopLevelDestination.MORE.sceneKey),
    ) {
        ThemeScreen()
    }
}
