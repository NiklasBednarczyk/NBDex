package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId

data class CoreGeneration(
    val id: CoreGenerationId,
    val name: String,
    val regionId: CoreRegionId?,
) {

    companion object {

        fun example(
            id: CoreGenerationId = CoreGenerationId.example(),
            name: String = "Generation Name",
            regionId: CoreRegionId? = CoreRegionId.example(),
        ): CoreGeneration {
            return CoreGeneration(
                id = id,
                name = name,
                regionId = regionId,
            )
        }

    }

}