package com.debug.pokedex.data

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