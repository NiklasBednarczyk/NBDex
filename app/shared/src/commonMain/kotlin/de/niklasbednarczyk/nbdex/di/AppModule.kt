package de.niklasbednarczyk.nbdex.di

import de.niklasbednarczyk.nbdex.core.common.dispatchers.DexDispatchers
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigationState
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexTopLevelDestination
import de.niklasbednarczyk.nbdex.data.di.dataModule
import de.niklasbednarczyk.nbdex.disk.di.diskModule
import de.niklasbednarczyk.nbdex.feature.di.featureModule
import de.niklasbednarczyk.nbdex.network.di.networkModule
import de.niklasbednarczyk.nbdex.persistence.di.persistenceModule
import de.niklasbednarczyk.nbdex.ui.DexAppViewModel
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

    viewModelOf(::DexAppViewModel)

    single { DexDispatchers() }

    single {
        DexNavigator(
            state = DexNavigationState(
                startKey = DexTopLevelDestination.POKEDEX.navKey,
                topLevelKeys = DexTopLevelDestination
                    .entries
                    .map { topLevelDestination -> topLevelDestination.navKey }
                    .toSet(),
            ),
        )
    }
}
