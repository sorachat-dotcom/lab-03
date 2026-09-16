package com.example.listycity3
import androidx.compose.runtime.mutableStateListOf
class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    val cities: List<City>
        get() = _cities

    fun addCity(city: City) {
        _cities.add(city)
    }

    //Replace a city with an entirely new one
    fun updateCity(oldCity: City, updatedCity: City) {
        val index = _cities.indexOf(oldCity)
        if (index != -1) {    //If not out of bounds
            _cities[index] = updatedCity
        }
    }
}