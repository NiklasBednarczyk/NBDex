package de.niklasbednarczyk.nbdex.feature.info.impl.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreview
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfo
import de.niklasbednarczyk.nbdex.core.ui.designsystem.preview.NBPreviewInfoPreviewParameterProvider
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.NBCenteredTopAppBar
import de.niklasbednarczyk.nbdex.core.ui.designsystem.screen.content.NBNotYetImplementedContent
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.info_title
import org.jetbrains.compose.resources.stringResource

@Composable
fun InfoScreen() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            NBCenteredTopAppBar(
                scrollBehavior = scrollBehavior,
                titleText = stringResource(Res.string.info_title),
            )
        },
    ) { innerPadding ->
        NBNotYetImplementedContent(
            modifier = Modifier.padding(innerPadding),
        )
    }
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(NBPreviewInfoPreviewParameterProvider::class) previewInfo: NBPreviewInfo,
) {
    NBPreview(
        previewInfo = previewInfo,
    ) {
        InfoScreen()
    }
}