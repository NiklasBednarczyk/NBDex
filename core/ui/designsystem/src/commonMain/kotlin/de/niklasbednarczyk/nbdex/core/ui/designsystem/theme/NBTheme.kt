package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialExpressiveTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.NBExtendedColors
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.scheme.getColorScheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.NBDimensions

object NBTheme {
    val colorScheme: ColorScheme
        @Composable @ReadOnlyComposable
        get() = MaterialTheme.colorScheme

    val typography: Typography
        @Composable @ReadOnlyComposable
        get() = MaterialTheme.typography

    val shapes: Shapes
        @Composable @ReadOnlyComposable
        get() = MaterialTheme.shapes

    val dimensions: NBDimensions
        @Composable @ReadOnlyComposable
        get() = LocalNBDimensions.current

    val extendedColors: NBExtendedColors
        @Composable @ReadOnlyComposable
        get() = LocalNBExtendedColors.current

    val isDarkTheme: Boolean
        @Composable @ReadOnlyComposable
        get() = LocalNBIsDarkTheme.current

    val isSinglePane: Boolean
        @Composable @ReadOnlyComposable
        get() = LocalNBIsSinglePane.current
}

@Composable
fun NBTheme(
    isDarkTheme: Boolean,
    contrast: CoreSettingsContrast,
    isSinglePane: Boolean,
    content: @Composable () -> Unit,
) {
    ProvideNBCompositionLocals(
        isDarkTheme = isDarkTheme,
        contrast = contrast,
        isSinglePane = isSinglePane,
    ) {
        val colorScheme = remember(isDarkTheme, contrast) {
            getColorScheme(
                isDarkTheme = isDarkTheme,
                contrast = contrast,
            )
        }

        MaterialExpressiveTheme(
            colorScheme = colorScheme,
            content = content,
        )
    }
}
