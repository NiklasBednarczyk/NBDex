package de.niklasbednarczyk.nbdex.core.ui.model.endpoint.display.ext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import de.niklasbednarczyk.nbdex.core.model.endpoint.display.type.CoreDisplayTypeVersionGroup
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.color.extended.NBExtendedColor
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_the_crown_tundra
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_the_indigo_disk
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_the_isle_of_armor
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_abbreviation_the_teal_mask
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_group_text_the_crown_tundra
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_group_text_the_indigo_disk
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_group_text_the_isle_of_armor
import nbdex.core.ui.resource.generated.resources.common_endpoint_version_group_text_the_teal_mask
import org.jetbrains.compose.resources.StringResource

val CoreDisplayTypeVersionGroup.SameVersions.extendedColor: NBExtendedColor
    @Composable @ReadOnlyComposable
    get() = when (this) {
        CoreDisplayTypeVersionGroup.TheCrownTundra -> NBTheme.extendedColors.version.theCrownTundra
        CoreDisplayTypeVersionGroup.TheIndigoDisk -> NBTheme.extendedColors.version.theIndigoDisk
        CoreDisplayTypeVersionGroup.TheIsleOfArmor -> NBTheme.extendedColors.version.theIsleOfArmor
        CoreDisplayTypeVersionGroup.TheTealMask -> NBTheme.extendedColors.version.theTealMask
    }

val CoreDisplayTypeVersionGroup.SameVersions.stringResourceAbbreviation: StringResource
    @Composable @ReadOnlyComposable
    get() = when (this) {
        CoreDisplayTypeVersionGroup.TheCrownTundra -> Res.string.common_endpoint_version_abbreviation_the_crown_tundra
        CoreDisplayTypeVersionGroup.TheIndigoDisk -> Res.string.common_endpoint_version_abbreviation_the_indigo_disk
        CoreDisplayTypeVersionGroup.TheIsleOfArmor -> Res.string.common_endpoint_version_abbreviation_the_isle_of_armor
        CoreDisplayTypeVersionGroup.TheTealMask -> Res.string.common_endpoint_version_abbreviation_the_teal_mask
    }


val CoreDisplayTypeVersionGroup.SameVersions.stringResourceText: StringResource
    @Composable @ReadOnlyComposable
    get() = when (this) {
        CoreDisplayTypeVersionGroup.TheCrownTundra -> Res.string.common_endpoint_version_group_text_the_crown_tundra
        CoreDisplayTypeVersionGroup.TheIndigoDisk -> Res.string.common_endpoint_version_group_text_the_indigo_disk
        CoreDisplayTypeVersionGroup.TheIsleOfArmor -> Res.string.common_endpoint_version_group_text_the_isle_of_armor
        CoreDisplayTypeVersionGroup.TheTealMask -> Res.string.common_endpoint_version_group_text_the_teal_mask
    }
