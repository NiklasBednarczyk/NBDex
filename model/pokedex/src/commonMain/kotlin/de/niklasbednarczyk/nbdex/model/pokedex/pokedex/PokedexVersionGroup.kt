package de.niklasbednarczyk.nbdex.model.pokedex.pokedex

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionGroup
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.versiongroup.CoreDisplayModelVersionGroup

data class PokedexVersionGroup(
    override val versionGroup: CoreVersionGroup,
    override val versions: List<PokedexVersion>,
) : CoreDisplayModelVersionGroup {

    companion object {

        fun example(
            versionGroup: CoreVersionGroup = CoreVersionGroup.example(),
            versions: List<PokedexVersion> = listOf(PokedexVersion.example()),
        ): PokedexVersionGroup {
            return PokedexVersionGroup(
                versionGroup = versionGroup,
                versions = versions,
            )
        }

    }

}