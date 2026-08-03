plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.koin.core)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.feature.about.impl)
            implementation(projects.feature.contrast.impl)
            implementation(projects.feature.info.impl)
            implementation(projects.feature.more.impl)
            implementation(projects.feature.pokedex.impl)
            implementation(projects.feature.pokemonform.impl)
            implementation(projects.feature.theme.impl)
        }
    }
}
