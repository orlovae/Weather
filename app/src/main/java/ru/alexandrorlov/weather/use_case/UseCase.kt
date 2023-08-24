package ru.alexandrorlov.weather.use_case

import ru.alexandrorlov.weather.R
import ru.alexandrorlov.weather.base.Result
import ru.alexandrorlov.weather.data.Repository
import ru.alexandrorlov.weather.util.NetworkHelper
import javax.inject.Inject

class UseCase @Inject constructor(
    private val repository: Repository,
    private val networkHelper: NetworkHelper
) {
    suspend fun execute(): Result<Any> {
        if (networkHelper.isConnect()) {
            try {
                repository.fetchMeals()
            } catch (e: Exception) {
                Result.Error(idMessage = R.string.exception_Exception)
            }
        }
        return repository.getMealUiList()
    }
}