package de.niklasbednarczyk.nbdex.core.ui.designsystem.button

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.PlainTooltip
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipAnchorPosition
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowBack

@Composable
fun DexIconButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tooltipAnchorPosition: TooltipAnchorPosition = TooltipAnchorPosition.Above,
) {
    TooltipBox(
        positionProvider = TooltipDefaults.rememberTooltipPositionProvider(tooltipAnchorPosition),
        tooltip = { PlainTooltip { Text(contentDescription) } },
        state = rememberTooltipState(),
    ) {
        IconButton(
            modifier = modifier,
            onClick = onClick,
            shapes = IconButtonDefaults.shapes(),
        ) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
            )
        }
    }
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        DexIconButton(
            icon = DexIcons.Material.ArrowBack,
            contentDescription = "",
            onClick = {},
        )
    }
}
