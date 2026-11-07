package de.niklasbednarczyk.nbdex.core.network.datasource

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Query
import de.niklasbednarczyk.nbdex.core.network.mapper.DexNetworkMapper
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

open class DexNetworkDataSourceImpl : KoinComponent {
    private val apolloClient: ApolloClient by inject()

    protected suspend fun <Model : Any, QueryData : Query.Data> executeQuery(
        query: Query<QueryData>,
        mapper: DexNetworkMapper<Model, QueryData>,
    ): Model {
        val queryData = apolloClient
            .query(query)
            .execute()
            .dataOrThrow()
        return mapper.networkToModel(queryData)
    }
}
