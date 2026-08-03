package de.niklasbednarczyk.nbdex.feature.di

import de.niklasbednarczyk.nbdex.feature.about.impl.di.featureAboutModule
import de.niklasbednarczyk.nbdex.feature.contrast.impl.di.featureContrastModule
import de.niklasbednarczyk.nbdex.feature.info.impl.di.featureInfoModule
import de.niklasbednarczyk.nbdex.feature.more.impl.di.featureMoreModule
import de.niklasbednarczyk.nbdex.feature.pokedex.impl.di.featurePokedexModule
import de.niklasbednarczyk.nbdex.feature.pokemonform.impl.di.featurePokemonFormModule
import de.niklasbednarczyk.nbdex.feature.theme.impl.di.featureThemeModule
import org.koin.dsl.module

val featureModule = module {
    includes(
        featureAboutModule,
        featureContrastModule,
        featureInfoModule,
        featureMoreModule,
        featurePokedexModule,
        featurePokemonFormModule,
        featureThemeModule,
    )
}
