package de.niklasbednarczyk.nbdex.core.data.mediator

import de.niklasbednarczyk.nbdex.core.common.dispatchers.DexDispatchers
import de.niklasbednarczyk.nbdex.core.common.logging.DexLogger
import de.niklasbednarczyk.nbdex.core.common.result.DexResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

abstract class ResultMediator<Input : Any, Output : Any> : KoinComponent {
    protected abstract val loggerName: String

    private val dispatchers: DexDispatchers by inject()
    private val logger = DexLogger(loggerName)

    protected abstract suspend fun shouldGetNetwork(): Boolean

    protected abstract suspend fun getNetworkInput(): Input

    protected abstract suspend fun insertPersistenceInput(
        input: Input,
    )

    protected abstract fun getOutput(): Flow<Output>

    operator fun invoke(): Flow<DexResult<Output>> = flow<DexResult<Output>> {
        if (shouldGetNetwork()) {
            val input = getNetworkInput()
            insertPersistenceInput(input)
        }
        emitAll(
            getOutput().map { output ->
                DexResult.Success(output)
            },
        )
    }
        .onStart { emit(DexResult.Loading) }
        .catch { throwable ->
            logger.catching(throwable)
            emit(DexResult.Error)
        }
        .flowOn(dispatchers.io)
}
