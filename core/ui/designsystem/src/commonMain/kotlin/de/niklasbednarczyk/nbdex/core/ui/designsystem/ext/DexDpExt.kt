package de.niklasbednarczyk.nbdex.core.ui.designsystem.ext

import androidx.compose.ui.unit.Dp

internal operator fun Dp.times(
    other: Dp,
): Dp = Dp(value * other.value)
