package com.debug.pokedex.data.model

import com.debug.pokedex.domain.entity.Pokemon
import com.debug.pokedex.domain.entity.PokemonType
import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class PokemonRemote(
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
    @SerialName("image") val image: String,
    @SerialName("description") val description: String,
    @SerialName("height") val height: Double,
    @SerialName("weight") val weight: Double,
    @SerialName("species") val species: String,
    @SerialName("types") val types: List<String>,
    @SerialName("training") val training: TrainingRemote,
    @SerialName("breedings") val breedings: BreedingsRemote,
    @SerialName("baseStats") val baseStats: BaseStatsRemote,
    @SerialName("typeDefences") val typeDefences: DefencesRemote
)

fun PokemonRemote.toPokemon(): Pokemon {
    return Pokemon(
        id = id,
        name = name,
        image = image,
        description = description,
        height = height,
        weight = weight,
        species = species,
        types = types.map { type ->
            getType(type)
        },
    )
}

fun getType(type: String) = when (type) {
    "bug" -> PokemonType.BUG
    "dark" -> PokemonType.DARK
    "dragon" -> PokemonType.DRAGON
    "electric" -> PokemonType.ELECTRIC
    "fairy" -> PokemonType.FAIRLY
    "fighting" -> PokemonType.FIGHTING
    "fire" -> PokemonType.FIRE
    "flying" -> PokemonType.FLYING
    "ghost" -> PokemonType.GHOST
    "grass" -> PokemonType.GRASS
    "ground" -> PokemonType.GROUND
    "ice" -> PokemonType.ICE
    "normal" -> PokemonType.NORMAL
    "poison" -> PokemonType.POISON
    "psychic" -> PokemonType.PSYCHIC
    "rock" -> PokemonType.ROCK
    "steel" -> PokemonType.STEEL
    "water" -> PokemonType.WATER
    else -> PokemonType.NORMAL

}