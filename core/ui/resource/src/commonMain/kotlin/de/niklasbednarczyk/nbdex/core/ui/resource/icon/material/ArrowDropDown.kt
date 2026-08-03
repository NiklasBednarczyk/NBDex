package de.niklasbednarczyk.nbdex.core.ui.resource.icon.material

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons

val NBIcons.Material.ArrowDropDown: ImageVector
    get() {
        if (_ArrowDropDown != null) {
            return _ArrowDropDown!!
        }
        _ArrowDropDown = ImageVector.Builder(
            name = "ArrowDropDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(480f, 600f)
                lineTo(280f, 400f)
                horizontalLineToRelative(400f)
                lineTo(480f, 600f)
                close()
            }
        }.build()

        return _ArrowDropDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDropDown: ImageVector? = null

@Preview
@Composable
private fun ArrowDropDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.ArrowDropDown, contentDescription = null)
    }
}
