package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemon
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonSpecies
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonType

data class PersistencePokedexPokemon(
    @Embedded
    val pokemon: PersistenceCorePokemon,
    @Relation(
        entity = PersistenceCorePokemonSpecies::class,
        parentColumns = ["pokemonSpeciesId"],
        entityColumns = ["id"],
    )
    val pokemonSpecies: PersistencePokedexPokemonSpecies?,
    @Relation(
        entity = PersistenceCorePokemonType::class,
        parentColumns = ["id"],
        entityColumns = ["pokemonId"],
    )
    val pokemonTypes: List<PersistencePokedexPokemonType>,
)
