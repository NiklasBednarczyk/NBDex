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
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
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
fun NBInfoContent(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier,
    bottomContent: @Composable (ColumnScope.() -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .padding(NBTheme.dimensions.padding.screenPaddingValues)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            modifier = Modifier.size(iconSize),
            imageVector = icon,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(NBTheme.dimensions.padding.large))
        NBTextSingleLine(
            text = text,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge,
        )
        bottomContent?.let { content ->
            Spacer(modifier = Modifier.height(NBTheme.dimensions.padding.medium))
            content()
        }
    }
}

@Composable
fun NBDetailPlaceholderContent(
    modifier: Modifier = Modifier,
) {
    NBInfoContent(
        modifier = modifier,
        icon = NBIcons.Material.ListAltCheck,
        text = stringResource(Res.string.common_info_detail_placeholder_text),
    )
}

@Composable
fun NBErrorContent(
    onReloadClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    NBInfoContent(
        modifier = modifier,
        icon = NBIcons.Material.Error,
        text = stringResource(Res.string.common_info_error_text),
        bottomContent = {
            FilledTonalButton(
                onClick = onReloadClick,
            ) {
                NBTextSingleLine(
                    text = stringResource(Res.string.common_info_error_button_text),
                )
            }
        },
    )
}

@Composable
fun NBNotYetImplementedContent(
    modifier: Modifier = Modifier,
) {
    NBInfoContent(
        modifier = modifier,
        icon = NBIcons.Material.Construction,
        text = stringResource(Res.string.common_info_not_yet_implemented_text),
    )
}

@Preview
@Composable
private fun InfoPreview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        NBInfoContent(
            icon = NBIcons.Material.ArrowBack,
            text = "This is a info text",
        )
    }
}

@Preview
@Composable
private fun DetailPlaceholderPreview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        NBDetailPlaceholderContent()
    }
}

@Preview
@Composable
private fun ErrorPreview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        NBErrorContent(
            onReloadClick = {},
        )
    }
}

@Preview
@Composable
private fun NotYetImplementedPreview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        NBNotYetImplementedContent()
    }
}
