plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.coroutines)
    alias(libs.plugins.nbdex.dependency.koin.core)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.common.dispatchers)
            implementation(projects.core.common.logging)
            implementation(projects.core.common.result)
        }
    }
}
