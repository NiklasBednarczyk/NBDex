package de.niklasbednarczyk.nbdex.model.pokedex.pokedex

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreRegion
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreRegionName

data class PokedexRegion(
    val region: CoreRegion,
    val regionName: CoreRegionName,
) {
    companion object {
        fun example(
            region: CoreRegion = CoreRegion.example(),
            regionName: CoreRegionName = CoreRegionName.example(),
        ): PokedexRegion {
            return PokedexRegion(
                region = region,
                regionName = regionName,
            )
        }
    }
}
