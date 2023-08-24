package ru.alexandrorlov.weather.base

import retrofit2.Response

open class BaseRemoteDataSource {

    suspend fun <T : Any> safeApiCall(
        call: suspend () -> Response<T>,
        errorMessageId: Int
    ): Result<T> {
        return safeApiResult(call, errorMessageId)
    }

    private suspend fun <T : Any> safeApiResult(
        call: suspend () -> Response<T>,
        errorMessageId: Int
    ): Result<T> {
        val response = call.invoke()
        return if (response.isSuccessful) {
            Result.Success(response.body())
        } else {
            Result.Error(
                idMessage = errorMessageId
            )
        }
    }
}