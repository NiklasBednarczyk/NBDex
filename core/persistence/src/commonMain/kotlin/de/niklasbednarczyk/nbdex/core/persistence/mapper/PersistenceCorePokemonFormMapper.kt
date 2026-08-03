package de.niklasbednarczyk.nbdex.core.persistence.mapper

import de.niklasbednarczyk.nbdex.core.model.endpoint.CorePokemonForm
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonForm

object PersistenceCorePokemonFormMapper : NBPersistenceCoreMapper<CorePokemonForm, PersistenceCorePokemonForm> {

    override fun modelToPersistence(model: CorePokemonForm): PersistenceCorePokemonForm {
        return PersistenceCorePokemonForm(
            id = model.id,
            formName = model.formName,
            formOrder = model.formOrder,
            isBattleOnly = model.isBattleOnly,
            isDefault = model.isDefault,
            isMega = model.isMega,
            name = model.name,
            order = model.order,
            pokemonId = model.pokemonId,
            versionGroupId = model.versionGroupId,
        )
    }

    override fun persistenceToModel(persistence: PersistenceCorePokemonForm): CorePokemonForm {
        return CorePokemonForm(
            id = persistence.id,
            formName = persistence.formName,
            formOrder = persistence.formOrder,
            isBattleOnly = persistence.isBattleOnly,
            isDefault = persistence.isDefault,
            isMega = persistence.isMega,
            name = persistence.name,
            order = persistence.order,
            pokemonId = persistence.pokemonId,
            versionGroupId = persistence.versionGroupId,
        )
    }

}