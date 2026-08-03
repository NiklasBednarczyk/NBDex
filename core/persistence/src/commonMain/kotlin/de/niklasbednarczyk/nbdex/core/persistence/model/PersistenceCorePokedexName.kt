package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexNameId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEDEX_NAME,
)
data class PersistenceCorePokedexName(
    @PrimaryKey
    val id: CorePokedexNameId,
    val languageId: CoreLanguageId?,
    val name: String,
    val pokedexId: CorePokedexId?,
)
