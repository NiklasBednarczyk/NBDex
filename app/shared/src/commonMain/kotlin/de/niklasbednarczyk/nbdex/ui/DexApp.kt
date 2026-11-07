package de.niklasbednarczyk.nbdex.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfoV2
import androidx.compose.material3.adaptive.layout.PaneExpansionAnchor
import androidx.compose.material3.adaptive.layout.calculatePaneScaffoldDirective
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.app.rememberIsDarkTheme
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator
import org.koin.compose.navigation3.koinEntryProvider
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun DexApp() {
    val viewModel = koinViewModel<DexAppViewModel>()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val navigator = viewModel.navigator

    DexApp(
        uiState = uiState,
        navigator = navigator,
        onPaneExpansionAnchorChange = viewModel::updatePaneExpansionAnchor,
    )
}

@Composable
private fun DexApp(
    uiState: DexAppState,
    navigator: DexNavigator,
    onPaneExpansionAnchorChange: (paneExpansionAnchor: PaneExpansionAnchor?) -> Unit,
    modifier: Modifier = Modifier,
) {
    val entryProvider = koinEntryProvider<DexNavKey>()

    val windowAdaptiveInfo = currentWindowAdaptiveInfoV2()

    val paneScaffoldDirective = remember(windowAdaptiveInfo) {
        calculatePaneScaffoldDirective(windowAdaptiveInfo)
    }
    Box(
        modifier = modifier.fillMaxSize(),
    ) {
        when (uiState) {
            DexAppState.Initial -> {}

            is DexAppState.Success -> {
                val isDarkTheme = rememberIsDarkTheme(uiState.theme)
                DexTheme(
                    isDarkTheme = isDarkTheme,
                    contrast = uiState.contrast,
                    isSinglePane = paneScaffoldDirective.maxHorizontalPartitions == 1,
                ) {
                    DexNavigationSuiteScaffold(
                        navigator = navigator,
                        windowAdaptiveInfo = windowAdaptiveInfo,
                    ) {
                        DexNavDisplay(
                            navigator = navigator,
                            entryProvider = entryProvider,
                            paneScaffoldDirective = paneScaffoldDirective,
                            paneExpansionAnchor = uiState.paneExpansionAnchor,
                            onPaneExpansionAnchorChange = onPaneExpansionAnchorChange,
                        )
                    }
                }
            }
        }
    }
}
