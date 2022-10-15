package com.debug.pokedex.data

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class DefencesRemote(
    @SerialName("normal") val normal: Double? = null,
    @SerialName("fire") val fire: Double? = null,
    @SerialName("water") val water: Double? = null,
    @SerialName("electric") val electric: Double? = null,
    @SerialName("grass") val grass: Double? = null,
    @SerialName("ice") val ice: Double? = null,
    @SerialName("fighting") val fighting: Double? = null,
    @SerialName("poison") val poison: Double? = null,
    @SerialName("ground") val ground: Double? = null,
    @SerialName("flying") val flying: Double? = null,
    @SerialName("psychic") val psychic: Double? = null,
    @SerialName("bug") val bug: Double? = null,
    @SerialName("rock") val rock: Double? = null,
    @SerialName("ghost") val ghost: Double? = null,
    @SerialName("dragon") val dragon: Double? = null,
    @SerialName("darl") val darl: Double? = null,
    @SerialName("steel") val steel: Double? = null,
    @SerialName("fairy") val fairy: Double? = null,
)