package de.niklasbednarczyk.nbdex.core.ui.resource.icon.material

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons

val NBIcons.Material.ArrowDropUp: ImageVector
    get() {
        if (_ArrowDropUp != null) {
            return _ArrowDropUp!!
        }
        _ArrowDropUp = ImageVector.Builder(
            name = "ArrowDropUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveToRelative(280f, 560f)
                lineToRelative(200f, -200f)
                lineToRelative(200f, 200f)
                lineTo(280f, 560f)
                close()
            }
        }.build()

        return _ArrowDropUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDropUp: ImageVector? = null

@Preview
@Composable
private fun ArrowDropUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.ArrowDropUp, contentDescription = null)
    }
}
