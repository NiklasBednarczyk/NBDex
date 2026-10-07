import com.codingfeline.buildkonfig.compiler.FieldSpec.Type.STRING
import de.niklasbednarczyk.nbdex.convention.constant.NBApollo
import de.niklasbednarczyk.nbdex.convention.ext.modulePackageName

private val schemaFolderPath = "src/commonMain/graphql"
private val schemaFilePath =
    "$schemaFolderPath/$modulePackageName/${NBApollo.PACKAGE}/schema.graphqls"

plugins {
    alias(libs.plugins.nbdex.android.kotlin.multiplatform.library)
    alias(libs.plugins.nbdex.dependency.apollo)
    alias(libs.plugins.nbdex.dependency.buildkonfig)
    alias(libs.plugins.nbdex.dependency.koin.core)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.common.logging)
            implementation(projects.core.model.endpoint)
            implementation(projects.core.model.id)
        }
    }
}

apollo {
    service(NBApollo.SERVICE_NAME) {
        packageName.set("$modulePackageName.${NBApollo.PACKAGE}")

        // Configure introspection schema download
        introspection {
            endpointUrl.set(NBApollo.URL)
            schemaFile.set(file(schemaFilePath))
        }

        // Enable generation of metadata for use by downstream modules
        generateApolloMetadata.set(true)

        // Disable generating all types
        alwaysGenerateTypesMatching.set(emptyList())

        // Ignored because Apollo does not recognize multi-module use of Fragment, see https://github.com/apollographql/apollo-kotlin/issues/6880
        issueSeverity("UnusedFragment", "ignore")
    }
}

buildkonfig {
    defaultConfigs {
        buildConfigField(STRING, "apolloUrl", NBApollo.URL)
    }
}
