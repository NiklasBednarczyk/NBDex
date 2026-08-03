package de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.common.util.string.nbCapitalize
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.type.CoreDisplayModelType
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeType
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.extendedColor
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.icon

@Composable
fun CoreDisplayViewTypes(
    types: List<CoreDisplayModelType>?,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(NBTheme.dimensions.padding.small),
        modifier = Modifier.fillMaxWidth(),
    ) {
        types?.forEach { type ->
            CoreDisplayViewType(
                type = type,
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun CoreDisplayViewType(
    type: CoreDisplayModelType,
    modifier: Modifier = Modifier,
) {
    val shape = NBTheme.shapes.small

    val icon = type.displayType?.icon

    val extendedColor = type.displayType?.extendedColor
    val color = extendedColor?.color ?: NBTheme.colorScheme.background
    val onColor = extendedColor?.onColor ?: NBTheme.colorScheme.onBackground

    Box(
        modifier = modifier
            .clip(shape)
            .border(
                width = NBTheme.dimensions.component.chip.containerOutlineWidth,
                color = NBTheme.colorScheme.outlineVariant,
                shape = shape,
            )
            .background(color)
            .heightIn(min = NBTheme.dimensions.component.chip.containerHeight),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (icon == null) {
                Spacer(modifier = Modifier.width(NBTheme.dimensions.padding.large))
            } else {
                Spacer(modifier = Modifier.width(NBTheme.dimensions.padding.medium))
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = onColor,
                    modifier = Modifier.size(NBTheme.dimensions.component.chip.iconSize),
                )
                Spacer(modifier = Modifier.width(NBTheme.dimensions.padding.medium))
            }
            NBTextSingleLine(
                text = type.typeName.name,
                color = onColor,
                style = NBTheme.typography.labelSmall,
            )
            Spacer(modifier = Modifier.width(NBTheme.dimensions.padding.large))
        }
    }
}

@Preview
@Composable
private fun PreviewList(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        CoreDisplayViewTypes(
            types = listOf(
                CoreDisplayModelType.example(
                    typeName = CoreTypeName.example(
                        name = "Type",
                    )
                ),
            ),
        )
        CoreDisplayViewTypes(
            types = listOf(
                CoreDisplayModelType.example(
                    typeName = CoreTypeName.example(
                        name = "Type 1",
                    )
                ),
                CoreDisplayModelType.example(
                    typeName = CoreTypeName.example(
                        name = "Type 2",
                    )
                ),
            ),
        )
    }
}

@Preview
@Composable
private fun PreviewItem(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        CoreDisplayViewType(
            type = CoreDisplayModelType.example(
                typeName = CoreTypeName.example(
                    name = "Type",
                )
            ),
        )
        CoreDisplayTypeType.entries.forEach { displayType ->
            CoreDisplayViewType(
                type = CoreDisplayModelType.example(
                    typeName = CoreTypeName.example(
                        typeId = displayType.id,
                        name = displayType.name.nbCapitalize(),
                    ),
                ),
            )
        }
    }
}