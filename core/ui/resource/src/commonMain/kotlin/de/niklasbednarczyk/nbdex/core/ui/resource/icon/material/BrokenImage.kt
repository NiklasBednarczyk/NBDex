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

val NBIcons.Material.BrokenImage: ImageVector
    get() {
        if (_BrokenImage != null) {
            return _BrokenImage!!
        }
        _BrokenImage = ImageVector.Builder(
            name = "BrokenImage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                lineTo(200f, 840f)
                close()
                moveTo(240f, 503f)
                lineTo(400f, 343f)
                lineTo(560f, 503f)
                lineTo(720f, 343f)
                lineTo(760f, 383f)
                verticalLineToRelative(-183f)
                lineTo(200f, 200f)
                verticalLineToRelative(263f)
                lineToRelative(40f, 40f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-264f)
                lineToRelative(-40f, -40f)
                lineToRelative(-160f, 160f)
                lineToRelative(-160f, -160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(184f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-264f)
                verticalLineToRelative(80f)
                verticalLineToRelative(-376f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()

        return _BrokenImage!!
    }

@Suppress("ObjectPropertyName")
private var _BrokenImage: ImageVector? = null

@Preview
@Composable
private fun BrokenImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.BrokenImage, contentDescription = null)
    }
}
