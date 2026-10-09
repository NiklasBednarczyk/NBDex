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

val NBIcons.Material.Api: ImageVector
    get() {
        if (_Api != null) {
            return _Api!!
        }
        _Api = ImageVector.Builder(
            name = "Api",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveToRelative(480f, 560f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(395f, 325f)
                lineTo(295f, 225f)
                lineToRelative(185f, -185f)
                lineToRelative(185f, 185f)
                lineToRelative(-100f, 100f)
                lineToRelative(-85f, -85f)
                lineToRelative(-85f, 85f)
                close()
                moveTo(225f, 665f)
                lineTo(40f, 480f)
                lineToRelative(185f, -185f)
                lineToRelative(100f, 100f)
                lineToRelative(-85f, 85f)
                lineToRelative(85f, 85f)
                lineToRelative(-100f, 100f)
                close()
                moveTo(735f, 665f)
                lineTo(635f, 565f)
                lineToRelative(85f, -85f)
                lineToRelative(-85f, -85f)
                lineToRelative(100f, -100f)
                lineToRelative(185f, 185f)
                lineToRelative(-185f, 185f)
                close()
                moveTo(480f, 920f)
                lineTo(295f, 735f)
                lineToRelative(100f, -100f)
                lineToRelative(85f, 85f)
                lineToRelative(85f, -85f)
                lineToRelative(100f, 100f)
                lineTo(480f, 920f)
                close()
            }
        }.build()

        return _Api!!
    }

@Suppress("ObjectPropertyName")
private var _Api: ImageVector? = null

@Preview
@Composable
private fun ApiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.Api, contentDescription = null)
    }
}
