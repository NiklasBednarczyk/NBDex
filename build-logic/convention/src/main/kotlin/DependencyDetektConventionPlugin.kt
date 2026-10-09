import de.niklasbednarczyk.nbdex.convention.ext.getLibrary
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import dev.detekt.gradle.Detekt
import dev.detekt.gradle.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.assign
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType

class DependencyDetektConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        plugins {
            apply(libs.getPluginId("plugin-detekt"))
        }

        extensions.configure<DetektExtension> {
            buildUponDefaultConfig.set(true)
            allRules.set(false)
            config.setFrom(file("$rootDir/config/detekt.yml"))
        }

        tasks.withType<Detekt>().configureEach {
            basePath = rootProject.projectDir.absolutePath
            exclude { element ->
                element.file.path.contains("/build/generated/")
            }
            reports {
                sarif.required.set(true)
            }
        }

        dependencies {
            add("detektPlugins", libs.getLibrary("compose-rules-detekt"))
        }
    }
}
