package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId

data class CorePokemon(
    val id: CorePokemonId,
    val baseExperience: Int?,
    val height: Int?,
    val isDefault: Boolean,
    val name: String,
    val order: Int?,
    val pokemonSpeciesId: CorePokemonSpeciesId?,
    val weight: Int?,
) {

    companion object {

        fun example(
            id: CorePokemonId = CorePokemonId.example(),
            baseExperience: Int? = -1,
            height: Int? = -1,
            isDefault: Boolean = false,
            name: String = "Pokemon Name",
            order: Int? = -1,
            pokemonSpeciesId: CorePokemonSpeciesId? = CorePokemonSpeciesId.example(),
            weight: Int? = -1,
        ): CorePokemon {
            return CorePokemon(
                id = id,
                baseExperience = baseExperience,
                height = height,
                isDefault = isDefault,
                name = name,
                order = order,
                pokemonSpeciesId = pokemonSpeciesId,
                weight = weight,
            )
        }

    }

}