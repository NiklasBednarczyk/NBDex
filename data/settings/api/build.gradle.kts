plugins {
    alias(libs.plugins.nbdex.library.data.api)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.model.settings)
        }
    }
}
