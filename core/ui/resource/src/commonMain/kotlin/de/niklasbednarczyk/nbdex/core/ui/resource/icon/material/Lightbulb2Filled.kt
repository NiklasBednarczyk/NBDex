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

val NBIcons.Material.Lightbulb2Filled: ImageVector
    get() {
        if (_Lightbulb2Filled != null) {
            return _Lightbulb2Filled!!
        }
        _Lightbulb2Filled = ImageVector.Builder(
            name = "Lightbulb2Filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(400f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 640f)
                verticalLineToRelative(-50f)
                quadToRelative(-57f, -39f, -88.5f, -100f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(0f, 69f, -31.5f, 129.5f)
                reflectiveQuadTo(640f, 590f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 720f)
                lineTo(400f, 720f)
                close()
                moveTo(400f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 840f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 880f)
                lineTo(400f, 880f)
                close()
            }
        }.build()

        return _Lightbulb2Filled!!
    }

@Suppress("ObjectPropertyName")
private var _Lightbulb2Filled: ImageVector? = null

@Preview
@Composable
private fun Lightbulb2FilledPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.Lightbulb2Filled, contentDescription = null)
    }
}
