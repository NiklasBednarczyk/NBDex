package de.niklasbednarczyk.nbdex.feature.theme.api.navigation

import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator
import kotlinx.serialization.Serializable

@Serializable
data object ThemeNavKey : DexNavKey

fun DexNavigator.navigateToTheme() {
    navigate(ThemeNavKey)
}
