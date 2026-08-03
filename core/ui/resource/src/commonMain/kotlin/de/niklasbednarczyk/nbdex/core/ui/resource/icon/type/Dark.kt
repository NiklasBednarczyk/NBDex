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

val NBIcons.Type.Dark: ImageVector
    get() {
        if (_Dark != null) {
            return _Dark!!
        }
        _Dark = ImageVector.Builder(
            name = "Dark",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(229.38f, 452.85f)
                curveTo(239.11f, 454.34f, 249.07f, 455.11f, 259.21f, 455.11f)
                curveTo(367.21f, 455.11f, 454.77f, 367.56f, 454.77f, 259.56f)
                curveTo(454.77f, 151.55f, 367.21f, 64f, 259.21f, 64f)
                curveTo(251.97f, 64f, 244.81f, 64.39f, 237.77f, 65.16f)
                curveTo(291.35f, 105.75f, 326.77f, 176.06f, 326.77f, 256f)
                curveTo(326.77f, 340.04f, 287.62f, 413.44f, 229.38f, 452.85f)
                close()
                moveTo(255.66f, 512f)
                curveTo(397.04f, 512f, 511.66f, 397.39f, 511.66f, 256f)
                curveTo(511.66f, 114.61f, 397.04f, 0f, 255.66f, 0f)
                curveTo(114.27f, 0f, -0.34f, 114.61f, -0.34f, 256f)
                curveTo(-0.34f, 397.39f, 114.27f, 512f, 255.66f, 512f)
                close()
            }
        }.build()

        return _Dark!!
    }

@Suppress("ObjectPropertyName")
private var _Dark: ImageVector? = null

@Preview
@Composable
private fun DarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Dark, contentDescription = null)
    }
}
