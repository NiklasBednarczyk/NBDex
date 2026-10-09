package de.niklasbednarczyk.nbdex.model.pokedex

import de.niklasbednarczyk.nbdex.model.pokedex.generation.PokedexGeneration
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexPokedex
import de.niklasbednarczyk.nbdex.model.pokedex.pokedex.PokedexRegion
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonForm
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.type.PokedexType
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap

data class PokedexData(
    val generations: ImmutableList<PokedexGeneration>,
    val pokedexesMap: ImmutableMap<PokedexRegion?, List<PokedexPokedex>>,
    val pokemonForms: ImmutableList<PokedexPokemonForm>,
    val preferences: PokedexPreferences,
    val types: ImmutableList<PokedexType>,
)
