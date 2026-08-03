package de.niklasbednarczyk.nbdex.persistence.db

import android.content.Context
import androidx.room3.Room
import androidx.room3.RoomDatabase
import androidx.sqlite.SQLiteDriver
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import org.koin.core.scope.Scope

internal actual inline fun <reified Database : RoomDatabase> createDatabaseBuilder(
    scope: Scope,
): RoomDatabase.Builder<Database> {
    val context = scope.get<Context>()
    val appContext = context.applicationContext
    val databaseFile = appContext.getDatabasePath(DATABASE_FILE_NAME)
    return Room.databaseBuilder<Database>(
        context = appContext,
        name = databaseFile.absolutePath,
    )
}

internal actual fun createSQLiteDriver(): SQLiteDriver {
    return BundledSQLiteDriver()
}
