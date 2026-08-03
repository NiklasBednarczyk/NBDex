package de.niklasbednarczyk.nbdex.feature.more.impl.di

import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.NBDetailPlaceholderContent
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.more.api.navigation.MoreNavKey
import de.niklasbednarczyk.nbdex.feature.more.impl.ui.MoreScreen
import de.niklasbednarczyk.nbdex.feature.more.impl.ui.MoreViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.koin.dsl.navigation3.navigation

val featureMoreModule = module {
    viewModelOf(::MoreViewModel)

    navigation<MoreNavKey>(
        metadata = ListDetailSceneStrategy.listPane(
            sceneKey = NBTopLevelDestination.MORE.sceneKey,
            detailPlaceholder = { NBDetailPlaceholderContent() }
        ),
    ) {
        MoreScreen()
    }
}