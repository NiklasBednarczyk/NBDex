package de.niklasbednarczyk.nbdex.persistence.pokedex.impl.dao

import androidx.room3.Dao
import androidx.room3.Query
import androidx.room3.Transaction
import de.niklasbednarczyk.nbdex.core.persistence.constant.NBTableName
import de.niklasbednarczyk.nbdex.persistence.pokedex.impl.model.pokemonform.PersistencePokedexPokemonForm
import kotlinx.coroutines.flow.Flow

@Dao
interface PokedexPokemonFormDao {

    @Transaction
    @Query(
        """
            SELECT *
            FROM ${NBTableName.POKEMON_FORM}
        """
    )
    fun getPokedexForms(): Flow<List<PersistencePokedexPokemonForm>>

}