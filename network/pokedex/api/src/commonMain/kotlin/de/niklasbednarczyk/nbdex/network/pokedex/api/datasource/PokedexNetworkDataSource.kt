package de.niklasbednarczyk.nbdex.network.pokedex.api.datasource

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.model.pokedex.endpoints.PokedexEndpoints

interface PokedexNetworkDataSource {
    suspend fun getEndpoints(
        languageId: CoreLanguageId,
    ): PokedexEndpoints
}
