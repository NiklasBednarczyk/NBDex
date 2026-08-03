package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme

@Composable
fun rememberIsDarkTheme(
    theme: CoreSettingsTheme,
): Boolean {
    val isSystemInDarkTheme = isSystemInDarkTheme()
    return remember(theme, isSystemInDarkTheme) {
        when (theme) {
            CoreSettingsTheme.SYSTEM_DEFAULT -> isSystemInDarkTheme
            CoreSettingsTheme.LIGHT -> false
            CoreSettingsTheme.DARK -> true
        }
    }
}