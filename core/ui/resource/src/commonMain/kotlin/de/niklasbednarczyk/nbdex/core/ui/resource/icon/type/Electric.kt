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

val NBIcons.Type.Electric: ImageVector
    get() {
        if (_Electric != null) {
            return _Electric!!
        }
        _Electric = ImageVector.Builder(
            name = "Electric",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(152.56f, 0.58f)
                curveTo(152.46f, 0.3f, 152.67f, 0f, 152.98f, 0f)
                horizontalLineTo(332.8f)
                curveTo(333f, 0f, 333.17f, 0.13f, 333.23f, 0.31f)
                lineTo(415.82f, 267.17f)
                curveTo(415.91f, 267.45f, 415.7f, 267.74f, 415.4f, 267.74f)
                horizontalLineTo(295.68f)
                curveTo(295.54f, 267.74f, 295.43f, 267.88f, 295.47f, 268.02f)
                lineTo(364.14f, 509.73f)
                curveTo(364.27f, 510.2f, 363.65f, 510.5f, 363.36f, 510.11f)
                lineTo(96.53f, 155.27f)
                curveTo(96.31f, 154.98f, 96.52f, 154.56f, 96.88f, 154.56f)
                horizontalLineTo(205.54f)
                curveTo(205.69f, 154.56f, 205.79f, 154.41f, 205.74f, 154.27f)
                lineTo(152.56f, 0.58f)
                close()
            }
        }.build()

        return _Electric!!
    }

@Suppress("ObjectPropertyName")
private var _Electric: ImageVector? = null

@Preview
@Composable
private fun ElectricPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Electric, contentDescription = null)
    }
}
