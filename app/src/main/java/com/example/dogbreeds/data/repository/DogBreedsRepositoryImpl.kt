package com.example.dogbreeds.data.repository

import com.example.dogbreeds.data.DogBreedsApi
import com.example.dogbreeds.domain.model.Dog
import com.example.dogbreeds.domain.repository.DogBreedsRepository
import javax.inject.Inject

 class DogBreedsRepositoryImpl @Inject constructor(private val dogBreedsApi: DogBreedsApi)
    : DogBreedsRepository{
        override suspend fun getDogBreeds() : List<Dog> {
            return dogBreedsApi.getDogBreeds()
        }
}