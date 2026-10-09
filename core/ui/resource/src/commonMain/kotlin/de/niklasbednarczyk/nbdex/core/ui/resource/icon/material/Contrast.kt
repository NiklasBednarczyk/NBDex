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

val NBIcons.Material.Contrast: ImageVector
    get() {
        if (_Contrast != null) {
            return _Contrast!!
        }
        _Contrast = ImageVector.Builder(
            name = "Contrast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(324f, 848.5f)
                quadTo(251f, 817f, 197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                quadTo(80f, 563f, 80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                quadTo(143f, 251f, 197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                quadTo(397f, 80f, 480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                quadTo(709f, 143f, 763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                quadTo(880f, 397f, 880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                quadTo(817f, 709f, 763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                quadTo(563f, 880f, 480f, 880f)
                reflectiveQuadToRelative(-156f, -31.5f)
                close()
                moveTo(520f, 797f)
                quadToRelative(119f, -15f, 199.5f, -104.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -123f, -80.5f, -212.5f)
                reflectiveQuadTo(520f, 163f)
                verticalLineToRelative(634f)
                close()
            }
        }.build()

        return _Contrast!!
    }

@Suppress("ObjectPropertyName")
private var _Contrast: ImageVector? = null

@Preview
@Composable
private fun ContrastPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.Contrast, contentDescription = null)
    }
}
