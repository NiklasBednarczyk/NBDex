package de.niklasbednarczyk.nbdex.core.disk.serializer

import androidx.datastore.core.okio.OkioSerializer
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import okio.BufferedSink
import okio.BufferedSource

interface NBSerializer<Disk : Message<*, *>> : OkioSerializer<Disk> {

    val adapter: ProtoAdapter<Disk>

    override suspend fun readFrom(source: BufferedSource): Disk {
        return adapter.decode(source)
    }

    override suspend fun writeTo(t: Disk, sink: BufferedSink) {
        sink.write(t.encode())
    }

}