package de.niklasbednarczyk.nbdex.core.ui.navigation

class DexNavigator(
    val state: DexNavigationState,
) {
    fun navigate(
        key: DexNavKey,
    ) {
        when (key) {
            state.currentTopLevelKey -> clearSubStack()
            in state.topLevelKeys -> goToTopLevel(key)
            else -> goToKey(key)
        }
    }

    fun onBack() {
        when (state.currentKey) {
            state.startKey -> error("You cannot go back from the start route")
            state.currentTopLevelKey -> state.topLevelStack.removeLastOrNull()
            else -> state.currentSubStack.removeLastOrNull()
        }
    }

    private fun goToKey(
        key: DexNavKey,
    ) {
        state.currentSubStack.apply {
            removeAll { navKey -> navKey::class == key::class }
            add(key)
        }
    }

    private fun goToTopLevel(
        key: DexNavKey,
    ) {
        state.topLevelStack.apply {
            if (key == state.startKey) {
                clear()
            } else {
                remove(key)
            }
            add(key)
        }
    }

    private fun clearSubStack() {
        state.currentSubStack.run {
            if (size > 1) {
                subList(
                    fromIndex = 1,
                    toIndex = size,
                )
                    .clear()
            }
        }
    }
}
