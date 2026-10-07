import com.android.build.api.dsl.ApplicationExtension
import de.niklasbednarczyk.nbdex.convention.constant.NBAndroidSdk
import de.niklasbednarczyk.nbdex.convention.constant.NBAppInfo
import de.niklasbednarczyk.nbdex.convention.constant.NBJava
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
            namespace = NBAppInfo.PACKAGE_NAME
            defaultConfig {
                applicationId = NBAppInfo.PACKAGE_NAME
                versionCode = NBAppInfo.VERSION_CODE
                versionName = NBAppInfo.VERSION_NAME

                minSdk = NBAndroidSdk.MIN
                targetSdk = NBAndroidSdk.TARGET
                compileSdk = NBAndroidSdk.COMPILE
            }
            compileOptions {
                sourceCompatibility = NBJava.javaVersion
                targetCompatibility = NBJava.javaVersion
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
                    jvmTarget.set(NBJava.jvmTarget)
                }
            }
        }
    }
}
