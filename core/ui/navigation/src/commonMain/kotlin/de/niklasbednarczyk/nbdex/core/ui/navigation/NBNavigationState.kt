package de.niklasbednarczyk.nbdex.core.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavEntryDecorator
import androidx.navigation3.runtime.rememberDecoratedNavEntries
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import kotlinx.coroutines.flow.Flow

class NBNavigationState(
    internal val startKey: NBNavKey,
    internal val topLevelKeys: Set<NBNavKey>,
) {
    val topLevelStack: SnapshotStateList<NBNavKey> = mutableStateListOf(startKey)
    internal val subStacks = topLevelKeys.associateWith { navKey -> mutableStateListOf(navKey) }

    val currentTopLevelKey: NBNavKey by derivedStateOf { topLevelStack.last() }

    internal val currentSubStack: SnapshotStateList<NBNavKey>
        get() = subStacks[currentTopLevelKey]
            ?: error("Sub stack for $currentTopLevelKey does not exist")

    internal val currentKey: NBNavKey by derivedStateOf { currentSubStack.last() }

    val currentKeyFlow: Flow<NBNavKey> = snapshotFlow { currentKey }
}

@Composable
fun NBNavigationState.toEntries(
    entryProvider: (NBNavKey) -> NavEntry<NBNavKey>,
): SnapshotStateList<NavEntry<NBNavKey>> {
    val decoratedEntries = subStacks.mapValues { (_, backStack) ->
        val entryDecorators = listOf<NavEntryDecorator<NBNavKey>>(
            rememberSaveableStateHolderNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator(),
        )
        rememberDecoratedNavEntries(
            backStack = backStack,
            entryDecorators = entryDecorators,
            entryProvider = entryProvider,
        )
    }

    return topLevelStack
        .flatMap { decoratedEntries[it].orEmpty() }
        .toMutableStateList()
}
