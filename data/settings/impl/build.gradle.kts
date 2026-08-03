plugins {
    alias(libs.plugins.nbdex.library.data.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.model.settings)

            implementation(projects.data.settings.api)

            implementation(projects.disk.settings.api)
        }
    }
}
