package de.niklasbednarczyk.nbdex.util

import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.feature.info.api.navigation.InfoNavKey
import de.niklasbednarczyk.nbdex.feature.more.api.navigation.MoreNavKey
import de.niklasbednarczyk.nbdex.feature.pokedex.api.navigation.PokedexNavKey

val NBTopLevelDestination.navKey: NBNavKey
    get() = when (this) {
        NBTopLevelDestination.POKEDEX -> PokedexNavKey
        NBTopLevelDestination.INFO -> InfoNavKey
        NBTopLevelDestination.MORE -> MoreNavKey
    }
