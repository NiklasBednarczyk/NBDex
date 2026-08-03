package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEMON_FORM,
)
data class PersistenceCorePokemonForm(
    @PrimaryKey
    val id: CorePokemonFormId,
    val formName: String,
    val formOrder: Int?,
    val isBattleOnly: Boolean,
    val isDefault: Boolean,
    val isMega: Boolean,
    val name: String,
    val order: Int?,
    val pokemonId: CorePokemonId?,
    val versionGroupId: CoreVersionGroupId?,
)
