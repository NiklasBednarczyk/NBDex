package de.niklasbednarczyk.nbdex.model.pokedex

import de.niklasbednarczyk.nbdex.model.pokedex.generation.PokedexGeneration
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexPokedex
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexRegion
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonForm
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.type.PokedexType

data class PokedexData(
    val generations: List<PokedexGeneration>,
    val pokedexesMap: Map<PokedexRegion?, List<PokedexPokedex>>,
    val pokemonForms: List<PokedexPokemonForm>,
    val preferences: PokedexPreferences,
    val types: List<PokedexType>,
)