package de.niklasbednarczyk.nbdex.feature.more.impl.ui.model

import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.feature.about.api.navigation.AboutNavKey
import de.niklasbednarczyk.nbdex.feature.contrast.api.navigation.ContrastNavKey
import de.niklasbednarczyk.nbdex.feature.theme.api.navigation.ThemeNavKey

internal enum class MoreDestination {
    ABOUT,
    CONTRAST,
    THEME;

    val navKey: NBNavKey
        get() = when (this) {
            ABOUT -> AboutNavKey
            CONTRAST -> ContrastNavKey
            THEME -> ThemeNavKey
        }

}