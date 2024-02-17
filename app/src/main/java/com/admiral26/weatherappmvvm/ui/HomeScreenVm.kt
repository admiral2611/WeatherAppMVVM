package com.admiral26.weatherappmvvm.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.admiral26.weatherappmvvm.core.model.CurentWeatherRespons
import com.admiral26.weatherappmvvm.core.repository.WeatherRepository
import com.admiral26.weatherappmvvm.util.ResultWrapper
import com.bumptech.glide.Glide
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeScreenVm @Inject constructor(val repository: WeatherRepository) : ViewModel() {
    val weatherCurrentLiveData: MutableLiveData<CurentWeatherRespons?> = MutableLiveData()
    val errorLiveData: MutableLiveData<String?> = MutableLiveData()

    fun getCurrentWeather(city: String) {
        viewModelScope.launch {
            val result = repository.getCurrentWeather(city)
            when (result) {
                is ResultWrapper.Success  ->{
                    weatherCurrentLiveData.value = result.response
                }
                is ResultWrapper.ErrorResponse ->{
                    errorLiveData.value ="Error"
                }
                is ResultWrapper.NetworkError -> {
                    errorLiveData.value = "NETWORK_ERROR"
                }
            }
        }
    }
}