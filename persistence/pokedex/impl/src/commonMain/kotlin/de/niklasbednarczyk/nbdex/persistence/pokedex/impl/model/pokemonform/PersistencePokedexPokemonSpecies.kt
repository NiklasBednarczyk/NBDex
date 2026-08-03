package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonDexNumber
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonSpecies
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonSpeciesName

data class PersistencePokedexPokemonSpecies(
    @Embedded
    val pokemonSpecies: PersistenceCorePokemonSpecies,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["pokemonSpeciesId"]
    )
    val pokemonDexNumbers: List<PersistenceCorePokemonDexNumber>,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["pokemonSpeciesId"],
    )
    val pokemonSpeciesNames: List<PersistenceCorePokemonSpeciesName>,
)
