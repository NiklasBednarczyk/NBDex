import com.android.build.api.dsl.ApplicationExtension
import de.niklasbednarczyk.nbdex.convention.constant.DexAndroidSdk
import de.niklasbednarczyk.nbdex.convention.constant.DexAppInfo
import de.niklasbednarczyk.nbdex.convention.constant.DexJava
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class ApplicationAndroidConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        plugins {
            apply(libs.getPluginId("plugin-android-application"))
            apply(libs.getPluginId("plugin-compose"))
            apply(libs.getPluginId("plugin-kotlin-plugin-compose"))
            apply(libs.getPluginId("nbdex-dependency-detekt"))
            apply(libs.getPluginId("nbdex-dependency-spotless"))
        }

        extensions.configure<ApplicationExtension> {
            namespace = DexAppInfo.PACKAGE_NAME
            defaultConfig {
                applicationId = DexAppInfo.PACKAGE_NAME
                versionCode = DexAppInfo.VERSION_CODE
                versionName = DexAppInfo.VERSION_NAME

                minSdk = DexAndroidSdk.MIN
                targetSdk = DexAndroidSdk.TARGET
                compileSdk = DexAndroidSdk.COMPILE
            }
            compileOptions {
                sourceCompatibility = DexJava.javaVersion
                targetCompatibility = DexJava.javaVersion
            }
            buildTypes {
                getByName("release") {
                    isMinifyEnabled = false
                }
            }
            packaging {
                resources {
                    excludes += "/META-INF/{AL2.0,LGPL2.1}"
                }
            }
        }

        extensions.configure<KotlinAndroidProjectExtension> {
            target {
                compilerOptions {
                    jvmTarget.set(DexJava.jvmTarget)
                }
            }
        }
    }
}
