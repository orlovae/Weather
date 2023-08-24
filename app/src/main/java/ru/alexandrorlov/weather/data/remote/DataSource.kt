package ru.alexandrorlov.weather.data.remote

import ru.alexandrorlov.weather.R
import ru.alexandrorlov.weather.base.BaseRemoteDataSource
import ru.alexandrorlov.weather.base.Result
import javax.inject.Inject

class DataSource @Inject constructor(
    private val apiService: ApiService
) : BaseRemoteDataSource() {

    suspend fun getResultFromNetwork(): Result<Any> {
        return safeApiCall(
            call = { apiService.getRandomOneMeal() },
            errorMessageId = R.string.exception_Exception
        )
    }

    suspend fun getListResultFromNetwork(): Result<List<Any>> {
        val list = mutableListOf<Any>()
        repeat(10) {
            list.add(getResultFromNetwork())
        }

        return Result.Success(list)
    }
}