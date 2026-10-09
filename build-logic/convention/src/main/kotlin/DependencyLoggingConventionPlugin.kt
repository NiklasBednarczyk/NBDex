import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class DependencyLoggingConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                commonMain.dependencies {
                    implementation(libs.getLibrary("kotlin-logging"))

                    implementation(libs.getLibrary("slf4j-simple"))
                }
            }
        }
    }
}
