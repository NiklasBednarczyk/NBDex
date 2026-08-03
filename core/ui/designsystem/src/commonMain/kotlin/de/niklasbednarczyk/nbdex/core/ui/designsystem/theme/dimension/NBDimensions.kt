package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension

import androidx.compose.runtime.Immutable

@Immutable
data class NBDimensions(
    val component: NBDimensionsComponent = NBDimensionsComponent(),
    val padding: NBDimensionsPadding = NBDimensionsPadding(),
)
