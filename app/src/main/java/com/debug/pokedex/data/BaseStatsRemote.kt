package com.debug.pokedex.data

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class BaseStatsRemote(
    @SerialName("hp") val hp: List<Int>,
    @SerialName("attack") val attack: List<Int>,
    @SerialName("defence") val defence: List<Int>,
    @SerialName("specialAttack") val specialAttack: List<Int>,
    @SerialName("specialDefence") val specialDefence: List<Int>,
    @SerialName("speed") val speed: List<Int>,
)