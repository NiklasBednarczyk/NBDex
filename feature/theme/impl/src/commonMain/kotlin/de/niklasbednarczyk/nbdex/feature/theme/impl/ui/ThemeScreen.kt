package de.niklasbednarczyk.nbdex.feature.theme.impl.ui

import androidx.compose.material3.Scaffold
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
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme.DARK
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.NBSegmentedListSingleSelection
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBSmallTopAppBar
import de.niklasbednarczyk.nbdex.core.ui.model.settings.ext.stringResource
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.theme_title
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ThemeScreen() {
    val viewModel = koinViewModel<ThemeViewModel>()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    ThemeScreen(
        uiState = uiState,
        onBack = viewModel::navigateBack,
        onThemeClicked = viewModel::updateTheme,
    )
}

@Composable
private fun ThemeScreen(
    uiState: ThemeUiState,
    onBack: () -> Unit,
    onThemeClicked: (theme: CoreSettingsTheme) -> Unit,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            NBSmallTopAppBar(
                scrollBehavior = scrollBehavior,
                titleText = stringResource(Res.string.theme_title),
                onBack = onBack,
            )
        },
    ) { innerPadding ->
        when (uiState) {
            ThemeUiState.Initial -> {}
            is ThemeUiState.Success -> {
                NBSegmentedListSingleSelection(
                    items = uiState.themes,
                    selectedItem = uiState.selectedTheme,
                    onClick = onThemeClicked,
                    getKey = { theme -> theme },
                    getContentText = { theme -> stringResource(theme.stringResource) },
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
        var selectedTheme by remember { mutableStateOf(DARK) }

        ThemeScreen(
            uiState = ThemeUiState.Success(
                selectedTheme = selectedTheme,
            ),
            onBack = {},
            onThemeClicked = { theme -> selectedTheme = theme },
        )
    }
}


@Preview
@Composable
private fun PreviewInitial(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        ThemeScreen(
            uiState = ThemeUiState.Initial,
            onBack = {},
            onThemeClicked = {},
        )
    }
}

@Preview
@Composable
private fun PreviewInitialMultiplePanes(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
        isSinglePane = false,
    ) {
        ThemeScreen(
            uiState = ThemeUiState.Initial,
            onBack = {},
            onThemeClicked = {},
        )
    }
}
