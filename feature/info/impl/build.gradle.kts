plugins {
    alias(libs.plugins.nbdex.library.feature.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.feature.info.api)
        }
    }
}
