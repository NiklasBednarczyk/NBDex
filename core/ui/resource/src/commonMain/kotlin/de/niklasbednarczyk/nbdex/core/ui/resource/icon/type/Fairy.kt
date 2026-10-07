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

val NBIcons.Type.Fairy: ImageVector
    get() {
        if (_Fairy != null) {
            return _Fairy!!
        }
        _Fairy = ImageVector.Builder(
            name = "Fairy",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(102.73f, 405.98f)
                lineTo(184.85f, 382.17f)
                lineTo(255.78f, 511.86f)
                curveTo(255.87f, 512.03f, 256.11f, 512.03f, 256.2f, 511.86f)
                lineTo(327.13f, 382.17f)
                lineTo(409.26f, 405.98f)
                curveTo(409.44f, 406.03f, 409.61f, 405.86f, 409.56f, 405.68f)
                lineTo(385.74f, 325.18f)
                lineTo(511.86f, 256.2f)
                curveTo(512.03f, 256.11f, 512.03f, 255.87f, 511.86f, 255.78f)
                lineTo(384.7f, 186.24f)
                lineTo(409.56f, 102.22f)
                curveTo(409.61f, 102.04f, 409.44f, 101.87f, 409.26f, 101.92f)
                lineTo(325.21f, 126.29f)
                lineTo(256.2f, 0.13f)
                curveTo(256.11f, -0.04f, 255.87f, -0.04f, 255.78f, 0.13f)
                lineTo(186.77f, 126.29f)
                lineTo(102.73f, 101.92f)
                curveTo(102.54f, 101.87f, 102.37f, 102.04f, 102.43f, 102.22f)
                lineTo(127.28f, 186.24f)
                lineTo(0.13f, 255.78f)
                curveTo(-0.04f, 255.87f, -0.04f, 256.11f, 0.13f, 256.2f)
                lineTo(126.24f, 325.18f)
                lineTo(102.43f, 405.68f)
                curveTo(102.37f, 405.86f, 102.54f, 406.03f, 102.73f, 405.98f)
                close()
                moveTo(166.45f, 256.88f)
                lineTo(224.63f, 288.7f)
                lineTo(256.45f, 346.87f)
                curveTo(256.54f, 347.04f, 256.78f, 347.04f, 256.88f, 346.87f)
                lineTo(288.7f, 288.7f)
                lineTo(346.87f, 256.88f)
                curveTo(347.04f, 256.78f, 347.04f, 256.54f, 346.87f, 256.45f)
                lineTo(288.7f, 224.63f)
                lineTo(256.88f, 166.45f)
                curveTo(256.78f, 166.28f, 256.54f, 166.28f, 256.45f, 166.45f)
                lineTo(224.63f, 224.63f)
                lineTo(166.45f, 256.45f)
                curveTo(166.28f, 256.54f, 166.28f, 256.78f, 166.45f, 256.88f)
                close()
            }
        }.build()

        return _Fairy!!
    }

@Suppress("ObjectPropertyName")
private var _Fairy: ImageVector? = null

@Preview
@Composable
private fun FairyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Fairy, contentDescription = null)
    }
}
