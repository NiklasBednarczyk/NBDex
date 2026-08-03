import com.android.build.api.dsl.KotlinMultiplatformAndroidLibraryTarget
import de.niklasbednarczyk.nbdex.convention.constant.NBAndroidSdk
import de.niklasbednarczyk.nbdex.convention.constant.NBJava
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
    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("android-kotlin-multiplatform-library"))
            apply(libs.getPluginId("kotlin-multiplatform"))
        }

        extensions.configure<KotlinMultiplatformExtension> {
            jvmToolchain(NBJava.JDK_VERSION)

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

                minSdk = NBAndroidSdk.MIN
                compileSdk = NBAndroidSdk.COMPILE

                androidResources {
                    enable = true
                }
            }
        }

        dependencies {
            add("androidRuntimeClasspath", libs.getLibrary("compose-ui-tooling"))
        }
    }

}