plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.room3.core)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.model.endpoint)
            implementation(projects.core.model.id)
        }
    }
}
