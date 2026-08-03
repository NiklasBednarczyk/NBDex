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

val NBIcons.Type.Bug: ImageVector
    get() {
        if (_Bug != null) {
            return _Bug!!
        }
        _Bug = ImageVector.Builder(
            name = "Bug",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveToRelative(342.2f, 0.5f)
                curveToRelative(0.37f, -0.53f, 1.11f, -0.66f, 1.64f, -0.29f)
                lineToRelative(36.35f, 25.46f)
                curveToRelative(0.53f, 0.37f, 0.66f, 1.11f, 0.29f, 1.64f)
                lineToRelative(-50.6f, 72.26f)
                curveToRelative(24.6f, 7.86f, 41.36f, 16.34f, 41.36f, 16.34f)
                reflectiveCurveToRelative(-40.96f, 70.46f, -110.44f, 70.46f)
                reflectiveCurveToRelative(-118.85f, -65.67f, -118.85f, -65.67f)
                reflectiveCurveToRelative(17.51f, -11.17f, 43.46f, -20.75f)
                lineToRelative(-55.5f, -66.14f)
                curveToRelative(-0.42f, -0.5f, -0.35f, -1.24f, 0.14f, -1.66f)
                lineToRelative(34f, -28.53f)
                curveToRelative(0.5f, -0.42f, 1.24f, -0.35f, 1.66f, 0.14f)
                lineToRelative(70.27f, 83.75f)
                curveToRelative(6.02f, -0.68f, 12.15f, -1.06f, 18.33f, -1.06f)
                curveToRelative(8.89f, 0f, 17.77f, 0.68f, 26.44f, 1.82f)
                close()
                moveTo(355.94f, 189.7f)
                curveToRelative(18.54f, -13.24f, 46.6f, -47.8f, 46.6f, -47.8f)
                reflectiveCurveToRelative(71.66f, 56.79f, 71.66f, 177.21f)
                curveToRelative(0f, 120.42f, -123.9f, 192.89f, -123.9f, 192.89f)
                reflectiveCurveToRelative(-59.19f, -59.78f, -73.73f, -135.56f)
                curveToRelative(-14.53f, -75.78f, 21.5f, -159.93f, 21.5f, -159.93f)
                reflectiveCurveToRelative(39.32f, -13.56f, 57.87f, -26.8f)
                close()
                moveTo(156.26f, 189.7f)
                curveToRelative(-18.54f, -13.24f, -46.6f, -47.8f, -46.6f, -47.8f)
                reflectiveCurveToRelative(-71.66f, 56.79f, -71.66f, 177.21f)
                curveToRelative(0f, 120.42f, 123.9f, 192.89f, 123.9f, 192.89f)
                reflectiveCurveToRelative(59.19f, -59.78f, 73.73f, -135.56f)
                curveToRelative(14.53f, -75.78f, -21.5f, -159.93f, -21.5f, -159.93f)
                reflectiveCurveToRelative(-39.32f, -13.56f, -57.87f, -26.8f)
                close()
            }
        }.build()

        return _Bug!!
    }

@Suppress("ObjectPropertyName")
private var _Bug: ImageVector? = null

@Preview
@Composable
private fun BugPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Bug, contentDescription = null)
    }
}
