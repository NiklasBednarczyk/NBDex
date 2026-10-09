package de.niklasbednarczyk.nbdex.core.common.dispatchers

import kotlinx.coroutines.CoroutineDispatcher

internal expect fun ioDispatcher(): CoroutineDispatcher
