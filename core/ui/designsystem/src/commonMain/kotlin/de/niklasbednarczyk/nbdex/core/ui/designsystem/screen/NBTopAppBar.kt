package de.niklasbednarczyk.nbdex.core.ui.designsystem.screen

import androidx.compose.material3.TooltipAnchorPosition
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.ui.designsystem.button.NBIconButton
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowBack
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.content_description_icon_arrow_back
import org.jetbrains.compose.resources.stringResource

@Composable
fun NBSmallTopAppBar(
    scrollBehavior: TopAppBarScrollBehavior,
    titleText: String,
    onBack: () -> Unit,
) {
    NBTopAppBar(
        scrollBehavior = scrollBehavior,
        titleText = titleText,
        onBack = onBack,
        titleHorizontalAlignment = Alignment.Start,
    )
}

@Composable
fun NBCenteredTopAppBar(
    scrollBehavior: TopAppBarScrollBehavior,
    titleText: String,
) {
    NBTopAppBar(
        scrollBehavior = scrollBehavior,
        titleText = titleText,
        onBack = null,
        titleHorizontalAlignment = Alignment.CenterHorizontally,
    )
}

@Composable
private fun NBTopAppBar(
    scrollBehavior: TopAppBarScrollBehavior,
    titleText: String,
    onBack: (() -> Unit)?,
    titleHorizontalAlignment: Alignment.Horizontal,
) {
    val topAppBarColors = TopAppBarDefaults.topAppBarColors()

    TopAppBar(
        title = {
            NBTextSingleLine(
                text = titleText,
            )
        },
        subtitle = {},
        titleHorizontalAlignment = titleHorizontalAlignment,
        navigationIcon = {
            if (NBTheme.isSinglePane && onBack != null) {
                NBIconButton(
                    icon = NBIcons.Material.ArrowBack,
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
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    NBPreview(
        previewInfo = previewInfo,
    ) {
        NBSmallTopAppBar(
            scrollBehavior = scrollBehavior,
            titleText = "Small",
            onBack = {},
        )
        NBCenteredTopAppBar(
            scrollBehavior = scrollBehavior,
            titleText = "Centered",
        )
    }
}

@Preview
@Composable
private fun PreviewMultiplePanes(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    NBPreview(
        previewInfo = previewInfo,
        isSinglePane = false,
    ) {
        NBSmallTopAppBar(
            scrollBehavior = scrollBehavior,
            titleText = "Small",
            onBack = {},
        )
        NBCenteredTopAppBar(
            scrollBehavior = scrollBehavior,
            titleText = "Centered",
        )
    }
}
