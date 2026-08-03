package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.type

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreType
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreTypeName

data class PersistencePokedexType(
    @Embedded
    val type: PersistenceCoreType,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["typeId"],
    )
    val typeNames: List<PersistenceCoreTypeName>,
)
