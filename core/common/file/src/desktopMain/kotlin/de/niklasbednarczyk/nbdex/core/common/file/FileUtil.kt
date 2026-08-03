package de.niklasbednarczyk.nbdex.core.common.file

import java.io.File

fun getFile(fileName: String): File {
    val directoryPath = System.getProperty("java.io.tmpdir")
    return File(directoryPath, fileName)
}