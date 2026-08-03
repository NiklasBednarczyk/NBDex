package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreRegion
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreRegionName

data class PersistencePokedexRegion(
    @Embedded
    val region: PersistenceCoreRegion,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["regionId"],
    )
    val regionNames: List<PersistenceCoreRegionName>,
)
