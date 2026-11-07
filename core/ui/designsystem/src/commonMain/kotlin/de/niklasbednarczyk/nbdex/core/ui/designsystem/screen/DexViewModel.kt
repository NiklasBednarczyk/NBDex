package de.niklasbednarczyk.nbdex.core.ui.designsystem.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

open class DexViewModel : ViewModel() {
    protected fun <T> Flow<T>.dexStateIn(
        initialValue: T,
    ): StateFlow<T> = stateIn(
        scope = viewModelScope,
        started = SharingStarted.Lazily,
        initialValue = initialValue,
    )
}
