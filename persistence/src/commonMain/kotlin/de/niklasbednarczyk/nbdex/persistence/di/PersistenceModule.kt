package de.niklasbednarczyk.nbdex.persistence.di

import de.niklasbednarczyk.nbdex.persistence.db.NBDatabase
import de.niklasbednarczyk.nbdex.persistence.db.createDatabase
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.di.persistencePokedexModule
import org.koin.dsl.module

val persistenceModule = module {
    includes(
        persistencePokedexModule,
    )

    single {
        createDatabase<NBDatabase>(
            scope = this,
        )
    }

    // Core
    single { get<NBDatabase>().coreGenerationDao() }
    single { get<NBDatabase>().coreGenerationNameDao() }
    single { get<NBDatabase>().corePokedexDao() }
    single { get<NBDatabase>().corePokedexDescriptionDao() }
    single { get<NBDatabase>().corePokedexNameDao() }
    single { get<NBDatabase>().corePokedexVersionGroupDao() }
    single { get<NBDatabase>().corePokemonDao() }
    single { get<NBDatabase>().corePokemonDexNumberDao() }
    single { get<NBDatabase>().corePokemonFormDao() }
    single { get<NBDatabase>().corePokemonFormNameDao() }
    single { get<NBDatabase>().corePokemonSpeciesDao() }
    single { get<NBDatabase>().corePokemonSpeciesNameDao() }
    single { get<NBDatabase>().corePokemonTypeDao() }
    single { get<NBDatabase>().coreRegionDao() }
    single { get<NBDatabase>().coreRegionNameDao() }
    single { get<NBDatabase>().coreTypeDao() }
    single { get<NBDatabase>().coreTypeNameDao() }
    single { get<NBDatabase>().coreVersionDao() }
    single { get<NBDatabase>().coreVersionGroupDao() }
    single { get<NBDatabase>().coreVersionNameDao() }

    // Pokedex
    single { get<NBDatabase>().pokedexGenerationDao() }
    single { get<NBDatabase>().pokedexPokedexDao() }
    single { get<NBDatabase>().pokedexPokemonFormDao() }
    single { get<NBDatabase>().pokedexTypeDao() }
}
