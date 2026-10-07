package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokedex

import androidx.room3.Embedded
import androidx.room3.Junction
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedex
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexDescription
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexVersionGroup
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreRegion
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionGroup

data class PersistencePokedexPokedex(
    @Embedded
    val pokedex: PersistenceCorePokedex,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["pokedexId"],
    )
    val pokedexDescriptions: List<PersistenceCorePokedexDescription>,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["pokedexId"],
    )
    val pokedexNames: List<PersistenceCorePokedexName>,
    @Relation(
        entity = PersistenceCoreRegion::class,
        parentColumns = ["regionId"],
        entityColumns = ["id"],
    )
    val region: PersistencePokedexRegion?,
    @Relation(
        entity = PersistenceCoreVersionGroup::class,
        parentColumns = ["id"],
        entityColumns = ["id"],
        associateBy = Junction(
            value = PersistenceCorePokedexVersionGroup::class,
            parentColumns = ["pokedexId"],
            entityColumns = ["versionGroupId"],
        ),
    )
    val versionGroups: List<PersistencePokedexVersionGroup>,
)
