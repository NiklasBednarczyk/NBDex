package de.niklasbednarczyk.nbdex.core.ui.designsystem.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.SegmentedListItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import de.niklasbednarczyk.nbdex.core.ui.designsystem.ext.plus
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBSectionTitle
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.designsystem.theme.NBTheme
import kotlin.reflect.KClass

val listItemDefaultContainerColor: Color
    @Composable
    get() = NBTheme.colorScheme.surfaceContainer

val listItemGap: Dp
    get() = ListItemDefaults.SegmentedGap

private val defaultAdditionalContentPadding: PaddingValues
    get() = PaddingValues(0.dp)

private val verticalArrangement: Arrangement.Vertical
    get() = Arrangement.spacedBy(listItemGap)

@Composable
fun <Group : Any, Item : Any, KeyGroup : Any, KeyItem : Any> NBSegmentedListSingleActionGroup(
    map: Map<Group, List<Item>>,
    selectedItem: Item?,
    getKeyGroup: (Group) -> KeyGroup,
    getKeyItem: (Item) -> KeyItem,
    getContentTypeKlassGroup: (Group) -> KClass<*>,
    getContentTypeKlassItem: (Item) -> KClass<*>,
    onClick: (Item) -> Unit,
    getGroupText: @Composable (Group) -> String,
    getContentText: @Composable (Item) -> String,
    getSupportingContent: @Composable ((Item) -> Unit)? = null,
    getLeadingIcon: ((Item) -> ImageVector?)? = null,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
    additionalContentPadding: PaddingValues = defaultAdditionalContentPadding,
    containerColor: Color = listItemDefaultContainerColor,
) {
    LazyColumn(
        contentPadding = additionalContentPadding + NBTheme.dimensions.padding.screenPaddingValues,
    ) {
        map.entries.forEach { (group, items) ->
            item(
                key = getCompositeKey(
                    item = group,
                    getKey = getKeyGroup,
                    getContentTypeKlass = getContentTypeKlassGroup,
                ),
                contentType = getContentTypeKlassGroup(group),
            ) {
                NBSectionTitle(
                    title = getGroupText(group),
                )
            }
            itemsIndexed(
                items = items,
                key = { _, item ->
                    getCompositeKey(
                        item = item,
                        getKey = getKeyItem,
                        getContentTypeKlass = getContentTypeKlassItem,
                    )
                },
                contentType = { _, item -> getContentTypeKlassItem(item) }
            ) { index, item ->
                NBSegmentedListItemSingleAction(
                    selected = selectedItem == item,
                    onClick = { onClick(item) },
                    containerColor = containerColor,
                    index = index,
                    count = items.size,
                    contentText = getContentText(item),
                    supportingContent = { getSupportingContent?.invoke(item) },
                    leadingIcon = getLeadingIcon?.invoke(item),
                    trailingIcon = getTrailingIcon?.invoke(item),
                )
                if (index != items.lastIndex) {
                    Spacer(Modifier.height(listItemGap))
                }
            }
        }
    }
}

@Composable
fun <Item : Any, Key : Any> NBSegmentedListSingleSelection(
    items: List<Item>,
    selectedItem: Item,
    onClick: (Item) -> Unit,
    getKey: (Item) -> Key,
    getContentText: @Composable (Item) -> String,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
    additionalContentPadding: PaddingValues = defaultAdditionalContentPadding,
    containerColor: Color = listItemDefaultContainerColor,
) {
    LazyColumn(
        modifier = Modifier.selectableGroup(),
        verticalArrangement = verticalArrangement,
        contentPadding = additionalContentPadding + NBTheme.dimensions.padding.screenPaddingValues,
    ) {
        itemsIndexed(
            items = items,
            key = { _, item -> getKey(item) },
        ) { index, item ->
            NBSegmentedListItemSingleSelection(
                selected = selectedItem == item,
                onClick = { onClick(item) },
                containerColor = containerColor,
                index = index,
                count = items.size,
                contentText = getContentText(item),
                trailingIcon = getTrailingIcon?.invoke(item),
            )
        }
    }
}

