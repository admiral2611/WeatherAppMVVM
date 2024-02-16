package com.admiral26.weatherappmvvm.core.model


import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("cloud")
    val cloud: Int, // 0
    @SerializedName("condition")
    val condition: Condition,
    @SerializedName("feelslike_c")
    val feelslikeC: Double, // 17.0
    @SerializedName("feelslike_f")
    val feelslikeF: Double, // 62.6
    @SerializedName("gust_kph")
    val gustKph: Double, // 19.2
    @SerializedName("gust_mph")
    val gustMph: Double, // 11.9
    @SerializedName("humidity")
    val humidity: Int, // 39
    @SerializedName("is_day")
    val isDay: Int, // 1
    @SerializedName("last_updated")
    val lastUpdated: String, // 2024-02-15 12:30
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int, // 1707982200
    @SerializedName("precip_in")
    val precipIn: Double, // 0.0
    @SerializedName("precip_mm")
    val precipMm: Double, // 0.0
    @SerializedName("pressure_in")
    val pressureIn: Double, // 30.0
    @SerializedName("pressure_mb")
    val pressureMb: Double, // 1016.0
    @SerializedName("temp_c")
    val tempC: Double, // 17.0
    @SerializedName("temp_f")
    val tempF: Double, // 62.6
    @SerializedName("uv")
    val uv: Double, // 4.0
    @SerializedName("vis_km")
    val visKm: Double, // 7.0
    @SerializedName("vis_miles")
    val visMiles: Double, // 4.0
    @SerializedName("wind_degree")
    val windDegree: Int, // 180
    @SerializedName("wind_dir")
    val windDir: String, // S
    @SerializedName("wind_kph")
    val windKph: Double, // 15.1
    @SerializedName("wind_mph")
    val windMph: Double // 9.4
)