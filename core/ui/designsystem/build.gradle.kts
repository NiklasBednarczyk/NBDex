plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.compose.core)
    alias(libs.plugins.nbdex.dependency.compose.coil)
    alias(libs.plugins.nbdex.dependency.coroutines)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.common.logging)
            implementation(projects.core.common.util)
            implementation(projects.core.model.settings)
            implementation(projects.core.ui.resource)
        }
    }
}
