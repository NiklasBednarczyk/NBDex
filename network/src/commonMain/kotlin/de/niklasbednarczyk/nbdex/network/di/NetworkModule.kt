package de.niklasbednarczyk.nbdex.network.di

import de.niklasbednarczyk.nbdex.core.network.di.coreNetworkModule
import de.niklasbednarczyk.nbdex.network.pokedex.impl.di.networkPokedexModule
import org.koin.dsl.module

val networkModule = module {
    includes(
        coreNetworkModule,
        networkPokedexModule,
    )
}
