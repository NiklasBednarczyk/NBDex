package de.niklasbednarczyk.nbdex.convention.ext

import org.gradle.api.NamedDomainObjectContainer
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

internal val NamedDomainObjectContainer<KotlinSourceSet>.desktopMain: KotlinSourceSet
    get() = getByName("desktopMain")
