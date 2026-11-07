package de.niklasbednarczyk.nbdex.util

import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.info.api.navigation.InfoNavKey
import de.niklasbednarczyk.nbdex.feature.more.api.navigation.MoreNavKey
import de.niklasbednarczyk.nbdex.feature.pokedex.api.navigation.PokedexNavKey

val DexTopLevelDestination.navKey: DexNavKey
    get() = when (this) {
        DexTopLevelDestination.POKEDEX -> PokedexNavKey
        DexTopLevelDestination.INFO -> InfoNavKey
        DexTopLevelDestination.MORE -> MoreNavKey
    }
