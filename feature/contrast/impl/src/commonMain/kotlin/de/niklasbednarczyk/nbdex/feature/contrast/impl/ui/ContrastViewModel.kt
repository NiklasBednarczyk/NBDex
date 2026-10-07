package de.niklasbednarczyk.nbdex.feature.contrast.impl.ui

import androidx.lifecycle.viewModelScope
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBViewModel
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.data.settings.api.repository.SettingsRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

internal class ContrastViewModel(
    private val navigation: NBNavigator,
    private val settingsRepository: SettingsRepository,
) : NBViewModel() {
    val uiState: StateFlow<ContrastUiState> = settingsRepository
        .getSettings()
        .map { settings ->
            ContrastUiState.Success(
                selectedContrast = settings.contrast,
            )
        }
        .nbStateIn(ContrastUiState.Initial)

    fun navigateBack() {
        navigation.onBack()
    }

    fun updateContrast(
        contrast: CoreSettingsContrast,
    ) {
        viewModelScope.launch {
            settingsRepository.updateContrast(
                contrast = contrast,
            )
        }
    }
}
