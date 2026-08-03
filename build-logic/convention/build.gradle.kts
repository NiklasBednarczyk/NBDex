plugins {
    `kotlin-dsl`
}

group = "de.niklasbednarczyk.nbdex.buildlogic"

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.androidx.room3.gradle.plugin)
    compileOnly(libs.apollo.gradle.plugin)
    compileOnly(libs.buildkonfig.gradle.plugin)
    compileOnly(libs.compose.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.wire.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidKotlinMultiplatformLibrary") {
            id = libs.plugins.nbdex.android.kotlin.multiplatform.library.get().pluginId
            implementationClass = "AndroidKotlinMultiplatformLibraryConventionPlugin"
        }
        register("applicationAndroid") {
            id = libs.plugins.nbdex.application.android.get().pluginId
            implementationClass = "ApplicationAndroidConventionPlugin"
        }
        register("applicationDesktop") {
            id = libs.plugins.nbdex.application.desktop.get().pluginId
            implementationClass = "ApplicationDesktopConventionPlugin"
        }
        register("applicationWeb") {
            id = libs.plugins.nbdex.application.web.get().pluginId
            implementationClass = "ApplicationWebConventionPlugin"
        }
        register("dependencyApollo") {
            id = libs.plugins.nbdex.dependency.apollo.get().pluginId
            implementationClass = "DependencyApolloConventionPlugin"
        }
        register("dependencyBuildkonfig") {
            id = libs.plugins.nbdex.dependency.buildkonfig.get().pluginId
            implementationClass = "DependencyBuildkonfigConventionPlugin"
        }
        register("dependencyComposeCoil") {
            id = libs.plugins.nbdex.dependency.compose.coil.get().pluginId
            implementationClass = "DependencyComposeCoilConventionPlugin"
        }
        register("dependencyComposeCore") {
            id = libs.plugins.nbdex.dependency.compose.core.get().pluginId
            implementationClass = "DependencyComposeCoreConventionPlugin"
        }
        register("dependencyComposeResource") {
            id = libs.plugins.nbdex.dependency.compose.resource.get().pluginId
            implementationClass = "DependencyComposeResourceConventionPlugin"
        }
        register("dependencyCoroutines") {
            id = libs.plugins.nbdex.dependency.coroutines.get().pluginId
            implementationClass = "DependencyCoroutinesConventionPlugin"
        }
        register("dependencyDatastore") {
            id = libs.plugins.nbdex.dependency.datastore.get().pluginId
            implementationClass = "DependencyDatastoreConventionPlugin"
        }
        register("dependencyKoinCompose") {
            id = libs.plugins.nbdex.dependency.koin.compose.get().pluginId
            implementationClass = "DependencyKoinComposeConventionPlugin"
        }
        register("dependencyKoinCore") {
            id = libs.plugins.nbdex.dependency.koin.core.get().pluginId
            implementationClass = "DependencyKoinCoreConventionPlugin"
        }
        register("dependencyKsp") {
            id = libs.plugins.nbdex.dependency.ksp.get().pluginId
            implementationClass = "DependencyKspConventionPlugin"
        }
        register("dependencyLogging") {
            id = libs.plugins.nbdex.dependency.logging.get().pluginId
            implementationClass = "DependencyLoggingConventionPlugin"
        }
        register("dependencyRoom3Compiler") {
            id = libs.plugins.nbdex.dependency.room3.compiler.get().pluginId
            implementationClass = "DependencyRoom3CompilerConventionPlugin"
        }
        register("dependencyRoom3Core") {
            id = libs.plugins.nbdex.dependency.room3.core.get().pluginId
            implementationClass = "DependencyRoom3CoreConventionPlugin"
        }
        register("dependencySerialization") {
            id = libs.plugins.nbdex.dependency.serialization.get().pluginId
            implementationClass = "DependencySerializationConventionPlugin"
        }
        register("dependencySqlite") {
            id = libs.plugins.nbdex.dependency.sqlite.get().pluginId
            implementationClass = "DependencySqliteConventionPlugin"
        }
        register("dependencyWirePlugin") {
            id = libs.plugins.nbdex.dependency.wire.plugin.get().pluginId
            implementationClass = "DependencyWirePluginConventionPlugin"
        }
        register("dependencyWireRuntime") {
            id = libs.plugins.nbdex.dependency.wire.runtime.get().pluginId
            implementationClass = "DependencyWireRuntimeConventionPlugin"
        }
        register("libraryDataApi") {
            id = libs.plugins.nbdex.library.data.api.get().pluginId
            implementationClass = "LibraryDataApiConventionPlugin"
        }
        register("libraryDataImpl") {
            id = libs.plugins.nbdex.library.data.impl.get().pluginId
            implementationClass = "LibraryDataImplConventionPlugin"
        }
        register("libraryDiskApi") {
            id = libs.plugins.nbdex.library.disk.api.get().pluginId
            implementationClass = "LibraryDiskApiConventionPlugin"
        }
        register("libraryDiskImpl") {
            id = libs.plugins.nbdex.library.disk.impl.get().pluginId
            implementationClass = "LibraryDiskImplConventionPlugin"
        }
        register("libraryFeatureApi") {
            id = libs.plugins.nbdex.library.feature.api.get().pluginId
            implementationClass = "LibraryFeatureApiConventionPlugin"
        }
        register("libraryFeatureImpl") {
            id = libs.plugins.nbdex.library.feature.impl.get().pluginId
            implementationClass = "LibraryFeatureImplConventionPlugin"
        }
        register("libraryModel") {
            id = libs.plugins.nbdex.library.model.get().pluginId
            implementationClass = "LibraryModelConventionPlugin"
        }
        register("libraryNetworkApi") {
            id = libs.plugins.nbdex.library.network.api.get().pluginId
            implementationClass = "LibraryNetworkApiConventionPlugin"
        }
        register("libraryNetworkImpl") {
            id = libs.plugins.nbdex.library.network.impl.get().pluginId
            implementationClass = "LibraryNetworkImplConventionPlugin"
        }
        register("libraryPersistenceApi") {
            id = libs.plugins.nbdex.library.persistence.api.get().pluginId
            implementationClass = "LibraryPersistenceApiConventionPlugin"
        }
        register("libraryPersistenceImpl") {
            id = libs.plugins.nbdex.library.persistence.impl.get().pluginId
            implementationClass = "LibraryPersistenceImplConventionPlugin"
        }
    }
}