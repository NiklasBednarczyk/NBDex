import de.niklasbednarczyk.nbdex.convention.ext.desktopMain
import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class DependencyCoroutinesConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                androidMain.dependencies {
                    implementation(libs.getLibrary("kotlinx-coroutines-android"))
                }
                commonMain.dependencies {
                    implementation(libs.getLibrary("kotlinx-coroutines-core"))
                }
                desktopMain.dependencies {
                    implementation(libs.getLibrary("kotlinx-coroutines-swing"))
                }
            }

            compilerOptions {
                optIn.addAll(
                    // opt in for flatMapLatest
                    "kotlinx.coroutines.ExperimentalCoroutinesApi",
                    // opt in for debounce
                    "kotlinx.coroutines.FlowPreview",
                )
            }
        }
    }

}