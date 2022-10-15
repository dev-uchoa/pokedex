package com.debug.pokedex.network

import com.debug.pokedex.data.PokemonRemote
import retrofit2.http.GET

interface PokemonApi {

    @GET("/")
    suspend fun getPokemonList(): List<PokemonRemote>
}