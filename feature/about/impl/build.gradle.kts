import com.codingfeline.buildkonfig.compiler.FieldSpec.Type.STRING
import de.niklasbednarczyk.nbdex.convention.constant.NBAppInfo

plugins {
    alias(libs.plugins.nbdex.dependency.buildkonfig)
    alias(libs.plugins.nbdex.library.feature.impl)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.feature.about.api)
        }
    }
}

buildkonfig {
    defaultConfigs {
        buildConfigField(STRING, "appVersionName", NBAppInfo.VERSION_NAME)
    }
}