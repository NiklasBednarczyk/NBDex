package de.niklasbednarczyk.nbdex.feature.contrast.api.navigation

import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import kotlinx.serialization.Serializable

@Serializable
data object ContrastNavKey : NBNavKey

fun NBNavigator.navigateToContrast() {
    navigate(ContrastNavKey)
}
