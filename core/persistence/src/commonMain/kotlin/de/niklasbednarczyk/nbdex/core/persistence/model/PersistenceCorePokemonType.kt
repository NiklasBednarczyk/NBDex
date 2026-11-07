package de.niklasbednarczyk.nbdex.core.persistence.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonTypeId
import de.niklasbednarczyk.nbdex.core.model.id.CoreTypeId
import de.niklasbednarczyk.nbdex.core.persistence.constant.DexTableName

@Entity(
    tableName = DexTableName.POKEMON_TYPE,
)
data class PersistenceCorePokemonType(
    @PrimaryKey
    val id: CorePokemonTypeId,
    val pokemonId: CorePokemonId?,
    val slot: Int,
    val typeId: CoreTypeId?,
)
