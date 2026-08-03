package de.niklasbednarczyk.nbdex.model.pokedex.endpoints

import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGeneration
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreGenerationName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedex
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexDescription
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokedexVersionGroup
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemon
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonDexNumber
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonForm
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonFormName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonSpecies
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonSpeciesName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonType
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreRegion
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreRegionName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreType
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersion
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionGroup
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionName

data class PokedexEndpoints(
    val generations: List<CoreGeneration>,
    val generationNames: List<CoreGenerationName>,
    val pokedexes: List<CorePokedex>,
    val pokedexDescriptions: List<CorePokedexDescription>,
    val pokedexNames: List<CorePokedexName>,
    val pokedexVersionGroups: List<CorePokedexVersionGroup>,
    val pokemon: List<CorePokemon>,
    val pokemonDexNumbers: List<CorePokemonDexNumber>,
    val pokemonForms: List<CorePokemonForm>,
    val pokemonFormNames: List<CorePokemonFormName>,
    val pokemonSpecies: List<CorePokemonSpecies>,
    val pokemonSpeciesNames: List<CorePokemonSpeciesName>,
    val pokemonTypes: List<CorePokemonType>,
    val regions: List<CoreRegion>,
    val regionNames: List<CoreRegionName>,
    val types: List<CoreType>,
    val typeNames: List<CoreTypeName>,
    val versions: List<CoreVersion>,
    val versionGroups: List<CoreVersionGroup>,
    val versionNames: List<CoreVersionName>,
)
