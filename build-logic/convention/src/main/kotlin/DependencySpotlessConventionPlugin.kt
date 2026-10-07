import com.diffplug.gradle.spotless.SpotlessExtension
import de.niklasbednarczyk.nbdex.convention.ext.formatKotlin
import de.niklasbednarczyk.nbdex.convention.ext.formatKotlinGradle
import de.niklasbednarczyk.nbdex.convention.ext.formatMisc
import de.niklasbednarczyk.nbdex.convention.ext.formatProtobuf
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class DependencySpotlessConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        plugins {
            apply(libs.getPluginId("plugin-spotless"))
        }

        extensions.configure<SpotlessExtension> {
            formatKotlin(
                targets = listOf(
                    "src/**/*.kt",
                ),
            )
            formatKotlinGradle(
                targets = listOf(
                    "*.kts",
                ),
            )
            formatMisc(
                targets = listOf(
                    "**/*.config.js",
                    "src/**/*.css",
                    "src/**/*.graphql",
                    "src/**/*.graphqls",
                    "src/**/*.html",
                    "src/**/*.xml",
                ),
            )
            formatProtobuf(
                targets = listOf(
                    "src/**/*.proto",
                ),
            )
        }
    }
}
