plugins {
    alias(libs.plugins.nbdex.application.desktop)
}

kotlin {
    dependencies {
        implementation(projects.app.shared)
        implementation(projects.core.ui.resource)

        implementation(libs.compose.components.resources)
    }
}
