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

val NBIcons.Type.Normal: ImageVector
    get() {
        if (_Normal != null) {
            return _Normal!!
        }
        _Normal = ImageVector.Builder(
            name = "Normal",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(481f, 256f)
                curveTo(481f, 380.26f, 380.26f, 481f, 256f, 481f)
                curveTo(131.74f, 481f, 31f, 380.26f, 31f, 256f)
                curveTo(31f, 131.74f, 131.74f, 31f, 256f, 31f)
                curveTo(380.26f, 31f, 481f, 131.74f, 481f, 256f)
                close()
                moveTo(384.57f, 256f)
                curveTo(384.57f, 327.01f, 327.01f, 384.57f, 256f, 384.57f)
                curveTo(184.99f, 384.57f, 127.43f, 327.01f, 127.43f, 256f)
                curveTo(127.43f, 184.99f, 184.99f, 127.43f, 256f, 127.43f)
                curveTo(327.01f, 127.43f, 384.57f, 184.99f, 384.57f, 256f)
                close()
            }
        }.build()

        return _Normal!!
    }

@Suppress("ObjectPropertyName")
private var _Normal: ImageVector? = null

@Preview
@Composable
private fun NormalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Normal, contentDescription = null)
    }
}
