package de.niklasbednarczyk.nbdex.core.ui.designsystem.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.common.util.string.dexCapitalize
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast

class DexPreviewInfoPreviewParameterProvider : PreviewParameterProvider<DexPreviewInfo> {
    private val previewInfoList = listOf(
        DexPreviewInfo(
            isDarkTheme = false,
            contrast = CoreSettingsContrast.STANDARD,
        ),
        DexPreviewInfo(
            isDarkTheme = true,
            contrast = CoreSettingsContrast.STANDARD,
        ),
        DexPreviewInfo(
            isDarkTheme = false,
            contrast = CoreSettingsContrast.MEDIUM,
        ),
        DexPreviewInfo(
            isDarkTheme = true,
            contrast = CoreSettingsContrast.MEDIUM,
        ),
        DexPreviewInfo(
            isDarkTheme = false,
            contrast = CoreSettingsContrast.HIGH,
        ),
        DexPreviewInfo(
            isDarkTheme = true,
            contrast = CoreSettingsContrast.HIGH,
        ),
    )

    override val values: Sequence<DexPreviewInfo> = previewInfoList.asSequence()

    override fun getDisplayName(
        index: Int,
    ): String? {
        val previewInfo = previewInfoList.getOrNull(index) ?: return null

        val indexString = (index + 1).toString()
        val themeString = if (previewInfo.isDarkTheme) "Dark" else "Light"
        val contrastString = previewInfo.contrast.name.dexCapitalize()

        return "$indexString: $themeString - $contrastString"
    }
}
