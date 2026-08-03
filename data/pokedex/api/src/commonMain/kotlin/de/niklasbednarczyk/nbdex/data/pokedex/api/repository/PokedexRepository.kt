package de.niklasbednarczyk.nbdex.data.pokedex.api.repository

import de.niklasbednarczyk.nbdex.core.common.result.NBResult
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.model.pokedex.PokedexData
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import kotlinx.coroutines.flow.Flow

interface PokedexRepository {

    fun getResult(
        languageId: CoreLanguageId,
    ): Flow<NBResult<PokedexData>>

    suspend fun updatePreferencesGenerationId(
        generationId: CoreGenerationId?,
    )

    suspend fun updatePreferencesPokedexId(
        pokedexId: CorePokedexId,
    )

    suspend fun updatePreferencesTypeId(
        typeId: CoreTypeId?,
    )

    suspend fun updatePreferencesCategory(
        category: PokedexPreferencesCategory,
    )

}