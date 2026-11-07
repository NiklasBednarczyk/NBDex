package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.type.DexExtendedColorsType
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.version.DexExtendedColorsVersion

@Immutable
data class DexExtendedColors(
    val type: DexExtendedColorsType,
    val version: DexExtendedColorsVersion,
) {
    companion object {
        internal fun from(
            isDarkTheme: Boolean,
            contrast: CoreSettingsContrast,
        ): DexExtendedColors {
            return DexExtendedColors(
                type = DexExtendedColorsType.from(
                    isDarkTheme = isDarkTheme,
                    contrast = contrast,
                ),
                version = DexExtendedColorsVersion.from(
                    isDarkTheme = isDarkTheme,
                    contrast = contrast,
                ),
            )
        }
    }
}
