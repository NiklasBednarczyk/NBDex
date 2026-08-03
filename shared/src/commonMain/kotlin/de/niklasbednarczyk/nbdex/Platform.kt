package de.niklasbednarczyk.nbdex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform