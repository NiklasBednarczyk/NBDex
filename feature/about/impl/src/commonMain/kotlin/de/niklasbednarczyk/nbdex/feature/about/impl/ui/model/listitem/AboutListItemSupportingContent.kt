package de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.listitem

import org.jetbrains.compose.resources.StringResource

sealed interface AboutListItemSupportingContent {
    data object None : AboutListItemSupportingContent

    data class Resource(
        val stringResource: StringResource,
    ) : AboutListItemSupportingContent

    data class Text(
        val text: String,
    ) : AboutListItemSupportingContent
}
