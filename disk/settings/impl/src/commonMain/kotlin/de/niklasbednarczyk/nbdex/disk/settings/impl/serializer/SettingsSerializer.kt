package de.niklasbednarczyk.nbdex.disk.settings.impl.serializer

import com.squareup.wire.ProtoAdapter
import de.niklasbednarczyk.nbdex.core.disk.serializer.DexSerializer
import de.niklasbednarczyk.nbdex.disk.settings.impl.proto.DiskSettings

internal object SettingsSerializer : DexSerializer<DiskSettings> {
    override val defaultValue: DiskSettings
        get() = DiskSettings()

    override val adapter: ProtoAdapter<DiskSettings>
        get() = DiskSettings.ADAPTER
}
