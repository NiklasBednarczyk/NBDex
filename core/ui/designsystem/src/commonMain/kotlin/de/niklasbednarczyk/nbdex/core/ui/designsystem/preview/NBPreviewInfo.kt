package de.niklasbednarczyk.nbdex.core.ui.designsystem.preview

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast

@Immutable
data class NBPreviewInfo(
    val isDarkTheme: Boolean,
    val contrast: CoreSettingsContrast,
)