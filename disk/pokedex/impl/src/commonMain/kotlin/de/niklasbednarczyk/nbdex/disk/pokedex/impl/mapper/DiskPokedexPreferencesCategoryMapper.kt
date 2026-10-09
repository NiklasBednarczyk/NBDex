package de.niklasbednarczyk.nbdex.disk.pokedex.impl.mapper

import de.niklasbednarczyk.nbdex.core.disk.mapper.NBDiskMessageMapper
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.proto.DiskPokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory

internal object DiskPokedexPreferencesCategoryMapper :
    NBDiskMessageMapper<Set<PokedexPreferencesCategory>, DiskPokedexPreferences.Category> {
    override fun diskToModel(
        disk: DiskPokedexPreferences.Category,
    ): Set<PokedexPreferencesCategory> {
        return setOfNotNull(
            if (disk.isDefault == true) PokedexPreferencesCategory.DEFAULT else null,
            if (disk.isBaby == true) PokedexPreferencesCategory.BABY else null,
            if (disk.isBattleOnly == true) PokedexPreferencesCategory.BATTLE_ONLY else null,
            if (disk.isLegendary == true) PokedexPreferencesCategory.LEGENDARY else null,
            if (disk.isMega == true) PokedexPreferencesCategory.MEGA else null,
            if (disk.isMythical == true) PokedexPreferencesCategory.MYTHICAL else null,
        )
    }
}
