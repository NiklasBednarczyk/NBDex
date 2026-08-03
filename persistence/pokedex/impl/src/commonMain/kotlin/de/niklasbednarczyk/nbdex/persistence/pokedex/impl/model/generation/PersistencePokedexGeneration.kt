package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.generation

import androidx.room3.Embedded
import androidx.room3.Relation
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreGeneration
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreGenerationName

data class PersistencePokedexGeneration(
    @Embedded
    val generation: PersistenceCoreGeneration,
    @Relation(
        parentColumns = ["id"],
        entityColumns = ["generationId"],
    )
    val generationNames: List<PersistenceCoreGenerationName>,
)
