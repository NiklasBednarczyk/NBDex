plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.koin.core)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.network)

            implementation(projects.network.pokedex.impl)
        }
    }
}
