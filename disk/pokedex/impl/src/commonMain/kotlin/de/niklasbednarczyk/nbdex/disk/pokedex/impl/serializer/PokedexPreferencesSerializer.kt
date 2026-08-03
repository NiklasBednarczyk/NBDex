package de.niklasbednarczyk.nbdex.disk.pokedex.impl.serializer

import com.squareup.wire.ProtoAdapter
import de.niklasbednarczyk.nbdex.core.disk.serializer.NBSerializer
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.proto.DiskPokedexPreferences

internal object PokedexPreferencesSerializer : NBSerializer<DiskPokedexPreferences> {

    override val defaultValue: DiskPokedexPreferences
        get() = DiskPokedexPreferences()

    override val adapter: ProtoAdapter<DiskPokedexPreferences>
        get() = DiskPokedexPreferences.ADAPTER

}