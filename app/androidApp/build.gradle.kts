plugins {
    alias(libs.plugins.nbdex.application.android)
}

kotlin {
    dependencies {
        implementation(projects.app.shared)
        implementation(projects.core.model.settings)
        implementation(projects.core.ui.designsystem)

        implementation(libs.androidx.activity.compose)

        implementation(libs.koin.android)
        implementation(libs.koin.compose.viewmodel)
    }
}
