import com.apollographql.apollo.gradle.api.ApolloExtension
import de.niklasbednarczyk.nbdex.convention.constant.NBApollo
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.modulePackageName
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class LibraryNetworkImplConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        plugins {
            apply(libs.getPluginId("nbdex-android-kotlin-multiplatform-library"))
            apply(libs.getPluginId("nbdex-dependency-apollo"))
            apply(libs.getPluginId("nbdex-dependency-koin-core"))
        }

        extensions.configure<KotlinMultiplatformExtension> {
            sourceSets.apply {
                commonMain.dependencies {
                    implementation(project(":core:model:endpoint"))
                    implementation(project(":core:model:id"))
                    implementation(project(":core:network"))
                }
            }
        }

        extensions.configure<ApolloExtension> {
            service(NBApollo.SERVICE_NAME) {
                packageName.set("$modulePackageName.${NBApollo.PACKAGE}")

                // Use `bidirectional` to have the schema module get the used types from this module
                dependsOn(
                    dependencyNotation = project(":core:network"),
                    bidirectional = true,
                )

                // Whether to generate Kotlin models with `internal` visibility modifier.
                generateAsInternal.set(true)
            }
        }
    }
}
