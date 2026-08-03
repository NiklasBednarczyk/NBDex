package de.niklasbednarczyk.nbdex.core.disk.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import androidx.datastore.core.Storage
import com.squareup.wire.Message
import de.niklasbednarczyk.nbdex.core.disk.serializer.NBSerializer
import org.koin.core.scope.Scope

fun <Disk : Message<*, *>> createDataStore(
    scope: Scope,
    dataStoreName: String,
    serializer: NBSerializer<Disk>,
): DataStore<Disk> {
    return DataStoreFactory.create(
        storage = createStorage(
            scope = scope,
            dataStoreFileName = getDataStoreFileName(dataStoreName),
            serializer = serializer,
        )
    )
}

internal expect fun <Disk : Message<*, *>> createStorage(
    scope: Scope,
    dataStoreFileName: String,
    serializer: NBSerializer<Disk>,
): Storage<Disk>

private fun getDataStoreFileName(dataStoreName: String): String {
    return "nbdex_datastore_${dataStoreName}.pb"
}
