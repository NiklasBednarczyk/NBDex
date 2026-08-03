import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class DependencySerializationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("kotlin-plugin-serialization"))
        }

        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                commonMain.dependencies {
                    implementation(libs.getLibrary("kotlinx-serialization-core"))
                }
            }
        }
    }
}