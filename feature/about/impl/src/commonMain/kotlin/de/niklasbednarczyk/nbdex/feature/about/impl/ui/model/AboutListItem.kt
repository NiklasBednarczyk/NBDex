package de.niklasbednarczyk.nbdex.feature.about.impl.ui.model

import androidx.compose.ui.graphics.vector.ImageVector
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Api
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Code
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Commit
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.FormatPaint
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Image
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Person
import de.niklasbednarczyk.nbdex.feature.about.impl.buildkonfig.BuildKonfig
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.listitem.AboutListItemSupportingContent
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.listitem.AboutListItemType
import de.niklasbednarczyk.nbdex.feature.about.impl.ui.model.listitem.AboutListItemUrl
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.about_list_item_bulbapedia_content
import nbdex.core.ui.resource.generated.resources.about_list_item_bulbapedia_supporting_content
import nbdex.core.ui.resource.generated.resources.about_list_item_developer_content
import nbdex.core.ui.resource.generated.resources.about_list_item_developer_supporting_content
import nbdex.core.ui.resource.generated.resources.about_list_item_duiker101_content
import nbdex.core.ui.resource.generated.resources.about_list_item_duiker101_supporting_content
import nbdex.core.ui.resource.generated.resources.about_list_item_pokeapi_content
import nbdex.core.ui.resource.generated.resources.about_list_item_pokeapi_supporting_content
import nbdex.core.ui.resource.generated.resources.about_list_item_source_code_content
import nbdex.core.ui.resource.generated.resources.about_list_item_version_content
import org.jetbrains.compose.resources.StringResource

sealed interface AboutListItem {

    val leadingIcon: ImageVector
    val contentStringResource: StringResource

    val supportingContent: AboutListItemSupportingContent
    val type: AboutListItemType

    data object Bulbapedia : AboutListItem {

        override val leadingIcon: ImageVector
            get() = NBIcons.Material.FormatPaint

        override val contentStringResource: StringResource
            get() = Res.string.about_list_item_bulbapedia_content

        override val supportingContent: AboutListItemSupportingContent
            get() = AboutListItemSupportingContent.Resource(
                stringResource = Res.string.about_list_item_bulbapedia_supporting_content,
            )

        override val type: AboutListItemType
            get() = AboutListItemType.Link(
                url = AboutListItemUrl.BULBAPEDIA
            )

    }

    data object Developer : AboutListItem {

        override val leadingIcon: ImageVector
            get() = NBIcons.Material.Person

        override val contentStringResource: StringResource
            get() = Res.string.about_list_item_developer_content

        override val supportingContent: AboutListItemSupportingContent
            get() = AboutListItemSupportingContent.Resource(
                stringResource = Res.string.about_list_item_developer_supporting_content,
            )

        override val type: AboutListItemType
            get() = AboutListItemType.Basic

    }

    data object Duiker101 : AboutListItem {

        override val leadingIcon: ImageVector
            get() = NBIcons.Material.Image

        override val contentStringResource: StringResource
            get() = Res.string.about_list_item_duiker101_content

        override val supportingContent: AboutListItemSupportingContent
            get() = AboutListItemSupportingContent.Resource(
                stringResource = Res.string.about_list_item_duiker101_supporting_content,
            )

        override val type: AboutListItemType
            get() = AboutListItemType.Link(
                url = AboutListItemUrl.DUIKER101
            )

    }

    data object PokeApi : AboutListItem {

        override val leadingIcon: ImageVector
            get() = NBIcons.Material.Api

        override val contentStringResource: StringResource
            get() = Res.string.about_list_item_pokeapi_content

        override val supportingContent: AboutListItemSupportingContent
            get() = AboutListItemSupportingContent.Resource(
                stringResource = Res.string.about_list_item_pokeapi_supporting_content,
            )

        override val type: AboutListItemType
            get() = AboutListItemType.Link(
                url = AboutListItemUrl.POKE_API
            )

    }

    data object SourceCode : AboutListItem {

        override val leadingIcon: ImageVector
            get() = NBIcons.Material.Code

        override val contentStringResource: StringResource
            get() = Res.string.about_list_item_source_code_content

        override val supportingContent: AboutListItemSupportingContent
            get() = AboutListItemSupportingContent.None

        override val type: AboutListItemType
            get() = AboutListItemType.Link(
                url = AboutListItemUrl.SOURCE_CODE
            )

    }

    data object Version : AboutListItem {

        override val leadingIcon: ImageVector
            get() = NBIcons.Material.Commit

        override val contentStringResource: StringResource
            get() = Res.string.about_list_item_version_content

        override val supportingContent: AboutListItemSupportingContent
            get() = AboutListItemSupportingContent.Text(
                text = BuildKonfig.appVersionName,
            )

        override val type: AboutListItemType
            get() = AboutListItemType.Basic

    }

}





