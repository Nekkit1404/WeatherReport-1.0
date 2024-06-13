package com.example.weatherreport

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ParserApi {
    @GET("cities.json")
    suspend fun getCityList(): List<City>
}
interface WeatherReportApi {
    @GET("weather?units=metric")
    suspend fun getWeather(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") apiKey: String
    ): Response<WeatherReport>
}