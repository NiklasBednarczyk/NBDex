package de.niklasbednarczyk.nbdex.core.model.endpoint.sprites

import de.niklasbednarczyk.nbdex.core.model.id.NBId

internal interface NBSprite<Id : NBId> {

    val id: Id

    val basePath: String

    fun getUrl(
        spritePath: String,
    ): String {
        return "$BASE_URL/$basePath/$spritePath/${id.value}.png"
    }

    companion object {

        private const val BASE_URL =
            "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites"

    }

}