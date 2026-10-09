import com.diffplug.gradle.spotless.SpotlessExtension
import de.niklasbednarczyk.nbdex.convention.ext.formatKotlin
import de.niklasbednarczyk.nbdex.convention.ext.formatKotlinGradle
import de.niklasbednarczyk.nbdex.convention.ext.formatMarkdown
import de.niklasbednarczyk.nbdex.convention.ext.formatMisc
import de.niklasbednarczyk.nbdex.convention.ext.formatShell
import de.niklasbednarczyk.nbdex.convention.ext.formatTomlVersionCatalog
import de.niklasbednarczyk.nbdex.convention.ext.formatYaml
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class RootConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        plugins {
            apply(libs.getPluginId("plugin-spotless"))
        }

        extensions.configure<SpotlessExtension> {
            formatKotlin(
                targets =
                    listOf(
                        "build-logic/convention/src/**/*.kt",
                    ),
            )
            formatKotlinGradle(
                targets = listOf(
                    "*.kts",
                    "build-logic/*.kts",
                    "build-logic/convention/*.kts",
                ),
            )
            formatMarkdown(
                targets = listOf(
                    "*.md",
                ),
            )
            formatMisc(
                targets = listOf(
                    "*.editorconfig",
                    "*.gitignore",
                    "*.properties",
                    ".run/*.xml",
                    "app/iosApp/Configuration/*.xcconfig",
                    "app/iosApp/iosApp.xcodeproj/project.xcworkspace/*.xcworkspacedata",
                    "app/iosApp/iosApp.xcodeproj/xcshareddata/xcschemes/*.xcscheme",
                    "app/iosApp/iosApp.xcodeproj/*.pbxproj",
                    "app/iosApp/iosApp/**/*.json",
                    "app/iosApp/iosApp/*.plist",
                    "app/iosApp/iosApp/*.swift",
                    "build-logic/*.properties",
                    "gradle/wrapper/*.properties",
                ),
            )
            formatShell(
                targets = listOf(
                    "scripts/**/*.sh",
                ),
            )
            formatTomlVersionCatalog(
                targets = listOf(
                    "gradle/libs.versions.toml",
                ),
            )
            formatYaml(
                targets = listOf(
                    ".github/**/*.yml",
                    "config/*.yml",
                ),
            )
        }
    }
}
