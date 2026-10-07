package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component.NBDimensionsComponentChip
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component.NBDimensionsComponentListItem
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component.NBDimensionsComponentLoadingIndicator

@Immutable
data class NBDimensionsComponent(
    val chip: NBDimensionsComponentChip = NBDimensionsComponentChip(),
    val listItem: NBDimensionsComponentListItem = NBDimensionsComponentListItem(),
    val loadingIndicator: NBDimensionsComponentLoadingIndicator = NBDimensionsComponentLoadingIndicator(),
)
