package de.niklasbednarczyk.nbdex.feature.theme.api.navigation

import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import kotlinx.serialization.Serializable

@Serializable
data object ThemeNavKey : NBNavKey

fun NBNavigator.navigateToTheme() {
    navigate(ThemeNavKey)
}
