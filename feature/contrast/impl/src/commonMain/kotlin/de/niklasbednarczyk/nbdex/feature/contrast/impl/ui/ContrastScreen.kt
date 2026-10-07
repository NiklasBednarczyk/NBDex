package de.niklasbednarczyk.nbdex.feature.contrast.impl.ui

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
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.NBSegmentedListSingleSelection
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBSmallTopAppBar
import de.niklasbednarczyk.nbdex.core.ui.model.settings.ext.stringResource
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.contrast_title
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ContrastScreen() {
    val viewModel = koinViewModel<ContrastViewModel>()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    ContrastScreen(
        uiState = uiState,
        onBack = viewModel::navigateBack,
        onContrastClick = viewModel::updateContrast,
    )
}

@Composable
private fun ContrastScreen(
    uiState: ContrastUiState,
    onBack: () -> Unit,
    onContrastClick: (contrast: CoreSettingsContrast) -> Unit,
    modifier: Modifier = Modifier,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    Scaffold(
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            NBSmallTopAppBar(
                scrollBehavior = scrollBehavior,
                titleText = stringResource(Res.string.contrast_title),
                onBack = onBack,
            )
        },
    ) { innerPadding ->
        when (uiState) {
            ContrastUiState.Initial -> {}

            is ContrastUiState.Success -> {
                NBSegmentedListSingleSelection(
                    items = uiState.contrasts,
                    selectedItem = uiState.selectedContrast,
                    onClick = onContrastClick,
                    getKey = { contrast -> contrast },
                    getContentText = { contrast -> stringResource(contrast.stringResource) },
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
        var selectedContrast by remember { mutableStateOf(CoreSettingsContrast.MEDIUM) }

        ContrastScreen(
            uiState = ContrastUiState.Success(
                selectedContrast = selectedContrast,
            ),
            onBack = {},
            onContrastClick = { contrast -> selectedContrast = contrast },
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
        ContrastScreen(
            uiState = ContrastUiState.Initial,
            onBack = {},
            onContrastClick = {},
        )
    }
}

@Preview
@Composable
private fun InitialMultiplePanesPreview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
        isSinglePane = false,
    ) {
        ContrastScreen(
            uiState = ContrastUiState.Initial,
            onBack = {},
            onContrastClick = {},
        )
    }
}
