package de.niklasbednarczyk.nbdex.disk.pokedex.api.datasource

import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import kotlinx.coroutines.flow.Flow

interface PokedexDiskDataSource {

    fun getPreferences(): Flow<PokedexPreferences>

    suspend fun updateGenerationId(
        generationId: CoreGenerationId?,
    )

    suspend fun updatePokedexId(
        pokedexId: CorePokedexId,
    )

    suspend fun updateTypeId(
        typeId: CoreTypeId?,
    )

    suspend fun updateCategory(
        category: PokedexPreferencesCategory,
    )

}