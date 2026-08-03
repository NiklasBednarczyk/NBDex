import androidx.room3.gradle.RoomExtension
import de.niklasbednarczyk.nbdex.convention.ext.addKsp
import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class DependencyRoom3CompilerConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("nbdex-dependency-ksp"))
            apply(libs.getPluginId("androidx-room3"))
        }

        extensions.configure<KotlinMultiplatformExtension> {
            addKsp(libs.getLibrary("androidx-room3-compiler"))
        }

        extensions.configure<RoomExtension> {
            schemaDirectory("$projectDir/schemas")
        }
    }
}