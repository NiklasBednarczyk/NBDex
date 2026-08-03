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

val NBIcons.Type.Fire: ImageVector
    get() {
        if (_Fire != null) {
            return _Fire!!
        }
        _Fire = ImageVector.Builder(
            name = "Fire",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(352.26f, 395.39f)
                curveTo(358.58f, 372.26f, 346.3f, 324.71f, 346.3f, 324.71f)
                curveTo(346.3f, 324.71f, 337.4f, 363.45f, 323.48f, 377.77f)
                curveTo(311.61f, 389.98f, 297.07f, 398.45f, 276.21f, 400.68f)
                curveTo(293.26f, 392.39f, 304.99f, 375.12f, 304.99f, 355.15f)
                curveTo(304.99f, 327.13f, 281.88f, 304.41f, 253.37f, 304.41f)
                curveTo(224.86f, 304.41f, 201.74f, 327.13f, 201.74f, 355.15f)
                curveTo(201.74f, 362.81f, 203.47f, 370.07f, 206.56f, 376.58f)
                curveTo(188.73f, 362.37f, 185.92f, 339.59f, 185.92f, 339.59f)
                curveTo(185.92f, 339.59f, 166.01f, 422.26f, 220.88f, 461.15f)
                curveTo(275.74f, 500.04f, 383.22f, 466.61f, 383.22f, 466.61f)
                curveTo(383.22f, 466.61f, 229.41f, 574.84f, 115.44f, 457.05f)
                curveTo(17.26f, 355.58f, 89.81f, 222f, 89.81f, 222f)
                curveTo(89.81f, 222f, 86.68f, 234.4f, 86.68f, 248.78f)
                curveTo(86.68f, 263.17f, 94.48f, 274.11f, 94.48f, 274.11f)
                curveTo(94.48f, 274.11f, 117.74f, 225.07f, 135.85f, 205.13f)
                curveTo(152.98f, 186.25f, 174.46f, 170.95f, 193.02f, 157.72f)
                curveTo(207.3f, 147.55f, 219.85f, 138.6f, 227.34f, 130.22f)
                curveTo(268.62f, 84.07f, 243.31f, 0f, 243.31f, 0f)
                curveTo(243.31f, 0f, 289.84f, 41.02f, 302.83f, 94f)
                curveTo(307.78f, 114.19f, 304.6f, 137.17f, 301.75f, 157.72f)
                curveTo(297.13f, 191.07f, 293.39f, 218.02f, 326.79f, 216.28f)
                curveTo(380.77f, 213.45f, 333.87f, 130.22f, 333.87f, 130.22f)
                curveTo(333.87f, 130.22f, 456.32f, 194.58f, 447.17f, 307.14f)
                curveTo(438.02f, 419.71f, 313.32f, 445.3f, 313.32f, 445.3f)
                curveTo(313.32f, 445.3f, 345.93f, 418.52f, 352.26f, 395.39f)
                close()
            }
        }.build()

        return _Fire!!
    }

@Suppress("ObjectPropertyName")
private var _Fire: ImageVector? = null

@Preview
@Composable
private fun FirePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Fire, contentDescription = null)
    }
}
