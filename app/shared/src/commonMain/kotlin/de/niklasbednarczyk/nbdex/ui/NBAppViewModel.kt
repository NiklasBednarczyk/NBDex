package de.niklasbednarczyk.nbdex.ui

import androidx.compose.material3.adaptive.layout.PaneExpansionAnchor
import androidx.lifecycle.viewModelScope
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBViewModel
import de.niklasbednarczyk.nbdex.core.ui.model.settings.ext.paneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.ui.navigation.NBNavigator
import de.niklasbednarczyk.nbdex.data.settings.api.repository.SettingsRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class NBAppViewModel(
    val navigator: NBNavigator,
    private val settingsRepository: SettingsRepository,
) : NBViewModel() {

    val uiState: StateFlow<NBAppState> = settingsRepository
        .getSettings()
        .map { settings ->
            NBAppState.Success(
                paneExpansionAnchor = settings.paneExpansionAnchor,
                theme = settings.theme,
                contrast = settings.contrast,
            )
        }
        .nbStateIn(NBAppState.Initial)

    fun updatePaneExpansionAnchor(
        paneExpansionAnchor: PaneExpansionAnchor?
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