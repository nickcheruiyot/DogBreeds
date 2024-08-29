package com.example.dogbreeds.domain.repository

import com.example.dogbreeds.domain.model.Dog
import com.swayy.trainapp.util.Resource

interface DogBreedsRepository {
    suspend fun getDogBreed(): Resource<ArrayList<Dog>>
}