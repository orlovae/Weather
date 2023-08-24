package ru.alexandrorlov.weather.base

import ru.alexandrorlov.weather.ui.model.Meal
import ru.alexandrorlov.weather.ui.model.MealEntity
import ru.alexandrorlov.weather.ui.model.MealUi

fun List<MealEntity>.toListMealUi(): List<MealUi> {
    return this.map { mealEntity ->
        mealEntity.toMealUi()
    }
}

fun MealEntity.toMealUi(): MealUi {
    return MealUi(
        id = this.id,
        title = this.title,
        drinkAlternate = this.drinkAlternate,
        category = this.category,
        area = this.area,
        description = this.description,
        urlThumb = this.urlThumb,
        tags = this.tags,
        urlYoutube = this.urlYoutube,
        ingredient1 = this.ingredient1,
        ingredient2 = this.ingredient2,
        ingredient3 = this.ingredient3,
        ingredient4 = this.ingredient4,
        ingredient5 = this.ingredient5,
        ingredient6 = this.ingredient6,
        ingredient7 = this.ingredient7,
        ingredient8 = this.ingredient8,
        ingredient9 = this.ingredient9,
        ingredient10 = this.ingredient10,
        ingredient11 = this.ingredient11,
        ingredient12 = this.ingredient12,
        ingredient13 = this.ingredient13,
        ingredient14 = this.ingredient14,
        ingredient15 = this.ingredient15,
        ingredient16 = this.ingredient16,
        ingredient17 = this.ingredient17,
        ingredient18 = this.ingredient18,
        ingredient19 = this.ingredient19,
        ingredient20 = this.ingredient20,
        measure1 = this.measure1,
        measure2 = this.measure2,
        measure3 = this.measure3,
        measure4 = this.measure4,
        measure5 = this.measure5,
        measure6 = this.measure6,
        measure7 = this.measure7,
        measure8 = this.measure8,
        measure9 = this.measure9,
        measure10 = this.measure10,
        measure11 = this.measure11,
        measure12 = this.measure12,
        measure13 = this.measure13,
        measure14 = this.measure14,
        measure15 = this.measure15,
        measure16 = this.measure16,
        measure17 = this.measure17,
        measure18 = this.measure18,
        measure19 = this.measure19,
        measure20 = this.measure20,
        source = this.source,
        imageSource = this.imageSource,
        creativeCommonsConfirmed = this.creativeCommonsConfirmed,
        dateModified = this.dateModified,
    )
}

fun List<Meal>.fromApiToListMealEntity(): List<MealEntity> {
    return this.map { meal ->
        meal.toMealEntity()
    }
}

fun Meal.toMealEntity(): MealEntity {
    return MealEntity(
        id = this.id ?: -1,
        title = this.title ?: "",
        drinkAlternate = this.drinkAlternate ?: "",
        category = this.category ?: "",
        area = this.area ?: "",
        description = this.description ?: "",
        urlThumb = this.urlThumb ?: "",
        tags = this.tags ?: "",
        urlYoutube = this.urlYoutube ?: "",
        ingredient1 = this.ingredient1 ?: "",
        ingredient2 = this.ingredient2 ?: "",
        ingredient3 = this.ingredient3 ?: "",
        ingredient4 = this.ingredient4 ?: "",
        ingredient5 = this.ingredient5 ?: "",
        ingredient6 = this.ingredient6 ?: "",
        ingredient7 = this.ingredient7 ?: "",
        ingredient8 = this.ingredient8 ?: "",
        ingredient9 = this.ingredient9 ?: "",
        ingredient10 = this.ingredient10 ?: "",
        ingredient11 = this.ingredient11 ?: "",
        ingredient12 = this.ingredient12 ?: "",
        ingredient13 = this.ingredient13 ?: "",
        ingredient14 = this.ingredient14 ?: "",
        ingredient15 = this.ingredient15 ?: "",
        ingredient16 = this.ingredient16 ?: "",
        ingredient17 = this.ingredient17 ?: "",
        ingredient18 = this.ingredient18 ?: "",
        ingredient19 = this.ingredient19 ?: "",
        ingredient20 = this.ingredient20 ?: "",
        measure1 = this.measure1 ?: "",
        measure2 = this.measure2 ?: "",
        measure3 = this.measure3 ?: "",
        measure4 = this.measure4 ?: "",
        measure5 = this.measure5 ?: "",
        measure6 = this.measure6 ?: "",
        measure7 = this.measure7 ?: "",
        measure8 = this.measure8 ?: "",
        measure9 = this.measure9 ?: "",
        measure10 = this.measure10 ?: "",
        measure11 = this.measure11 ?: "",
        measure12 = this.measure12 ?: "",
        measure13 = this.measure13 ?: "",
        measure14 = this.measure14 ?: "",
        measure15 = this.measure15 ?: "",
        measure16 = this.measure16 ?: "",
        measure17 = this.measure17 ?: "",
        measure18 = this.measure18 ?: "",
        measure19 = this.measure19 ?: "",
        measure20 = this.measure20 ?: "",
        source = this.source ?: "",
        imageSource = this.imageSource ?: "",
        creativeCommonsConfirmed = this.creativeCommonsConfirmed ?: "",
        dateModified = this.dateModified ?: "",
    )
}