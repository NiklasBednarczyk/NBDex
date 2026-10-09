rootProject.name = "NBDex"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

// Allows spotless to format .gitignore, see https://github.com/diffplug/spotless/issues/1146
org.apache.tools.ant.DirectoryScanner.removeDefaultExclude("**/.gitignore")

include(":app:androidApp")
include(":app:desktopApp")
include(":app:shared")
include(":app:webApp")

include(":core:common:dispatchers")
include(":core:common:file")
include(":core:common:logging")
include(":core:common:result")
include(":core:common:util")
include(":core:data")
include(":core:disk")
include(":core:model:endpoint")
include(":core:model:id")
include(":core:model:settings")
include(":core:network")
include(":core:persistence")
include(":core:ui:designsystem")
include(":core:ui:model")
include(":core:ui:navigation")
include(":core:ui:resource")

include(":data")
include(":data:pokedex:api")
include(":data:pokedex:impl")
include(":data:settings:api")
include(":data:settings:impl")

include(":disk")
include(":disk:pokedex:api")
include(":disk:pokedex:impl")
include(":disk:settings:api")
include(":disk:settings:impl")

include(":feature")
include(":feature:about:api")
include(":feature:about:impl")
include(":feature:contrast:api")
include(":feature:contrast:impl")
include(":feature:info:api")
include(":feature:info:impl")
include(":feature:more:api")
include(":feature:more:impl")
include(":feature:pokedex:api")
include(":feature:pokedex:impl")
include(":feature:pokemonform:api")
include(":feature:pokemonform:impl")
include(":feature:theme:api")
include(":feature:theme:impl")

include(":model:pokedex")

include(":network")
include(":network:pokedex:api")
include(":network:pokedex:impl")

include(":persistence")
include(":persistence:pokedex:api")
include(":persistence:pokedex:impl")