@Composable
fun <Item : Any, Key : Any> NBSegmentedListSingleSelectionWithNull(
    items: List<Item>,
    selectedItem: Item?,
    onClick: (Item?) -> Unit,
    getKey: (Item) -> Key,
    getContentText: @Composable (Item?) -> String,
    getTrailingIcon: ((Item?) -> ImageVector?)? = null,
    additionalContentPadding: PaddingValues = defaultAdditionalContentPadding,
    containerColor: Color = listItemDefaultContainerColor,
) {
    LazyColumn(
        modifier = Modifier.selectableGroup(),
        verticalArrangement = verticalArrangement,
        contentPadding = additionalContentPadding + NBTheme.dimensions.padding.screenPaddingValues,
    ) {
        val count = items.size + 1
        item {
            NBSegmentedListItemSingleSelection(
                selected = selectedItem == null,
                onClick = { onClick(null) },
                containerColor = containerColor,
                index = 0,
                count = count,
                contentText = getContentText(null),
                trailingIcon = getTrailingIcon?.invoke(null),
            )
        }
        itemsIndexed(
            items = items,
            key = { _, item -> getKey(item) },
        ) { index, item ->
            NBSegmentedListItemSingleSelection(
                selected = selectedItem == item,
                onClick = { onClick(item) },
                containerColor = containerColor,
                index = index + 1,
                count = count,
                contentText = getContentText(item),
                trailingIcon = getTrailingIcon?.invoke(item),
            )
        }
    }
}

@Composable
fun <Group : Any, Item : Any, KeyGroup : Any, KeyItem : Any> NBSegmentedListSingleSelectionGroupNullable(
    map: Map<Group?, List<Item>>,
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
    additionalContentPadding: PaddingValues = defaultAdditionalContentPadding,
    containerColor: Color = listItemDefaultContainerColor,
) {
    LazyColumn(
        contentPadding = additionalContentPadding + NBTheme.dimensions.padding.screenPaddingValues,
    ) {
        map.entries.forEach { (group, items) ->
            item(
                key = getCompositeKeyNullable(
                    item = group,
                    getKey = getKeyGroup,
                    getContentTypeKlass = getContentTypeKlassGroup,
                ),
                contentType = getContentTypeKlassGroup(group),
            ) {
                NBSectionTitle(
                    title = getGroupText(group),
                )
            }
            itemsIndexed(
                items = items,
                key = { _, item ->
                    getCompositeKey(
                        item = item,
                        getKey = getKeyItem,
                        getContentTypeKlass = getContentTypeKlassItem,
                    )
                },
                contentType = { _, item -> getContentTypeKlassItem(item) }
            ) { index, item ->
                NBSegmentedListItemSingleSelection(
                    selected = selectedItem == item,
                    onClick = { onClick(item) },
                    containerColor = containerColor,
                    index = index,
                    count = items.size,
                    contentText = getContentText(item),
                    supportingContent = { getSupportingContent?.invoke(item) },
                    trailingIcon = getTrailingIcon?.invoke(item),
                )
                if (index != items.lastIndex) {
                    Spacer(Modifier.height(listItemGap))
                }
            }
        }
    }
}

