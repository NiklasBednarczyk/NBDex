package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonDexNumber
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonDexNumber

object PersistenceCorePokemonDexNumberMapper :
    NBPersistenceCoreInputMapper<CorePokemonDexNumber, PersistenceCorePokemonDexNumber, CorePokedexId> {

    override fun modelToPersistence(model: CorePokemonDexNumber): PersistenceCorePokemonDexNumber {
        return PersistenceCorePokemonDexNumber(
            id = model.id,
            pokedexId = model.pokedexId,
            pokedexNumber = model.pokedexNumber,
            pokemonSpeciesId = model.pokemonSpeciesId,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCorePokemonDexNumber): CorePokemonDexNumber {
        return CorePokemonDexNumber(
            id = persistence.id,
            pokedexId = persistence.pokedexId,
            pokedexNumber = persistence.pokedexNumber,
            pokemonSpeciesId = persistence.pokemonSpeciesId,
        )
    }

    override fun persistenceToInput(persistence: PersistenceCorePokemonDexNumber): CorePokedexId? {
        return persistence.pokedexId
    }

}