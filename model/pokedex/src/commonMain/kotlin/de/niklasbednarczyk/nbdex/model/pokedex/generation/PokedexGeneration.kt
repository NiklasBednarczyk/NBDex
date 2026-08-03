package de.niklasbednarczyk.nbdex.model.pokedex.generation

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGeneration
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGenerationName

data class PokedexGeneration(
    val generation: CoreGeneration,
    val generationName: CoreGenerationName,
) {

    companion object {

        fun example(
            generation: CoreGeneration = CoreGeneration.example(),
            generationName: CoreGenerationName = CoreGenerationName.example(),
        ): PokedexGeneration {
            return PokedexGeneration(
                generation = generation,
                generationName = generationName,
            )
        }

    }

}