package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId

data class CoreVersionGroup(
    val id: CoreVersionGroupId,
    val generationId: CoreGenerationId?,
    val name: String,
    val order: Int?,
) {

    companion object {

        fun example(
            id: CoreVersionGroupId = CoreVersionGroupId.example(),
            generationId: CoreGenerationId? = CoreGenerationId.example(),
            name: String = "VersionGroup Name",
            order: Int? = -1,
        ): CoreVersionGroup {
            return CoreVersionGroup(
                id = id,
                generationId = generationId,
                name = name,
                order = order,
            )
        }

    }

}