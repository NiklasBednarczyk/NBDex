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

val NBIcons.Type.Ground: ImageVector
    get() {
        if (_Ground != null) {
            return _Ground!!
        }
        _Ground = ImageVector.Builder(
            name = "Ground",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(112.76f, 439.75f)
                curveTo(112.63f, 439.75f, 112.53f, 439.62f, 112.57f, 439.49f)
                lineTo(243.29f, 70.13f)
                curveTo(243.32f, 70.05f, 243.39f, 70f, 243.48f, 70f)
                horizontalLineTo(383.02f)
                curveTo(383.11f, 70f, 383.18f, 70.05f, 383.21f, 70.13f)
                lineTo(511.99f, 439.49f)
                curveTo(512.03f, 439.62f, 511.93f, 439.75f, 511.8f, 439.75f)
                horizontalLineTo(116.69f)
                horizontalLineTo(112.76f)
                close()
                moveTo(0.2f, 441.2f)
                curveTo(0.06f, 441.2f, -0.04f, 441.06f, 0.01f, 440.93f)
                lineTo(97.35f, 181.06f)
                curveTo(97.38f, 180.98f, 97.46f, 180.93f, 97.54f, 180.93f)
                horizontalLineTo(182.12f)
                curveTo(182.26f, 180.93f, 182.35f, 181.06f, 182.31f, 181.2f)
                lineTo(88.18f, 441.07f)
                curveTo(88.15f, 441.15f, 88.08f, 441.2f, 87.99f, 441.2f)
                horizontalLineTo(0.2f)
                close()
            }
        }.build()

        return _Ground!!
    }

@Suppress("ObjectPropertyName")
private var _Ground: ImageVector? = null

@Preview
@Composable
private fun GroundPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Ground, contentDescription = null)
    }
}
