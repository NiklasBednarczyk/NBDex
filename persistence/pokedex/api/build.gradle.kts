plugins {
    alias(libs.plugins.nbdex.library.persistence.api)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.model.pokedex)
        }
    }
}
