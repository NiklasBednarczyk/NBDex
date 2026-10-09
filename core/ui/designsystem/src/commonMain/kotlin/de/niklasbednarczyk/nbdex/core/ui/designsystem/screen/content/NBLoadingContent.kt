package de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LoadingIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.Dp
import androidx.window.core.layout.WindowSizeClass
import de.niklasbednarczyk.nbdex.core.ui.designsystem.ext.times
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme

@Composable
fun NBLoadingContent(
    modifier: Modifier = Modifier,
) {
    BoxWithConstraints(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        val indicatorSize = calculateIndicatorSize(minWidth)

        LoadingIndicator(
            modifier = Modifier.size(indicatorSize),
        )
    }
}

@Composable
private fun calculateIndicatorSize(
    boxMinWith: Dp,
): Dp {
    val indicatorMinSize = NBTheme.dimensions.component.loadingIndicator.minSize
    val indicatorMaxSize = NBTheme.dimensions.component.loadingIndicator.maxSize
    val boxMaxWidth = WindowSizeClass.WIDTH_DP_EXTRA_LARGE_LOWER_BOUND

    val indicatorSize = indicatorMaxSize * (boxMinWith / boxMaxWidth)

    return indicatorSize.coerceIn(
        minimumValue = indicatorMinSize,
        maximumValue = indicatorMaxSize,
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
        NBLoadingContent()
    }
}
