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

val NBIcons.Type.Poison: ImageVector
    get() {
        if (_Poison != null) {
            return _Poison!!
        }
        _Poison = ImageVector.Builder(
            name = "Poison",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(427.82f, 393.45f)
                curveTo(479.52f, 352.11f, 512f, 292.38f, 512f, 225.95f)
                curveTo(512f, 101.16f, 397.39f, 0f, 256f, 0f)
                curveTo(114.61f, 0f, 0f, 101.16f, 0f, 225.95f)
                curveTo(0f, 289.98f, 30.17f, 347.79f, 78.66f, 388.9f)
                curveTo(75.72f, 399.05f, 74.11f, 410.08f, 74.11f, 421.62f)
                curveTo(74.11f, 471.54f, 104.27f, 512f, 141.47f, 512f)
                curveTo(165.65f, 512f, 186.85f, 494.92f, 198.74f, 469.25f)
                curveTo(210.62f, 494.92f, 231.82f, 512f, 256f, 512f)
                curveTo(278.04f, 512f, 297.6f, 497.8f, 309.89f, 475.86f)
                curveTo(322.19f, 497.8f, 341.75f, 512f, 363.79f, 512f)
                curveTo(401f, 512f, 431.16f, 471.54f, 431.16f, 421.62f)
                curveTo(431.16f, 411.78f, 429.99f, 402.31f, 427.82f, 393.45f)
                close()
                moveTo(404.21f, 230.43f)
                curveTo(404.21f, 293.79f, 336.35f, 345.14f, 252.63f, 345.14f)
                curveTo(168.92f, 345.14f, 101.05f, 293.79f, 101.05f, 230.43f)
                curveTo(101.05f, 167.08f, 168.92f, 115.72f, 252.63f, 115.72f)
                curveTo(336.35f, 115.72f, 404.21f, 167.08f, 404.21f, 230.43f)
                close()
            }
        }.build()

        return _Poison!!
    }

@Suppress("ObjectPropertyName")
private var _Poison: ImageVector? = null

@Preview
@Composable
private fun PoisonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Poison, contentDescription = null)
    }
}
