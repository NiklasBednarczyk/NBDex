package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.Index
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexVersionGroupId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEDEX_VERSION_GROUP,
    indices = [
        Index("pokedexId"),
        Index("versionGroupId"),
    ],
)
data class PersistenceCorePokedexVersionGroup(
    @PrimaryKey
    val id: CorePokedexVersionGroupId,
    val pokedexId: CorePokedexId?,
    val versionGroupId: CoreVersionGroupId?,
)
