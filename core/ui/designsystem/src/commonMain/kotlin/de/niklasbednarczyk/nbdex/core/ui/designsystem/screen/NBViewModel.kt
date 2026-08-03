package de.niklasbednarczyk.nbdex.core.ui.designsystem.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

abstract class NBViewModel : ViewModel() {

    protected fun <T> Flow<T>.nbStateIn(
        initialValue: T,
    ): StateFlow<T> = stateIn(
        scope = viewModelScope,
        started = SharingStarted.Lazily,
        initialValue = initialValue,
    )

}