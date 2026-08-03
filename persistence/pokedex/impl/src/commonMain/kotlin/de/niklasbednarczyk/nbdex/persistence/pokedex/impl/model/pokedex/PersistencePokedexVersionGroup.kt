package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersion
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionGroup

data class PersistencePokedexVersionGroup(
    @Embedded
    val versionGroup: PersistenceCoreVersionGroup,
    @Relation(
        entity = PersistenceCoreVersion::class,
        parentColumns = ["id"],
        entityColumns = ["versionGroupId"],
    )
    val versions: List<PersistencePokedexVersion>,
)
