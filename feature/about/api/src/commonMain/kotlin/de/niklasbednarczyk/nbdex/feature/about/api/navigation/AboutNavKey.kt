package de.niklasbednarczyk.nbdex.feature.about.api.navigation

import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator
import kotlinx.serialization.Serializable

@Serializable
data object AboutNavKey : DexNavKey

fun DexNavigator.navigateToAbout() {
    navigate(AboutNavKey)
}
