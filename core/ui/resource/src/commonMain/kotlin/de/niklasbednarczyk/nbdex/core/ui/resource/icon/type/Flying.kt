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

val NBIcons.Type.Flying: ImageVector
    get() {
        if (_Flying != null) {
            return _Flying!!
        }
        _Flying = ImageVector.Builder(
            name = "Flying",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(178.71f, 477.73f)
                curveTo(253.71f, 477.73f, 317.93f, 436.05f, 344.44f, 376.96f)
                curveTo(344.76f, 376.23f, 238.01f, 404.7f, 241.41f, 394.64f)
                curveTo(242.93f, 390.14f, 308.37f, 366.24f, 356.05f, 338.35f)
                curveTo(383.45f, 322.33f, 396.07f, 288.4f, 396.07f, 288.4f)
                curveTo(396.07f, 288.4f, 349.9f, 310.82f, 326.56f, 316.5f)
                curveTo(279.53f, 327.96f, 238.13f, 326.73f, 238.13f, 325.53f)
                curveTo(238.13f, 322.95f, 306.88f, 309.89f, 402.42f, 251.66f)
                curveTo(447.37f, 224.28f, 459.57f, 177.1f, 459.57f, 177.1f)
                curveTo(459.57f, 177.1f, 410.16f, 206.54f, 380.29f, 216.25f)
                curveTo(309.46f, 239.29f, 244.82f, 246.24f, 244.82f, 243.12f)
                curveTo(244.82f, 236.45f, 301.7f, 220.8f, 362.02f, 191.58f)
                curveTo(393.38f, 176.38f, 420.54f, 156.53f, 452.01f, 134.45f)
                curveTo(503.51f, 98.33f, 512f, 34f, 512f, 34f)
                curveTo(512f, 34f, 461.21f, 66.76f, 436.42f, 77.64f)
                curveTo(334.14f, 122.53f, 243.83f, 146.08f, 178.71f, 151.18f)
                curveTo(80.42f, 158.87f, 0f, 227.46f, 0f, 316.5f)
                curveTo(0f, 405.55f, 80.01f, 477.73f, 178.71f, 477.73f)
                close()
            }
        }.build()

        return _Flying!!
    }

@Suppress("ObjectPropertyName")
private var _Flying: ImageVector? = null

@Preview
@Composable
private fun FlyingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Flying, contentDescription = null)
    }
}
