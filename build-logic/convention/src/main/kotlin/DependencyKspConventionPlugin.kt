import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project

class DependencyKspConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("ksp"))
        }
    }

}