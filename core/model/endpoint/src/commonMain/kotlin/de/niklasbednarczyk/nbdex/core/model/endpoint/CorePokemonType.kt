package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonTypeId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId

data class CorePokemonType(
    val id: CorePokemonTypeId,
    val pokemonId: CorePokemonId?,
    val slot: Int,
    val typeId: CoreTypeId?,
) {

    companion object {

        fun example(
            id: CorePokemonTypeId = CorePokemonTypeId.example(),
            pokemonId: CorePokemonId? = CorePokemonId.example(),
            slot: Int = -1,
            typeId: CoreTypeId? = CoreTypeId.example(),
        ): CorePokemonType {
            return CorePokemonType(
                id = id,
                pokemonId = pokemonId,
                slot = slot,
                typeId = typeId,
            )
        }

    }

}