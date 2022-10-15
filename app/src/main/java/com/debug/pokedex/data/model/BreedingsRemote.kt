package com.debug.pokedex.data.model

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class BreedingsRemote(
    @SerialName("eggGroups") val eggGroups: List<String>,
    @SerialName("gender") val gender: GenderRemote,
    @SerialName("eggCycles") val eggCycles: BaseInfoRemote
)