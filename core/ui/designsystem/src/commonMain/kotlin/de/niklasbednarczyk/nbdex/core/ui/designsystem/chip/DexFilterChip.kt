package de.niklasbednarczyk.nbdex.core.ui.designsystem.chip

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.DexTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowDropDown
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowDropUp
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Check
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.content_description_icon_arrow_drop_down
import nbdex.core.ui.resource.generated.resources.content_description_icon_arrow_drop_up
import nbdex.core.ui.resource.generated.resources.content_description_icon_check
import org.jetbrains.compose.resources.stringResource

@Composable
fun DexFilterChip(
    labelText: String,
    selected: Boolean,
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    FilterChip(
        modifier = modifier.animateContentSize(),
        selected = selected,
        onClick = onClick,
        label = {
            DexTextSingleLine(
                modifier = Modifier.animateContentSize(),
                text = labelText,
            )
        },
        leadingIcon =
            if (selected) {
                {
                    Icon(
                        imageVector = DexIcons.Material.Check,
                        contentDescription = stringResource(Res.string.content_description_icon_check),
                        modifier = Modifier.size(FilterChipDefaults.IconSize),
                    )
                }
            } else {
                null
            },
        trailingIcon = {
            Icon(
                imageVector = if (expanded) {
                    DexIcons.Material.ArrowDropUp
                } else {
                    DexIcons.Material.ArrowDropDown
                },
                contentDescription = if (expanded) {
                    stringResource(Res.string.content_description_icon_arrow_drop_up)
                } else {
                    stringResource(Res.string.content_description_icon_arrow_drop_down)
                },
                modifier = Modifier.size(FilterChipDefaults.IconSize),
            )
        },
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
        var expandedSelected by remember { mutableStateOf(false) }
        var expandedNotSelected by remember { mutableStateOf(false) }

        DexFilterChip(
            labelText = "Selected",
            selected = true,
            expanded = expandedSelected,
            onClick = { expandedSelected = !expandedSelected },
        )
        DexFilterChip(
            labelText = "Not selected",
            selected = false,
            expanded = expandedNotSelected,
            onClick = { expandedNotSelected = !expandedNotSelected },
        )
    }
}
