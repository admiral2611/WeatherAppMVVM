package com.admiral26.weatherappmvvm.core.repository

import com.admiral26.weatherappmvvm.core.model.CurentWeatherRespons
import com.admiral26.weatherappmvvm.core.network.WeatherService
import com.admiral26.weatherappmvvm.util.ResultWrapper
import com.admiral26.weatherappmvvm.util.api_key
import com.admiral26.weatherappmvvm.util.parseResponse
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val service: WeatherService) {

    suspend fun getCurrentWeather(q:String):ResultWrapper<CurentWeatherRespons?,Any> {
        return parseResponse(Dispatchers.IO){
            service.getCurrentWeather("abc250afba9c435489b60858241702",q = q,"no")
        }
    }
}