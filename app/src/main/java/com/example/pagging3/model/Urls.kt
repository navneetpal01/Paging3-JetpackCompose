package com.example.pagging3.model

import kotlinx.serialization.Serializable


@Serializable
data class Urls(
    val regular : String,
)

//data class Urls(
//    @SerialName("regular")
//    val regularName : String,
//)


//TODO - If you want to give different name to this property but in the json it's regular
// Then you can use @SerialName("$nameInJson")