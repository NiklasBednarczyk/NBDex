package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.endpoint.values.CorePokedexNumber
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonDexNumberId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEMON_DEX_NUMBER,
)
data class PersistenceCorePokemonDexNumber(
    @PrimaryKey
    val id: CorePokemonDexNumberId,
    val pokedexId: CorePokedexId?,
    val pokedexNumber: CorePokedexNumber,
    val pokemonSpeciesId: CorePokemonSpeciesId?,
)
