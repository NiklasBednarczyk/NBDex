package de.niklasbednarczyk.nbdex.feature.info.impl.di

import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.NBDetailPlaceholderContent
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.info.api.navigation.InfoNavKey
import de.niklasbednarczyk.nbdex.feature.info.impl.ui.InfoScreen
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val featureInfoModule = module {
    navigation<InfoNavKey>(
        metadata = ListDetailSceneStrategy.listPane(
            sceneKey = NBTopLevelDestination.INFO.sceneKey,
            detailPlaceholder = { NBDetailPlaceholderContent() }
        ),
    ) {
        InfoScreen()
    }
}