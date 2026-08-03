package de.niklasbednarczyk.nbdex.model.pokedex.pokemonform

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonType
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.type.CoreDisplayModelType

data class PokedexPokemonType(
    val pokemonType: CorePokemonType,
    override val typeName: CoreTypeName,
) : CoreDisplayModelType {

    companion object {

        fun example(
            pokemonType: CorePokemonType = CorePokemonType.example(),
            typeName: CoreTypeName = CoreTypeName.example(),
        ): PokedexPokemonType {
            return PokedexPokemonType(
                pokemonType = pokemonType,
                typeName = typeName,
            )
        }

    }

}