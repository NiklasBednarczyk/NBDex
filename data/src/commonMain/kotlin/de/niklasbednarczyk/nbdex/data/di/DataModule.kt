package de.niklasbednarczyk.nbdex.data.di

import de.niklasbednarczyk.nbdex.data.pokedex.impl.di.dataPokedexModule
import de.niklasbednarczyk.nbdex.data.settings.impl.di.dataSettingsModule
import org.koin.dsl.module

val dataModule = module {
    includes(
        dataPokedexModule,
        dataSettingsModule,
    )
}