@Composable
fun <Item : Any, Key : Any> NBSegmentedListMultiSelection(
    items: List<Item>,
    selectedItems: Set<Item>,
    onClick: (Item) -> Unit,
    getKey: (Item) -> Key,
    getContentText: @Composable (Item) -> String,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
    additionalContentPadding: PaddingValues = defaultAdditionalContentPadding,
    containerColor: Color = listItemDefaultContainerColor,
) {
    LazyColumn(
        modifier = Modifier.selectableGroup(),
        verticalArrangement = verticalArrangement,
        contentPadding = additionalContentPadding + NBTheme.dimensions.padding.screenPaddingValues,
    ) {
        itemsIndexed(
            items = items,
            key = { _, item -> getKey(item) },
        ) { index, item ->
            NBSegmentedListItemMultiSelection(
                checked = selectedItems.contains(item),
                onCheckedChange = { onClick(item) },
                containerColor = containerColor,
                index = index,
                count = items.size,
                contentText = getContentText(item),
                trailingIcon = getTrailingIcon?.invoke(item),
            )
        }
    }
}

@Composable
fun NBSegmentedListItemBasic(
    containerColor: Color = listItemDefaultContainerColor,
    index: Int,
    count: Int,
    contentText: String,
    supportingContent: @Composable (() -> Unit)? = null,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
) {
    val colorsDefault = ListItemDefaults.segmentedColors()

    SegmentedListItem(
        enabled = false,
        onClick = {},
        colors = ListItemDefaults.segmentedColors(
            disabledContainerColor = containerColor,
            disabledContentColor = colorsDefault.contentColor,
            disabledLeadingContentColor = colorsDefault.leadingContentColor,
            disabledTrailingContentColor = colorsDefault.trailingContentColor,
            disabledOverlineContentColor = colorsDefault.overlineContentColor,
            disabledSupportingContentColor = colorsDefault.supportingContentColor,
        ),
        shapes = ListItemDefaults.segmentedShapes(
            index = index,
            count = count,
        ),
        trailingContent = {
            trailingIcon?.let { imageVector ->
                Icon(
                    imageVector = imageVector,
                    contentDescription = null,
                    modifier = Modifier.size(NBTheme.dimensions.component.listItem.trailingIconSize),
                )
            }
        },
        leadingContent = {
            leadingIcon?.let { imageVector ->
                Icon(
                    imageVector = imageVector,
                    contentDescription = null,
                    modifier = Modifier.size(NBTheme.dimensions.component.listItem.leadingIconSize),
                )
            }
        },
        content = {
            NBTextSingleLine(
                text = contentText,
            )
        },
        supportingContent = supportingContent,
    )
}

@Composable
fun NBSegmentedListItemSingleAction(
    selected: Boolean = false,
    onClick: () -> Unit,
    containerColor: Color = listItemDefaultContainerColor,
    index: Int,
    count: Int,
    contentText: String,
    supportingContent: @Composable (() -> Unit)? = null,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
) {
    val colorsUnselected = ListItemDefaults.segmentedColors(
        containerColor = containerColor,
    )
    val colorsSelected = ListItemDefaults.segmentedColors(
        containerColor = colorsUnselected.selectedContainerColor,
        contentColor = colorsUnselected.selectedContentColor,
    )

    SegmentedListItem(
        onClick = onClick,
        colors = if (selected) colorsSelected else colorsUnselected,
        shapes = ListItemDefaults.segmentedShapes(
            index = index,
            count = count,
        ),
        trailingContent = {
            trailingIcon?.let { imageVector ->
                Icon(
                    imageVector = imageVector,
                    contentDescription = null,
                    modifier = Modifier.size(NBTheme.dimensions.component.listItem.trailingIconSize),
                )
            }
        },
        leadingContent = {
            leadingIcon?.let { imageVector ->
                Icon(
                    imageVector = imageVector,
                    contentDescription = null,
                    modifier = Modifier.size(NBTheme.dimensions.component.listItem.leadingIconSize),
                )
            }
        },
        content = {
            NBTextSingleLine(
                text = contentText,
            )
        },
        supportingContent = supportingContent,
    )
}

