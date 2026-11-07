package de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.DexTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowBack
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Construction
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Error
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ListAltCheck
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.common_info_detail_placeholder_text
import nbdex.core.ui.resource.generated.resources.common_info_error_button_text
import nbdex.core.ui.resource.generated.resources.common_info_error_text
import nbdex.core.ui.resource.generated.resources.common_info_not_yet_implemented_text
import org.jetbrains.compose.resources.stringResource

private val iconSize = 48.dp

@Composable
fun DexInfoContent(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier,
    bottomContent: @Composable (ColumnScope.() -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .padding(DexTheme.dimensions.padding.screenPaddingValues)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            modifier = Modifier.size(iconSize),
            imageVector = icon,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(DexTheme.dimensions.padding.large))
        DexTextSingleLine(
            text = text,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge,
        )
        bottomContent?.let { content ->
            Spacer(modifier = Modifier.height(DexTheme.dimensions.padding.medium))
            content()
        }
    }
}

@Composable
fun DexDetailPlaceholderContent(
    modifier: Modifier = Modifier,
) {
    DexInfoContent(
        modifier = modifier,
        icon = DexIcons.Material.ListAltCheck,
        text = stringResource(Res.string.common_info_detail_placeholder_text),
    )
}

@Composable
fun DexErrorContent(
    onReloadClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    DexInfoContent(
        modifier = modifier,
        icon = DexIcons.Material.Error,
        text = stringResource(Res.string.common_info_error_text),
        bottomContent = {
            FilledTonalButton(
                onClick = onReloadClick,
            ) {
                DexTextSingleLine(
                    text = stringResource(Res.string.common_info_error_button_text),
                )
            }
        },
    )
}

@Composable
fun DexNotYetImplementedContent(
    modifier: Modifier = Modifier,
) {
    DexInfoContent(
        modifier = modifier,
        icon = DexIcons.Material.Construction,
        text = stringResource(Res.string.common_info_not_yet_implemented_text),
    )
}

@Preview
@Composable
private fun InfoPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        DexInfoContent(
            icon = DexIcons.Material.ArrowBack,
            text = "This is a info text",
        )
    }
}

@Preview
@Composable
private fun DetailPlaceholderPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        DexDetailPlaceholderContent()
    }
}

@Preview
@Composable
private fun ErrorPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        DexErrorContent(
            onReloadClick = {},
        )
    }
}

@Preview
@Composable
private fun NotYetImplementedPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        DexNotYetImplementedContent()
    }
}
