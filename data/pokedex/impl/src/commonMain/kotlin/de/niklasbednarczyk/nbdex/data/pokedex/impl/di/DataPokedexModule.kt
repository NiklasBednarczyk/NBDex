package de.niklasbednarczyk.nbdex.data.pokedex.impl.di

import de.niklasbednarczyk.nbdex.data.pokedex.api.repository.PokedexRepository
import de.niklasbednarczyk.nbdex.data.pokedex.impl.repository.PokedexRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val dataPokedexModule = module {
    singleOf(::PokedexRepositoryImpl).bind(PokedexRepository::class)
}
