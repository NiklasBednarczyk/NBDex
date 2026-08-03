plugins {
    alias(libs.plugins.nbdex.library.disk.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.disk.pokedex.api)

            implementation(projects.model.pokedex)
        }
    }
}
