plugins {
    alias(libs.plugins.nbdex.library.data.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.data.pokedex.api)

            implementation(projects.disk.pokedex.api)

            implementation(projects.model.pokedex)

            implementation(projects.network.pokedex.api)

            implementation(projects.persistence.pokedex.api)
        }
    }
}
