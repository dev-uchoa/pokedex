package com.debug.pokedex.data.model

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class TrainingRemote(
    @SerialName("evYield") val evYield: String,
    @SerialName("catchRate") val catchRate: BaseInfoRemote,
    @SerialName("baseFriendship") val baseFriendship: BaseInfoRemote,
    @SerialName("baseExp") val baseExp: Int? = null,
    @SerialName("growthRate") val growthRate: String
)