import de.niklasbednarczyk.nbdex.convention.ext.desktopMain
import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.compose.ComposeExtension
import org.jetbrains.compose.resources.ResourcesExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class DependencyComposeCoreConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        plugins {
            apply(libs.getPluginId("plugin-compose"))
            apply(libs.getPluginId("plugin-kotlin-plugin-compose"))
            apply(libs.getPluginId("nbdex-dependency-immutable"))
        }

        val compose = extensions.getByType<ComposeExtension>().dependencies
        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                commonMain.dependencies {
                    implementation(libs.getLibrary("androidx-lifecycle-runtime-compose"))
                    implementation(libs.getLibrary("androidx-lifecycle-viewmodel-navigation3"))

                    implementation(libs.getLibrary("androidx-navigation3-ui"))

                    implementation(libs.getLibrary("compose-components-resources"))
                    implementation(libs.getLibrary("compose-foundation"))
                    implementation(libs.getLibrary("compose-material3"))
                    implementation(libs.getLibrary("compose-material3-adaptive-navigation-suite"))
                    implementation(libs.getLibrary("compose-material3-adaptive-navigation3"))
                    implementation(libs.getLibrary("compose-runtime"))
                    implementation(libs.getLibrary("compose-ui"))
                    implementation(libs.getLibrary("compose-ui-tooling-preview"))
                }
                desktopMain.dependencies {
                    implementation(compose.desktop.currentOs)
                }
            }

            compilerOptions {
                optIn.addAll(
                    // opt in for SearchBar
                    "androidx.compose.material3.ExperimentalMaterial3Api",
                    // opt in for MaterialExpressiveTheme
                    "androidx.compose.material3.ExperimentalMaterial3ExpressiveApi",
                    // opt in for ListDetailSceneStrategy
                    "androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi",
                    // opt in for LocalSystemTheme
                    "androidx.compose.ui.InternalComposeUiApi",
                )
            }
        }

        extensions.configure<ComposeExtension> {
            configure<ResourcesExtension> {
                generateResClass = never
            }
        }
    }
}
