package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.DexExtendedColors
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.DexDimensions

internal val LocalDexDimensions =
    staticCompositionLocalOf<DexDimensions> { noLocalProvidedFor("DexDimensions") }

internal val LocalDexExtendedColors =
    staticCompositionLocalOf<DexExtendedColors> { noLocalProvidedFor("DexExtendedColors") }

internal val LocalDexIsDarkTheme =
    staticCompositionLocalOf<Boolean> { noLocalProvidedFor("DexIsDarkTheme") }

internal val LocalDexIsSinglePane =
    staticCompositionLocalOf<Boolean> { noLocalProvidedFor("DexIsSinglePane") }

@Composable
internal fun ProvideDexCompositionLocals(
    isDarkTheme: Boolean,
    contrast: CoreSettingsContrast,
    isSinglePane: Boolean,
    content: @Composable () -> Unit,
) {
    val dimensions = DexDimensions()

    val extendedColors = remember(isDarkTheme, contrast) {
        DexExtendedColors.from(
            isDarkTheme = isDarkTheme,
            contrast = contrast,
        )
    }

    CompositionLocalProvider(
        LocalDexDimensions provides dimensions,
        LocalDexExtendedColors provides extendedColors,
        LocalDexIsDarkTheme provides isDarkTheme,
        LocalDexIsSinglePane provides isSinglePane,
        content = content,
    )
}

private fun noLocalProvidedFor(
    name: String,
): Nothing {
    error("CompositionLocal $name not present")
}
