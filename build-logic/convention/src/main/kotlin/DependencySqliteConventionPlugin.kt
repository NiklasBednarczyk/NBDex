import de.niklasbednarczyk.nbdex.convention.ext.desktopMain
import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class DependencySqliteConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                androidMain.dependencies {
                    implementation(libs.getLibrary("androidx-sqlite-bundled"))
                }
                desktopMain.dependencies {
                    implementation(libs.getLibrary("androidx-sqlite-bundled"))
                }
                iosMain.dependencies {
                    implementation(libs.getLibrary("androidx-sqlite-bundled"))
                }
                webMain.dependencies {
                    implementation(libs.getLibrary("androidx-sqlite-web"))
                }
            }
        }
    }

}