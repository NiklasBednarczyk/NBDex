import com.android.build.api.dsl.KotlinMultiplatformAndroidLibraryTarget
import de.niklasbednarczyk.nbdex.convention.constant.DexAndroidSdk
import de.niklasbednarczyk.nbdex.convention.constant.DexJava
import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.modulePackageName
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class AndroidKotlinMultiplatformLibraryConventionPlugin : Plugin<Project> {
    @OptIn(ExperimentalWasmDsl::class)
    override fun apply(
        target: Project,
    ) = with(target) {
        plugins {
            apply(libs.getPluginId("plugin-android-kotlin-multiplatform-library"))
            apply(libs.getPluginId("plugin-kotlin-multiplatform"))
            apply(libs.getPluginId("nbdex-dependency-detekt"))
            apply(libs.getPluginId("nbdex-dependency-spotless"))
        }

        extensions.configure<KotlinMultiplatformExtension> {
            jvmToolchain(DexJava.JDK_VERSION)

            applyDefaultHierarchyTemplate()

            // Desktop
            jvm("desktop")

            // iOS
            iosArm64()
            iosSimulatorArm64()

            // Web
            js {
                browser()
            }
            wasmJs {
                browser()
            }

            extensions.configure<KotlinMultiplatformAndroidLibraryTarget>("android") {
                namespace = modulePackageName

                minSdk = DexAndroidSdk.MIN
                compileSdk = DexAndroidSdk.COMPILE

                androidResources {
                    enable = true
                }
                withHostTest {}
            }
        }

        dependencies {
            add("androidRuntimeClasspath", libs.getLibrary("compose-ui-tooling"))
        }
    }
}
