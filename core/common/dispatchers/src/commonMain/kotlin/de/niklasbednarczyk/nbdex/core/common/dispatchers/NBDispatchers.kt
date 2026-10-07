package de.niklasbednarczyk.nbdex.core.common.dispatchers

import kotlinx.coroutines.CoroutineDispatcher

data class NBDispatchers(
    val io: CoroutineDispatcher = ioDispatcher(),
)
