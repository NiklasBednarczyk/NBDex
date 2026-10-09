package de.niklasbednarczyk.nbdex.di

import de.niklasbednarczyk.nbdex.core.common.dispatchers.NBDispatchers
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigationState
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.data.di.dataModule
import de.niklasbednarczyk.nbdex.disk.di.diskModule
import de.niklasbednarczyk.nbdex.feature.di.featureModule
import de.niklasbednarczyk.nbdex.network.di.networkModule
import de.niklasbednarczyk.nbdex.persistence.di.persistenceModule
import de.niklasbednarczyk.nbdex.ui.NBAppViewModel
import de.niklasbednarczyk.nbdex.util.navKey
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

internal val appModule = module {
    includes(
        dataModule,
        diskModule,
        featureModule,
        networkModule,
        persistenceModule,
    )

    viewModelOf(::NBAppViewModel)

    single { NBDispatchers() }

    single {
        NBNavigator(
            state = NBNavigationState(
                startKey = NBTopLevelDestination.POKEDEX.navKey,
                topLevelKeys = NBTopLevelDestination
                    .entries
                    .map { topLevelDestination -> topLevelDestination.navKey }
                    .toSet(),
            ),
        )
    }
}
