package de.niklasbednarczyk.nbdex.convention.ext

import com.diffplug.gradle.spotless.FormatExtension
import com.diffplug.gradle.spotless.SpotlessExtension

// TODO Add spotless to build.yaml
// TODO Add detekt to build.yaml with all different type interference calls (detektMain, detektAndroid, detektTest, ...)

internal fun SpotlessExtension.formatKotlin(
    targets: List<String>,
) {
    kotlin {
        target(targets)
        ktlint()
    }
}

internal fun SpotlessExtension.formatKotlinGradle(
    targets: List<String>,
) {
    kotlinGradle {
        target(targets)
        ktlint()
    }
}

internal fun SpotlessExtension.formatMarkdown(
    targets: List<String>,
) {
    flexmark {
        target(targets)
        flexmark()
    }
}

internal fun SpotlessExtension.formatMisc(
    targets: List<String>,
) {
    format("misc") {
        target(targets)
        defaultFormat()
    }
}

internal fun SpotlessExtension.formatProtobuf(
    targets: List<String>,
) {
    protobuf {
        target(targets)
        defaultFormat()
    }
}

internal fun SpotlessExtension.formatShell(
    targets: List<String>,
) {
    shell {
        target(targets)
        defaultFormat()
    }
}

internal fun SpotlessExtension.formatTomlVersionCatalog(
    targets: List<String>,
) {
    toml {
        target(targets)
        versionCatalog()
            .stripQuotedKeys(true)
    }
}

internal fun SpotlessExtension.formatYaml(
    targets: List<String>,
) {
    yaml {
        target(targets)
        jackson()
            .yamlFeature("MINIMIZE_QUOTES", true)
            .yamlFeature("WRITE_DOC_START_MARKER", false)
    }
}

private fun FormatExtension.defaultFormat() {
    endWithNewline()
    leadingTabsToSpaces()
    trimTrailingWhitespace()
}
