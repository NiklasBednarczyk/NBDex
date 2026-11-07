package de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension

import androidx.compose.runtime.Immutable
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component.DexDimensionsComponentChip
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component.DexDimensionsComponentListItem
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.dimension.component.DexDimensionsComponentLoadingIndicator

@Immutable
data class DexDimensionsComponent(
    val chip: DexDimensionsComponentChip = DexDimensionsComponentChip(),
    val listItem: DexDimensionsComponentListItem = DexDimensionsComponentListItem(),
    val loadingIndicator: DexDimensionsComponentLoadingIndicator = DexDimensionsComponentLoadingIndicator(),
)
