package de.niklasbednarczyk.nbdex.feature.about.impl.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.ui.designsystem.ext.plus
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.NBSegmentedListItemBasic
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.NBSegmentedListItemSingleAction
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.listItemDefaultContainerColor
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.listItemGap
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBSmallTopAppBar
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBSectionTitle
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.OpenInNew
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.AboutContent
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.AboutListItem
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.AboutSection
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.listitem.AboutListItemSupportingContent
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.listitem.AboutListItemType
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.about_title
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun AboutScreen() {
    val viewModel = koinViewModel<AboutViewModel>()
    val uiState = viewModel.uiState

    AboutScreen(
        uiState = uiState,
        onBack = viewModel::navigateBack,
    )
}

@Composable
private fun AboutScreen(
    uiState: AboutUiState,
    onBack: () -> Unit,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            NBSmallTopAppBar(
                scrollBehavior = scrollBehavior,
                titleText = stringResource(Res.string.about_title),
                onBack = onBack,
            )
        },
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = innerPadding + NBTheme.dimensions.padding.screenPaddingValues,
        ) {
            uiState.sectionsWithContent.forEach { (section, content) ->
                item(
                    key = section,
                    contentType = AboutSection::class,
                ) {
                    NBSectionTitle(
                        title = stringResource(section.titleStringResource),
                    )
                }
                when (content) {
                    is AboutContent.Card -> {
                        item {
                            Card(
                                card = content,
                            )
                        }
                    }

                    is AboutContent.SegmentedList -> {
                        itemsIndexed(
                            items = content.items,
                        ) { index, listItem ->
                            ListItem(
                                listItem = listItem,
                                index = index,
                                count = content.items.size,
                            )

                            if (index != content.items.lastIndex) {
                                Spacer(Modifier.height(listItemGap))
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun Card(
    card: AboutContent.Card,
) {
    Box(
        modifier = Modifier
            .clip(NBTheme.shapes.medium)
            .background(listItemDefaultContainerColor)
            .padding(NBTheme.dimensions.padding.large)
            .fillMaxWidth(),
    ) {
        Text(
            text = stringResource(card.textStringResource),
            style = NBTheme.typography.bodyLarge,
            color = NBTheme.colorScheme.onSurface,
        )
    }
}

@Composable
private fun ListItem(
    listItem: AboutListItem,
    index: Int,
    count: Int,
) {
    val contentText = stringResource(listItem.contentStringResource)
    val supportingContentText = when (val supportingContent = listItem.supportingContent) {
        AboutListItemSupportingContent.None -> null
        is AboutListItemSupportingContent.Resource -> stringResource(supportingContent.stringResource)
        is AboutListItemSupportingContent.Text -> supportingContent.text
    }
    val leadingIcon = listItem.leadingIcon

    when (val type = listItem.type) {
        AboutListItemType.Basic -> {
            NBSegmentedListItemBasic(
                index = index,
                count = count,
                contentText = contentText,
                supportingContent = {
                    supportingContentText?.let { text ->
                        Text(
                            text = text,
                        )
                    }
                },
                leadingIcon = leadingIcon,
            )
        }

        is AboutListItemType.Link -> {
            val uriHandler = LocalUriHandler.current
            NBSegmentedListItemSingleAction(
                onClick = { uriHandler.openUri(type.url) },
                index = index,
                count = count,
                contentText = contentText,
                supportingContent = {
                    supportingContentText?.let { text ->
                        Text(
                            text = text,
                        )
                    }
                },
                leadingIcon = leadingIcon,
                trailingIcon = NBIcons.Material.OpenInNew,
            )
        }
    }
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        AboutScreen(
            uiState = AboutUiState,
            onBack = {},
        )
    }
}

@Preview
@Composable
private fun PreviewMultiplePanes(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
        isSinglePane = false,
    ) {
        AboutScreen(
            uiState = AboutUiState,
            onBack = {},
        )
    }
}
