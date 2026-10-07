package de.niklasbednarczyk.nbdex.core.network.di

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.network.http.LoggingInterceptor
import de.niklasbednarczyk.nbdex.core.common.logging.NBLogger
import de.niklasbednarczyk.nbdex.core.network.buildkonfig.BuildKonfig
import de.niklasbednarczyk.nbdex.core.network.constant.NBApolloClient
import org.koin.dsl.module

val coreNetworkModule = module {
    single {
        val logger = NBLogger(NBApolloClient.LOGGER_NAME)

        val httpInterceptor = LoggingInterceptor(
            log = { message -> logger.info { message } },
            level = LoggingInterceptor.Level.BASIC,
        )

        ApolloClient.Builder()
            .serverUrl(BuildKonfig.apolloUrl)
            .addHttpInterceptor(httpInterceptor)
            .build()
    }
}
