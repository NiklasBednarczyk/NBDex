package de.niklasbednarczyk.nbdex.core.model.endpoint.sprites

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.NBId
import kotlin.jvm.JvmInline

@JvmInline
value class CorePokemonSprite private constructor(override val id: CorePokemonId) : NBSprite<NBId> {
    override val basePath: String
        get() = BASE_PATH

    fun getOfficialArtworkUrl(): String {
        return getUrl(
            spritePath = SPRITE_OFFICIAL_ARTWORK_PATH,
        )
    }

    companion object {
        private const val BASE_PATH = "pokemon"

        private const val SPRITE_OFFICIAL_ARTWORK_PATH = "other/official-artwork"

        fun from(
            id: CorePokemonId,
        ): CorePokemonSprite {
            return CorePokemonSprite(id)
        }

        fun from(
            id: CorePokemonId?,
        ): CorePokemonSprite? {
            return id?.let(::from)
        }
    }
}
