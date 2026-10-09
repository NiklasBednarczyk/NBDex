package de.niklasbednarczyk.nbdex.core.disk.mapper

import com.squareup.wire.WireEnum

interface NBDiskEnumMapper<Model : Any, Disk : WireEnum> {
    fun modelToDisk(
        model: Model,
    ): Disk

    fun diskToModel(
        disk: Disk,
    ): Model

    fun diskToModelNullable(
        disk: Disk?,
    ): Model? {
        return disk?.let(::diskToModel)
    }
}
