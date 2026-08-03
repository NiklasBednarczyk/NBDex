package de.niklasbednarczyk.nbdex.disk.di

import de.niklasbednarczyk.nbdex.disk.settings.impl.di.diskSettingsModule
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.di.diskPokedexModule
import org.koin.dsl.module

val diskModule = module {
    includes(
        diskPokedexModule,
        diskSettingsModule,
    )
}
