package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.app

import androidx.compose.runtime.Composable
import androidx.compose.ui.LocalSystemTheme
import androidx.compose.ui.SystemTheme

@Composable
internal actual fun isSystemInDarkTheme(): Boolean {
    return LocalSystemTheme.current == SystemTheme.Dark
}
