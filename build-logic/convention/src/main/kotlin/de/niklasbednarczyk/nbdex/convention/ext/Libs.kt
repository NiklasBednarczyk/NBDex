package de.niklasbednarczyk.nbdex.convention.ext

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

internal val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal fun VersionCatalog.getLibrary(
    alias: String,
) = findLibrary(alias).get()

internal fun VersionCatalog.getPluginId(
    alias: String,
) = findPlugin(alias).get().get().pluginId
