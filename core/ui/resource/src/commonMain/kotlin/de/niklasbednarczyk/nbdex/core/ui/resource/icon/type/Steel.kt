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

val NBIcons.Type.Steel: ImageVector
    get() {
        if (_Steel != null) {
            return _Steel!!
        }
        _Steel = ImageVector.Builder(
            name = "Steel",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.05f, 254.53f)
                curveTo(-0.02f, 254.41f, -0.02f, 254.27f, 0.05f, 254.15f)
                lineTo(128.79f, 34.18f)
                curveTo(128.86f, 34.07f, 128.99f, 34f, 129.12f, 34f)
                horizontalLineTo(384.29f)
                curveTo(384.43f, 34f, 384.55f, 34.07f, 384.62f, 34.19f)
                lineTo(511.95f, 254.15f)
                curveTo(512.02f, 254.27f, 512.02f, 254.41f, 511.95f, 254.52f)
                lineTo(384.62f, 474.24f)
                curveTo(384.55f, 474.36f, 384.43f, 474.43f, 384.29f, 474.43f)
                horizontalLineTo(129.12f)
                curveTo(128.99f, 474.43f, 128.86f, 474.36f, 128.79f, 474.25f)
                lineTo(0.05f, 254.53f)
                close()
                moveTo(374.62f, 254.21f)
                curveTo(374.62f, 319.7f, 321.53f, 372.79f, 256.04f, 372.79f)
                curveTo(190.55f, 372.79f, 137.46f, 319.7f, 137.46f, 254.21f)
                curveTo(137.46f, 188.73f, 190.55f, 135.64f, 256.04f, 135.64f)
                curveTo(321.53f, 135.64f, 374.62f, 188.73f, 374.62f, 254.21f)
                close()
            }
        }.build()

        return _Steel!!
    }

@Suppress("ObjectPropertyName")
private var _Steel: ImageVector? = null

@Preview
@Composable
private fun SteelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Steel, contentDescription = null)
    }
}
