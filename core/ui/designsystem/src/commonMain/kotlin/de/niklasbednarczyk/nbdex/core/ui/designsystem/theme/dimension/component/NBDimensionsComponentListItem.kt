package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class NBDimensionsComponentListItem(
    /**
     * 20dp
     *
     * md.comp.list.list-item.leading-icon.expressive.size
     * */
    val leadingIconSize: Dp = 20.dp,
    /**
     * 56dp
     *
     * md.comp.list.list-item.leading-image.width
     *
     * md.comp.list.list-item.leading-image.height
     * */
    val leadingImageSize: Dp = 56.dp,
    /**
     * 20dp
     *
     * md.comp.list.list-item.trailing-icon.expressive.size
     * */
    val trailingIconSize: Dp = 20.dp,
)
