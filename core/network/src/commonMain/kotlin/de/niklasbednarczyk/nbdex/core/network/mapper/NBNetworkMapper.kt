package de.niklasbednarczyk.nbdex.core.network.mapper

interface NBNetworkMapper<Model : Any, NetworkCore : Any> {
    fun networkToModel(
        network: NetworkCore,
    ): Model
}
