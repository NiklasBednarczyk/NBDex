package de.niklasbednarczyk.nbdex

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import de.niklasbednarczyk.nbdex.di.initKoin
import de.niklasbednarczyk.nbdex.ui.NBApp

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        initKoin()
        NBApp()
    }
}