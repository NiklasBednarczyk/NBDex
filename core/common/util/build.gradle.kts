plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
}

kotlin {
    sourceSets {
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}
