import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class ApplicationWebConventionPlugin : Plugin<Project> {

    @OptIn(ExperimentalWasmDsl::class)
    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("kotlin-multiplatform"))
            apply(libs.getPluginId("compose"))
            apply(libs.getPluginId("kotlin-plugin-compose"))
        }

        extensions.configure<KotlinMultiplatformExtension> {
            js {
                browser()
                binaries.executable()
            }
            wasmJs {
                browser()
                binaries.executable()
            }

            sourceSets.apply {
                commonMain.dependencies {
                    implementation(libs.getLibrary("compose-ui"))
                }
            }
        }
    }
}
