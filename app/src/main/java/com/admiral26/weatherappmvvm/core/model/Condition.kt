package com.admiral26.weatherappmvvm.core.model


import com.google.gson.annotations.SerializedName

data class Condition(
    @SerializedName("code")
    val code: Int, // 1000
    @SerializedName("icon")
    //https://cdn.weatherapi.com/weather/64x64/day/116.png
    val icon: String, // //cdn.weatherapi.com/weather/64x64/day/113.png
    @SerializedName("text")
    val text: String // Sunny
)