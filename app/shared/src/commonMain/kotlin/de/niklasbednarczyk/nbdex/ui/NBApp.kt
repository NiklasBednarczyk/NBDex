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
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.app.rememberIsDarkTheme
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import org.koin.compose.navigation3.koinEntryProvider
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun NBApp() {
    val viewModel = koinViewModel<NBAppViewModel>()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val navigator = viewModel.navigator

    NBApp(
        uiState = uiState,
        navigator = navigator,
        onPaneExpansionAnchorChange = viewModel::updatePaneExpansionAnchor,
    )
}

@Composable
private fun NBApp(
    uiState: NBAppState,
    navigator: NBNavigator,
    onPaneExpansionAnchorChange: (paneExpansionAnchor: PaneExpansionAnchor?) -> Unit,
    modifier: Modifier = Modifier,
) {
    val entryProvider = koinEntryProvider<NBNavKey>()

    val windowAdaptiveInfo = currentWindowAdaptiveInfoV2()

    val paneScaffoldDirective = remember(windowAdaptiveInfo) {
        calculatePaneScaffoldDirective(windowAdaptiveInfo)
    }
    Box(
        modifier = modifier.fillMaxSize(),
    ) {
        when (uiState) {
            NBAppState.Initial -> {}

            is NBAppState.Success -> {
                val isDarkTheme = rememberIsDarkTheme(uiState.theme)
                NBTheme(
                    isDarkTheme = isDarkTheme,
                    contrast = uiState.contrast,
                    isSinglePane = paneScaffoldDirective.maxHorizontalPartitions == 1,
                ) {
                    NBNavigationSuiteScaffold(
                        navigator = navigator,
                        windowAdaptiveInfo = windowAdaptiveInfo,
                    ) {
                        NBNavDisplay(
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
