package de.niklasbednarczyk.nbdex.core.disk.mapper

import com.squareup.wire.Message

interface DexDiskMessageMapper<Model : Any, Disk : Message<*, *>> {
    fun diskToModel(
        disk: Disk,
    ): Model

    fun diskToModelNullable(
        disk: Disk?,
    ): Model? {
        return disk?.let(::diskToModel)
    }
}
