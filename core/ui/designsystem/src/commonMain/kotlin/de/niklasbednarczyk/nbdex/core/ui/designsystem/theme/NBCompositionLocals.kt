package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.NBExtendedColors
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.NBDimensions

internal val LocalNBDimensions =
    staticCompositionLocalOf<NBDimensions> { noLocalProvidedFor("NBDimensions") }

internal val LocalNBExtendedColors =
    staticCompositionLocalOf<NBExtendedColors> { noLocalProvidedFor("NBExtendedColors") }

internal val LocalNBIsDarkTheme =
    staticCompositionLocalOf<Boolean> { noLocalProvidedFor("NBIsDarkTheme") }

internal val LocalNBIsSinglePane =
    staticCompositionLocalOf<Boolean> { noLocalProvidedFor("LocalNBIsSinglePane") }

@Composable
internal fun ProvideNBCompositionLocals(
    isDarkTheme: Boolean,
    contrast: CoreSettingsContrast,
    isSinglePane: Boolean,
    content: @Composable () -> Unit,
) {
    val dimensions = NBDimensions()

    val extendedColors = remember(isDarkTheme, contrast) {
        NBExtendedColors.from(
            isDarkTheme = isDarkTheme,
            contrast = contrast,
        )
    }

    CompositionLocalProvider(
        LocalNBDimensions provides dimensions,
        LocalNBExtendedColors provides extendedColors,
        LocalNBIsDarkTheme provides isDarkTheme,
        LocalNBIsSinglePane provides isSinglePane,
        content = content,
    )
}

private fun noLocalProvidedFor(
    name: String,
): Nothing {
    error("CompositionLocal $name not present")
}
