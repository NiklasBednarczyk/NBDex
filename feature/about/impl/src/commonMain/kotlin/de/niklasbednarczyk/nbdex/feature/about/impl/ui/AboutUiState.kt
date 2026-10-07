package de.niklasbednarczyk.nbdex.feature.about.impl.ui

import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.AboutContent
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.AboutListItem
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.AboutSection
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.about_card_disclaimer_text

data object AboutUiState {
    val sectionsWithContent: Map<AboutSection, AboutContent>
        get() = mapOf(
            AboutSection.APP_INFO to AboutContent.SegmentedList(
                items = listOf(
                    AboutListItem.Developer,
                    AboutListItem.Version,
                    AboutListItem.SourceCode,
                ),
            ),
            AboutSection.CREDITS to AboutContent.SegmentedList(
                items = listOf(
                    AboutListItem.PokeApi,
                    AboutListItem.Duiker101,
                    AboutListItem.Bulbapedia,
                ),
            ),
            AboutSection.DISCLAIMER to AboutContent.Card(
                textStringResource = Res.string.about_card_disclaimer_text,
            ),
        )
}
