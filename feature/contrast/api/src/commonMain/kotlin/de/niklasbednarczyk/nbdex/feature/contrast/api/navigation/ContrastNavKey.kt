package de.niklasbednarczyk.nbdex.feature.contrast.api.navigation

import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator
import kotlinx.serialization.Serializable

@Serializable
data object ContrastNavKey : DexNavKey

fun DexNavigator.navigateToContrast() {
    navigate(ContrastNavKey)
}
