package de.niklasbednarczyk.nbdex.disk.settings.impl.di

import de.niklasbednarczyk.nbdex.core.disk.constant.NBDataStoreName
import de.niklasbednarczyk.nbdex.core.disk.datastore.createDataStore
import de.niklasbednarczyk.nbdex.disk.settings.api.datasource.SettingsDiskDataSource
import de.niklasbednarczyk.nbdex.disk.settings.impl.datasource.SettingsDiskDataSourceImpl
import de.niklasbednarczyk.nbdex.disk.settings.impl.serializer.SettingsSerializer
import org.koin.core.module.dsl.singleOf
import org.koin.core.qualifier.named
import org.koin.dsl.bind
import org.koin.dsl.module

val diskSettingsModule = module {
    single(named(NBDataStoreName.SETTINGS)) {
        createDataStore(
            scope = this,
            dataStoreName = NBDataStoreName.SETTINGS,
            serializer = SettingsSerializer,
        )
    }

    singleOf(::SettingsDiskDataSourceImpl).bind(SettingsDiskDataSource::class)
}
