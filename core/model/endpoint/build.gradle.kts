plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.model.id)
        }
    }
}
