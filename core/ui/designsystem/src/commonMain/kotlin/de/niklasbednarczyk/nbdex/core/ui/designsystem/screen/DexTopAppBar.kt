package de.niklasbednarczyk.nbdex.core.ui.designsystem.screen

import androidx.compose.material3.TooltipAnchorPosition
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.ui.designsystem.button.DexIconButton
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.DexTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowBack
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.content_description_icon_arrow_back
import org.jetbrains.compose.resources.stringResource

@Composable
fun DexSmallTopAppBar(
    scrollBehavior: TopAppBarScrollBehavior,
    titleText: String,
    onBack: () -> Unit,
) {
    DexTopAppBar(
        scrollBehavior = scrollBehavior,
        titleText = titleText,
        onBack = onBack,
        titleHorizontalAlignment = Alignment.Start,
    )
}

@Composable
fun DexCenteredTopAppBar(
    scrollBehavior: TopAppBarScrollBehavior,
    titleText: String,
) {
    DexTopAppBar(
        scrollBehavior = scrollBehavior,
        titleText = titleText,
        onBack = null,
        titleHorizontalAlignment = Alignment.CenterHorizontally,
    )
}

@Composable
private fun DexTopAppBar(
    scrollBehavior: TopAppBarScrollBehavior,
    titleText: String,
    onBack: (() -> Unit)?,
    titleHorizontalAlignment: Alignment.Horizontal,
    modifier: Modifier = Modifier,
) {
    val topAppBarColors = TopAppBarDefaults.topAppBarColors()

    TopAppBar(
        modifier = modifier,
        title = {
            DexTextSingleLine(
                text = titleText,
            )
        },
        subtitle = {},
        titleHorizontalAlignment = titleHorizontalAlignment,
        navigationIcon = {
            if (DexTheme.isSinglePane && onBack != null) {
                DexIconButton(
                    icon = DexIcons.Material.ArrowBack,
                    contentDescription = stringResource(Res.string.content_description_icon_arrow_back),
                    onClick = onBack,
                    tooltipAnchorPosition = TooltipAnchorPosition.Below,
                )
            }
        },
        colors = topAppBarColors.copy(
            scrolledContainerColor = topAppBarColors.containerColor,
        ),
        scrollBehavior = scrollBehavior,
    )
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    DexPreview(
        previewInfo = previewInfo,
    ) {
        DexSmallTopAppBar(
            scrollBehavior = scrollBehavior,
            titleText = "Small",
            onBack = {},
        )
        DexCenteredTopAppBar(
            scrollBehavior = scrollBehavior,
            titleText = "Centered",
        )
    }
}

@Preview
@Composable
private fun MultiplePanesPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    DexPreview(
        previewInfo = previewInfo,
        isSinglePane = false,
    ) {
        DexSmallTopAppBar(
            scrollBehavior = scrollBehavior,
            titleText = "Small",
            onBack = {},
        )
        DexCenteredTopAppBar(
            scrollBehavior = scrollBehavior,
            titleText = "Centered",
        )
    }
}
