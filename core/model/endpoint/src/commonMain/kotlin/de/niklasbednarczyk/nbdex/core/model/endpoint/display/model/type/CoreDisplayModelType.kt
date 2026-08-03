package de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.type

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.NBDisplayModel
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeType
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId

interface CoreDisplayModelType : NBDisplayModel<CoreTypeId, CoreDisplayTypeType> {

    override val id: CoreTypeId?
        get() = typeName.typeId

    override val displayType: CoreDisplayTypeType?
        get() = CoreDisplayTypeType.from(id)

    val typeName: CoreTypeName

    companion object {

        fun example(
            typeName: CoreTypeName = CoreTypeName.example(),
        ): CoreDisplayModelType {
            return object : CoreDisplayModelType {
                override val typeName: CoreTypeName
                    get() = typeName
            }
        }

    }

}