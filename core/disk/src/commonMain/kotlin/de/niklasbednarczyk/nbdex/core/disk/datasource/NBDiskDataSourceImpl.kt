package de.niklasbednarczyk.nbdex.core.disk.datasource

import androidx.datastore.core.DataStore
import com.squareup.wire.Message
import de.niklasbednarczyk.nbdex.core.disk.mapper.NBDiskMessageMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.named

abstract class NBDiskDataSourceImpl<Disk : Message<*, *>> : KoinComponent {

    protected abstract val dataStoreName: String

    protected val dataStore: DataStore<Disk> by inject(named(dataStoreName))

    fun <Model : Any> getModelFlow(
        mapper: NBDiskMessageMapper<Model, Disk>,
    ): Flow<Model> {
        return dataStore
            .data
            .map(mapper::diskToModel)
    }

}