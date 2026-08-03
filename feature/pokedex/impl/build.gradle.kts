plugins {
    alias(libs.plugins.nbdex.library.feature.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.data.pokedex.api)

            implementation(projects.feature.pokedex.api)
            implementation(projects.feature.pokemonform.api)

            implementation(projects.model.pokedex)
        }
    }
}