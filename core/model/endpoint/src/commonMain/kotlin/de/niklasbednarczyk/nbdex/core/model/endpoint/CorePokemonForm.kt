package de.niklasbednarczyk.nbdex.core.model.endpoint

import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonFormId
import de.niklasbednarczyk.nbdex.core.model.id.CorePokemonId
import de.niklasbednarczyk.nbdex.core.model.id.CoreVersionGroupId

data class CorePokemonForm(
    val id: CorePokemonFormId,
    val formName: String,
    val formOrder: Int?,
    val isBattleOnly: Boolean,
    val isDefault: Boolean,
    val isMega: Boolean,
    val name: String,
    val order: Int?,
    val pokemonId: CorePokemonId?,
    val versionGroupId: CoreVersionGroupId?,
) {

    companion object {

        fun example(
            id: CorePokemonFormId = CorePokemonFormId.example(),
            formName: String = "PokemonForm FormName",
            formOrder: Int? = -1,
            isBattleOnly: Boolean = false,
            isDefault: Boolean = false,
            isMega: Boolean = false,
            name: String = "PokemonForm Name",
            order: Int? = -1,
            pokemonId: CorePokemonId? = CorePokemonId.example(),
            versionGroupId: CoreVersionGroupId? = CoreVersionGroupId.example(),
        ): CorePokemonForm {
            return CorePokemonForm(
                id = id,
                formName = formName,
                formOrder = formOrder,
                isBattleOnly = isBattleOnly,
                isDefault = isDefault,
                isMega = isMega,
                name = name,
                order = order,
                pokemonId = pokemonId,
                versionGroupId = versionGroupId,
            )
        }

    }

}