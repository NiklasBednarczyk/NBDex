package de.niklasbednarczyk.nbdex.core.ui.designsystem.adaptive

import androidx.compose.material3.adaptive.currentWindowAdaptiveInfoV2
import androidx.compose.runtime.Composable
import androidx.window.core.layout.WindowSizeClass

@Composable
private fun getWindowSizeClass(): WindowSizeClass {
    val windowAdaptiveInfo = currentWindowAdaptiveInfoV2()
    return windowAdaptiveInfo.windowSizeClass
}

@Composable
fun isWidthAtLeastMedium(): Boolean {
    return getWindowSizeClass().isWidthAtLeastBreakpoint(WindowSizeClass.WIDTH_DP_MEDIUM_LOWER_BOUND)
}