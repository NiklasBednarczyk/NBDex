package de.niklasbednarczyk.nbdex.core.disk.datastore

import android.content.Context
import androidx.datastore.core.Storage
import androidx.datastore.core.okio.OkioStorage
import com.squareup.wire.Message
import de.niklasbednarczyk.nbdex.core.disk.serializer.NBSerializer
import okio.FileSystem
import okio.Path.Companion.toPath
import org.koin.core.scope.Scope

internal actual fun <Disk : Message<*, *>> createStorage(
    scope: Scope,
    dataStoreFileName: String,
    serializer: NBSerializer<Disk>,
): Storage<Disk> {
    val context = scope.get<Context>()

    return OkioStorage(
        fileSystem = FileSystem.SYSTEM,
        serializer = serializer,
        producePath = {
            val dataStoreFile = context.filesDir.resolve(dataStoreFileName)
            dataStoreFile.absolutePath.toPath()
        }
    )
}