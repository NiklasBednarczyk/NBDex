import de.niklasbednarczyk.nbdex.convention.ext.desktopMain
import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class DependencyComposeCoilConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                androidMain.dependencies {
                    implementation(libs.getLibrary("ktor-client-okhttp"))
                }
                commonMain.dependencies {
                    implementation(libs.getLibrary("coil-compose"))
                    implementation(libs.getLibrary("coil-network-ktor3"))
                }
                desktopMain.dependencies {
                    implementation(libs.getLibrary("ktor-client-okhttp"))
                }
                iosMain.dependencies {
                    implementation(libs.getLibrary("ktor-client-darwin"))
                }
            }
        }
    }

}