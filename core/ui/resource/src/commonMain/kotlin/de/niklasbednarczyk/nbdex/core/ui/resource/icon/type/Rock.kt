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

val NBIcons.Type.Rock: ImageVector
    get() {
        if (_Rock != null) {
            return _Rock!!
        }
        _Rock = ImageVector.Builder(
            name = "Rock",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(395.14f, 244.76f)
                curveTo(395.11f, 244.72f, 395.1f, 244.67f, 395.11f, 244.62f)
                lineTo(427.77f, 54.15f)
                curveTo(427.78f, 54.06f, 427.86f, 54f, 427.95f, 54f)
                horizontalLineTo(438.29f)
                curveTo(438.37f, 54f, 438.44f, 54.05f, 438.46f, 54.13f)
                lineTo(512.05f, 287.13f)
                curveTo(512.07f, 287.2f, 512.05f, 287.28f, 511.99f, 287.33f)
                lineTo(457.73f, 329.69f)
                curveTo(457.65f, 329.76f, 457.53f, 329.74f, 457.47f, 329.66f)
                lineTo(395.14f, 244.76f)
                close()
                moveTo(-1f, 371.02f)
                curveTo(-1f, 371.1f, -0.95f, 371.17f, -0.87f, 371.2f)
                lineTo(110.97f, 407.77f)
                curveTo(111.03f, 407.79f, 111.09f, 407.78f, 111.14f, 407.74f)
                lineTo(361.14f, 235.14f)
                curveTo(361.19f, 235.12f, 361.21f, 235.07f, 361.22f, 235.02f)
                lineTo(388.03f, 55.13f)
                curveTo(388.05f, 55.02f, 387.96f, 54.92f, 387.85f, 54.92f)
                horizontalLineTo(166.41f)
                curveTo(166.35f, 54.92f, 166.3f, 54.94f, 166.26f, 54.98f)
                lineTo(-0.96f, 256.71f)
                curveTo(-0.99f, 256.75f, -1f, 256.79f, -1f, 256.83f)
                verticalLineTo(371.02f)
                close()
                moveTo(157.58f, 417.08f)
                lineTo(279.78f, 457.11f)
                curveTo(279.83f, 457.13f, 279.89f, 457.12f, 279.94f, 457.09f)
                lineTo(425.42f, 352.73f)
                curveTo(425.5f, 352.68f, 425.52f, 352.57f, 425.46f, 352.48f)
                lineTo(370.93f, 271.33f)
                curveTo(370.87f, 271.24f, 370.76f, 271.22f, 370.67f, 271.28f)
                lineTo(157.58f, 417.08f)
                close()
            }
        }.build()

        return _Rock!!
    }

@Suppress("ObjectPropertyName")
private var _Rock: ImageVector? = null

@Preview
@Composable
private fun RockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Rock, contentDescription = null)
    }
}
