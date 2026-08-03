package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreMoveDamageClassId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId

data class CoreType(
    val id: CoreTypeId,
    val generationId: CoreGenerationId?,
    val moveDamageClassId: CoreMoveDamageClassId?,
    val name: String,
) {

    companion object {

        fun example(
            id: CoreTypeId = CoreTypeId.example(),
            generationId: CoreGenerationId? = CoreGenerationId.example(),
            moveDamageClassId: CoreMoveDamageClassId? = CoreMoveDamageClassId.example(),
            name: String = "Type Name",
        ): CoreType {
            return CoreType(
                id = id,
                generationId = generationId,
                moveDamageClassId = moveDamageClassId,
                name = name,
            )
        }

    }

}
