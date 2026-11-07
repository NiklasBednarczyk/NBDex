package de.niklasbednarczyk.nbdex.disk.pokedex.impl.serializer

import com.squareup.wire.ProtoAdapter
import de.niklasbednarczyk.nbdex.core.disk.serializer.DexSerializer
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.proto.DiskPokedexPreferences

internal object PokedexPreferencesSerializer : DexSerializer<DiskPokedexPreferences> {
    override val defaultValue: DiskPokedexPreferences
        get() = DiskPokedexPreferences()

    override val adapter: ProtoAdapter<DiskPokedexPreferences>
        get() = DiskPokedexPreferences.ADAPTER
}
