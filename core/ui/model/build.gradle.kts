plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.compose.core)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.common.util)
            implementation(projects.core.model.endpoint)
            implementation(projects.core.model.id)
            implementation(projects.core.model.settings)
            implementation(projects.core.ui.designsystem)
            implementation(projects.core.ui.resource)
        }
    }
}
