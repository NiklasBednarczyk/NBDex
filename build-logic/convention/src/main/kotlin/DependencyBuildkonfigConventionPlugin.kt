import com.codingfeline.buildkonfig.gradle.BuildKonfigExtension
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.modulePackageName
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class DependencyBuildkonfigConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("buildkonfig"))
        }

        extensions.configure<BuildKonfigExtension> {
            packageName.set("$modulePackageName.buildkonfig")
        }
    }

}