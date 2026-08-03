package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonType
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreTypeName

data class PersistencePokedexPokemonType(
    @Embedded
    val pokemonType: PersistenceCorePokemonType,
    @Relation(
        parentColumns = ["typeId"],
        entityColumns = ["typeId"],
    )
    val typeNames: List<PersistenceCoreTypeName>,
)
