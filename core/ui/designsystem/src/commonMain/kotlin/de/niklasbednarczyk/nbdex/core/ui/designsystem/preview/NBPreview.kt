package de.niklasbednarczyk.nbdex.core.ui.designsystem.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme

@Composable
fun NBPreview(
    previewInfo: NBPreviewInfo,
    modifier: Modifier = Modifier,
    isSinglePane: Boolean = true,
    content: @Composable ColumnScope.() -> Unit,
) {
    NBTheme(
        isDarkTheme = previewInfo.isDarkTheme,
        contrast = previewInfo.contrast,
        isSinglePane = isSinglePane,
    ) {
        Surface(
            modifier = modifier,
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(NBTheme.dimensions.padding.small),
                content = content,
            )
        }
    }
}
