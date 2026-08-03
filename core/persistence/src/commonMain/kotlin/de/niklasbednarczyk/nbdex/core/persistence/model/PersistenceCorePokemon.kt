package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEMON,
)
data class PersistenceCorePokemon(
    @PrimaryKey
    val id: CorePokemonId,
    val baseExperience: Int?,
    val height: Int?,
    val isDefault: Boolean,
    val name: String,
    val order: Int?,
    val pokemonSpeciesId: CorePokemonSpeciesId?,
    val weight: Int?,
)
