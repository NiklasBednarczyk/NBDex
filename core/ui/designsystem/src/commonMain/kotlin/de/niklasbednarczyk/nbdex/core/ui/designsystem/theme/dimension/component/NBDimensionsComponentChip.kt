package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class NBDimensionsComponentChip(
    /**
     * 32dp
     *
     * md.comp.assist-chip.container.height
     *
     * md.comp.filter-chip.container.height
     *
     * md.comp.input-chip.container.height
     *
     * md.comp.suggestion-chip.container.height
     * */
    val containerHeight: Dp = 32.dp,

    /**
     * 1dp
     *
     * md.comp.assist-chip.flat.outline.width
     *
     * md.comp.filter-chip.flat.unselected.outline.width
     *
     * md.comp.input-chip.unselected.outline.width
     *
     * md.comp.suggestion-chip.flat.outline.width
     * */
    val containerOutlineWidth: Dp = 1.dp,

    /**
     * 18dp
     *
     * md.comp.assist-chip.with-icon.icon.size
     *
     * md.comp.filter-chip.with-icon.icon.size
     *
     * md.comp.input-chip.with-leading-icon.leading-icon.size
     *
     * md.comp.suggestion-chip.with-leading-icon.leading-icon.size
     * */
    val iconSize: Dp = 18.dp,
)