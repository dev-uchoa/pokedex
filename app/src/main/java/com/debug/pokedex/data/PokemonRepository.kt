package com.debug.pokedex.data

import com.debug.pokedex.domain.entity.Pokemon

interface PokemonRepository {

    suspend fun getPokemonList(): List<Pokemon>
}