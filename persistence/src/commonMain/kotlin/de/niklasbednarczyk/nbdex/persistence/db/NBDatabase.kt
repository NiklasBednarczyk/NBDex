package de.niklasbednarczyk.nbdex.persistence.db

import androidx.room3.ColumnTypeConverters
import androidx.room3.ConstructedBy
import androidx.room3.Database
import androidx.room3.RoomDatabase
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreGenerationDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreGenerationNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokedexDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokedexDescriptionDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokedexNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokedexVersionGroupDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonDexNumberDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonFormDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonFormNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonSpeciesDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonSpeciesNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CorePokemonTypeDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreRegionDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreRegionNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreTypeDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreTypeNameDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreVersionDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreVersionGroupDao
import de.niklasbednarczyk.nbdex.core.persistence.dao.CoreVersionNameDao
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreGeneration
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreGenerationName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedex
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexDescription
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokedexVersionGroup
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemon
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonDexNumber
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonForm
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonFormName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonSpecies
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonSpeciesName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCorePokemonType
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreRegion
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreRegionName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreType
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreTypeName
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersion
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionGroup
import de.niklasbednarczyk.nbdex.core.persistence.model.PersistenceCoreVersionName
import de.niklasbednarczyk.nbdex.persistence.converter.NBColumnTypeConvertersId
import de.niklasbednarczyk.nbdex.persistence.converter.NBColumnTypeConvertersValues
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao.PokedexGenerationDao
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao.PokedexPokedexDao
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao.PokedexPokemonFormDao
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao.PokedexTypeDao

@Database(
    entities = [
        PersistenceCoreGeneration::class,
        PersistenceCoreGenerationName::class,
        PersistenceCorePokedex::class,
        PersistenceCorePokedexDescription::class,
        PersistenceCorePokedexName::class,
        PersistenceCorePokedexVersionGroup::class,
        PersistenceCorePokemon::class,
        PersistenceCorePokemonDexNumber::class,
        PersistenceCorePokemonForm::class,
        PersistenceCorePokemonFormName::class,
        PersistenceCorePokemonSpecies::class,
        PersistenceCorePokemonSpeciesName::class,
        PersistenceCorePokemonType::class,
        PersistenceCoreRegion::class,
        PersistenceCoreRegionName::class,
        PersistenceCoreType::class,
        PersistenceCoreTypeName::class,
        PersistenceCoreVersion::class,
        PersistenceCoreVersionGroup::class,
        PersistenceCoreVersionName::class,
    ],
    version = 1,
)
@ColumnTypeConverters(
    NBColumnTypeConvertersId::class,
    NBColumnTypeConvertersValues::class,
)
@ConstructedBy(NBDatabaseConstructor::class)
abstract class NBDatabase : RoomDatabase() {
    //  Core
    abstract fun coreGenerationDao(): CoreGenerationDao

    abstract fun coreGenerationNameDao(): CoreGenerationNameDao

    abstract fun corePokedexDao(): CorePokedexDao

    abstract fun corePokedexDescriptionDao(): CorePokedexDescriptionDao

    abstract fun corePokedexNameDao(): CorePokedexNameDao

    abstract fun corePokedexVersionGroupDao(): CorePokedexVersionGroupDao

    abstract fun corePokemonDao(): CorePokemonDao

    abstract fun corePokemonDexNumberDao(): CorePokemonDexNumberDao

    abstract fun corePokemonFormDao(): CorePokemonFormDao

    abstract fun corePokemonFormNameDao(): CorePokemonFormNameDao

    abstract fun corePokemonSpeciesDao(): CorePokemonSpeciesDao

    abstract fun corePokemonSpeciesNameDao(): CorePokemonSpeciesNameDao

    abstract fun corePokemonTypeDao(): CorePokemonTypeDao

    abstract fun coreRegionDao(): CoreRegionDao

    abstract fun coreRegionNameDao(): CoreRegionNameDao

    abstract fun coreTypeDao(): CoreTypeDao

    abstract fun coreTypeNameDao(): CoreTypeNameDao

    abstract fun coreVersionDao(): CoreVersionDao

    abstract fun coreVersionGroupDao(): CoreVersionGroupDao

    abstract fun coreVersionNameDao(): CoreVersionNameDao

    // Pokedex
    abstract fun pokedexGenerationDao(): PokedexGenerationDao

    abstract fun pokedexPokedexDao(): PokedexPokedexDao

    abstract fun pokedexPokemonFormDao(): PokedexPokemonFormDao

    abstract fun pokedexTypeDao(): PokedexTypeDao
}
