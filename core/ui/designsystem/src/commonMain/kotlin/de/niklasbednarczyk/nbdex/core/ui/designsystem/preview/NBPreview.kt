package de.niklasbednarczyk.nbdex.core.ui.designsystem.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme

@Composable
fun NBPreview(
    previewInfo: NBPreviewInfo,
    isSinglePane: Boolean = true,
    content: @Composable ColumnScope.() -> Unit,
) {
    NBTheme(
        isDarkTheme = previewInfo.isDarkTheme,
        contrast = previewInfo.contrast,
        isSinglePane = isSinglePane,
    ) {
        Surface {
            Column(
                verticalArrangement = Arrangement.spacedBy(NBTheme.dimensions.padding.small),
                content = content,
            )
        }
    }
}