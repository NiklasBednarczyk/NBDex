package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId

data class CorePokedex(
    val id: CorePokedexId,
    val isMainSeries: Boolean,
    val name: String,
    val regionId: CoreRegionId?,
) {

    companion object {

        fun example(
            id: CorePokedexId = CorePokedexId.example(),
            isMainSeries: Boolean = false,
            name: String = "Pokedex Name",
            regionId: CoreRegionId? = CoreRegionId.example(),
        ): CorePokedex {
            return CorePokedex(
                id = id,
                isMainSeries = isMainSeries,
                name = name,
                regionId = regionId,
            )
        }

    }

}
