package ru.alexandrorlov.weather.ui.main.state

import androidx.annotation.StringRes
import ru.alexandrorlov.weather.base.UiState
import ru.alexandrorlov.weather.ui.model.MealUi

sealed class MealState : UiState {
    object Loading : MealState()

    data class Data(val mealList: List<MealUi>? = null) : MealState()

    val data: Data?
        get() = this as? Data

    data class Error(@StringRes val idMessage: Int) : MealState()
}
