package com.example.dogbreeds.data

import com.example.dogbreeds.data.remote.Dto.Message
import retrofit2.http.GET

interface DogBreedsApi {
    @GET("/documentation/")
    suspend fun getcharacters():Message
}