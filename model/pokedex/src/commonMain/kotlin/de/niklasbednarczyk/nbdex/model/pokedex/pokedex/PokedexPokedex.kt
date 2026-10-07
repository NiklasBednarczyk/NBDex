package de.niklasbednarczyk.nbdex.model.pokedex.pokedex

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedex
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexDescription
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexName
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

data class PokedexPokedex(
    val pokedex: CorePokedex,
    val pokedexDescription: CorePokedexDescription,
    val pokedexName: CorePokedexName,
    val region: PokedexRegion?,
    val versionGroups: ImmutableList<PokedexVersionGroup>,
) {
    companion object {
        fun example(
            pokedex: CorePokedex = CorePokedex.example(),
            pokedexDescription: CorePokedexDescription = CorePokedexDescription.example(),
            pokedexName: CorePokedexName = CorePokedexName.example(),
            region: PokedexRegion? = PokedexRegion.example(),
            versionGroups: ImmutableList<PokedexVersionGroup> = persistentListOf(PokedexVersionGroup.example()),
        ): PokedexPokedex {
            return PokedexPokedex(
                pokedex = pokedex,
                pokedexDescription = pokedexDescription,
                pokedexName = pokedexName,
                region = region,
                versionGroups = versionGroups,
            )
        }
    }
}
