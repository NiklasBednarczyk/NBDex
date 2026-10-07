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
                npm("sqlite-wasm-worker", layout.projectDirectory.dir("worker").asFile),
            )
        }
        wasmJsMain.dependencies {
            implementation(libs.kotlinx.browser)
        }
    }

    targets.configureEach {
        compilations.configureEach {
            compileTaskProvider.get().compilerOptions {
                // Supress warning for NBDatabaseConstructor, see https://youtrack.jetbrains.com/issue/KT-61573/Emit-the-compilation-warning-on-expect-actual-classes.-The-warning-must-mention-that-expect-actual-classes-are-in-Beta#focus=Comments-27-10358357.0-0
                freeCompilerArgs.add("-Xexpect-actual-classes")
            }
        }
    }
}
