plugins {
    alias(libs.plugins.nbdex.library.disk.api)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.model.pokedex)
        }
    }
}
