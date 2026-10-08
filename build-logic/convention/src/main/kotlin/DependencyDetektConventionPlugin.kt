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
                // TODO Decide on report type
                // observe findings in your browser with structure and code snippets
                html.required.set(true)
                // checkstyle(xml) like format mainly for integrations like Jenkins
                checkstyle.required.set(true)
                // standardized SARIF format (https://sarifweb.azurewebsites.net/) to support integrations with GitHub Code Scanning
                sarif.required.set(true)
                // simple Markdown format
                markdown.required.set(true)
            }
        }

        dependencies {
            add("detektPlugins", libs.getLibrary("compose-rules-detekt"))
        }
    }
}
