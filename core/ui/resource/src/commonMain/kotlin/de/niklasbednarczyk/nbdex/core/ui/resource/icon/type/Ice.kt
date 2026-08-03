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

val NBIcons.Type.Ice: ImageVector
    get() {
        if (_Ice != null) {
            return _Ice!!
        }
        _Ice = ImageVector.Builder(
            name = "Ice",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(384.3f, 39.04f)
                lineTo(385.88f, 177.39f)
                lineTo(265.21f, 235.32f)
                lineTo(263.72f, 104.69f)
                lineTo(384.3f, 39.04f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(505.27f, 257.05f)
                lineTo(385.81f, 325.37f)
                lineTo(266.29f, 256.94f)
                lineTo(385.75f, 194.19f)
                lineTo(505.27f, 257.05f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(245.04f, 257.05f)
                lineTo(125.58f, 325.37f)
                lineTo(6.06f, 256.94f)
                lineTo(125.52f, 194.19f)
                lineTo(245.04f, 257.05f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(124.24f, 38.48f)
                lineTo(248.23f, 99.88f)
                lineTo(245.06f, 233.7f)
                lineTo(127.99f, 175.72f)
                lineTo(124.24f, 38.48f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(387.68f, 473.52f)
                lineTo(263.69f, 412.12f)
                lineTo(266.86f, 278.3f)
                lineTo(383.93f, 336.28f)
                lineTo(387.68f, 473.52f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(128.52f, 474.77f)
                lineTo(126.95f, 336.42f)
                lineTo(247.62f, 278.49f)
                lineTo(249.11f, 409.12f)
                lineTo(128.52f, 474.77f)
                close()
            }
        }.build()

        return _Ice!!
    }

@Suppress("ObjectPropertyName")
private var _Ice: ImageVector? = null

@Preview
@Composable
private fun IcePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Ice, contentDescription = null)
    }
}
