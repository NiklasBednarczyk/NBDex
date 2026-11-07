package de.niklasbednarczyk.nbdex.core.ui.designsystem.menu

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DropdownMenuGroup
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.DropdownMenuPopup
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.window.PopupProperties
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.DexTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.DexIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowRight
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Check
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.ImmutableSet

@Composable
fun <T : Any> DexDropdownMenuSingleSelectionWithNull(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    items: ImmutableList<T>,
    selectedItem: T?,
    onClick: (T?) -> Unit,
    getContentText: @Composable (T) -> String,
    getTrailingIcon: ((T) -> ImageVector?)? = null,
) {
    DexDropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
        items = items,
        getContentText = getContentText,
        getSelected = { item -> item == selectedItem },
        onClick = { item ->
            if (item == selectedItem) onClick(null) else onClick(item)
            onDismissRequest()
        },
        getTrailingIcon = getTrailingIcon,
    )
}

@Composable
fun <Group : Any, Item : Any> DexDropdownMenuSingleSelectionGroupNullable(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    map: ImmutableMap<Group?, List<Item>>,
    selectedItem: Item,
    onClick: (Item) -> Unit,
    getGroupText: @Composable (Group?) -> String,
    getContentText: @Composable (Item) -> String,
    modifier: Modifier = Modifier,
    getSupportingContent: @Composable ((Item) -> Unit)? = null,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
) {
    val density = LocalDensity.current
    var menuWidth by remember { mutableStateOf(0.dp) }

    DexDropdownMenuPopup(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
    ) {
        DexDropdownMenuGroup(
            modifier = modifier.onSizeChanged { size ->
                with(density) {
                    menuWidth = size.width.toDp()
                }
            },
        ) {
            val entries = map.entries.toList()
            var selectedGroup by remember {
                val group = entries
                    .firstOrNull { (_, items) -> items.contains(selectedItem) }
                    ?.key
                mutableStateOf(group)
            }

            entries.fastForEachIndexed { groupIndex, (group, items) ->
                Box {
                    val groupInteractionSource = remember { MutableInteractionSource() }
                    var groupHeight by remember { mutableStateOf(0.dp) }

                    val isGroupHovered by groupInteractionSource.collectIsHoveredAsState()
                    SideEffect(isGroupHovered) {
                        if (isGroupHovered) {
                            selectedGroup = group
                        }
                    }

                    DexDropdownMenuItem(
                        modifier = Modifier
                            .onSizeChanged { size ->
                                with(density) {
                                    groupHeight = size.height.toDp()
                                }
                            },
                        index = groupIndex,
                        count = entries.size,
                        text = getGroupText(group),
                        selected = false,
                        onClick = { selectedGroup = group },
                        trailingIcon = DexIcons.Material.ArrowRight,
                        interactionSource = groupInteractionSource,
                    )

                    DexDropdownMenuPopup(
                        expanded = selectedGroup == group,
                        onDismissRequest = onDismissRequest,
                        properties = PopupProperties(
                            focusable = false,
                        ),
                        offset = DpOffset(
                            x = menuWidth,
                            y = -groupHeight,
                        ),
                    ) {
                        DexDropdownMenuGroup(
                            interactionSource = groupInteractionSource,
                        ) {
                            items.fastForEachIndexed { itemIndex, item ->
                                DexDropdownMenuItem(
                                    index = itemIndex,
                                    count = items.size,
                                    text = getContentText(item),
                                    supportingContent = { getSupportingContent?.invoke(item) },
                                    selected = item == selectedItem,
                                    onClick = { onClick(item) },
                                    trailingIcon = getTrailingIcon?.invoke(item),
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun <T : Any> DexDropdownMenuMultiSelection(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    items: ImmutableList<T>,
    selectedItems: ImmutableSet<T>,
    onClick: (T) -> Unit,
    getContentText: @Composable (T) -> String,
    getTrailingIcon: ((T) -> ImageVector?)? = null,
) {
    DexDropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
        items = items,
        getContentText = getContentText,
        getSelected = { item -> selectedItems.contains(item) },
        onClick = onClick,
        getTrailingIcon = getTrailingIcon,
    )
}

@Composable
private fun <T : Any> DexDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    items: ImmutableList<T>,
    getContentText: @Composable (T) -> String,
    getSelected: (T) -> Boolean,
    onClick: (T) -> Unit,
    getTrailingIcon: ((T) -> ImageVector?)?,
) {
    DexDropdownMenuPopup(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
    ) {
        DexDropdownMenuGroup {
            items.fastForEachIndexed { index, item ->
                DexDropdownMenuItem(
                    index = index,
                    count = items.size,
                    text = getContentText(item),
                    selected = getSelected(item),
                    onClick = { onClick(item) },
                    trailingIcon = getTrailingIcon?.invoke(item),
                )
            }
        }
    }
}

@Composable
private fun DexDropdownMenuPopup(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    offset: DpOffset = DpOffset(x = 0.dp, y = 0.dp),
    properties: PopupProperties = PopupProperties(focusable = true),
    content: @Composable ColumnScope.() -> Unit,
) {
    DropdownMenuPopup(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
        modifier = modifier.verticalScroll(rememberScrollState()),
        offset = offset,
        properties = properties,
        content = content,
    )
}

@Composable
private fun DexDropdownMenuGroup(
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    DropdownMenuGroup(
        modifier = modifier,
        shapes = MenuDefaults.groupShape(
            index = 0,
            count = 1,
        ),
        interactionSource = interactionSource,
        content = content,
    )
}

@Composable
private fun DexDropdownMenuItem(
    index: Int,
    count: Int,
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    trailingIcon: ImageVector?,
    modifier: Modifier = Modifier,
    supportingContent: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource? = null,
) {
    DropdownMenuItem(
        modifier = modifier,
        shapes = MenuDefaults.itemShape(
            index = index,
            count = count,
        ),
        text = {
            DexTextSingleLine(
                text = text,
            )
        },
        supportingText = supportingContent,
        selected = selected,
        onClick = onClick,
        selectedLeadingIcon = {
            Icon(
                imageVector = DexIcons.Material.Check,
                modifier = Modifier.size(MenuDefaults.LeadingIconSize),
                contentDescription = null,
            )
        },
        trailingIcon = trailingIcon?.let { imageVector ->
            {
                Icon(
                    imageVector = imageVector,
                    modifier = Modifier.size(MenuDefaults.TrailingIconSize),
                    contentDescription = null,
                )
            }
        },
        interactionSource = interactionSource,
    )
}
