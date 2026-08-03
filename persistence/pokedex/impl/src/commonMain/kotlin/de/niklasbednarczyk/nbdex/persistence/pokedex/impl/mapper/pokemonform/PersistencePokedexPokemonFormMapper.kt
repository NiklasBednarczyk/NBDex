package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.mapper.pokemonform

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.persistence.mapper.NBPersistenceFeatureMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonFormMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCorePokemonFormNameMapper
import de.niklasbednarczyk.nbdex.core.persistence.mapper.PersistenceCoreVersionGroupMapper
import de.niklasbednarczyk.nbdex.model.pokedex.pokemonform.PokedexPokemonForm
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform.PersistencePokedexPokemonForm

internal object PersistencePokedexPokemonFormMapper :
    NBPersistenceFeatureMapper<PokedexPokemonForm, PersistencePokedexPokemonForm, Pair<CoreLanguageId, CorePokedexId>> {

    override fun persistenceToModel(
        persistence: PersistencePokedexPokemonForm,
        input: Pair<CoreLanguageId, CorePokedexId>
    ): PokedexPokemonForm {
        val (languageId) = input
        return PokedexPokemonForm(
            pokemonForm = PersistenceCorePokemonFormMapper.persistenceToModel(
                persistence = persistence.pokemonForm,
            ),
            pokemonFormName = PersistenceCorePokemonFormNameMapper.persistenceListToModelNullable(
                persistenceList = persistence.pokemonFormNames,
                input = languageId,
            ),
            versionGroup = PersistenceCoreVersionGroupMapper.persistenceToModelNullable(
                persistence = persistence.versionGroup,
            ),
            pokemon = PersistencePokedexPokemonMapper.persistenceToModelNullable(
                persistence = persistence.pokemon,
                input = input,
            ),
        )
    }

}