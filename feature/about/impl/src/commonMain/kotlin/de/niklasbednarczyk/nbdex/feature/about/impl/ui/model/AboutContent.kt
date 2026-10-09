package de.niklasbednarczyk.nbdex.feature.about.impl.ui.model

import org.jetbrains.compose.resources.StringResource

sealed interface AboutContent {
    data class Card(
        val textStringResource: StringResource,
    ) : AboutContent

    data class SegmentedList(
        val items: List<AboutListItem>,
    ) : AboutContent
}
