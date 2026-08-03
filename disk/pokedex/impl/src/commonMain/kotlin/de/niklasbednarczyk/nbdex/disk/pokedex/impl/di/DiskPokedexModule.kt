package de.niklasbednarczyk.nbdex.disk.pokedex.impl.di

import de.niklasbednarczyk.nbdex.core.disk.constant.NBDataStoreName
import de.niklasbednarczyk.nbdex.core.disk.datastore.createDataStore
import de.niklasbednarczyk.nbdex.disk.pokedex.api.datasource.PokedexDiskDataSource
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.datasource.PokedexDiskDataSourceImpl
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.serializer.PokedexPreferencesSerializer
import org.koin.core.module.dsl.singleOf
import org.koin.core.qualifier.named
import org.koin.dsl.bind
import org.koin.dsl.module

val diskPokedexModule = module {
    single(named(NBDataStoreName.POKEDEX_PREFERENCES)) {
        createDataStore(
            scope = this,
            dataStoreName = NBDataStoreName.POKEDEX_PREFERENCES,
            serializer = PokedexPreferencesSerializer,
        )
    }

    singleOf(::PokedexDiskDataSourceImpl).bind(PokedexDiskDataSource::class)
}