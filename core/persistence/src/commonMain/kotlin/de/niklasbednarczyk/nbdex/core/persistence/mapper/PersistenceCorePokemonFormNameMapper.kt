package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonFormName
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonFormName

object PersistenceCorePokemonFormNameMapper :
    NBPersistenceCoreInputMapper<CorePokemonFormName, PersistenceCorePokemonFormName, CoreLanguageId> {

    override fun modelToPersistence(model: CorePokemonFormName): PersistenceCorePokemonFormName {
        return PersistenceCorePokemonFormName(
            id = model.id,
            languageId = model.languageId,
            name = model.name,
            pokemonFormId = model.pokemonFormId,
            pokemonName = model.pokemonName,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCorePokemonFormName): CorePokemonFormName {
        return CorePokemonFormName(
            id = persistence.id,
            languageId = persistence.languageId,
            name = persistence.name,
            pokemonFormId = persistence.pokemonFormId,
            pokemonName = persistence.pokemonName,
        )
    }

    override fun persistenceToInput(persistence: PersistenceCorePokemonFormName): CoreLanguageId? {
        return persistence.languageId
    }

}