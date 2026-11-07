package de.niklasbednarczyk.nbdex.core.network.mapper

interface DexNetworkMapper<Model : Any, NetworkCore : Any> {
    fun networkToModel(
        network: NetworkCore,
    ): Model
}
