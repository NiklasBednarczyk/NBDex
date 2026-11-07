package de.niklasbednarczyk.nbdex.core.ui.designsystem.text

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme

@Composable
fun DexSectionTitle(
    title: String,
    modifier: Modifier = Modifier,
) {
    DexTextSingleLine(
        modifier = modifier.padding(
            vertical = DexTheme.dimensions.padding.medium,
        ),
        text = title,
        style = DexTheme.typography.titleSmall,
    )
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        DexSectionTitle(
            title = "Section title",
        )
    }
}
