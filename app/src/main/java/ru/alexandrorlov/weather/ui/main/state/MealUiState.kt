package ru.alexandrorlov.weather.ui.main.state

import ru.alexandrorlov.weather.base.UiState

data class MealUiState(
    val mealState: MealState = MealState.Loading
) : UiState