package de.niklasbednarczyk.nbdex.core.ui.designsystem.image

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil3.compose.AsyncImagePainter
import coil3.compose.rememberAsyncImagePainter
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.NBIcons
import de.niklasbednarczyk.nbdex.core.ui.resource.icon.material.BrokenImage
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.content_description_icon_broken_image
import org.jetbrains.compose.resources.stringResource

@Composable
fun NBAsyncImage(
    imageUrl: String?,
    contentDescription: String?,
    modifier: Modifier = Modifier,
) {
    var imagePainterState by remember { mutableStateOf<AsyncImagePainter.State?>(null) }
    rememberAsyncImagePainter(
        model = imageUrl,
        onState = { state -> imagePainterState = state },
    )

    AnimatedContent(imagePainterState) { state ->
        when (state) {
            null,
            AsyncImagePainter.State.Empty,
            is AsyncImagePainter.State.Loading -> {
                Box(modifier = modifier)
            }

            is AsyncImagePainter.State.Error -> {
                Icon(
                    modifier = modifier,
                    imageVector = NBIcons.Material.BrokenImage,
                    contentDescription = stringResource(Res.string.content_description_icon_broken_image),
                )
            }

            is AsyncImagePainter.State.Success -> {
                Image(
                    modifier = modifier,
                    contentScale = ContentScale.Crop,
                    painter = state.painter,
                    contentDescription = contentDescription,
                )
            }
        }
    }
}
