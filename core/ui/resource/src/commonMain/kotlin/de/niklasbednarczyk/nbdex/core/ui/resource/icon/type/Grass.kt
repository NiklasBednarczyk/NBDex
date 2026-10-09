package de.niklasbednarczyk.nbdex.core.ui.resource.icon.type

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons

val NBIcons.Type.Grass: ImageVector
    get() {
        if (_Grass != null) {
            return _Grass!!
        }
        _Grass = ImageVector.Builder(
            name = "Grass",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveToRelative(97.41f, 440.65f)
                curveToRelative(-1.76f, -1.65f, -3.5f, -3.34f, -5.21f, -5.06f)
                curveToRelative(-90.68f, -90.68f, -90.68f, -237.71f, 0f, -328.4f)
                curveToRelative(90.68f, -90.68f, 379.64f, -96.75f, 379.64f, -96.75f)
                reflectiveCurveToRelative(39.44f, 334.46f, -51.24f, 425.15f)
                curveToRelative(-80.54f, 80.54f, -205.52f, 89.55f, -296.01f, 27.03f)
                lineToRelative(72.91f, -89.47f)
                lineToRelative(116.55f, -25.16f)
                lineToRelative(-95.14f, -9.51f)
                lineToRelative(60.46f, -61.56f)
                lineToRelative(68.82f, -15.08f)
                lineToRelative(-54.42f, -16.12f)
                lineToRelative(54.42f, -98.18f)
                lineToRelative(-77.41f, 86.83f)
                lineToRelative(-29.89f, -42.18f)
                lineToRelative(10.52f, 69.65f)
                lineToRelative(-53.92f, 60.78f)
                lineToRelative(-24.99f, -76.9f)
                verticalLineToRelative(102.27f)
                close()
            }
        }.build()

        return _Grass!!
    }

@Suppress("ObjectPropertyName")
private var _Grass: ImageVector? = null

@Preview
@Composable
private fun GrassPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Grass, contentDescription = null)
    }
}
