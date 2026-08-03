import de.niklasbednarczyk.nbdex.convention.constant.NBAppInfo
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.compose.ComposeExtension
import org.jetbrains.compose.desktop.DesktopExtension
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

class ApplicationDesktopConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("kotlin-jvm"))
            apply(libs.getPluginId("compose"))
            apply(libs.getPluginId("kotlin-plugin-compose"))
        }

        val compose = extensions.getByType<ComposeExtension>().dependencies
        dependencies {
            add("implementation", compose.desktop.currentOs)
        }

        extensions.configure<ComposeExtension> {
            extensions.configure<DesktopExtension>("desktop") {
                application {
                    mainClass = "${NBAppInfo.PACKAGE_NAME}.MainKt"

                    nativeDistributions {
                        targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
                        packageName = NBAppInfo.PACKAGE_NAME
                        packageVersion = NBAppInfo.VERSION_NAME
                    }
                }
            }
        }

    }
}
