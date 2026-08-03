plugins {
    alias(libs.plugins.nbdex.library.network.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.model.pokedex)

            implementation(projects.network.pokedex.api)
        }
    }
}
