package com.admiral26.weatherappmvvm.core.model


import com.google.gson.annotations.SerializedName

data class CurentWeatherRespons(
    @SerializedName("current")
    val current: Current,
    @SerializedName("location")
    val location: Location
)