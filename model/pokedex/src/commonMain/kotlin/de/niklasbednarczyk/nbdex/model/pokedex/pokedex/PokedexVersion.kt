package de.niklasbednarczyk.nbdex.model.pokedex.pokedex

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersion
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.versiongroup.CoreDisplayModelVersionGroupVersion

data class PokedexVersion(
    val version: CoreVersion,
    override val versionName: CoreVersionName,
) : CoreDisplayModelVersionGroupVersion {
    companion object {
        fun example(
            version: CoreVersion = CoreVersion.example(),
            versionName: CoreVersionName = CoreVersionName.example(),
        ): PokedexVersion {
            return PokedexVersion(
                version = version,
                versionName = versionName,
            )
        }
    }
}
