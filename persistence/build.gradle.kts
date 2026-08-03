@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.koin.core)
    alias(libs.plugins.nbdex.dependency.room3.core)
    alias(libs.plugins.nbdex.dependency.room3.compiler)
    alias(libs.plugins.nbdex.dependency.sqlite)
}

kotlin {
    js {
        useEsModules()
    }
    wasmJs {
        useEsModules()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.common.dispatchers)
            implementation(projects.core.common.file)
            implementation(projects.core.model.endpoint)
            implementation(projects.core.model.id)
            implementation(projects.core.persistence)

            implementation(projects.persistence.pokedex.impl)

            implementation(
                npm("sqlite-wasm-worker", layout.projectDirectory.dir("worker").asFile)
            )
        }
        wasmJsMain.dependencies {
            implementation(libs.kotlinx.browser)
        }
    }
}
