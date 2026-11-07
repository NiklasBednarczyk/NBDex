package de.niklasbednarczyk.nbdex.persistence.di

import de.niklasbednarczyk.nbdex.persistence.db.DexDatabase
import de.niklasbednarczyk.nbdex.persistence.db.createDatabase
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.di.persistencePokedexModule
import org.koin.dsl.module

val persistenceModule = module {
    includes(
        persistencePokedexModule,
    )

    single {
        createDatabase<DexDatabase>(
            scope = this,
        )
    }

    // Core
    single { get<DexDatabase>().coreGenerationDao() }
    single { get<DexDatabase>().coreGenerationNameDao() }
    single { get<DexDatabase>().corePokedexDao() }
    single { get<DexDatabase>().corePokedexDescriptionDao() }
    single { get<DexDatabase>().corePokedexNameDao() }
    single { get<DexDatabase>().corePokedexVersionGroupDao() }
    single { get<DexDatabase>().corePokemonDao() }
    single { get<DexDatabase>().corePokemonDexNumberDao() }
    single { get<DexDatabase>().corePokemonFormDao() }
    single { get<DexDatabase>().corePokemonFormNameDao() }
    single { get<DexDatabase>().corePokemonSpeciesDao() }
    single { get<DexDatabase>().corePokemonSpeciesNameDao() }
    single { get<DexDatabase>().corePokemonTypeDao() }
    single { get<DexDatabase>().coreRegionDao() }
    single { get<DexDatabase>().coreRegionNameDao() }
    single { get<DexDatabase>().coreTypeDao() }
    single { get<DexDatabase>().coreTypeNameDao() }
    single { get<DexDatabase>().coreVersionDao() }
    single { get<DexDatabase>().coreVersionGroupDao() }
    single { get<DexDatabase>().coreVersionNameDao() }

    // Pokedex
    single { get<DexDatabase>().pokedexGenerationDao() }
    single { get<DexDatabase>().pokedexPokedexDao() }
    single { get<DexDatabase>().pokedexPokemonFormDao() }
    single { get<DexDatabase>().pokedexTypeDao() }
}
