package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexDescriptionId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEDEX_DESCRIPTION,
)
data class PersistenceCorePokedexDescription(
    @PrimaryKey
    val id: CorePokedexDescriptionId,
    val description: String,
    val languageId: CoreLanguageId?,
    val pokedexId: CorePokedexId?,
)
