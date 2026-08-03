package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId

data class CoreRegion(
    val id: CoreRegionId,
    val name: String,
) {

    companion object {

        fun example(
            id: CoreRegionId = CoreRegionId.example(),
            name: String = "Region Name",
        ): CoreRegion {
            return CoreRegion(
                id = id,
                name = name,
            )
        }

    }

}