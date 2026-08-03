package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.di

import de.niklasbednarczyk.nbdex.persistence.pokedex.api.datasource.PokedexPersistenceDataSource
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.datasource.PokedexPersistenceDataSourceImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val persistencePokedexModule = module {
    singleOf(::PokedexPersistenceDataSourceImpl).bind(PokedexPersistenceDataSource::class)
}
