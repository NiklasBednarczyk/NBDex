package de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.common.util.string.nbCapitalize
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.versiongroup.CoreDisplayModelVersionGroup
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.versiongroup.CoreDisplayModelVersionGroupVersion
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersion
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersionGroup
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.NBExtendedColor
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.extendedColor
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.stringResourceAbbreviation
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.stringResourceText
import org.jetbrains.compose.resources.stringResource

@Composable
fun CoreDisplayViewVersionGroups(
    versionGroups: List<CoreDisplayModelVersionGroup>,
    showAbbreviations: Boolean,
) {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(NBTheme.dimensions.padding.small),
        verticalArrangement = Arrangement.spacedBy(NBTheme.dimensions.padding.small),
    ) {
        versionGroups.forEach { versionGroup ->
            CoreDisplayViewVersionGroup(
                versionGroup = versionGroup,
                showAbbreviations = showAbbreviations,
            )
        }
    }
}

@Composable
fun CoreDisplayViewVersionGroup(
    versionGroup: CoreDisplayModelVersionGroup,
    showAbbreviations: Boolean,
) {
    val shape = NBTheme.shapes.small

    Row(
        modifier = Modifier
            .clip(shape)
            .border(
                width = NBTheme.dimensions.component.chip.containerOutlineWidth,
                color = NBTheme.colorScheme.outlineVariant,
                shape = shape,
            )
            .height(IntrinsicSize.Max)
            .width(IntrinsicSize.Max),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        when (val versionGroupDisplayType = versionGroup.displayType) {
            is CoreDisplayTypeVersionGroup.Basic,
            null -> {
                versionGroup.versions.forEach { version ->
                    val versionDisplayType = version.displayType
                    val versionName = version.versionName.name
                    VersionText(
                        extendedColor = versionDisplayType?.extendedColor,
                        text = if (showAbbreviations) {
                            versionDisplayType?.stringResourceAbbreviation?.let { stringResource ->
                                stringResource(stringResource)
                            } ?: versionName.filter { char -> char.isUpperCase() || char.isDigit() }
                        } else {
                            versionName
                        },
                    )
                }
            }

            is CoreDisplayTypeVersionGroup.SameVersions -> {
                VersionText(
                    extendedColor = versionGroupDisplayType.extendedColor,
                    text = if (showAbbreviations) {
                        stringResource(versionGroupDisplayType.stringResourceAbbreviation)
                    } else {
                        stringResource(versionGroupDisplayType.stringResourceText)
                    },
                )
            }
        }
    }
}

@Composable
private fun RowScope.VersionText(
    extendedColor: NBExtendedColor?,
    text: String,
) {
    val color = extendedColor?.color ?: NBTheme.colorScheme.background
    val onColor = extendedColor?.onColor ?: NBTheme.colorScheme.onBackground

    Box(
        modifier = Modifier
            .background(color)
            .padding(
                horizontal = NBTheme.dimensions.padding.medium,
                vertical = NBTheme.dimensions.padding.small,
            )
            .weight(1f),
        contentAlignment = Alignment.Center,
    ) {
        NBTextSingleLine(
            modifier = Modifier.fillMaxWidth(),
            text = text,
            color = onColor,
            style = NBTheme.typography.labelSmall,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview
@Composable
private fun PreviewVersionGroup(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        val versionGroups = listOf(
            CoreDisplayModelVersionGroup.example(
                versions = listOf(
                    CoreDisplayModelVersionGroupVersion.example(
                        versionName = CoreVersionName.example(
                            name = "Version"
                        )
                    ),
                ),
            ),
            CoreDisplayModelVersionGroup.example(
                versions = listOf(
                    CoreDisplayModelVersionGroupVersion.example(
                        versionName = CoreVersionName.example(
                            name = "Version 1"
                        )
                    ),
                    CoreDisplayModelVersionGroupVersion.example(
                        versionName = CoreVersionName.example(
                            name = "Version 2"
                        )
                    ),
                ),
            ),
        )

        CoreDisplayViewVersionGroups(
            versionGroups = versionGroups,
            showAbbreviations = false,
        )
        CoreDisplayViewVersionGroups(
            versionGroups = versionGroups,
            showAbbreviations = true,
        )
    }
}

@Preview
@Composable
private fun PreviewVersion(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        CoreDisplayTypeVersion.entries.forEach { displayType ->
            Row {
                VersionText(
                    extendedColor = displayType.extendedColor,
                    text = displayType.name.nbCapitalize(),
                )
            }
        }
    }
}
