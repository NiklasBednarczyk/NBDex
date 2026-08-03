package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreRegionId
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName

@Entity(
    tableName = NBTableName.POKEDEX,
)
data class PersistenceCorePokedex(
    @PrimaryKey
    val id: CorePokedexId,
    val isMainSeries: Boolean,
    val name: String,
    val regionId: CoreRegionId?,
)
