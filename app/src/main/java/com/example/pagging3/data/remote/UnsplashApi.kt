package com.example.pagging3.data.remote

import com.example.pagging3.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface UnsplashApi {
    //Api Key
    @Headers("Authorization: Client-ID ")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): List<UnsplashImage>

}