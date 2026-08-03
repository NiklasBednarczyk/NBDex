plugins {
    alias(libs.plugins.nbdex.library.feature.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.data.settings.api)

            implementation(projects.feature.about.api)
            implementation(projects.feature.contrast.api)
            implementation(projects.feature.more.api)
            implementation(projects.feature.theme.api)
        }
    }
}
