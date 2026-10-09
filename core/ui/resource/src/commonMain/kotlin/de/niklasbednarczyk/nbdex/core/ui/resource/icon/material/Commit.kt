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

val NBIcons.Material.Commit: ImageVector
    get() {
        if (_Commit != null) {
            return _Commit!!
        }
        _Commit = ImageVector.Builder(
            name = "Commit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(352.5f, 634.5f)
                quadTo(298f, 589f, 284f, 520f)
                lineTo(80f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(204f)
                quadToRelative(14f, -69f, 68.5f, -114.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(73f, 0f, 127.5f, 45.5f)
                reflectiveQuadTo(676f, 440f)
                horizontalLineToRelative(204f)
                verticalLineToRelative(80f)
                lineTo(676f, 520f)
                quadToRelative(-14f, 69f, -68.5f, 114.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-73f, 0f, -127.5f, -45.5f)
                close()
                moveTo(480f, 600f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
            }
        }.build()

        return _Commit!!
    }

@Suppress("ObjectPropertyName")
private var _Commit: ImageVector? = null

@Preview
@Composable
private fun CommitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.Commit, contentDescription = null)
    }
}
