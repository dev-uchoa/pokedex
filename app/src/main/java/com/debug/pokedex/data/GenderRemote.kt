package com.debug.pokedex.data

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class GenderRemote(
    @SerialName("female") val female: Double? = null,
    @SerialName("male") val male: Double? = null,
)