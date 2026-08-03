package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonSpeciesNameId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEMON_SPECIES_NAME,
)
data class PersistenceCorePokemonSpeciesName(
    @PrimaryKey
    val id: CorePokemonSpeciesNameId,
    val genus: String,
    val languageId: CoreLanguageId?,
    val name: String,
    val pokemonSpeciesId: CorePokemonSpeciesId?,
)
