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

val NBIcons.Material.Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(320f, 720f)
                lineTo(80f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(57f, 57f)
                lineToRelative(-184f, 184f)
                lineToRelative(183f, 183f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(640f, 720f)
                lineTo(583f, 663f)
                lineTo(767f, 479f)
                lineTo(584f, 296f)
                lineTo(640f, 240f)
                lineTo(880f, 480f)
                lineTo(640f, 720f)
                close()
            }
        }.build()

        return _Code!!
    }

@Suppress("ObjectPropertyName")
private var _Code: ImageVector? = null

@Preview
@Composable
private fun CodePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.Code, contentDescription = null)
    }
}
