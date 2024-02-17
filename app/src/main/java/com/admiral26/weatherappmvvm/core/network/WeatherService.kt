package com.admiral26.weatherappmvvm.core.network

import com.admiral26.weatherappmvvm.core.model.CurentWeatherRespons
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("/v1/current.json")
    suspend fun getCurrentWeather(
        @Query("key")key:String,
        @Query("q")q:String,
        @Query("aqi")aqi:String
    ):Response<CurentWeatherRespons?>
}