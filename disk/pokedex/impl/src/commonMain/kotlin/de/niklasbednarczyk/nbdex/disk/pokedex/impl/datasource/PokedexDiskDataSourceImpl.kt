package de.niklasbednarczyk.nbdex.disk.pokedex.impl.datasource

import de.niklasbednarczyk.nbdex.core.disk.constant.NBDataStoreName
import de.niklasbednarczyk.nbdex.core.disk.datasource.NBDiskDataSourceImpl
import de.niklasbednarczyk.nbdex.core.model.id.CoreGenerationId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokedexId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.disk.pokedex.api.datasource.PokedexDiskDataSource
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.mapper.DiskPokedexPreferencesMapper
import de.niklasbednarczyk.nbdex.disk.pokedex.impl.proto.DiskPokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferences
import de.niklasbednarczyk.nbdex.model.pokedex.preferences.PokedexPreferencesCategory
import kotlinx.coroutines.flow.Flow

internal class PokedexDiskDataSourceImpl :
    NBDiskDataSourceImpl<DiskPokedexPreferences>(),
    PokedexDiskDataSource {
    override val dataStoreName: String
        get() = NBDataStoreName.POKEDEX_PREFERENCES

    override fun getPreferences(): Flow<PokedexPreferences> {
        return getModelFlow(
            mapper = DiskPokedexPreferencesMapper,
        )
    }

    override suspend fun updateGenerationId(
        generationId: CoreGenerationId?,
    ) {
        dataStore.updateData { preferences ->
            preferences.copy(
                generationId = generationId?.value,
            )
        }
    }

    override suspend fun updatePokedexId(
        pokedexId: CorePokedexId,
    ) {
        dataStore.updateData { preferences ->
            preferences.copy(
                pokedexId = pokedexId.value,
            )
        }
    }

    override suspend fun updateTypeId(
        typeId: CoreTypeId?,
    ) {
        dataStore.updateData { preferences ->
            preferences.copy(
                typeId = typeId?.value,
            )
        }
    }

    override suspend fun updateCategory(
        category: PokedexPreferencesCategory,
    ) {
        dataStore.updateData { preferences ->
            val preferencesCategory = preferences.category ?: DiskPokedexPreferences.Category()
            when (category) {
                PokedexPreferencesCategory.DEFAULT -> preferences.copy(
                    category = preferencesCategory.copy(
                        isDefault = preferencesCategory.isDefault == false,
                    ),
                )

                PokedexPreferencesCategory.BABY -> preferences.copy(
                    category = preferencesCategory.copy(
                        isBaby = preferencesCategory.isBaby == false,
                    ),
                )

                PokedexPreferencesCategory.BATTLE_ONLY -> preferences.copy(
                    category = preferencesCategory.copy(
                        isBattleOnly = preferencesCategory.isBattleOnly == false,
                    ),
                )

                PokedexPreferencesCategory.LEGENDARY -> preferences.copy(
                    category = preferencesCategory.copy(
                        isLegendary = preferencesCategory.isLegendary == false,
                    ),
                )

                PokedexPreferencesCategory.MEGA -> preferences.copy(
                    category = preferencesCategory.copy(
                        isMega = preferencesCategory.isMega == false,
                    ),
                )

                PokedexPreferencesCategory.MYTHICAL -> preferences.copy(
                    category = preferencesCategory.copy(
                        isMythical = preferencesCategory.isMythical == false,
                    ),
                )
            }
        }
    }
}
