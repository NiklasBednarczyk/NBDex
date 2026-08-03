plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.datastore)
    alias(libs.plugins.nbdex.dependency.koin.core)
    alias(libs.plugins.nbdex.dependency.wire.runtime)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.common.file)
        }
    }
}

