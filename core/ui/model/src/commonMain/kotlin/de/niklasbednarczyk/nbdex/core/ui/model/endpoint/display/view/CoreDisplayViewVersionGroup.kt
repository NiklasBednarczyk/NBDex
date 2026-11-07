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
import de.niklasbednarczyk.nbdex.core.common.util.string.dexCapitalize
import de.niklasbednarczyk.nbdex.core.model.endpoint.CoreVersionName
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.versiongroup.CoreDisplayModelVersionGroup
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.model.versiongroup.CoreDisplayModelVersionGroupVersion
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersion
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersionGroup
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.DexPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.DexTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.DexExtendedColor
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.extendedColor
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.stringResourceAbbreviation
import de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext.stringResourceText
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import org.jetbrains.compose.resources.stringResource

@Composable
fun CoreDisplayViewVersionGroups(
    versionGroups: ImmutableList<CoreDisplayModelVersionGroup>,
    showAbbreviations: Boolean,
    modifier: Modifier = Modifier,
) {
    FlowRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(DexTheme.dimensions.padding.small),
        verticalArrangement = Arrangement.spacedBy(DexTheme.dimensions.padding.small),
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
    modifier: Modifier = Modifier,
) {
    val shape = DexTheme.shapes.small

    Row(
        modifier = modifier
            .clip(shape)
            .border(
                width = DexTheme.dimensions.component.chip.containerOutlineWidth,
                color = DexTheme.colorScheme.outlineVariant,
                shape = shape,
            )
            .height(IntrinsicSize.Max)
            .width(IntrinsicSize.Max),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        when (val versionGroupDisplayType = versionGroup.displayType) {
            is CoreDisplayTypeVersionGroup.Basic,
            null,
                -> {
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
    extendedColor: DexExtendedColor?,
    text: String,
    modifier: Modifier = Modifier,
) {
    val color = extendedColor?.color ?: DexTheme.colorScheme.background
    val onColor = extendedColor?.onColor ?: DexTheme.colorScheme.onBackground

    Box(
        modifier = modifier
            .background(color)
            .padding(
                horizontal = DexTheme.dimensions.padding.medium,
                vertical = DexTheme.dimensions.padding.small,
            )
            .weight(1f),
        contentAlignment = Alignment.Center,
    ) {
        DexTextSingleLine(
            modifier = Modifier.fillMaxWidth(),
            text = text,
            color = onColor,
            style = DexTheme.typography.labelSmall,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview
@Composable
private fun VersionGroupPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        val versionGroups = persistentListOf(
            CoreDisplayModelVersionGroup.example(
                versions = listOf(
                    CoreDisplayModelVersionGroupVersion.example(
                        versionName = CoreVersionName.example(
                            name = "Version",
                        ),
                    ),
                ),
            ),
            CoreDisplayModelVersionGroup.example(
                versions = listOf(
                    CoreDisplayModelVersionGroupVersion.example(
                        versionName = CoreVersionName.example(
                            name = "Version 1",
                        ),
                    ),
                    CoreDisplayModelVersionGroupVersion.example(
                        versionName = CoreVersionName.example(
                            name = "Version 2",
                        ),
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
private fun VersionPreview(
    @PreviewParameter(DexPreviewInfoPreviewParameterProvider::class) previewInfo: DexPreviewInfo,
) {
    DexPreview(
        previewInfo = previewInfo,
    ) {
        CoreDisplayTypeVersion.entries.forEach { displayType ->
            Row {
                VersionText(
                    extendedColor = displayType.extendedColor,
                    text = displayType.name.dexCapitalize(),
                )
            }
        }
    }
}
