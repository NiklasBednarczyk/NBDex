package de.niklasbednarczyk.nbdex.core.disk.datastore

import androidx.datastore.core.Storage
import androidx.datastore.core.okio.WebLocalStorage
import com.squareup.wire.Message
import de.niklasbednarczyk.nbdex.core.disk.serializer.DexSerializer
import org.koin.core.scope.Scope

internal actual fun <Disk : Message<*, *>> createStorage(
    scope: Scope,
    dataStoreFileName: String,
    serializer: DexSerializer<Disk>,
): Storage<Disk> {
    return WebLocalStorage(
        serializer = serializer,
        name = dataStoreFileName,
    )
}
