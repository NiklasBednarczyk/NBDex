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

val NBIcons.Material.Construction: ImageVector
    get() {
        if (_Construction != null) {
            return _Construction!!
        }
        _Construction = ImageVector.Builder(
            name = "Construction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(756f, 840f)
                lineTo(537f, 621f)
                lineToRelative(84f, -84f)
                lineToRelative(219f, 219f)
                lineToRelative(-84f, 84f)
                close()
                moveTo(204f, 840f)
                lineTo(120f, 756f)
                lineTo(396f, 480f)
                lineTo(328f, 412f)
                lineTo(300f, 440f)
                lineTo(249f, 389f)
                verticalLineToRelative(82f)
                lineToRelative(-28f, 28f)
                lineToRelative(-121f, -121f)
                lineToRelative(28f, -28f)
                horizontalLineToRelative(82f)
                lineToRelative(-50f, -50f)
                lineToRelative(142f, -142f)
                quadToRelative(20f, -20f, 43f, -29f)
                reflectiveQuadToRelative(47f, -9f)
                quadToRelative(24f, 0f, 47f, 9f)
                reflectiveQuadToRelative(43f, 29f)
                lineToRelative(-92f, 92f)
                lineToRelative(50f, 50f)
                lineToRelative(-28f, 28f)
                lineToRelative(68f, 68f)
                lineToRelative(90f, -90f)
                quadToRelative(-4f, -11f, -6.5f, -23f)
                reflectiveQuadToRelative(-2.5f, -24f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(701f, 119f)
                quadToRelative(15f, 0f, 28.5f, 3f)
                reflectiveQuadToRelative(27.5f, 9f)
                lineToRelative(-99f, 99f)
                lineToRelative(72f, 72f)
                lineToRelative(99f, -99f)
                quadToRelative(7f, 14f, 9.5f, 27.5f)
                reflectiveQuadTo(841f, 259f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(701f, 399f)
                quadToRelative(-12f, 0f, -24f, -2f)
                reflectiveQuadToRelative(-23f, -7f)
                lineTo(204f, 840f)
                close()
            }
        }.build()

        return _Construction!!
    }

@Suppress("ObjectPropertyName")
private var _Construction: ImageVector? = null

@Preview
@Composable
private fun ConstructionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.Construction, contentDescription = null)
    }
}
