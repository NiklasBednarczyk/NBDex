package de.niklasbednarczyk.nbdex.feature.about.impl.di

import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.about.api.navigation.AboutNavKey
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.AboutScreen
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.AboutViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val featureAboutModule = module {
    viewModelOf(::AboutViewModel)

    navigation<AboutNavKey>(
        metadata = ListDetailSceneStrategy.detailPane(NBTopLevelDestination.MORE.sceneKey),
    ) {
        AboutScreen()
    }
}
