package de.niklasbednarczyk.nbdex.feature.about.api.navigation

import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import kotlinx.serialization.Serializable

@Serializable
data object AboutNavKey : NBNavKey

fun NBNavigator.navigateToAbout() {
    navigate(AboutNavKey)
}
