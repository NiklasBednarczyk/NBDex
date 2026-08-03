plugins {
    alias(libs.plugins.nbdex.library.persistence.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.model.pokedex)

            implementation(projects.persistence.pokedex.api)
        }
    }
}
