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
import de.niklasbednarczyk.nbdex.core.common.util.string.dexCapitalize
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreTypeName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.type.CoreDisplayModelType
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeType
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.DexTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.extendedColor
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.icon
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Composable
fun CoreDisplayViewTypes(
    types: ImmutableList<CoreDisplayModelType>?,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(DexTheme.dimensions.padding.small),
        modifier = modifier.fillMaxWidth(),
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
    val shape = DexTheme.shapes.small

    val icon = type.displayType?.icon

    val extendedColor = type.displayType?.extendedColor
    val color = extendedColor?.color ?: DexTheme.colorScheme.background
    val onColor = extendedColor?.onColor ?: DexTheme.colorScheme.onBackground

    Box(
        modifier = modifier
            .clip(shape)
            .border(
                width = DexTheme.dimensions.component.chip.containerOutlineWidth,
                color = DexTheme.colorScheme.outlineVariant,
                shape = shape,
            )
            .background(color)
            .heightIn(min = DexTheme.dimensions.component.chip.containerHeight),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (icon == null) {
                Spacer(modifier = Modifier.width(DexTheme.dimensions.padding.large))
            } else {
                Spacer(modifier = Modifier.width(DexTheme.dimensions.padding.medium))
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = onColor,
                    modifier = Modifier.size(DexTheme.dimensions.component.chip.iconSize),
                )
                Spacer(modifier = Modifier.width(DexTheme.dimensions.padding.medium))
            }
            DexTextSingleLine(
                text = type.typeName.name,
                color = onColor,
                style = DexTheme.typography.labelSmall,
            )
            Spacer(modifier = Modifier.width(DexTheme.dimensions.padding.large))
        }
    }
}

@Preview
@Composable
private fun ListPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        CoreDisplayViewTypes(
            types = persistentListOf(
                CoreDisplayModelType.example(
                    typeName = CoreTypeName.example(
                        name = "Type",
                    ),
                ),
            ),
        )
        CoreDisplayViewTypes(
            types = persistentListOf(
                CoreDisplayModelType.example(
                    typeName = CoreTypeName.example(
                        name = "Type 1",
                    ),
                ),
                CoreDisplayModelType.example(
                    typeName = CoreTypeName.example(
                        name = "Type 2",
                    ),
                ),
            ),
        )
    }
}

@Preview
@Composable
private fun ItemPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        CoreDisplayViewType(
            type = CoreDisplayModelType.example(
                typeName = CoreTypeName.example(
                    name = "Type",
                ),
            ),
        )
        CoreDisplayTypeType.entries.forEach { displayType ->
            CoreDisplayViewType(
                type = CoreDisplayModelType.example(
                    typeName = CoreTypeName.example(
                        typeId = displayType.id,
                        name = displayType.name.dexCapitalize(),
                    ),
                ),
            )
        }
    }
}
