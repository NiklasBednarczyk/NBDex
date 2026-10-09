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
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowDropDown
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowDropUp
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Check
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.content_description_icon_arrow_drop_down
import nbdex.core.ui.resource.generated.resources.content_description_icon_arrow_drop_up
import nbdex.core.ui.resource.generated.resources.content_description_icon_check
import org.jetbrains.compose.resources.stringResource

@Composable
fun NBFilterChip(
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
            NBTextSingleLine(
                modifier = Modifier.animateContentSize(),
                text = labelText,
            )
        },
        leadingIcon =
            if (selected) {
                {
                    Icon(
                        imageVector = NBIcons.Material.Check,
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
                    NBIcons.Material.ArrowDropUp
                } else {
                    NBIcons.Material.ArrowDropDown
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
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        var expandedSelected by remember { mutableStateOf(false) }
        var expandedNotSelected by remember { mutableStateOf(false) }

        NBFilterChip(
            labelText = "Selected",
            selected = true,
            expanded = expandedSelected,
            onClick = { expandedSelected = !expandedSelected },
        )
        NBFilterChip(
            labelText = "Not selected",
            selected = false,
            expanded = expandedNotSelected,
            onClick = { expandedNotSelected = !expandedNotSelected },
        )
    }
}
