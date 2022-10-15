package com.debug.pokedex.data

import com.debug.pokedex.data.api.PokemonApi
import com.debug.pokedex.data.model.toPokemon
import com.debug.pokedex.domain.entity.Pokemon
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val pokemonApi: PokemonApi
):PokemonRepository{

    override suspend fun getPokemonList(): List<Pokemon> {
        return pokemonApi.getPokemonList().map { pokemonRemote ->
            pokemonRemote.toPokemon()
        }
    }


}