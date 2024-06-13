package com.example.weatherreport


data class City (
    val id: String,
    val city: String,
    val latitude: String,
    val longitude: String,
)
data class WeatherReport(
    val main: Main
)

data class Main(
    val temp: Double
)
data class CurrentChosenCity(
    val city: String,
    val temperature: Double?
)