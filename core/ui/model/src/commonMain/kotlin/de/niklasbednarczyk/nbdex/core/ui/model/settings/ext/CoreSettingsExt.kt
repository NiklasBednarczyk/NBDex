package de.niklasbednarczyk.nbdex.core.ui.model.settings.ext

import androidx.compose.material3.adaptive.layout.PaneExpansionAnchor
import androidx.compose.material3.adaptive.layout.PaneScaffoldDirective
import androidx.compose.ui.unit.dp
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsContrast
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsPaneExpansionAnchor
import de.niklasbednarczyk.nbdex.core.model.settings.CoreSettingsTheme
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.settings_contrast_high
import nbdex.core.ui.resource.generated.resources.settings_contrast_medium
import nbdex.core.ui.resource.generated.resources.settings_contrast_standard
import nbdex.core.ui.resource.generated.resources.settings_theme_dark
import nbdex.core.ui.resource.generated.resources.settings_theme_light
import nbdex.core.ui.resource.generated.resources.settings_theme_system_default
import org.jetbrains.compose.resources.StringResource

/**
 * The default pane preferred width, defined in:
 * https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/adaptive/adaptive-layout/src/commonMain/kotlin/androidx/compose/material3/adaptive/layout/PaneScaffoldDirective.kt;drc=1fa955064d00cb5f6bd5f634e56b3977685213d0;l=345
 */
private const val DEFAULT_PANE_PREFERRED_WIDTH = 360

/**
 * The default pane preferred width for extra large screens, defined in:
 * https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/adaptive/adaptive-layout/src/commonMain/kotlin/androidx/compose/material3/adaptive/layout/PaneScaffoldDirective.kt;drc=1fa955064d00cb5f6bd5f634e56b3977685213d0;l=346
 */
private const val DEFAULT_PANE_PREFERRED_WIDTH_XL = 412

val CoreSettingsPaneExpansionAnchor.paneExpansionAnchor: PaneExpansionAnchor
    get() = when (this) {
        CoreSettingsPaneExpansionAnchor.FULL_LIST -> {
            PaneExpansionAnchor
                .Proportion(1f)
        }

        CoreSettingsPaneExpansionAnchor.FULL_DETAIL -> {
            PaneExpansionAnchor
                .Proportion(0f)
        }

        CoreSettingsPaneExpansionAnchor.HALF_LIST_HALF_DETAIL -> {
            PaneExpansionAnchor
                .Proportion(0.5f)
        }

        CoreSettingsPaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH -> {
            PaneExpansionAnchor
                .Offset
                .fromStart(DEFAULT_PANE_PREFERRED_WIDTH.dp)
        }

        CoreSettingsPaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH_XL -> {
            PaneExpansionAnchor
                .Offset
                .fromStart(DEFAULT_PANE_PREFERRED_WIDTH_XL.dp)
        }
    }

val paneExpansionAnchors: List<PaneExpansionAnchor> = CoreSettingsPaneExpansionAnchor
    .entries
    .map { paneExpansionAnchor -> paneExpansionAnchor.paneExpansionAnchor }

fun getInitialAnchoredIndex(
    paneExpansionAnchor: CoreSettingsPaneExpansionAnchor?,
    paneScaffoldDirective: PaneScaffoldDirective,
): Int {
    val paneExpansionAnchors = CoreSettingsPaneExpansionAnchor.entries

    return paneExpansionAnchor?.let { anchor ->
        paneExpansionAnchors.indexOf(anchor)
    } ?: if (paneScaffoldDirective.defaultPanePreferredWidth == DEFAULT_PANE_PREFERRED_WIDTH_XL.dp) {
        paneExpansionAnchors.indexOf(CoreSettingsPaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH_XL)
    } else {
        paneExpansionAnchors.indexOf(CoreSettingsPaneExpansionAnchor.DEFAULT_PANE_PREFERRED_WIDTH)
    }
}

val CoreSettingsTheme.stringResource: StringResource
    get() = when (this) {
        CoreSettingsTheme.SYSTEM_DEFAULT -> Res.string.settings_theme_system_default
        CoreSettingsTheme.LIGHT -> Res.string.settings_theme_light
        CoreSettingsTheme.DARK -> Res.string.settings_theme_dark
    }

val CoreSettingsContrast.stringResource: StringResource
    get() = when (this) {
        CoreSettingsContrast.STANDARD -> Res.string.settings_contrast_standard
        CoreSettingsContrast.MEDIUM -> Res.string.settings_contrast_medium
        CoreSettingsContrast.HIGH -> Res.string.settings_contrast_high
    }
