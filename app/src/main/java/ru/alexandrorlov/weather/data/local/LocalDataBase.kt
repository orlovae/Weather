package ru.alexandrorlov.weather.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.alexandrorlov.weather.ui.model.MealEntity

@Database(entities = [MealEntity::class], version = 1)
abstract class LocalDataBase : RoomDatabase() {

    abstract fun MealDao(): MealDao
}