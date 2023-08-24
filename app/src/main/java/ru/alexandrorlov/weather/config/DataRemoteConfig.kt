package ru.alexandrorlov.weather.config

object DataRemoteConfig {

    fun getBaseURLGet(): String {
        return BASE_URL_GET
    }

    const val QUERY_RANDOM = "random.php"

    private const val BASE_URL_GET = "https://www.themealdb.com/api/json/v1/"
}