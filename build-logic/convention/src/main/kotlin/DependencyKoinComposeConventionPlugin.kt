import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class DependencyKoinComposeConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                commonMain.dependencies {
                    implementation(libs.getLibrary("koin-compose-navigation3"))
                    implementation(libs.getLibrary("koin-compose-viewmodel"))
                }
            }

            compilerOptions {
                optIn.addAll(
                    // opt in for navigation
                    "org.koin.core.annotation.KoinExperimentalAPI",
                )
            }
        }
    }
}
