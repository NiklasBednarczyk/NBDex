package de.niklasbednarczyk.nbdex.ui

import androidx.compose.material3.adaptive.layout.PaneExpansionAnchor
import androidx.lifecycle.viewModelScope
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.DexViewModel
import de.niklasbednarczyk.nbdex.core.ui.model.settings.ext.paneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.ui.navigation.DexNavigator
import de.niklasbednarczyk.nbdex.data.settings.api.repository.SettingsRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class DexAppViewModel(
    val navigator: DexNavigator,
    private val settingsRepository: SettingsRepository,
) : DexViewModel() {
    val uiState: StateFlow<DexAppState> = settingsRepository
        .getSettings()
        .map { settings ->
            DexAppState.Success(
                paneExpansionAnchor = settings.paneExpansionAnchor,
                theme = settings.theme,
                contrast = settings.contrast,
            )
        }
        .dexStateIn(DexAppState.Initial)

    fun updatePaneExpansionAnchor(
        paneExpansionAnchor: PaneExpansionAnchor?,
    ) {
        viewModelScope.launch {
            CoreSettingsPaneExpansionAnchor
                .entries
                .firstOrNull { settingsAnchor -> settingsAnchor.paneExpansionAnchor == paneExpansionAnchor }
                ?.let { settingsPaneExpansionAnchor ->
                    settingsRepository.updatePaneExpansionAnchor(
                        paneExpansionAnchor = settingsPaneExpansionAnchor,
                    )
                }
        }
    }
}
