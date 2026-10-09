package de.niklasbednarczyk.nbdex.feature.more.impl.ui

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.NBSegmentedListSingleActionGroup
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBCenteredTopAppBar
import de.niklasbednarczyk.nbdex.core.ui.model.settings.ext.stringResource
import de.niklasbednarczyk.nbdex.feature.more.impl.ui.model.MoreDestination
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.more_title
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MoreScreen() {
    val viewModel = koinViewModel<MoreViewModel>()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    MoreScreen(
        uiState = uiState,
        onAboutClick = viewModel::navigateToAbout,
        onContrastClick = viewModel::navigateToContrast,
        onThemeClick = viewModel::navigateToTheme,
    )
}

@Composable
private fun MoreScreen(
    uiState: MoreUiState,
    onAboutClick: () -> Unit,
    onContrastClick: () -> Unit,
    onThemeClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            NBCenteredTopAppBar(
                scrollBehavior = scrollBehavior,
                titleText = stringResource(Res.string.more_title),
            )
        },
    ) { innerPadding ->
        when (uiState) {
            MoreUiState.Initial -> {}

            is MoreUiState.Success -> {
                NBSegmentedListSingleActionGroup(
                    map = uiState.sectionsWithDestinations,
                    selectedItem = uiState.selectedDestination,
                    getKeyGroup = { section -> section },
                    getKeyItem = { destination -> destination },
                    getContentTypeKlassGroup = { section -> section::class },
                    getContentTypeKlassItem = { destination -> destination::class },
                    onClick = { destination ->
                        when (destination) {
                            MoreDestination.ABOUT -> onAboutClick()
                            MoreDestination.CONTRAST -> onContrastClick()
                            MoreDestination.THEME -> onThemeClick()
                        }
                    },
                    getGroupText = { section -> stringResource(section.titleStringResource) },
                    getContentText = { destination -> stringResource(destination.titleStringResource) },
                    getSupportingContent = { destination ->
                        val resource = when (destination) {
                            MoreDestination.ABOUT -> null
                            MoreDestination.CONTRAST -> uiState.selectedContrast.stringResource
                            MoreDestination.THEME -> uiState.selectedTheme.stringResource
                        }
                        if (resource != null) {
                            Text(
                                text = stringResource(resource),
                            )
                        }
                    },
                    getLeadingIcon = { destination -> destination.leadingIcon },
                    additionalContentPadding = innerPadding,
                )
            }
        }
    }
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        var selectedDestination by remember { mutableStateOf<MoreDestination?>(null) }

        MoreScreen(
            uiState = MoreUiState.Success(
                selectedDestination = selectedDestination,
                selectedTheme = CoreSettingsTheme.DARK,
                selectedContrast = CoreSettingsContrast.MEDIUM,
            ),
            onAboutClick = { selectedDestination = MoreDestination.ABOUT },
            onContrastClick = { selectedDestination = MoreDestination.CONTRAST },
            onThemeClick = { selectedDestination = MoreDestination.THEME },
        )
    }
}

@Preview
@Composable
private fun InitialPreview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        MoreScreen(
            uiState = MoreUiState.Initial,
            onAboutClick = {},
            onContrastClick = {},
            onThemeClick = {},
        )
    }
}
