import com.squareup.wire.gradle.WireExtension
import de.niklasbednarczyk.nbdex.convention.ext.getPluginId
import de.niklasbednarczyk.nbdex.convention.ext.libs
import de.niklasbednarczyk.nbdex.convention.ext.plugins
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class DependencyWirePluginConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        plugins {
            apply(libs.getPluginId("wire"))
        }

        extensions.configure<WireExtension> {
            kotlin {}
            sourcePath {
                srcDir("src/commonMain/proto")
            }
        }
    }

}