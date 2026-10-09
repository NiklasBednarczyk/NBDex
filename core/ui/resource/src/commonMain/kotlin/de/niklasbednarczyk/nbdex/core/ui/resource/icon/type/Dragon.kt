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

val NBIcons.Type.Dragon: ImageVector
    get() {
        if (_Dragon != null) {
            return _Dragon!!
        }
        _Dragon = ImageVector.Builder(
            name = "Dragon",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(280.7f, 254.88f)
                curveTo(284.17f, 252.76f, 287.12f, 248.33f, 289.49f, 243.4f)
                curveTo(320.73f, 256.17f, 342.69f, 286.35f, 342.69f, 321.54f)
                curveTo(342.69f, 368.29f, 303.94f, 406.19f, 256.14f, 406.19f)
                curveTo(236.52f, 406.19f, 218.42f, 399.8f, 203.91f, 389.04f)
                curveTo(199.14f, 386.78f, 195.23f, 384.62f, 192.02f, 382.85f)
                curveTo(187.05f, 380.1f, 183.79f, 378.29f, 181.74f, 378.58f)
                curveTo(175.77f, 379.4f, 177.51f, 384.89f, 179.08f, 389.88f)
                curveTo(180.15f, 393.27f, 181.15f, 396.42f, 179.61f, 397.73f)
                curveTo(177.99f, 399.09f, 172.76f, 394.11f, 166.65f, 388.28f)
                curveTo(158.34f, 380.35f, 148.39f, 370.87f, 143.7f, 373.72f)
                curveTo(139.99f, 375.97f, 143.59f, 382.08f, 148f, 389.56f)
                lineTo(148.33f, 390.12f)
                curveTo(150.19f, 393.28f, 152.35f, 396.5f, 154.32f, 399.44f)
                curveTo(158.32f, 405.41f, 161.54f, 410.22f, 159.93f, 411.03f)
                curveTo(157.98f, 412.02f, 144.39f, 402.85f, 132.95f, 390.12f)
                curveTo(128.53f, 385.2f, 124.25f, 379.88f, 120.27f, 374.93f)
                lineTo(120.27f, 374.93f)
                curveTo(111.56f, 364.09f, 104.31f, 355.07f, 100.24f, 356.14f)
                curveTo(95.34f, 357.42f, 99.04f, 367.53f, 104.49f, 377.25f)
                curveTo(107.03f, 381.8f, 110.03f, 386.43f, 112.62f, 390.44f)
                lineTo(112.62f, 390.44f)
                curveTo(116.65f, 396.67f, 119.71f, 401.4f, 118.61f, 401.98f)
                curveTo(117.11f, 402.77f, 103.93f, 389.91f, 94.97f, 373.72f)
                curveTo(89.66f, 364.1f, 85.19f, 353.46f, 81.58f, 344.86f)
                curveTo(77.66f, 335.52f, 74.74f, 328.57f, 72.81f, 327.87f)
                curveTo(66.13f, 325.44f, 66.13f, 339.06f, 68.81f, 358.72f)
                curveTo(69.16f, 361.28f, 69.68f, 363.97f, 70.32f, 366.71f)
                curveTo(96.31f, 450.79f, 176.13f, 512f, 270.57f, 512f)
                curveTo(386.08f, 512f, 479.73f, 420.41f, 479.73f, 307.43f)
                curveTo(479.73f, 199.9f, 394.9f, 111.75f, 287.12f, 103.49f)
                curveTo(287.26f, 98.43f, 289.9f, 88.38f, 289.9f, 88.38f)
                curveTo(289.9f, 88.38f, 308.93f, 42.35f, 309.93f, 32.51f)
                curveTo(310f, 31.86f, 310.08f, 31.15f, 310.16f, 30.39f)
                curveTo(311.35f, 19.76f, 313.55f, 0f, 296.55f, 0f)
                curveTo(287.47f, 0f, 283.25f, 6.75f, 278.42f, 14.48f)
                lineTo(278.42f, 14.48f)
                curveTo(276.57f, 17.45f, 274.62f, 20.55f, 272.28f, 23.48f)
                curveTo(255.41f, 44.54f, 227.05f, 70.85f, 210.96f, 84.86f)
                curveTo(176.97f, 114.48f, 143.62f, 138.83f, 124.17f, 153.03f)
                lineTo(124.17f, 153.03f)
                lineTo(124.17f, 153.03f)
                curveTo(115.32f, 159.48f, 109.35f, 163.84f, 107.5f, 165.64f)
                curveTo(93.57f, 179.22f, 43.64f, 269.29f, 43.64f, 269.29f)
                curveTo(43.64f, 269.29f, 27.49f, 298.18f, 33.23f, 304.04f)
                curveTo(38.97f, 309.9f, 52.81f, 308.56f, 52.81f, 308.56f)
                curveTo(52.81f, 308.56f, 238.76f, 265.9f, 255.4f, 262.54f)
                curveTo(259.88f, 261.63f, 263.05f, 261.11f, 265.48f, 260.71f)
                curveTo(272.07f, 259.62f, 273.26f, 259.42f, 280.7f, 254.88f)
                close()
                moveTo(149.24f, 200.06f)
                curveTo(139.25f, 209.55f, 122.7f, 232.2f, 122.7f, 232.2f)
                curveTo(122.7f, 232.2f, 153.46f, 234.09f, 170.41f, 217.99f)
                curveTo(187.35f, 201.88f, 183.47f, 174.43f, 183.47f, 174.43f)
                curveTo(183.47f, 174.43f, 159.21f, 190.58f, 149.24f, 200.06f)
                close()
            }
        }.build()

        return _Dragon!!
    }

@Suppress("ObjectPropertyName")
private var _Dragon: ImageVector? = null

@Preview
@Composable
private fun DragonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Dragon, contentDescription = null)
    }
}
