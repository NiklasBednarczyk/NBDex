plugins {
    alias(libs.plugins.nbdex.root)
    alias(libs.plugins.plugin.android.application) apply false
    alias(libs.plugins.plugin.android.kotlin.multiplatform.library) apply false
    alias(libs.plugins.plugin.androidx.room3) apply false
    alias(libs.plugins.plugin.apollo) apply false
    alias(libs.plugins.plugin.buildkonfig) apply false
    alias(libs.plugins.plugin.compose) apply false
    alias(libs.plugins.plugin.detekt) apply false
    alias(libs.plugins.plugin.kotlin.jvm) apply false
    alias(libs.plugins.plugin.kotlin.multiplatform) apply false
    alias(libs.plugins.plugin.kotlin.plugin.compose) apply false
    alias(libs.plugins.plugin.kotlin.plugin.serialization) apply false
    alias(libs.plugins.plugin.ksp) apply false
    alias(libs.plugins.plugin.spotless) apply false
    alias(libs.plugins.plugin.wire) apply false
}
