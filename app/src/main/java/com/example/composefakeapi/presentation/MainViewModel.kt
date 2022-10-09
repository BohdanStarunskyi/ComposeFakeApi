package com.example.composefakeapi.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composefakeapi.common.States
import com.example.composefakeapi.domain.use_case.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val useCase: UseCase) : ViewModel() {
    private val _state = mutableStateOf(States())
    val state: State<States> = _state

    init {
        getComments()
    }

    private fun getComments() {
        viewModelScope.launch {
            runCatching {
                _state.value = States(isLoading = true)
                useCase.getComments()
            }.onSuccess {
                _state.value = States(comments = it)
            }.onFailure {
                _state.value = States(error = it)
            }
        }
    }

}