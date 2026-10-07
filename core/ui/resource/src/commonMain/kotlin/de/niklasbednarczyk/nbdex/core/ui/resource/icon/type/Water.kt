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

val NBIcons.Type.Water: ImageVector
    get() {
        if (_Water != null) {
            return _Water!!
        }
        _Water = ImageVector.Builder(
            name = "Water",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(422.17f, 346.52f)
                curveTo(422.17f, 437.9f, 347.81f, 511.98f, 256.09f, 511.98f)
                curveTo(164.36f, 511.98f, 90f, 437.9f, 90f, 346.52f)
                curveTo(90f, 257.64f, 247.1f, 13.55f, 255.72f, 0.23f)
                curveTo(255.91f, -0.08f, 256.26f, -0.08f, 256.45f, 0.23f)
                curveTo(265.07f, 13.55f, 422.17f, 257.64f, 422.17f, 346.52f)
                close()
                moveTo(228.4f, 458.93f)
                curveTo(144.12f, 440.49f, 158.54f, 347.13f, 158.54f, 347.13f)
                curveTo(158.54f, 347.13f, 181.56f, 403.49f, 237.4f, 421.74f)
                curveTo(293.25f, 440f, 360.74f, 413.23f, 360.74f, 413.23f)
                curveTo(360.74f, 413.23f, 312.68f, 477.37f, 228.4f, 458.93f)
                close()
            }
        }.build()

        return _Water!!
    }

@Suppress("ObjectPropertyName")
private var _Water: ImageVector? = null

@Preview
@Composable
private fun WaterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Water, contentDescription = null)
    }
}
