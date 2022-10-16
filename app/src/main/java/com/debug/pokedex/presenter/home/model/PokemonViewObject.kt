package com.debug.pokedex.presenter.home.model

import android.os.Parcelable
import com.debug.pokedex.domain.entity.Pokemon
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonViewObject(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val height: Double,
    val weight: Double,
    val species: String,
    val mainType: PokemonTypeResources,
    val types: List<PokemonTypeResources>
) : Parcelable {
    constructor(pokemon: Pokemon) : this(
        id = pokemon.id,
        name = pokemon.name,
        image = pokemon.image,
        description = pokemon.description,
        height = pokemon.height,
        weight = pokemon.weight,
        species = pokemon.species,
        mainType = PokemonTypeResources.fromPokemonType(pokemon.types.first()),
        types = pokemon.types.map { type ->
            PokemonTypeResources.fromPokemonType(type)
        },
    )
}