package de.niklasbednarczyk.nbdex.model.pokedex.preferences

import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId

data class PokedexPreferences(
    val pokedexId: CorePokedexId,
    val generationId: CoreGenerationId?,
    val typeId: CoreTypeId?,
    val categories: Set<PokedexPreferencesCategory>,
)