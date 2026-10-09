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

val NBIcons.Material.ListAltCheck: ImageVector
    get() {
        if (_ListAltCheck != null) {
            return _ListAltCheck!!
        }
        _ListAltCheck = ImageVector.Builder(
            name = "ListAltCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(454f)
                verticalLineToRelative(-85f)
                verticalLineToRelative(191f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-320f)
                lineTo(200f, 200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                lineTo(200f, 840f)
                close()
                moveTo(694f, 880f)
                lineTo(552f, 738f)
                lineToRelative(57f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineTo(694f, 880f)
                close()
                moveTo(348.5f, 508.5f)
                quadTo(360f, 497f, 360f, 480f)
                reflectiveQuadToRelative(-11.5f, -28.5f)
                quadTo(337f, 440f, 320f, 440f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                quadTo(280f, 463f, 280f, 480f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                quadTo(303f, 520f, 320f, 520f)
                reflectiveQuadToRelative(28.5f, -11.5f)
                close()
                moveTo(348.5f, 348.5f)
                quadTo(360f, 337f, 360f, 320f)
                reflectiveQuadToRelative(-11.5f, -28.5f)
                quadTo(337f, 280f, 320f, 280f)
                reflectiveQuadToRelative(-28.5f, 11.5f)
                quadTo(280f, 303f, 280f, 320f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                quadTo(303f, 360f, 320f, 360f)
                reflectiveQuadToRelative(28.5f, -11.5f)
                close()
                moveTo(440f, 520f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                lineTo(440f, 440f)
                verticalLineToRelative(80f)
                close()
                moveTo(440f, 360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                lineTo(440f, 280f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()

        return _ListAltCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ListAltCheck: ImageVector? = null

@Preview
@Composable
private fun ListAltCheckPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.ListAltCheck, contentDescription = null)
    }
}
