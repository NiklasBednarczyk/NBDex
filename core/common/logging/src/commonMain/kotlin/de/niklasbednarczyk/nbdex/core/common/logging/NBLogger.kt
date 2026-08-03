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

    private fun initLogger(name: String?): KLogger {
        val loggerName = name ?: "NBLogger"
        return KotlinLogging.logger(loggerName)
    }

    /** Add a log message indicating [throwable] is caught along with the stack trace */
    fun catching(throwable: Throwable) {
        logger.error(throwable) { "Catching ${throwable::class.simpleName}" }
    }

    /** Add a log message at level info */
    fun i(message: () -> Any?) {
        logger.info(message)
    }

}