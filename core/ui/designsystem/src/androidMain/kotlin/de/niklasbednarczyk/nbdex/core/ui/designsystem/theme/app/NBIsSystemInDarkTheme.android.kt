package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.app

import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

@Composable
internal actual fun isSystemInDarkTheme(): Boolean {
    return (LocalConfiguration.current.uiMode and UI_MODE_NIGHT_MASK) == UI_MODE_NIGHT_YES
}
