plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.compose.core)
    alias(libs.plugins.nbdex.dependency.compose.resource)
}

compose.resources {
    publicResClass = true
}
