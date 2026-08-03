package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemon
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonForm
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonFormName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionGroup

data class PersistencePokedexPokemonForm(
    @Embedded
    val pokemonForm: PersistenceCorePokemonForm,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["pokemonFormId"],
    )
    val pokemonFormNames: List<PersistenceCorePokemonFormName>,
    @Relation(
        parentColumns = ["versionGroupId"],
        entityColumns = ["id"],
    )
    val versionGroup: PersistenceCoreVersionGroup?,
    @Relation(
        entity = PersistenceCorePokemon::class,
        parentColumns = ["pokemonId"],
        entityColumns = ["id"],
    )
    val pokemon: PersistencePokedexPokemon?,
)
