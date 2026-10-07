package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexVersionGroupId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId

data class CorePokedexVersionGroup(
    val id: CorePokedexVersionGroupId,
    val pokedexId: CorePokedexId?,
    val versionGroupId: CoreVersionGroupId?,
) {
    companion object {
        fun example(
            id: CorePokedexVersionGroupId = CorePokedexVersionGroupId.example(),
            pokedexId: CorePokedexId? = CorePokedexId.example(),
            versionGroupId: CoreVersionGroupId? = CoreVersionGroupId.example(),
        ): CorePokedexVersionGroup {
            return CorePokedexVersionGroup(
                id = id,
                pokedexId = pokedexId,
                versionGroupId = versionGroupId,
            )
        }
    }
}
