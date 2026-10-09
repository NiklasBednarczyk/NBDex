package de.niklasbednarczyk.nbdex.core.ui.designsystem.text

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme

@Composable
fun NBSectionTitle(
    title: String,
    modifier: Modifier = Modifier,
) {
    NBTextSingleLine(
        modifier = modifier.padding(
            vertical = NBTheme.dimensions.padding.medium,
        ),
        text = title,
        style = NBTheme.typography.titleSmall,
    )
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        NBSectionTitle(
            title = "Section title",
        )
    }
}
