plugins {
    alias(libs.plugins.nbdex.library.feature.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.data.settings.api)

            implementation(projects.feature.theme.api)
        }
    }
}