@Composable
private fun NBSegmentedListItemSingleSelection(
    selected: Boolean,
    onClick: () -> Unit,
    containerColor: Color = listItemDefaultContainerColor,
    index: Int,
    count: Int,
    contentText: String,
    supportingContent: @Composable (() -> Unit)? = null,
    trailingIcon: ImageVector? = null,
) {
    SegmentedListItem(
        selected = selected,
        onClick = onClick,
        colors = ListItemDefaults.segmentedColors(
            containerColor = containerColor,
        ),
        shapes = ListItemDefaults.segmentedShapes(
            index = index,
            count = count,
        ),
        leadingContent = {
            RadioButton(
                selected = selected,
                onClick = null,
            )
        },
        trailingContent = {
            trailingIcon?.let { imageVector ->
                Icon(
                    imageVector = imageVector,
                    contentDescription = null,
                    modifier = Modifier.size(NBTheme.dimensions.component.listItem.trailingIconSize),
                )
            }
        },
        content = {
            NBTextSingleLine(
                text = contentText,
            )
        },
        supportingContent = supportingContent,
        verticalAlignment = Alignment.CenterVertically,
    )
}

@Composable
private fun NBSegmentedListItemMultiSelection(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    containerColor: Color = listItemDefaultContainerColor,
    index: Int,
    count: Int,
    contentText: String,
    trailingIcon: ImageVector? = null,
) {
    SegmentedListItem(
        checked = checked,
        onCheckedChange = onCheckedChange,
        colors = ListItemDefaults.segmentedColors(
            containerColor = containerColor,
        ),
        shapes = ListItemDefaults.segmentedShapes(
            index = index,
            count = count,
        ),
        leadingContent = {
            Checkbox(
                checked = checked,
                onCheckedChange = null,
            )
        },
        trailingContent = {
            trailingIcon?.let { imageVector ->
                Icon(
                    imageVector = imageVector,
                    contentDescription = null,
                    modifier = Modifier.size(NBTheme.dimensions.component.listItem.trailingIconSize),
                )
            }
        },
        content = {
            NBTextSingleLine(
                text = contentText,
            )
        },
    )
}

private fun <Item : Any, Key : Any, ContentTypeKlass : KClass<*>> getCompositeKey(
    item: Item,
    getKey: (Item) -> Key,
    getContentTypeKlass: (Item) -> ContentTypeKlass
): String {
    val contentTypeString = getContentTypeKlass(item).simpleName.toString()
    val keyString = getKey(item).toString()
    return "$contentTypeString - $keyString"
}

private fun <Item : Any, Key : Any, ContentTypeKlass : KClass<*>> getCompositeKeyNullable(
    item: Item?,
    getKey: (Item) -> Key,
    getContentTypeKlass: (Item?) -> ContentTypeKlass
): String {
    val contentTypeString = getContentTypeKlass(item).simpleName.toString()
    val keyString = item?.let(getKey).toString()
    return "$contentTypeString - $keyString"
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        val count = 7
        NBSegmentedListItemBasic(
            index = 0,
            count = count,
            contentText = "Basic"
        )
        NBSegmentedListItemSingleAction(
            selected = false,
            onClick = {},
            index = 1,
            count = count,
            contentText = "Single Action Unselected",
        )
        NBSegmentedListItemSingleAction(
            selected = true,
            onClick = {},
            index = 2,
            count = count,
            contentText = "Single Action Selected",
        )
        NBSegmentedListItemSingleSelection(
            selected = false,
            onClick = {},
            index = 3,
            count = count,
            contentText = "Single Selection Unselected",
        )
        NBSegmentedListItemSingleSelection(
            selected = true,
            onClick = {},
            index = 4,
            count = count,
            contentText = "Single Selection Selected",
        )
        NBSegmentedListItemMultiSelection(
            checked = false,
            onCheckedChange = {},
            index = 5,
            count = count,
            contentText = "Multi Selection Unchecked",
        )
        NBSegmentedListItemMultiSelection(
            checked = true,
            onCheckedChange = {},
            index = 6,
            count = count,
            contentText = "Multi Selection Checked",
        )
    }
}
