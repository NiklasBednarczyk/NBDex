plugins {
    alias(libs.plugins.nbdex.library.disk.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.model.settings)

            implementation(projects.disk.settings.api)
        }
    }
}
