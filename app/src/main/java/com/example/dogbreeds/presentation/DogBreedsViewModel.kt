package com.example.dogbreeds.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogbreeds.domain.repository.DogBreedsRepository
import com.swayy.trainapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class DogBreedsViewModel @Inject constructor(
    private val repository: DogBreedsRepository
): ViewModel() {
    private val _state = mutableStateOf(DogBreedsState())
    val state: State<DogBreedsState> = _state

    init {
        getDogBreeds()
    }

    fun getDogBreeds() {
        viewModelScope.launch {
            when (val result = repository.getDogBreed()) {
                is Resource.Loading -> {
                    _state.value = DogBreedsState(isLoading = false, error = result.message)
                }

                is Resource.Success -> {
                    _state.value = DogBreedsState(isLoading = false, characters = result.data!!)
                }

                else -> {
                    state
                }
            }
        }
    }
}