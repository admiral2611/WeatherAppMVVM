package com.admiral26.weatherappmvvm.core.model


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("country")
    val country: String, // Uzbekistan
    @SerializedName("lat")
    val lat: Double, // 41.32
    @SerializedName("localtime")
    val localtime: String, // 2024-02-15 12:33
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Int, // 1707982388
    @SerializedName("lon")
    val lon: Double, // 69.25
    @SerializedName("name")
    val name: String, // Tashkent
    @SerializedName("region")
    val region: String, // Toshkent
    @SerializedName("tz_id")
    val tzId: String // Asia/Tashkent
)