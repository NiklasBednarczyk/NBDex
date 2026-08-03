plugins {
    alias(libs.plugins.nbdex.library.network.api)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.model.pokedex)
        }
    }
}
