package de.niklasbednarczyk.nbdex.model.pokedex.type

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreType
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.type.CoreDisplayModelType

data class PokedexType(
    val type: CoreType,
    override val typeName: CoreTypeName,
) : CoreDisplayModelType {

    companion object {

        fun example(
            type: CoreType = CoreType.example(),
            typeName: CoreTypeName = CoreTypeName.example(),
        ): PokedexType {
            return PokedexType(
                type = type,
                typeName = typeName,
            )
        }

    }

}