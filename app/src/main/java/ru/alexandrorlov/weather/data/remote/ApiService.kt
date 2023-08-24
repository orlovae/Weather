package ru.alexandrorlov.weather.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import ru.alexandrorlov.weather.config.AppConfig
import ru.alexandrorlov.weather.config.DataRemoteConfig
import ru.alexandrorlov.weather.ui.model.Meals

interface ApiService {
    @GET("{api_key}/{random}")
    suspend fun getRandomOneMeal(
        @Path("api_key") api_key: Int = AppConfig.THE_MEAL_DB_API_KEY,
        @Path("random") query: String = DataRemoteConfig.QUERY_RANDOM
    ): Response<Meals>
}