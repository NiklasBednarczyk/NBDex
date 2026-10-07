package de.niklasbednarczyk.nbdex.core.model.settings

data class CoreSettings(
    val paneExpansionAnchor: CoreSettingsPaneExpansionAnchor?,
    val theme: CoreSettingsTheme,
    val contrast: CoreSettingsContrast,
)
