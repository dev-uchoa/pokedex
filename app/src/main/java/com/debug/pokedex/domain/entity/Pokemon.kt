package com.debug.pokedex.domain.entity

data class Pokemon(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val height: Double,
    val weight: Double,
    val species: String,
    val types: List<PokemonType>
)