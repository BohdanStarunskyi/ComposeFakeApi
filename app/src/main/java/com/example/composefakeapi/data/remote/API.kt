package com.example.composefakeapi.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface API {
    @GET("/comments")
    suspend fun getComments(): Response<com.example.composefakeapi.data.remote.dto.Response>
}