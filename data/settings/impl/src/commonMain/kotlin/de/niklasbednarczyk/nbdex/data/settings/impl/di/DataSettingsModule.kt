package de.niklasbednarczyk.nbdex.data.settings.impl.di

import de.niklasbednarczyk.nbdex.data.settings.api.repository.SettingsRepository
import de.niklasbednarczyk.nbdex.data.settings.impl.repository.SettingsRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val dataSettingsModule = module {
    singleOf(::SettingsRepositoryImpl).bind(SettingsRepository::class)
}
