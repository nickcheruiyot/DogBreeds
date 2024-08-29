package com.example.dogbreeds.presentation

import com.example.dogbreeds.domain.model.Dog

data class DogBreedsState(
    val isLoading:Boolean = false,
    val error: String? = null,
    val characters:ArrayList<Dog> = ArrayList()
)
