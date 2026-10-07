package de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.listitem

sealed interface AboutListItemType {
    data object Basic : AboutListItemType

    data class Link(
        val url: String,
    ) : AboutListItemType
}
