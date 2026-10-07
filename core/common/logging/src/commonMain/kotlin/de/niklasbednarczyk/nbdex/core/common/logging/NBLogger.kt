package de.niklasbednarczyk.nbdex.core.common.logging

import io.github.oshai.kotlinlogging.KLogger
import io.github.oshai.kotlinlogging.KotlinLogging
import kotlin.reflect.KClass

class NBLogger {
    private val logger: KLogger

    constructor(name: String) {
        logger = initLogger(
            name = name,
        )
    }

    constructor(klass: KClass<*>) {
        logger = initLogger(
            name = klass.simpleName,
        )
    }

    private fun initLogger(
        name: String?,
    ): KLogger {
        val loggerName = name ?: "NBLogger"
        return KotlinLogging.logger(loggerName)
    }

    fun catching(
        throwable: Throwable,
    ) {
        logger.error(throwable) { "Catching ${throwable::class.simpleName ?: "Unknown throwable"}" }
    }

    fun info(
        message: () -> Any?,
    ) {
        logger.info(message)
    }
}
