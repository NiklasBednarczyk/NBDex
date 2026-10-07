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

val NBIcons.Type.Psychic: ImageVector
    get() {
        if (_Psychic != null) {
            return _Psychic!!
        }
        _Psychic = ImageVector.Builder(
            name = "Psychic",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFBA1A1A)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(455.92f, 425.18f)
                curveTo(455.92f, 425.18f, 391.36f, 476.96f, 262.89f, 455.54f)
                curveTo(165.42f, 439.28f, 113.44f, 331.83f, 113.44f, 274.08f)
                curveTo(113.44f, 137.15f, 214.78f, 105.99f, 283.3f, 105.99f)
                curveTo(351.82f, 105.99f, 396.51f, 172.79f, 396.51f, 224.51f)
                curveTo(396.51f, 276.23f, 359.93f, 321.47f, 303.01f, 321.47f)
                curveTo(246.08f, 321.47f, 229.22f, 281.5f, 229.22f, 244.76f)
                curveTo(229.22f, 208.02f, 258.95f, 195.07f, 286.06f, 195.07f)
                curveTo(313.17f, 195.07f, 322.45f, 218.22f, 322.45f, 238.11f)
                curveTo(322.45f, 258f, 307.02f, 265.13f, 294.14f, 265.13f)
                curveTo(281.27f, 265.13f, 280f, 258.63f, 275.07f, 251.81f)
                curveTo(270.14f, 244.98f, 281.35f, 219.15f, 262.89f, 219.15f)
                curveTo(244.43f, 219.15f, 240.99f, 248.85f, 240.99f, 248.85f)
                curveTo(240.99f, 248.85f, 247.72f, 306.18f, 303.01f, 305.19f)
                curveTo(358.29f, 304.2f, 384.52f, 261.46f, 376.9f, 219.15f)
                curveTo(369.27f, 176.83f, 328.21f, 131.87f, 256.13f, 140.95f)
                curveTo(184.06f, 150.04f, 154.63f, 222.86f, 167.6f, 300.68f)
                curveTo(180.57f, 378.51f, 273.81f, 423.6f, 347.11f, 407.38f)
                curveTo(420.42f, 391.16f, 493.43f, 338.09f, 493.43f, 203.53f)
                curveTo(493.43f, 68.98f, 376.9f, -11.9f, 237.94f, 1.43f)
                curveTo(98.99f, 14.76f, 12.73f, 136.24f, 18.25f, 282.21f)
                curveTo(23.77f, 428.17f, 162.27f, 507.67f, 279.39f, 511.77f)
                curveTo(396.51f, 515.86f, 468.31f, 448.07f, 468.31f, 448.07f)
                curveTo(468.31f, 448.07f, 484.46f, 433.67f, 478.13f, 422.42f)
                curveTo(471.8f, 411.18f, 455.92f, 425.18f, 455.92f, 425.18f)
                close()
            }
        }.build()

        return _Psychic!!
    }

@Suppress("ObjectPropertyName")
private var _Psychic: ImageVector? = null

@Preview
@Composable
private fun PsychicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Type.Psychic, contentDescription = null)
    }
}
