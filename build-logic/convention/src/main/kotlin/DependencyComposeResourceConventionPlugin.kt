import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.compose.ComposeExtension
import org.jetbrains.compose.resources.ResourcesExtension

class DependencyComposeResourceConventionPlugin : Plugin<Project> {
    override fun apply(
        target: Project,
    ) = with(target) {
        extensions.configure<ComposeExtension> {
            configure<ResourcesExtension> {
                generateResClass = always
            }
        }
    }
}
