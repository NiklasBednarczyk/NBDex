package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class NBDimensionsPadding(
    /** 4dp */
    val small: Dp = 4.dp,
    /** 8dp */
    val medium: Dp = 8.dp,
    /** 16dp */
    val large: Dp = 16.dp,
    /** 16dp x 8.dp */
    val screenPaddingValues: PaddingValues = PaddingValues(
        horizontal = 16.dp,
        vertical = 8.dp,
    ),
)
