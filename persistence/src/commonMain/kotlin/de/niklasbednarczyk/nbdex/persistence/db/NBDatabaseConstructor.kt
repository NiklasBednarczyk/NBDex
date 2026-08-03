package de.niklasbednarczyk.nbdex.persistence.db

import androidx.room3.RoomDatabaseConstructor

// The Room compiler generates the `actual` implementations.
@Suppress("KotlinNoActualForExpect", "EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect object NBDatabaseConstructor : RoomDatabaseConstructor<NBDatabase> {
    override fun initialize(): NBDatabase
}
