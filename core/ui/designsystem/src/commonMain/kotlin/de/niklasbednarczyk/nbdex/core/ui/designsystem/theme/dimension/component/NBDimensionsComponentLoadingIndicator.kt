package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class NBDimensionsComponentLoadingIndicator(
    /**
     * 24dp
     *
     * https://m3.material.io/components/loading-indicator/guidelines#c359e905-4449-417e-ba6e-708bbc9b5981
     * */
    val minSize: Dp = 24.dp,
    /**
     * 240dp
     *
     * https://m3.material.io/components/loading-indicator/guidelines#c359e905-4449-417e-ba6e-708bbc9b5981
     * */
    val maxSize: Dp = 240.dp,
)
