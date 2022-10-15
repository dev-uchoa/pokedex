package com.debug.pokedex.data.model

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class BaseInfoRemote(
    @SerialName("value") val value: Int? = null,
    @SerialName("text") val text: String
)