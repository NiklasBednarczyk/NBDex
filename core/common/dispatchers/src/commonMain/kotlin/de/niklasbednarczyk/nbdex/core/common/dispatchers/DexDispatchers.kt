package de.niklasbednarczyk.nbdex.core.common.dispatchers

import kotlinx.coroutines.CoroutineDispatcher

data class DexDispatchers(
    val io: CoroutineDispatcher = ioDispatcher(),
)
