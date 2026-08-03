package de.niklasbednarczyk.nbdex.convention.ext

import de.niklasbednarczyk.nbdex.convention.constant.NBAppInfo
import org.gradle.api.Project

val Project.modulePackageName: String
    get() {
        val appPackageName = NBAppInfo.PACKAGE_NAME
        val moduleName = path
            .split(":")
            .drop(1)
            .flatMap { str -> str.split("-") }
            .joinToString(".")
        return if (moduleName.isEmpty()) {
            appPackageName
        } else {
            "$appPackageName.$moduleName"
        }
    }
