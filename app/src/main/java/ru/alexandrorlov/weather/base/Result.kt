package ru.alexandrorlov.weather.base

import androidx.annotation.StringRes

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: Any?) : Result<T>()
    data class Error(@StringRes val idMessage: Int) : Result<Nothing>()
}
