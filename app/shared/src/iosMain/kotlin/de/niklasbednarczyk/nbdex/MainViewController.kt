package de.niklasbednarczyk.nbdex

import androidx.compose.ui.window.ComposeUIViewController
import de.niklasbednarczyk.nbdex.di.initKoin
import de.niklasbednarczyk.nbdex.ui.NBApp

fun MainViewController() = ComposeUIViewController {
    initKoin()
    NBApp()
}