package de.niklasbednarczyk.nbdex.disk.pokedex.impl.mapper

import de.niklasbednarczyk.nbdex.core.disk.mapper.NBDiskMessageMapper
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.proto.DiskPokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferences

internal object DiskPokedexPreferencesMapper :
    NBDiskMessageMapper<PokedexPreferences, DiskPokedexPreferences> {
    override fun diskToModel(
        disk: DiskPokedexPreferences,
    ): PokedexPreferences {
        return PokedexPreferences(
            pokedexId = CorePokedexId.from(disk.pokedexId) ?: CorePokedexId.default,
            generationId = CoreGenerationId.from(disk.generationId),
            typeId = CoreTypeId.from(disk.typeId),
            categories = DiskPokedexPreferencesCategoryMapper
                .diskToModelNullable(
                    disk = disk.category,
                )
                .orEmpty(),
        )
    }
}
