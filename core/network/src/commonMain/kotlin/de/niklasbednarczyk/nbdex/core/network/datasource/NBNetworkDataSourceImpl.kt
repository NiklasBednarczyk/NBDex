package de.niklasbednarczyk.nbdex.core.network.datasource

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Query
import de.niklasbednarczyk.nbdex.core.network.mapper.NBNetworkMapper
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

open class NBNetworkDataSourceImpl : KoinComponent {
    private val apolloClient: ApolloClient by inject()

    protected suspend fun <Model : Any, QueryData : Query.Data> executeQuery(
        query: Query<QueryData>,
        mapper: NBNetworkMapper<Model, QueryData>,
    ): Model {
        val queryData = apolloClient
            .query(query)
            .execute()
            .dataOrThrow()
        return mapper.networkToModel(queryData)
    }
}
