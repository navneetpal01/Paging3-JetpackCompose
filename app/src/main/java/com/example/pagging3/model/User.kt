package com.example.pagging3.model

import androidx.room.Embedded
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("links")
    @Embedded //This is for our room library cause room library will not know how to store it
    val userLinks : UserLinks,
    val username : String
)