package de.niklasbednarczyk.nbdex.convention.constant

import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

internal object DexJava {
    val javaVersion = JavaVersion.VERSION_17
    const val JDK_VERSION = 17
    val jvmTarget = JvmTarget.JVM_17
}
