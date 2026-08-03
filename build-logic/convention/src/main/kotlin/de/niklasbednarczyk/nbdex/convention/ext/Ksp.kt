package de.niklasbednarczyk.nbdex.convention.ext

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.addKsp(dependencyNotation: Any) {
    dependencies {
        add("kspAndroid", dependencyNotation)
        add("kspDesktop", dependencyNotation)
        add("kspIosArm64", dependencyNotation)
        add("kspIosSimulatorArm64", dependencyNotation)
        add("kspJs", dependencyNotation)
        add("kspWasmJs", dependencyNotation)
    }
}
