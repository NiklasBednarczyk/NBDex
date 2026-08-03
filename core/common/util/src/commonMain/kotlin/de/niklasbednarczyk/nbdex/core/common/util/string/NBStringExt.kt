package de.niklasbednarczyk.nbdex.core.common.util.string

fun String.nbCapitalize(): String {
    return this
        .lowercase()
        .replaceFirstChar { char -> if (char.isLowerCase()) char.titlecase() else char.toString() }
}
