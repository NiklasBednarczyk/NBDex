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

val NBIcons.Type.Ghost: ImageVector
    get() {
        if (_Ghost != null) {
            return _Ghost!!
        }
        _Ghost = ImageVector.Builder(
            name = "Ghost",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(368.95f, 510.23f)
                curveTo(322.77f, 512.59f, 269.9f, 512.59f, 251.93f, 510.23f)
                curveTo(111.77f, 491.79f, 0f, 389.31f, 0f, 250.8f)
                curveTo(0f, 112.29f, 114.61f, 0f, 256f, 0f)
                curveTo(397.39f, 0f, 512f, 112.29f, 512f, 250.8f)
                curveTo(512f, 315.22f, 487.21f, 373.97f, 446.46f, 418.39f)
                curveTo(435.39f, 430.45f, 450.58f, 438.91f, 466f, 447.5f)
                curveTo(481.13f, 455.93f, 496.49f, 464.5f, 487.56f, 476.71f)
                curveTo(477.73f, 490.17f, 424.39f, 507.39f, 368.95f, 510.23f)
                close()
                moveTo(220f, 219.45f)
                curveTo(220f, 241.09f, 202.09f, 258.64f, 180f, 258.64f)
                curveTo(157.91f, 258.64f, 140f, 241.09f, 140f, 219.45f)
                curveTo(140f, 204.93f, 148.05f, 192.26f, 160.02f, 185.49f)
                curveTo(160.71f, 204.36f, 176.23f, 219.45f, 195.27f, 219.45f)
                horizontalLineTo(220f)
                curveTo(220f, 219.45f, 220f, 219.45f, 220f, 219.45f)
                close()
                moveTo(343.98f, 185.49f)
                curveTo(343.29f, 204.36f, 327.77f, 219.45f, 308.73f, 219.45f)
                horizontalLineTo(284f)
                curveTo(284f, 219.45f, 284f, 219.45f, 284f, 219.45f)
                curveTo(284f, 241.09f, 301.91f, 258.64f, 324f, 258.64f)
                curveTo(346.09f, 258.64f, 364f, 241.09f, 364f, 219.45f)
                curveTo(364f, 204.93f, 355.95f, 192.26f, 343.98f, 185.49f)
                close()
            }
        }.build()

        return _Ghost!!
    }

@Suppress("ObjectPropertyName")
private var _Ghost: ImageVector? = null

@Preview
@Composable
private fun GhostPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Ghost, contentDescription = null)
    }
}
