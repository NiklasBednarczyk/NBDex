package de.niklasbednarczyk.nbdex

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import de.niklasbednarczyk.nbdex.di.initKoin
import de.niklasbednarczyk.nbdex.ui.NBApp
import nbdex.core.ui.resource.generated.resources.Res
import nbdex.core.ui.resource.generated.resources.app_name
import org.jetbrains.compose.resources.stringResource

fun main() {
    initKoin()

    application {
        Window(
            onCloseRequest = ::exitApplication,
            state = rememberWindowState(
                placement = WindowPlacement.Maximized,
                width = Dp.Unspecified,
                height = Dp.Unspecified,
            ),
            title = stringResource(Res.string.app_name),
        ) {
            NBApp()
        }
    }
}
