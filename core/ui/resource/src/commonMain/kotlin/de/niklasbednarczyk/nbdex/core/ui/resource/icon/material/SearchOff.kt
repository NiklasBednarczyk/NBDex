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

val NBIcons.Material.SearchOff: ImageVector
    get() {
        if (_SearchOff != null) {
            return _SearchOff!!
        }
        _SearchOff = ImageVector.Builder(
            name = "SearchOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFFBA1A1A))) {
                moveTo(138.5f, 821.5f)
                quadTo(80f, 763f, 80f, 680f)
                reflectiveQuadToRelative(58.5f, -141.5f)
                quadTo(197f, 480f, 280f, 480f)
                reflectiveQuadToRelative(141.5f, 58.5f)
                quadTo(480f, 597f, 480f, 680f)
                reflectiveQuadToRelative(-58.5f, 141.5f)
                quadTo(363f, 880f, 280f, 880f)
                reflectiveQuadToRelative(-141.5f, -58.5f)
                close()
                moveTo(824f, 840f)
                lineTo(568f, 584f)
                quadToRelative(-12f, -13f, -25.5f, -26.5f)
                reflectiveQuadTo(516f, 532f)
                quadToRelative(38f, -24f, 61f, -64f)
                reflectiveQuadToRelative(23f, -88f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(420f, 200f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(240f, 380f)
                quadToRelative(0f, 6f, 0.5f, 11.5f)
                reflectiveQuadTo(242f, 403f)
                quadToRelative(-18f, 2f, -39.5f, 8f)
                reflectiveQuadTo(164f, 425f)
                quadToRelative(-2f, -11f, -3f, -22f)
                reflectiveQuadToRelative(-1f, -23f)
                quadToRelative(0f, -109f, 75.5f, -184.5f)
                reflectiveQuadTo(420f, 120f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(680f, 380f)
                quadToRelative(0f, 43f, -13.5f, 81.5f)
                reflectiveQuadTo(629f, 532f)
                lineToRelative(251f, 252f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(209f, 779f)
                lineTo(280f, 708f)
                lineTo(350f, 779f)
                lineTo(379f, 751f)
                lineTo(308f, 680f)
                lineTo(379f, 609f)
                lineTo(351f, 581f)
                lineTo(280f, 652f)
                lineTo(209f, 581f)
                lineTo(181f, 609f)
                lineTo(252f, 680f)
                lineTo(181f, 751f)
                lineTo(209f, 779f)
                close()
            }
        }.build()

        return _SearchOff!!
    }

@Suppress("ObjectPropertyName")
private var _SearchOff: ImageVector? = null

@Preview
@Composable
private fun SearchOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = NBIcons.Material.SearchOff, contentDescription = null)
    }
}
