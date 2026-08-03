import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class LibraryFeatureImplConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("nbdex-android-kotlin-multiplatform-library"))
            apply(libs.getPluginId("nbdex-dependency-compose-core"))
            apply(libs.getPluginId("nbdex-dependency-coroutines"))
            apply(libs.getPluginId("nbdex-dependency-koin-core"))
            apply(libs.getPluginId("nbdex-dependency-koin-compose"))
        }

        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                commonMain.dependencies {
                    implementation(project(":core:common:logging"))
                    implementation(project(":core:common:result"))
                    implementation(project(":core:model:endpoint"))
                    implementation(project(":core:model:id"))
                    implementation(project(":core:model:settings"))
                    implementation(project(":core:ui:designsystem"))
                    implementation(project(":core:ui:model"))
                    implementation(project(":core:ui:navigation"))
                    implementation(project(":core:ui:resource"))
                }
            }
        }
    }

}