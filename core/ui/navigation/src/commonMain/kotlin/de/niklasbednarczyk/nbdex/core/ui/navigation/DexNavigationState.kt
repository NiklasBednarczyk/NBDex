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

class DexNavigationState(
    internal val startKey: DexNavKey,
    internal val topLevelKeys: Set<DexNavKey>,
) {
    val topLevelStack: SnapshotStateList<DexNavKey> = mutableStateListOf(startKey)
    internal val subStacks = topLevelKeys.associateWith { navKey -> mutableStateListOf(navKey) }

    val currentTopLevelKey: DexNavKey by derivedStateOf { topLevelStack.last() }

    internal val currentSubStack: SnapshotStateList<DexNavKey>
        get() = subStacks[currentTopLevelKey]
            ?: error("Sub stack for $currentTopLevelKey does not exist")

    internal val currentKey: DexNavKey by derivedStateOf { currentSubStack.last() }

    val currentKeyFlow: Flow<DexNavKey> = snapshotFlow { currentKey }
}

@Composable
fun DexNavigationState.toEntries(
    entryProvider: (DexNavKey) -> NavEntry<DexNavKey>,
): SnapshotStateList<NavEntry<DexNavKey>> {
    val decoratedEntries = subStacks.mapValues { (_, backStack) ->
        val entryDecorators = listOf<NavEntryDecorator<DexNavKey>>(
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
