package com.debug.pokedex.data.api

import com.debug.pokedex.data.model.PokemonRemote
import retrofit2.http.GET

interface PokemonApi {

    @GET("/")
    suspend fun getPokemonList(): List<PokemonRemote>
}