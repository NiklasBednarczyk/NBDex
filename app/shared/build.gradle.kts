plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.compose.core)
    alias(libs.plugins.nbdex.dependency.koin.core)
    alias(libs.plugins.nbdex.dependency.koin.compose)
}

kotlin {
    listOf(
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.common.dispatchers)
            implementation(projects.core.model.settings)
            implementation(projects.core.ui.designsystem)
            implementation(projects.core.ui.model)
            implementation(projects.core.ui.navigation)
            implementation(projects.core.ui.resource)

            implementation(projects.data)
            implementation(projects.data.settings.api)
            implementation(projects.disk)
            implementation(projects.feature)
            implementation(projects.feature.info.api)
            implementation(projects.feature.more.api)
            implementation(projects.feature.pokedex.api)
            implementation(projects.network)
            implementation(projects.persistence)
        }
    }
}
