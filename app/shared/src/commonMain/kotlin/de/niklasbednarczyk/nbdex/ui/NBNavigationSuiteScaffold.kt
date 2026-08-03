package de.niklasbednarczyk.nbdex.ui

import androidx.compose.material3.Icon
import androidx.compose.material3.adaptive.WindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBTopLevelDestination
import de.niklasbednarczyk.nbdex.util.navKey
import org.jetbrains.compose.resources.stringResource

@Composable
fun NBNavigationSuiteScaffold(
    navigator: NBNavigator,
    windowAdaptiveInfo: WindowAdaptiveInfo,
    content: @Composable () -> Unit
) {
    val navigationSuiteType = remember(windowAdaptiveInfo) {
        NavigationSuiteScaffoldDefaults.navigationSuiteType(windowAdaptiveInfo)
    }

    NavigationSuiteScaffold(
        navigationItems = {
            NBTopLevelDestination.entries.forEach { topLevelDestination ->
                val navKey = topLevelDestination.navKey
                val selected = navKey == navigator.state.currentTopLevelKey

                NavigationSuiteItem(
                    selected = selected,
                    onClick = { navigator.navigate(navKey) },
                    icon = {
                        Icon(
                            imageVector = if (selected) {
                                topLevelDestination.selectedIcon
                            } else {
                                topLevelDestination.unselectedIcon
                            },
                            contentDescription = null,
                        )
                    },

                    label = {
                        NBTextSingleLine(
                            text = stringResource(topLevelDestination.titleStringResource),
                        )
                    },
                    navigationSuiteType = navigationSuiteType,
                )
            }
        },
        navigationSuiteType = navigationSuiteType,
        content = content,
    )
}