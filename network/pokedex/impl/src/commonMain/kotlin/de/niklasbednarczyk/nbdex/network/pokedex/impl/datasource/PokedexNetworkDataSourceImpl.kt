package de.niklasbednarczyk.nbdex.network.pokedex.impl.datasource

import de.niklasbednarczyk.nbdex.core.model.id.CoreLanguageId
import de.niklasbednarczyk.nbdex.core.network.datasource.NBNetworkDataSourceImpl
import de.niklasbednarczyk.nbdex.model.pokedex.endpoints.PokedexEndpoints
import de.niklasbednarczyk.nbdex.network.pokedex.api.datasource.PokedexNetworkDataSource
import de.niklasbednarczyk.nbdex.network.pokedex.impl.apollo.NetworkPokedexEndpointsQuery
import de.niklasbednarczyk.nbdex.network.pokedex.impl.mapper.NetworkPokedexEndpointsMapper

internal class PokedexNetworkDataSourceImpl : NBNetworkDataSourceImpl(), PokedexNetworkDataSource {

    override suspend fun getEndpoints(
        languageId: CoreLanguageId,
    ): PokedexEndpoints {
        return executeQuery(
            query = NetworkPokedexEndpointsQuery(
                languageId = languageId.value,
            ),
            mapper = NetworkPokedexEndpointsMapper,
        )
    }

}