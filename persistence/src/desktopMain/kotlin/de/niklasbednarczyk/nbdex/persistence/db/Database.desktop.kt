package de.niklasbednarczyk.nbdex.persistence.db

import androidx.room3.Room
import androidx.room3.RoomDatabase
import androidx.sqlite.SQLiteDriver
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import de.niklasbednarczyk.nbdex.core.common.file.getFile
import org.koin.core.scope.Scope

internal actual inline fun <reified Database : RoomDatabase> createDatabaseBuilder(
    scope: Scope,
): RoomDatabase.Builder<Database> {
    val databaseFile = getFile(DATABASE_FILE_NAME)
    return Room.databaseBuilder<Database>(
        name = databaseFile.absolutePath,
    )
}

internal actual fun createSQLiteDriver(): SQLiteDriver {
    return BundledSQLiteDriver()
}
