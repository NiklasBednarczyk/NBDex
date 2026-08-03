package de.niklasbednarczyk.nbdex.convention.ext

import org.gradle.api.Project
import org.gradle.api.plugins.PluginManager

internal fun Project.plugins(block: PluginManager.() -> Unit) {
    with(pluginManager, block)
}
