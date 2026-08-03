package de.niklasbednarczyk.nbdex.network.pokedex.impl.di

import de.niklasbednarczyk.nbdex.network.pokedex.api.datasource.PokedexNetworkDataSource
import de.niklasbednarczyk.nbdex.network.pokedex.impl.datasource.PokedexNetworkDataSourceImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val networkPokedexModule = module {
    singleOf(::PokedexNetworkDataSourceImpl).bind(PokedexNetworkDataSource::class)
}
