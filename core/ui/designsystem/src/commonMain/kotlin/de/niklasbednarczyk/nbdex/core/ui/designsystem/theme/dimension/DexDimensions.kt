package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension

import androidx.compose.runtime.Immutable

@Immutable
data class DexDimensions(
    val component: DexDimensionsComponent = DexDimensionsComponent(),
    val padding: DexDimensionsPadding = DexDimensionsPadding(),
)
