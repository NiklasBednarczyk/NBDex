package de.niklasbednarczyk.nbdex.core.disk.datastore

import androidx.datastore.core.Storage
import androidx.datastore.core.okio.OkioStorage
import com.squareup.wire.Message
import de.niklasbednarczyk.nbdex.core.common.file.getFilePath
import de.niklasbednarczyk.nbdex.core.disk.serializer.DexSerializer
import okio.FileSystem
import okio.Path.Companion.toPath
import org.koin.core.scope.Scope

internal actual fun <Disk : Message<*, *>> createStorage(
    scope: Scope,
    dataStoreFileName: String,
    serializer: DexSerializer<Disk>,
): Storage<Disk> {
    return OkioStorage(
        fileSystem = FileSystem.SYSTEM,
        serializer = serializer,
        producePath = {
            val dataStoreFilePath = getFilePath(dataStoreFileName)
            dataStoreFilePath.toPath()
        },
    )
}
