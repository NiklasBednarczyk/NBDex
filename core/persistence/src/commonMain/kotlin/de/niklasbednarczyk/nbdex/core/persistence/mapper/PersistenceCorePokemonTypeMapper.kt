package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonType
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonType

object PersistenceCorePokemonTypeMapper : NBPersistenceCoreMapper<CorePokemonType, PersistenceCorePokemonType> {

    override fun modelToPersistence(model: CorePokemonType): PersistenceCorePokemonType {
        return PersistenceCorePokemonType(
            id = model.id,
            pokemonId = model.pokemonId,
            slot = model.slot,
            typeId = model.typeId,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCorePokemonType): CorePokemonType {
        return CorePokemonType(
            id = persistence.id,
            pokemonId = persistence.pokemonId,
            slot = persistence.slot,
            typeId = persistence.typeId,
        )
    }

}