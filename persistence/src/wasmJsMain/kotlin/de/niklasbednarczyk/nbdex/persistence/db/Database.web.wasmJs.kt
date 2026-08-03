package de.niklasbednarczyk.nbdex.persistence.db

import androidx.sqlite.driver.web.WebWorkerSQLiteDriver
import org.w3c.dom.Worker

internal actual fun createSQLiteWasmWorker(): WebWorkerSQLiteDriver {
    return WebWorkerSQLiteDriver(jsWorker())
}

@OptIn(ExperimentalWasmJsInterop::class)
private fun jsWorker(): Worker =
    js("""new Worker(new URL("sqlite-wasm-worker/worker.js", import.meta.url))""")
