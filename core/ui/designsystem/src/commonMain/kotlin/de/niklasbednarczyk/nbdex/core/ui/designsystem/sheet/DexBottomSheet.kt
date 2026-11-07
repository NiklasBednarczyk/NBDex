package de.niklasbednarczyk.nbdex.core.ui.designsystem.sheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import de.niklasbednarczyk.nbdex.core.ui.designsystem.button.DexIconButton
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.DexSegmentedListMultiSelection
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.DexSegmentedListSingleSelectionGroupNullable
import de.niklasbednarczyk.nbdex.core.ui.designsystem.list.DexSegmentedListSingleSelectionWithNull
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.DexTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.DexTheme
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Close
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.coroutines.launch
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.content_description_icon_close
import org.jetbrains.compose.resources.stringResource
import kotlin.reflect.KClass

private val bottomSheetListItemContainerColor: Color
    @ReadOnlyComposable
    @Composable
    get() = DexTheme.colorScheme.surfaceContainerHigh

@Composable
fun <Item : Any, Key : Any> DexBottomSheetSingleSelectionWithNull(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    title: String,
    items: ImmutableList<Item>,
    selectedItem: Item?,
    getKey: (Item) -> Key,
    onClick: (Item?) -> Unit,
    getContentText: @Composable (Item?) -> String,
    getTrailingIcon: ((Item?) -> ImageVector?)? = null,
) {
    DexBottomSheet(
        expanded = expanded,
        title = title,
        onDismissRequest = onDismissRequest,
    ) { onClose ->
        DexSegmentedListSingleSelectionWithNull(
            items = items,
            selectedItem = selectedItem,
            onClick = { item ->
                onClick(item)
                onClose()
            },
            getKey = getKey,
            getContentText = getContentText,
            getTrailingIcon = getTrailingIcon,
            containerColor = bottomSheetListItemContainerColor,
        )
    }
}

@Composable
fun <Group : Any, Item : Any, KeyGroup : Any, KeyItem : Any> DexBottomSheetSingleSelectionGroupNullable(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    title: String,
    map: ImmutableMap<Group?, List<Item>>,
    selectedItem: Item,
    getKeyGroup: (Group) -> KeyGroup,
    getKeyItem: (Item) -> KeyItem,
    getContentTypeKlassGroup: (Group?) -> KClass<*>,
    getContentTypeKlassItem: (Item) -> KClass<*>,
    onClick: (Item) -> Unit,
    getGroupText: @Composable (Group?) -> String,
    getContentText: @Composable (Item) -> String,
    getSupportingContent: @Composable ((Item) -> Unit)? = null,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
) {
    DexBottomSheet(
        expanded = expanded,
        title = title,
        onDismissRequest = onDismissRequest,
    ) { onClose ->
        DexSegmentedListSingleSelectionGroupNullable(
            map = map,
            selectedItem = selectedItem,
            getKeyGroup = getKeyGroup,
            getKeyItem = getKeyItem,
            getContentTypeKlassGroup = getContentTypeKlassGroup,
            getContentTypeKlassItem = getContentTypeKlassItem,
            onClick = { item ->
                onClick(item)
                onClose()
            },
            getGroupText = getGroupText,
            getContentText = getContentText,
            getSupportingContent = getSupportingContent,
            getTrailingIcon = getTrailingIcon,
            containerColor = bottomSheetListItemContainerColor,
        )
    }
}

@Composable
fun <Item : Any, Key : Any> DexBottomSheetMultiSelection(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    title: String,
    items: ImmutableList<Item>,
    selectedItems: ImmutableSet<Item>,
    getKey: (Item) -> Key,
    onClick: (Item) -> Unit,
    getContentText: @Composable (Item) -> String,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
) {
    DexBottomSheet(
        expanded = expanded,
        title = title,
        onDismissRequest = onDismissRequest,
    ) {
        DexSegmentedListMultiSelection(
            items = items,
            selectedItems = selectedItems,
            onClick = { item -> onClick(item) },
            getKey = getKey,
            getContentText = getContentText,
            getTrailingIcon = getTrailingIcon,
            containerColor = bottomSheetListItemContainerColor,
        )
    }
}

@Composable
private fun DexBottomSheet(
    expanded: Boolean,
    title: String,
    onDismissRequest: () -> Unit,
    content: @Composable ColumnScope.(
        onClose: () -> Unit,
    ) -> Unit,
) {
    val bottomSheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true,
    )
    val scope = rememberCoroutineScope()

    val onClose: () -> Unit = {
        scope
            .launch { bottomSheetState.hide() }
            .invokeOnCompletion {
                if (!bottomSheetState.isVisible) {
                    onDismissRequest()
                }
            }
    }

    if (expanded) {
        ModalBottomSheet(
            onDismissRequest = onDismissRequest,
            sheetState = bottomSheetState,
            dragHandle = null,
        ) {
            Column {
                Row(
                    modifier = Modifier.padding(DexTheme.dimensions.padding.screenPaddingValues),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    DexTextSingleLine(
                        modifier = Modifier.weight(1f),
                        text = title,
                        style = DexTheme.typography.titleMedium,
                    )
                    DexIconButton(
                        icon = DexIcons.Material.Close,
                        contentDescription = stringResource(Res.string.content_description_icon_close),
                        onClick = onClose,
                    )
                }
                HorizontalDivider()
                content(onClose)
            }
        }
    }
}
