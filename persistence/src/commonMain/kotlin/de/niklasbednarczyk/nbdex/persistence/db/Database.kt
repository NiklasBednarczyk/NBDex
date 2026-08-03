package de.niklasbednarczyk.nbdex.persistence.db

import androidx.room3.RoomDatabase
import androidx.sqlite.SQLiteDriver
import de.niklasbednarczyk.nbdex.core.common.dispatchers.NBDispatchers
import org.koin.core.scope.Scope

internal const val DATABASE_FILE_NAME = "nbdex_database.db"

internal inline fun <reified Database : RoomDatabase> createDatabase(
    scope: Scope,
): Database {
    val dispatchers = scope.get<NBDispatchers>()

    val builder = createDatabaseBuilder<Database>(
        scope = scope,
    )

    return builder
        .setDriver(createSQLiteDriver())
        .setQueryCoroutineContext(dispatchers.io)
        .build()
}

internal expect inline fun <reified Database : RoomDatabase> createDatabaseBuilder(
    scope: Scope,
): RoomDatabase.Builder<Database>

internal expect fun createSQLiteDriver(): SQLiteDriver
