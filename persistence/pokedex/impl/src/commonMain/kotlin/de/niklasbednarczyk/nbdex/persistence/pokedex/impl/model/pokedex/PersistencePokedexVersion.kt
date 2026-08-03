package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersion
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionName

data class PersistencePokedexVersion(
    @Embedded
    val version: PersistenceCoreVersion,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["versionId"],
    )
    val versionNames: List<PersistenceCoreVersionName>,
)
