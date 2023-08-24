package ru.alexandrorlov.weather.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<State>(initialState: State) : ViewModel()
        where State : UiState {
    private val _state = MutableStateFlow(initialState)
    val state: StateFlow<State>
        get() = _state.asStateFlow()

    protected fun setState(state: State) {
        _state.value = state
    }
}