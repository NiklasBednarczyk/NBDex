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

val NBIcons.Type.Fighting: ImageVector
    get() {
        if (_Fighting != null) {
            return _Fighting!!
        }
        _Fighting = ImageVector.Builder(
            name = "Fighting",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(88.23f, 42.57f)
                curveTo(94.43f, 18.1f, 116.59f, 0f, 142.98f, 0f)
                curveTo(162.78f, 0f, 180.2f, 10.18f, 190.28f, 25.6f)
                horizontalLineTo(206.79f)
                curveTo(217.05f, 15.07f, 231.38f, 8.53f, 247.24f, 8.53f)
                curveTo(270.5f, 8.53f, 290.47f, 22.59f, 299.13f, 42.67f)
                horizontalLineTo(312.95f)
                curveTo(321.62f, 37.26f, 331.85f, 34.13f, 342.82f, 34.13f)
                curveTo(366.07f, 34.13f, 386.04f, 48.19f, 394.7f, 68.27f)
                horizontalLineTo(432.3f)
                curveTo(432.62f, 68.27f, 432.92f, 68.35f, 433.18f, 68.5f)
                curveTo(434.89f, 68.35f, 436.63f, 68.27f, 438.39f, 68.27f)
                curveTo(469.58f, 68.27f, 494.87f, 93.55f, 494.87f, 124.74f)
                verticalLineTo(294.09f)
                lineTo(494.87f, 294.4f)
                lineTo(494.87f, 294.71f)
                verticalLineTo(297.15f)
                curveTo(494.87f, 298.19f, 494.84f, 299.21f, 494.78f, 300.24f)
                curveTo(491.38f, 417.72f, 385.75f, 512f, 255.93f, 512f)
                curveTo(123.97f, 512f, 17f, 414.58f, 17f, 294.4f)
                curveTo(17f, 236.39f, 41.92f, 183.68f, 82.55f, 144.68f)
                curveTo(82.45f, 201.23f, 83.41f, 259.69f, 87.81f, 258.69f)
                curveTo(99.6f, 256f, 90.39f, 80.84f, 88.23f, 42.57f)
                close()
            }
        }.build()

        return _Fighting!!
    }

@Suppress("ObjectPropertyName")
private var _Fighting: ImageVector? = null

@Preview
@Composable
private fun FightingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Fighting, contentDescription = null)
    }
}
