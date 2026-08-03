plugins {
    alias(libs.plugins.nbdex.application.web)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.app.shared)
        }
    }
}
