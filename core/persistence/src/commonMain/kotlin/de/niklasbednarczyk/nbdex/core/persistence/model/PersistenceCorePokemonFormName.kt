package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormNameId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEMON_FORM_NAME,
)
data class PersistenceCorePokemonFormName(
    @PrimaryKey
    val id: CorePokemonFormNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val pokemonFormId: CorePokemonFormId?,
    val pokemonName: String,
)
