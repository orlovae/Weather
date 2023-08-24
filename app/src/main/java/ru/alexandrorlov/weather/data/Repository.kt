package ru.alexandrorlov.weather.data

import ru.alexandrorlov.weather.base.Result
import ru.alexandrorlov.weather.base.toListMealUi
import ru.alexandrorlov.weather.data.local.RepositoryLocal
import ru.alexandrorlov.weather.data.remote.DataSource
import ru.alexandrorlov.weather.ui.model.Meal
import ru.alexandrorlov.weather.ui.model.Meals
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
    private val remote: DataSource,
    private val local: RepositoryLocal
) {

    suspend fun getMealUiList(): Result<Any> {
        return Result.Success(local.getAllMealEntity().toListMealUi())
    }

    suspend fun fetchMeals() {
        val result = getTenMeal()
        if (result is Result.Success) {
            local.deleteAll()
            local.insertAllMealApi(result.data as List<Meal>)
        }
    }

    private suspend fun getTenMeal(): Result<Any> {
        val apiMealSet = mutableSetOf<Meal>()
        repeat(10) {
            val result = remote.getResultFromNetwork()
            if (result is Result.Success) {
                (result.data as Meals).meals?.first()?.let { meal ->
                    apiMealSet.add(meal)
                }
            } else {
                return result
            }
        }
        return Result.Success(apiMealSet.toList())
    }
}