package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionId

data class CoreVersion(
    val id: CoreVersionId,
    val name: String,
    val versionGroupId: CoreVersionGroupId?,
) {

    companion object {

        fun example(
            id: CoreVersionId = CoreVersionId.example(),
            name: String = "Version Name",
            versionGroupId: CoreVersionGroupId? = CoreVersionGroupId.example(),
        ): CoreVersion {
            return CoreVersion(
                id = id,
                name = name,
                versionGroupId = versionGroupId,
            )
        }

    }

}