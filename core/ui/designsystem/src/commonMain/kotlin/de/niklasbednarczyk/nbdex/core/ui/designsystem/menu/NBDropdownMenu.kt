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
import androidx.compose.runtime.LaunchedEffect
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
import de.niklasbednarczyk.nbdex.core.ui.designsystem.text.NBTextSingleLine
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.ArrowRight
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.Check

@Composable
fun <T : Any> NBDropdownMenuSingleSelectionWithNull(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    items: List<T>,
    selectedItem: T?,
    onClick: (T?) -> Unit,
    getContentText: @Composable (T) -> String,
    getTrailingIcon: ((T) -> ImageVector?)? = null,
) {
    NBDropdownMenu(
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
fun <Group : Any, Item : Any> NBDropdownMenuSingleSelectionGroupNullable(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    map: Map<Group?, List<Item>>,
    selectedItem: Item,
    onClick: (Item) -> Unit,
    getGroupText: @Composable (Group?) -> String,
    getContentText: @Composable (Item) -> String,
    getSupportingContent: @Composable ((Item) -> Unit)? = null,
    getTrailingIcon: ((Item) -> ImageVector?)? = null,
) {
    val density = LocalDensity.current
    var menuWidth by remember { mutableStateOf(0.dp) }

    NBDropdownMenuPopup(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
    ) {
        NBDropdownMenuGroup(
            modifier = Modifier.onSizeChanged { size ->
                with(density) {
                    menuWidth = size.width.toDp()
                }
            },
        ) {
            val entries = map.entries.toList()
            var selectedGroup by remember {
                val group = entries
                    .firstOrNull { (_, items) ->
                        items.any { item -> item == selectedItem }
                    }
                    ?.key
                mutableStateOf(group)
            }

            entries.fastForEachIndexed { groupIndex, (group, items) ->
                Box {
                    val groupInteractionSource = remember { MutableInteractionSource() }
                    var groupHeight by remember { mutableStateOf(0.dp) }

                    val groupIsHovered by groupInteractionSource.collectIsHoveredAsState()
                    LaunchedEffect(groupIsHovered) {
                        if (groupIsHovered) {
                            selectedGroup = group
                        }
                    }

                    NBDropdownMenuItem(
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
                        trailingIcon = NBIcons.Material.ArrowRight,
                        interactionSource = groupInteractionSource,
                    )

                    NBDropdownMenuPopup(
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
                        NBDropdownMenuGroup(
                            interactionSource = groupInteractionSource,
                        ) {
                            items.fastForEachIndexed { itemIndex, item ->
                                NBDropdownMenuItem(
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
fun <T : Any> NBDropdownMenuMultiSelection(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    items: List<T>,
    selectedItems: Set<T>,
    onClick: (T) -> Unit,
    getContentText: @Composable (T) -> String,
    getTrailingIcon: ((T) -> ImageVector?)? = null,
) {
    NBDropdownMenu(
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
private fun <T : Any> NBDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    items: List<T>,
    getContentText: @Composable (T) -> String,
    getSelected: (T) -> Boolean,
    onClick: (T) -> Unit,
    getTrailingIcon: ((T) -> ImageVector?)?,
) {
    NBDropdownMenuPopup(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
    ) {
        NBDropdownMenuGroup {
            items.fastForEachIndexed { index, item ->
                NBDropdownMenuItem(
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
private fun NBDropdownMenuPopup(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    offset: DpOffset = DpOffset(0.dp, 0.dp),
    properties: PopupProperties = PopupProperties(focusable = true),
    content: @Composable ColumnScope.() -> Unit,
) {
    DropdownMenuPopup(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
        modifier = Modifier.verticalScroll(rememberScrollState()),
        offset = offset,
        properties = properties,
        content = content,
    )
}

@Composable
private fun NBDropdownMenuGroup(
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
private fun NBDropdownMenuItem(
    modifier: Modifier = Modifier,
    index: Int,
    count: Int,
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    trailingIcon: ImageVector?,
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
            NBTextSingleLine(
                text = text,
            )
        },
        supportingText = supportingContent,
        selected = selected,
        onClick = onClick,
        selectedLeadingIcon = {
            Icon(
                imageVector = NBIcons.Material.Check,
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
