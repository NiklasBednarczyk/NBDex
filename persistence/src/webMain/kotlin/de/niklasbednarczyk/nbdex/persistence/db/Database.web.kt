package de.niklasbednarczyk.nbdex.persistence.db

import androidx.room3.Room
import androidx.room3.RoomDatabase
import androidx.sqlite.SQLiteDriver
import androidx.sqlite.driver.web.WebWorkerSQLiteDriver
import org.koin.core.scope.Scope

internal actual inline fun <reified Database : RoomDatabase> createDatabaseBuilder(
    scope: Scope,
): RoomDatabase.Builder<Database> {
    return Room.databaseBuilder<Database>(
        name = DATABASE_FILE_NAME,
    )
}

/* Sources for SQLiteWasmWorker and worker setup:
    - https://github.com/danysantiago/room-web-demo/tree/main
    - https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:sqlite/sqlite-web-worker-test/web-worker/
*/
internal actual fun createSQLiteDriver(): SQLiteDriver {
    return createSQLiteWasmWorker()
}

internal expect fun createSQLiteWasmWorker(): WebWorkerSQLiteDriver
