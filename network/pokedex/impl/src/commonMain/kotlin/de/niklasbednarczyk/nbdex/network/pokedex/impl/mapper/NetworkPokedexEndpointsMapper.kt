package de.niklasbednarczyk.nbdex.network.pokedex.impl.mapper

import de.niklasbednarczyk.nbdex.core.network.mapper.NBNetworkMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreGenerationMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreGenerationNameMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokedexDescriptionMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokedexMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokedexNameMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokedexVersionGroupMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokemonDexNumberMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokemonFormMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokemonFormNameMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokemonMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokemonSpeciesMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokemonSpeciesNameMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCorePokemonTypeMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreRegionMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreRegionNameMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreTypeMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreTypeNameMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreVersionGroupMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreVersionMapper
import de.niklasbednarczyk.nbdex.core.network.mapper.NetworkCoreVersionNameMapper
import de.niklasbednarczyk.nbdex.model.pokedex.endpoints.PokedexEndpoints
import de.niklasbednarczyk.nbdex.network.pokedex.impl.apollo.NetworkPokedexEndpointsQuery

internal object NetworkPokedexEndpointsMapper :
    NBNetworkMapper<PokedexEndpoints, NetworkPokedexEndpointsQuery.Data> {

    override fun networkToModel(network: NetworkPokedexEndpointsQuery.Data): PokedexEndpoints {
        return PokedexEndpoints(
            generations = network.generations.map { generation ->
                NetworkCoreGenerationMapper.networkToModel(
                    network = generation.networkCoreGeneration,
                )
            },
            generationNames = network.generationNames.map { generationName ->
                NetworkCoreGenerationNameMapper.networkToModel(
                    network = generationName.networkCoreGenerationName,
                )
            },
            pokedexes = network.pokedexes.map { pokedex ->
                NetworkCorePokedexMapper.networkToModel(
                    network = pokedex.networkCorePokedex,
                )
            },
            pokedexDescriptions = network.pokedexDescriptions.map { pokedexDescription ->
                NetworkCorePokedexDescriptionMapper.networkToModel(
                    network = pokedexDescription.networkCorePokedexDescription,
                )
            },
            pokedexNames = network.pokedexNames.map { pokedexNames ->
                NetworkCorePokedexNameMapper.networkToModel(
                    network = pokedexNames.networkCorePokedexName,
                )
            },
            pokedexVersionGroups = network.pokedexVersionGroups.map { pokedexVersionGroup ->
                NetworkCorePokedexVersionGroupMapper.networkToModel(
                    network = pokedexVersionGroup.networkCorePokedexVersionGroup,
                )
            },
            pokemon = network.pokemon.map { pokemon ->
                NetworkCorePokemonMapper.networkToModel(
                    network = pokemon.networkCorePokemon,
                )
            },
            pokemonDexNumbers = network.pokemonDexNumbers.map { pokemonDexNumber ->
                NetworkCorePokemonDexNumberMapper.networkToModel(
                    network = pokemonDexNumber.networkCorePokemonDexNumber,
                )
            },
            pokemonForms = network.pokemonForms.map { pokemonForm ->
                NetworkCorePokemonFormMapper.networkToModel(
                    network = pokemonForm.networkCorePokemonForm,
                )
            },
            pokemonFormNames = network.pokemonFormNames.map { pokemonFormName ->
                NetworkCorePokemonFormNameMapper.networkToModel(
                    network = pokemonFormName.networkCorePokemonFormName,
                )
            },
            pokemonSpecies = network.pokemonSpecies.map { pokemonSpecies ->
                NetworkCorePokemonSpeciesMapper.networkToModel(
                    network = pokemonSpecies.networkCorePokemonSpecies,
                )
            },
            pokemonSpeciesNames = network.pokemonSpeciesNames.map { pokemonSpeciesName ->
                NetworkCorePokemonSpeciesNameMapper.networkToModel(
                    network = pokemonSpeciesName.networkCorePokemonSpeciesName,
                )
            },
            pokemonTypes = network.pokemonTypes.map { pokemonType ->
                NetworkCorePokemonTypeMapper.networkToModel(
                    network = pokemonType.networkCorePokemonType,
                )
            },
            regions = network.regions.map { region ->
                NetworkCoreRegionMapper.networkToModel(
                    network = region.networkCoreRegion,
                )
            },
            regionNames = network.regionNames.map { regionName ->
                NetworkCoreRegionNameMapper.networkToModel(
                    network = regionName.networkCoreRegionName,
                )
            },
            types = network.types.map { type ->
                NetworkCoreTypeMapper.networkToModel(
                    network = type.networkCoreType,
                )
            },
            typeNames = network.typeNames.map { typeName ->
                NetworkCoreTypeNameMapper.networkToModel(
                    network = typeName.networkCoreTypeName,
                )
            },
            versions = network.versions.map { version ->
                NetworkCoreVersionMapper.networkToModel(
                    network = version.networkCoreVersion,
                )
            },
            versionGroups = network.versionGroups.map { versionGroup ->
                NetworkCoreVersionGroupMapper.networkToModel(
                    network = versionGroup.networkCoreVersionGroup,
                )
            },
            versionNames = network.versionNames.map { versionName ->
                NetworkCoreVersionNameMapper.networkToModel(
                    network = versionName.networkCoreVersionName,
                )
            },
        )
    }

}