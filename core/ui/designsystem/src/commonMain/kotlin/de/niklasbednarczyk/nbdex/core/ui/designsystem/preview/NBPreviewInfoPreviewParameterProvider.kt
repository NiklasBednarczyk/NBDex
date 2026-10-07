package de.niklasbednarczyk.nbdex.core.ui.designsystem.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.common.util.string.nbCapitalize
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast

class NBPreviewInfoPreviewParameterProvider : PreviewParameterProvider<NBPreviewInfo> {
    private val previewInfoList = listOf(
        NBPreviewInfo(
            isDarkTheme = false,
            contrast = CoreSettingsContrast.STANDARD,
        ),
        NBPreviewInfo(
            isDarkTheme = true,
            contrast = CoreSettingsContrast.STANDARD,
        ),
        NBPreviewInfo(
            isDarkTheme = false,
            contrast = CoreSettingsContrast.MEDIUM,
        ),
        NBPreviewInfo(
            isDarkTheme = true,
            contrast = CoreSettingsContrast.MEDIUM,
        ),
        NBPreviewInfo(
            isDarkTheme = false,
            contrast = CoreSettingsContrast.HIGH,
        ),
        NBPreviewInfo(
            isDarkTheme = true,
            contrast = CoreSettingsContrast.HIGH,
        ),
    )

    override val values: Sequence<NBPreviewInfo> = previewInfoList.asSequence()

    override fun getDisplayName(
        index: Int,
    ): String? {
        val previewInfo = previewInfoList.getOrNull(index) ?: return null

        val indexString = (index + 1).toString()
        val themeString = if (previewInfo.isDarkTheme) "Dark" else "Light"
        val contrastString = previewInfo.contrast.name.nbCapitalize()

        return "$indexString: $themeString - $contrastString"
    }
}
