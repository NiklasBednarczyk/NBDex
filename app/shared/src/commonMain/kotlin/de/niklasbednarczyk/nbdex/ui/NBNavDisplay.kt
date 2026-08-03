package de.niklasbednarczyk.nbdex.ui

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.material3.VerticalDragHandle
import androidx.compose.material3.adaptive.layout.PaneExpansionAnchor
import androidx.compose.material3.adaptive.layout.PaneScaffoldDirective
import androidx.compose.material3.adaptive.layout.rememberPaneExpansionState
import androidx.compose.material3.adaptive.navigation3.rememberListDetailSceneStrategy
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.ui.NavDisplay
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.ui.model.settings.ext.getInitialAnchoredIndex
import de.niklasbednarczyk.nbdex.core.ui.model.settings.ext.paneExpansionAnchors
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavKey
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.core.ui.navigation.toEntries
import org.koin.compose.navigation3.EntryProvider

@Composable
fun NBNavDisplay(
    navigator: NBNavigator,
    entryProvider: EntryProvider<NBNavKey>,
    paneScaffoldDirective: PaneScaffoldDirective,
    paneExpansionAnchor: CoreSettingsPaneExpansionAnchor?,
    onPaneExpansionAnchorChanged: (paneExpansionAnchor: PaneExpansionAnchor?) -> Unit,
) {
    val paneExpansionState = rememberPaneExpansionState(
        anchors = paneExpansionAnchors,
        initialAnchoredIndex = getInitialAnchoredIndex(
            paneExpansionAnchor = paneExpansionAnchor,
            paneScaffoldDirective = paneScaffoldDirective,
        ),
    )

    val currentAnchor = paneExpansionState.currentAnchor
    LaunchedEffect(currentAnchor) {
        onPaneExpansionAnchorChanged(currentAnchor)
    }

    val listDetailStrategy = rememberListDetailSceneStrategy<NBNavKey>(
        directive = paneScaffoldDirective,
        paneExpansionState = paneExpansionState,
        paneExpansionDragHandle = { state ->
            val interactionSource = remember { MutableInteractionSource() }
            VerticalDragHandle(
                modifier = Modifier.paneExpansionDraggable(
                    state = state,
                    minTouchTargetSize = LocalMinimumInteractiveComponentSize.current,
                    interactionSource = interactionSource,
                ),
                interactionSource = interactionSource,
            )
        }
    )

    NavDisplay(
        entries = navigator.state.toEntries(entryProvider),
        onBack = navigator::onBack,
        sceneStrategies = listOf(listDetailStrategy),
    )
}
