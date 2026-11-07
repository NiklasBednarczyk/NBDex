package de.niklasbednarczyk.nbdex.core.ui.designsystem.selection

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import de.niklasbednarczyk.nbdex.core.ui.designsystem.adaptive.isWidthAtLeastMedium
import de.niklasbednarczyk.nbdex.core.ui.designsystem.chip.DexFilterChip
import de.niklasbednarczyk.nbdex.core.ui.designsystem.menu.DexDropdownMenuMultiSelection
import de.niklasbednarczyk.nbdex.core.ui.designsystem.menu.DexDropdownMenuSingleSelectionGroupNullable
import de.niklasbednarczyk.nbdex.core.ui.designsystem.menu.DexDropdownMenuSingleSelectionWithNull
import de.niklasbednarczyk.nbdex.core.ui.designsystem.sheet.DexBottomSheetMultiSelection
import de.niklasbednarczyk.nbdex.core.ui.designsystem.sheet.DexBottomSheetSingleSelectionGroupNullable
import de.niklasbednarczyk.nbdex.core.ui.designsystem.sheet.DexBottomSheetSingleSelectionWithNull
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.ImmutableSet
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.common_format_multi_selection_multiple_selected
import org.jetbrains.compose.resources.stringResource
import kotlin.reflect.KClass

val isSelectionDropdownMenu: Boolean
    @Composable
    get() = isWidthAtLeastMedium()

@Composable
fun <Item : Any, Key : Any> DexSingleSelectionWithNull(
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    title: String,
    items: ImmutableList<Item>,
    selectedItem: Item?,
    getKey: (Item) -> Key,
    getContentText: @Composable (Item?) -> String,
    onClick: (Item?) -> Unit,
    modifier: Modifier = Modifier,
    getTrailingIcon: ((Item?) -> ImageVector?)? = null,
) {
    val onDismissRequest = { onExpandedChange(false) }
    val selected = selectedItem != null

    Box(
        modifier = modifier,
    ) {
        DexFilterChip(
            labelText = if (selected) getContentText(selectedItem) else title,
            selected = selected,
            expanded = expanded,
            onClick = { onExpandedChange(!expanded) },
        )
        if (isSelectionDropdownMenu) {
            DexDropdownMenuSingleSelectionWithNull(
                expanded = expanded,
                onDismissRequest = onDismissRequest,
                items = items,
                selectedItem = selectedItem,
                getContentText = getContentText,
                onClick = onClick,
                getTrailingIcon = getTrailingIcon,
            )
        } else {
            DexBottomSheetSingleSelectionWithNull(
                title = title,
                expanded = expanded,
                onDismissRequest = onDismissRequest,
                items = items,
                selectedItem = selectedItem,
                getKey = getKey,
                getContentText = getContentText,
                onClick = onClick,
                getTrailingIcon = getTrailingIcon,
            )
        }
    }
}

@Composable
fun <Group : Any, Item : Any, KeyGroup : Any, KeyItem : Any> DexSingleSelectionGroupNullable(
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    title: String,
    map: ImmutableMap<Group?, List<Item>>,
    selectedItem: Item,
    getKeyGroup: (Group) -> KeyGroup,
    getKeyItem: (Item) -> KeyItem,
    getContentTypeKlassGroup: (Group?) -> KClass<*>,
    getContentTypeKlassItem: (Item) -> KClass<*>,
    getGroupText: @Composable (Group?) -> String,
    getContentText: @Composable (Item) -> String,
    onClick: (Item) -> Unit,
    modifier: Modifier = Modifier,
    getSupportingContent: @Composable ((Item) -> Unit)? = null,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
) {
    val onDismissRequest = { onExpandedChange(false) }

    Box(
        modifier = modifier,
    ) {
        DexFilterChip(
            labelText = getContentText(selectedItem),
            selected = true,
            expanded = expanded,
            onClick = { onExpandedChange(!expanded) },
        )
        if (isSelectionDropdownMenu) {
            DexDropdownMenuSingleSelectionGroupNullable(
                expanded = expanded,
                onDismissRequest = onDismissRequest,
                map = map,
                selectedItem = selectedItem,
                getGroupText = getGroupText,
                getContentText = getContentText,
                getSupportingContent = getSupportingContent,
                onClick = onClick,
                getTrailingIcon = getTrailingIcon,
            )
        } else {
            DexBottomSheetSingleSelectionGroupNullable(
                title = title,
                expanded = expanded,
                onDismissRequest = onDismissRequest,
                map = map,
                selectedItem = selectedItem,
                getKeyGroup = getKeyGroup,
                getKeyItem = getKeyItem,
                getContentTypeKlassGroup = getContentTypeKlassGroup,
                getContentTypeKlassItem = getContentTypeKlassItem,
                getGroupText = getGroupText,
                getContentText = getContentText,
                getSupportingContent = getSupportingContent,
                onClick = onClick,
                getTrailingIcon = getTrailingIcon,
            )
        }
    }
}

@Composable
fun <Item : Any, Key : Any> DexMultiSelection(
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    title: String,
    items: ImmutableList<Item>,
    selectedItems: ImmutableSet<Item>,
    getKey: (Item) -> Key,
    onClick: (Item) -> Unit,
    getContentText: @Composable (Item) -> String,
    modifier: Modifier = Modifier,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
) {
    val onDismissRequest = { onExpandedChange(false) }
    val firstSelectedItem = selectedItems.firstOrNull()
    val selectedItemsSize = selectedItems.size

    Box(
        modifier = modifier,
    ) {
        DexFilterChip(
            labelText = if (firstSelectedItem == null) {
                title
            } else if (selectedItemsSize == 1) {
                getContentText(firstSelectedItem)
            } else {
                stringResource(
                    Res.string.common_format_multi_selection_multiple_selected,
                    getContentText(firstSelectedItem),
                    selectedItemsSize - 1,
                )
            },
            selected = selectedItems.isNotEmpty(),
            expanded = expanded,
            onClick = { onExpandedChange(!expanded) },
        )
        if (isSelectionDropdownMenu) {
            DexDropdownMenuMultiSelection(
                expanded = expanded,
                onDismissRequest = onDismissRequest,
                items = items,
                selectedItems = selectedItems,
                getContentText = getContentText,
                onClick = onClick,
                getTrailingIcon = getTrailingIcon,
            )
        } else {
            DexBottomSheetMultiSelection(
                title = title,
                expanded = expanded,
                onDismissRequest = onDismissRequest,
                items = items,
                selectedItems = selectedItems,
                getKey = getKey,
                getContentText = getContentText,
                onClick = onClick,
                getTrailingIcon = getTrailingIcon,
            )
        }
    }
}
