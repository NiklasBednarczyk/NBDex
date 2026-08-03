package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.type.NBExtendedColorsType
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.version.NBExtendedColorsVersion

@Immutable
data class NBExtendedColors(
    val type: NBExtendedColorsType,
    val version: NBExtendedColorsVersion,
) {

    companion object {

        internal fun from(
            isDarkTheme: Boolean,
            contrast: CoreSettingsContrast,
        ): NBExtendedColors {
            return NBExtendedColors(
                type = NBExtendedColorsType.from(
                    isDarkTheme = isDarkTheme,
                    contrast = contrast,
                ),
                version = NBExtendedColorsVersion.from(
                    isDarkTheme = isDarkTheme,
                    contrast = contrast,
                ),
            )
        }

    }

}
